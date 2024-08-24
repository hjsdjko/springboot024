package com.cl.dao;

import com.cl.entity.WanjuzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuzulinView;


/**
 * 玩具租赁
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface WanjuzulinDao extends BaseMapper<WanjuzulinEntity> {
	
	List<WanjuzulinView> selectListView(@Param("ew") Wrapper<WanjuzulinEntity> wrapper);

	List<WanjuzulinView> selectListView(Pagination page,@Param("ew") Wrapper<WanjuzulinEntity> wrapper);
	
	WanjuzulinView selectView(@Param("ew") Wrapper<WanjuzulinEntity> wrapper);
	

}
