package com.cl.dao;

import com.cl.entity.WanjushipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjushipinView;


/**
 * 玩具视频
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjushipinDao extends BaseMapper<WanjushipinEntity> {
	
	List<WanjushipinView> selectListView(@Param("ew") Wrapper<WanjushipinEntity> wrapper);

	List<WanjushipinView> selectListView(Pagination page,@Param("ew") Wrapper<WanjushipinEntity> wrapper);
	
	WanjushipinView selectView(@Param("ew") Wrapper<WanjushipinEntity> wrapper);
	

}
