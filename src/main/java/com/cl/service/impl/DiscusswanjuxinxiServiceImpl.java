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


import com.cl.dao.DiscusswanjuxinxiDao;
import com.cl.entity.DiscusswanjuxinxiEntity;
import com.cl.service.DiscusswanjuxinxiService;
import com.cl.entity.view.DiscusswanjuxinxiView;

@Service("discusswanjuxinxiService")
public class DiscusswanjuxinxiServiceImpl extends ServiceImpl<DiscusswanjuxinxiDao, DiscusswanjuxinxiEntity> implements DiscusswanjuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswanjuxinxiEntity> page = this.selectPage(
                new Query<DiscusswanjuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusswanjuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswanjuxinxiEntity> wrapper) {
		  Page<DiscusswanjuxinxiView> page =new Query<DiscusswanjuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusswanjuxinxiView> selectListView(Wrapper<DiscusswanjuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswanjuxinxiView selectView(Wrapper<DiscusswanjuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
