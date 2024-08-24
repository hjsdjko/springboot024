package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WanjushipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjushipinView;


/**
 * 玩具视频
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjushipinService extends IService<WanjushipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjushipinView> selectListView(Wrapper<WanjushipinEntity> wrapper);
   	
   	WanjushipinView selectView(@Param("ew") Wrapper<WanjushipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjushipinEntity> wrapper);
   	

}

