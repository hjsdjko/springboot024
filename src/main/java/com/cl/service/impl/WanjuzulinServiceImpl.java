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


import com.cl.dao.WanjuzulinDao;
import com.cl.entity.WanjuzulinEntity;
import com.cl.service.WanjuzulinService;
import com.cl.entity.view.WanjuzulinView;

@Service("wanjuzulinService")
public class WanjuzulinServiceImpl extends ServiceImpl<WanjuzulinDao, WanjuzulinEntity> implements WanjuzulinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanjuzulinEntity> page = this.selectPage(
                new Query<WanjuzulinEntity>(params).getPage(),
                new EntityWrapper<WanjuzulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanjuzulinEntity> wrapper) {
		  Page<WanjuzulinView> page =new Query<WanjuzulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WanjuzulinView> selectListView(Wrapper<WanjuzulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanjuzulinView selectView(Wrapper<WanjuzulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
