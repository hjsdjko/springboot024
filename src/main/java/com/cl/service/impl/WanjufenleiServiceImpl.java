package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.WanjufenleiDao;
import com.cl.entity.WanjufenleiEntity;
import com.cl.service.WanjufenleiService;
import com.cl.entity.view.WanjufenleiView;

@Service("wanjufenleiService")
public class WanjufenleiServiceImpl extends ServiceImpl<WanjufenleiDao, WanjufenleiEntity> implements WanjufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjufenleiEntity> page = this.selectPage(
                new Query<WanjufenleiEntity>(params).getPage(),
                new EntityWrapper<WanjufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjufenleiEntity> wrapper) {
		  Page<WanjufenleiView> page =new Query<WanjufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WanjufenleiView> selectListView(Wrapper<WanjufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjufenleiView selectView(Wrapper<WanjufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
