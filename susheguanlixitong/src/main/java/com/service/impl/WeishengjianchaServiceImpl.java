package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.WeishengjianchaDao;
import com.entity.WeishengjianchaEntity;
import com.service.WeishengjianchaService;
import com.entity.view.WeishengjianchaView;

/**
 * 卫生检查 服务实现类
 * @author 
 * @since 2021-04-23
 */
@Service("weishengjianchaService")
@Transactional
public class WeishengjianchaServiceImpl extends ServiceImpl<WeishengjianchaDao, WeishengjianchaEntity> implements WeishengjianchaService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<WeishengjianchaView> page =new Query<WeishengjianchaView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
