package com.cl.dao;

import com.cl.entity.DiscusswanjuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswanjuxinxiView;


/**
 * 玩具信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface DiscusswanjuxinxiDao extends BaseMapper<DiscusswanjuxinxiEntity> {
	
	List<DiscusswanjuxinxiView> selectListView(@Param("ew") Wrapper<DiscusswanjuxinxiEntity> wrapper);

	List<DiscusswanjuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswanjuxinxiEntity> wrapper);
	
	DiscusswanjuxinxiView selectView(@Param("ew") Wrapper<DiscusswanjuxinxiEntity> wrapper);
	

}
