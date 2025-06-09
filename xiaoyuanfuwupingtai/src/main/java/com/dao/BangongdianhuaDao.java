package com.dao;

import com.entity.BangongdianhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BangongdianhuaView;

/**
 * 教师办公电话 Dao 接口
 *
 * @author 
 * @since 2021-05-04
 */
public interface BangongdianhuaDao extends BaseMapper<BangongdianhuaEntity> {

   List<BangongdianhuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
