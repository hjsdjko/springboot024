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

import com.cl.entity.WanjufenleiEntity;
import com.cl.entity.view.WanjufenleiView;

import com.cl.service.WanjufenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 玩具分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@RestController
@RequestMapping("/wanjufenlei")
public class WanjufenleiController {
    @Autowired
    private WanjufenleiService wanjufenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WanjufenleiEntity wanjufenlei,
		HttpServletRequest request){
        EntityWrapper<WanjufenleiEntity> ew = new EntityWrapper<WanjufenleiEntity>();

		PageUtils page = wanjufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjufenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WanjufenleiEntity wanjufenlei, 
		HttpServletRequest request){
        EntityWrapper<WanjufenleiEntity> ew = new EntityWrapper<WanjufenleiEntity>();

		PageUtils page = wanjufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjufenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WanjufenleiEntity wanjufenlei){
       	EntityWrapper<WanjufenleiEntity> ew = new EntityWrapper<WanjufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wanjufenlei, "wanjufenlei")); 
        return R.ok().put("data", wanjufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WanjufenleiEntity wanjufenlei){
        EntityWrapper< WanjufenleiEntity> ew = new EntityWrapper< WanjufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wanjufenlei, "wanjufenlei")); 
		WanjufenleiView wanjufenleiView =  wanjufenleiService.selectView(ew);
		return R.ok("查询玩具分类成功").put("data", wanjufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WanjufenleiEntity wanjufenlei = wanjufenleiService.selectById(id);
		wanjufenlei = wanjufenleiService.selectView(new EntityWrapper<WanjufenleiEntity>().eq("id", id));
        return R.ok().put("data", wanjufenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WanjufenleiEntity wanjufenlei = wanjufenleiService.selectById(id);
		wanjufenlei = wanjufenleiService.selectView(new EntityWrapper<WanjufenleiEntity>().eq("id", id));
        return R.ok().put("data", wanjufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WanjufenleiEntity wanjufenlei, HttpServletRequest request){
    	wanjufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjufenlei);
        wanjufenleiService.insert(wanjufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WanjufenleiEntity wanjufenlei, HttpServletRequest request){
    	wanjufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjufenlei);
        wanjufenleiService.insert(wanjufenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WanjufenleiEntity wanjufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wanjufenlei);
        wanjufenleiService.updateById(wanjufenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wanjufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
