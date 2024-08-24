package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WanjufenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjufenleiView;


/**
 * 玩具分类
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
public interface WanjufenleiService extends IService<WanjufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjufenleiView> selectListView(Wrapper<WanjufenleiEntity> wrapper);
   	
   	WanjufenleiView selectView(@Param("ew") Wrapper<WanjufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjufenleiEntity> wrapper);
   	

}

