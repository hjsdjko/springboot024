package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WanjuzulinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WanjuzulinView;


/**
 * 玩具租赁
 *
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
public interface WanjuzulinService extends IService<WanjuzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanjuzulinView> selectListView(Wrapper<WanjuzulinEntity> wrapper);
   	
   	WanjuzulinView selectView(@Param("ew") Wrapper<WanjuzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanjuzulinEntity> wrapper);
   	

}

