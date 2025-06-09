package com.dao;

import com.entity.QueqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QueqinView;

/**
 * 缺勤 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface QueqinDao extends BaseMapper<QueqinEntity> {

   List<QueqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
