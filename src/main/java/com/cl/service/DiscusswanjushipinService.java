package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusswanjushipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswanjushipinView;


/**
 * 玩具视频评论表
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface DiscusswanjushipinService extends IService<DiscusswanjushipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswanjushipinView> selectListView(Wrapper<DiscusswanjushipinEntity> wrapper);
   	
   	DiscusswanjushipinView selectView(@Param("ew") Wrapper<DiscusswanjushipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswanjushipinEntity> wrapper);
   	

}

