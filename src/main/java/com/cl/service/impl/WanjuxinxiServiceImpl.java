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


import com.cl.dao.WanjuxinxiDao;
import com.cl.entity.WanjuxinxiEntity;
import com.cl.service.WanjuxinxiService;
import com.cl.entity.view.WanjuxinxiView;

@Service("wanjuxinxiService")
public class WanjuxinxiServiceImpl extends ServiceImpl<WanjuxinxiDao, WanjuxinxiEntity> implements WanjuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjuxinxiEntity> page = this.selectPage(
                new Query<WanjuxinxiEntity>(params).getPage(),
                new EntityWrapper<WanjuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjuxinxiEntity> wrapper) {
		  Page<WanjuxinxiView> page =new Query<WanjuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WanjuxinxiView> selectListView(Wrapper<WanjuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjuxinxiView selectView(Wrapper<WanjuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
