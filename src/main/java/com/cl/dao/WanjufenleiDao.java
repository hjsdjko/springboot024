package com.cl.dao;

import com.cl.entity.WanjufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjufenleiView;


/**
 * 玩具分类
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjufenleiDao extends BaseMapper<WanjufenleiEntity> {
	
	List<WanjufenleiView> selectListView(@Param("ew") Wrapper<WanjufenleiEntity> wrapper);

	List<WanjufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WanjufenleiEntity> wrapper);
	
	WanjufenleiView selectView(@Param("ew") Wrapper<WanjufenleiEntity> wrapper);
	

}
