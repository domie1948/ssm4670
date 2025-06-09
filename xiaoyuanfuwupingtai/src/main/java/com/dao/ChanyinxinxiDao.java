package com.dao;

import com.entity.ChanyinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanyinxinxiView;

/**
 * 餐饮信息 Dao 接口
 *
 * @author 
 * @since 2021-05-04
 */
public interface ChanyinxinxiDao extends BaseMapper<ChanyinxinxiEntity> {

   List<ChanyinxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
