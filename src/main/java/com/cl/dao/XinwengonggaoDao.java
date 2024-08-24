package com.cl.dao;

import com.cl.entity.XinwengonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwengonggaoView;


/**
 * 新闻公告
 * 
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface XinwengonggaoDao extends BaseMapper<XinwengonggaoEntity> {
	
	List<XinwengonggaoView> selectListView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);

	List<XinwengonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	
	XinwengonggaoView selectView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	

}
