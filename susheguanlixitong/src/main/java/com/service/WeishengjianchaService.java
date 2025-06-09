package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengjianchaEntity;
import java.util.Map;

/**
 * 卫生检查 服务类
 * @author 
 * @since 2021-04-23
 */
public interface WeishengjianchaService extends IService<WeishengjianchaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}