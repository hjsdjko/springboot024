package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusswanjuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswanjuxinxiView;


/**
 * 玩具信息评论表
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface DiscusswanjuxinxiService extends IService<DiscusswanjuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswanjuxinxiView> selectListView(Wrapper<DiscusswanjuxinxiEntity> wrapper);
   	
   	DiscusswanjuxinxiView selectView(@Param("ew") Wrapper<DiscusswanjuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswanjuxinxiEntity> wrapper);
   	

}

