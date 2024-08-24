package com.cl.dao;

import com.cl.entity.WanjuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuxinxiView;


/**
 * 玩具信息
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjuxinxiDao extends BaseMapper<WanjuxinxiEntity> {
	
	List<WanjuxinxiView> selectListView(@Param("ew") Wrapper<WanjuxinxiEntity> wrapper);

	List<WanjuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WanjuxinxiEntity> wrapper);
	
	WanjuxinxiView selectView(@Param("ew") Wrapper<WanjuxinxiEntity> wrapper);
	

}
