package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.WeishengjianchaEntity;

import com.service.WeishengjianchaService;
import com.entity.view.WeishengjianchaView;
import com.service.SusheService;
import com.entity.SusheEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 卫生检查
 * 后端接口
 * @author
 * @email
 * @date 2021-04-23
*/
@RestController
@Controller
@RequestMapping("/weishengjiancha")
public class WeishengjianchaController {
    private static final Logger logger = LoggerFactory.getLogger(WeishengjianchaController.class);

    @Autowired
    private WeishengjianchaService weishengjianchaService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private SusheService susheService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = weishengjianchaService.queryPage(params);

        //字典表数据转换
        List<WeishengjianchaView> list =(List<WeishengjianchaView>)page.getList();
        for(WeishengjianchaView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WeishengjianchaEntity weishengjiancha = weishengjianchaService.selectById(id);
        if(weishengjiancha !=null){
            //entity转view
            WeishengjianchaView view = new WeishengjianchaView();
            BeanUtils.copyProperties( weishengjiancha , view );//把实体数据重构到view中

            //级联表
            SusheEntity sushe = susheService.selectById(weishengjiancha.getSusheId());
            if(sushe != null){
                BeanUtils.copyProperties( sushe , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setSusheId(sushe.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WeishengjianchaEntity weishengjiancha, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,weishengjiancha:{}",this.getClass().getName(),weishengjiancha.toString());
        Wrapper<WeishengjianchaEntity> queryWrapper = new EntityWrapper<WeishengjianchaEntity>()
            .eq("sushe_id", weishengjiancha.getSusheId())
            .eq("weishengjiancha_time", weishengjiancha.getWeishengjianchaTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WeishengjianchaEntity weishengjianchaEntity = weishengjianchaService.selectOne(queryWrapper);
        if(weishengjianchaEntity==null){
            weishengjiancha.setInsertTime(new Date());
            weishengjiancha.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      weishengjiancha.set
        //  }
            weishengjianchaService.insert(weishengjiancha);
            return R.ok();
        }else {
            return R.error(511,"该宿舍该天已有卫生检查记录");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WeishengjianchaEntity weishengjiancha, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,weishengjiancha:{}",this.getClass().getName(),weishengjiancha.toString());
        //根据字段查询是否有相同数据
        Wrapper<WeishengjianchaEntity> queryWrapper = new EntityWrapper<WeishengjianchaEntity>()
            .notIn("id",weishengjiancha.getId())
            .andNew()
            .eq("sushe_id", weishengjiancha.getSusheId())
            .eq("weishengjiancha_time", weishengjiancha.getWeishengjianchaTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WeishengjianchaEntity weishengjianchaEntity = weishengjianchaService.selectOne(queryWrapper);
        if(weishengjianchaEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      weishengjiancha.set
            //  }
            weishengjianchaService.updateById(weishengjiancha);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该宿舍该天已有卫生检查记录");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        weishengjianchaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

