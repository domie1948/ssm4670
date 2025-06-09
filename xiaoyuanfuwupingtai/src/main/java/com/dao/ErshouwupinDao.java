package com.dao;

import com.entity.ErshouwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshouwupinView;

/**
 * 二手物品 Dao 接口
 *
 * @author 
 * @since 2021-05-04
 */
public interface ErshouwupinDao extends BaseMapper<ErshouwupinEntity> {

   List<ErshouwupinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
