package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WanjuguihaiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuguihaiView;


/**
 * 玩具归还
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface WanjuguihaiService extends IService<WanjuguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjuguihaiView> selectListView(Wrapper<WanjuguihaiEntity> wrapper);
   	
   	WanjuguihaiView selectView(@Param("ew") Wrapper<WanjuguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjuguihaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WanjuguihaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WanjuguihaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WanjuguihaiEntity> wrapper);



}

