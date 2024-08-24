package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.WanjuxinxiEntity;
import com.cl.entity.view.WanjuxinxiView;

import com.cl.service.WanjuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 玩具信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@RestController
@RequestMapping("/wanjuxinxi")
public class WanjuxinxiController {
    @Autowired
    private WanjuxinxiService wanjuxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WanjuxinxiEntity wanjuxinxi,
		HttpServletRequest request){
        EntityWrapper<WanjuxinxiEntity> ew = new EntityWrapper<WanjuxinxiEntity>();

		PageUtils page = wanjuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WanjuxinxiEntity wanjuxinxi, 
		HttpServletRequest request){
        EntityWrapper<WanjuxinxiEntity> ew = new EntityWrapper<WanjuxinxiEntity>();

		PageUtils page = wanjuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WanjuxinxiEntity wanjuxinxi){
       	EntityWrapper<WanjuxinxiEntity> ew = new EntityWrapper<WanjuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wanjuxinxi, "wanjuxinxi")); 
        return R.ok().put("data", wanjuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WanjuxinxiEntity wanjuxinxi){
        EntityWrapper< WanjuxinxiEntity> ew = new EntityWrapper< WanjuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wanjuxinxi, "wanjuxinxi")); 
		WanjuxinxiView wanjuxinxiView =  wanjuxinxiService.selectView(ew);
		return R.ok("查询玩具信息成功").put("data", wanjuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WanjuxinxiEntity wanjuxinxi = wanjuxinxiService.selectById(id);
		wanjuxinxi = wanjuxinxiService.selectView(new EntityWrapper<WanjuxinxiEntity>().eq("id", id));
        return R.ok().put("data", wanjuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WanjuxinxiEntity wanjuxinxi = wanjuxinxiService.selectById(id);
		wanjuxinxi = wanjuxinxiService.selectView(new EntityWrapper<WanjuxinxiEntity>().eq("id", id));
        return R.ok().put("data", wanjuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WanjuxinxiEntity wanjuxinxi, HttpServletRequest request){
    	wanjuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjuxinxi);
        wanjuxinxiService.insert(wanjuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WanjuxinxiEntity wanjuxinxi, HttpServletRequest request){
    	wanjuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjuxinxi);
        wanjuxinxiService.insert(wanjuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WanjuxinxiEntity wanjuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wanjuxinxi);
        wanjuxinxiService.updateById(wanjuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wanjuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
