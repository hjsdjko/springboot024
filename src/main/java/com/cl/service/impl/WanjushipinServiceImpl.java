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


import com.cl.dao.WanjushipinDao;
import com.cl.entity.WanjushipinEntity;
import com.cl.service.WanjushipinService;
import com.cl.entity.view.WanjushipinView;

@Service("wanjushipinService")
public class WanjushipinServiceImpl extends ServiceImpl<WanjushipinDao, WanjushipinEntity> implements WanjushipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjushipinEntity> page = this.selectPage(
                new Query<WanjushipinEntity>(params).getPage(),
                new EntityWrapper<WanjushipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjushipinEntity> wrapper) {
		  Page<WanjushipinView> page =new Query<WanjushipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WanjushipinView> selectListView(Wrapper<WanjushipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjushipinView selectView(Wrapper<WanjushipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
