package com.cl.dao;

import com.cl.entity.WanjuguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuguihaiView;


/**
 * 玩具归还
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface WanjuguihaiDao extends BaseMapper<WanjuguihaiEntity> {
	
	List<WanjuguihaiView> selectListView(@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);

	List<WanjuguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);
	
	WanjuguihaiView selectView(@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);



}
