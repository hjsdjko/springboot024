package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinwengonggaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwengonggaoView;


/**
 * 新闻公告
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface XinwengonggaoService extends IService<XinwengonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwengonggaoView> selectListView(Wrapper<XinwengonggaoEntity> wrapper);
   	
   	XinwengonggaoView selectView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwengonggaoEntity> wrapper);
   	

}

