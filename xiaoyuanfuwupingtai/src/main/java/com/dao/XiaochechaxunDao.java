package com.dao;

import com.entity.XiaochechaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaochechaxunView;

/**
 * 校车查询 Dao 接口
 *
 * @author 
 * @since 2021-05-04
 */
public interface XiaochechaxunDao extends BaseMapper<XiaochechaxunEntity> {

   List<XiaochechaxunView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
