package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WanjuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuxinxiView;


/**
 * 玩具信息
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjuxinxiService extends IService<WanjuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjuxinxiView> selectListView(Wrapper<WanjuxinxiEntity> wrapper);
   	
   	WanjuxinxiView selectView(@Param("ew") Wrapper<WanjuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjuxinxiEntity> wrapper);
   	

}

