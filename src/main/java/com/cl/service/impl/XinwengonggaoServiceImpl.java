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


import com.cl.dao.XinwengonggaoDao;
import com.cl.entity.XinwengonggaoEntity;
import com.cl.service.XinwengonggaoService;
import com.cl.entity.view.XinwengonggaoView;

@Service("xinwengonggaoService")
public class XinwengonggaoServiceImpl extends ServiceImpl<XinwengonggaoDao, XinwengonggaoEntity> implements XinwengonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwengonggaoEntity> page = this.selectPage(
                new Query<XinwengonggaoEntity>(params).getPage(),
                new EntityWrapper<XinwengonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwengonggaoEntity> wrapper) {
		  Page<XinwengonggaoView> page =new Query<XinwengonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinwengonggaoView> selectListView(Wrapper<XinwengonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwengonggaoView selectView(Wrapper<XinwengonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
