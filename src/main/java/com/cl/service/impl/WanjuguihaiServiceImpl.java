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


import com.cl.dao.WanjuguihaiDao;
import com.cl.entity.WanjuguihaiEntity;
import com.cl.service.WanjuguihaiService;
import com.cl.entity.view.WanjuguihaiView;

@Service("wanjuguihaiService")
public class WanjuguihaiServiceImpl extends ServiceImpl<WanjuguihaiDao, WanjuguihaiEntity> implements WanjuguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjuguihaiEntity> page = this.selectPage(
                new Query<WanjuguihaiEntity>(params).getPage(),
                new EntityWrapper<WanjuguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjuguihaiEntity> wrapper) {
		  Page<WanjuguihaiView> page =new Query<WanjuguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WanjuguihaiView> selectListView(Wrapper<WanjuguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjuguihaiView selectView(Wrapper<WanjuguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WanjuguihaiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WanjuguihaiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WanjuguihaiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
