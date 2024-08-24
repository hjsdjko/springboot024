package com.cl.dao;

import com.cl.entity.DiscusswanjushipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswanjushipinView;


/**
 * 玩具视频评论表
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface DiscusswanjushipinDao extends BaseMapper<DiscusswanjushipinEntity> {
	
	List<DiscusswanjushipinView> selectListView(@Param("ew") Wrapper<DiscusswanjushipinEntity> wrapper);

	List<DiscusswanjushipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswanjushipinEntity> wrapper);
	
	DiscusswanjushipinView selectView(@Param("ew") Wrapper<DiscusswanjushipinEntity> wrapper);
	

}
