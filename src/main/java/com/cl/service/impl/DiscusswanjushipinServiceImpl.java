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


import com.cl.dao.DiscusswanjushipinDao;
import com.cl.entity.DiscusswanjushipinEntity;
import com.cl.service.DiscusswanjushipinService;
import com.cl.entity.view.DiscusswanjushipinView;

@Service("discusswanjushipinService")
public class DiscusswanjushipinServiceImpl extends ServiceImpl<DiscusswanjushipinDao, DiscusswanjushipinEntity> implements DiscusswanjushipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswanjushipinEntity> page = this.selectPage(
                new Query<DiscusswanjushipinEntity>(params).getPage(),
                new EntityWrapper<DiscusswanjushipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswanjushipinEntity> wrapper) {
		  Page<DiscusswanjushipinView> page =new Query<DiscusswanjushipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusswanjushipinView> selectListView(Wrapper<DiscusswanjushipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswanjushipinView selectView(Wrapper<DiscusswanjushipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
