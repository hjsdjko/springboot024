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

import com.cl.entity.WanjushipinEntity;
import com.cl.entity.view.WanjushipinView;

import com.cl.service.WanjushipinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 玩具视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@RestController
@RequestMapping("/wanjushipin")
public class WanjushipinController {
    @Autowired
    private WanjushipinService wanjushipinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WanjushipinEntity wanjushipin,
		HttpServletRequest request){
        EntityWrapper<WanjushipinEntity> ew = new EntityWrapper<WanjushipinEntity>();

		PageUtils page = wanjushipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjushipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WanjushipinEntity wanjushipin, 
		HttpServletRequest request){
        EntityWrapper<WanjushipinEntity> ew = new EntityWrapper<WanjushipinEntity>();

		PageUtils page = wanjushipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjushipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WanjushipinEntity wanjushipin){
       	EntityWrapper<WanjushipinEntity> ew = new EntityWrapper<WanjushipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wanjushipin, "wanjushipin")); 
        return R.ok().put("data", wanjushipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WanjushipinEntity wanjushipin){
        EntityWrapper< WanjushipinEntity> ew = new EntityWrapper< WanjushipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wanjushipin, "wanjushipin")); 
		WanjushipinView wanjushipinView =  wanjushipinService.selectView(ew);
		return R.ok("查询玩具视频成功").put("data", wanjushipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WanjushipinEntity wanjushipin = wanjushipinService.selectById(id);
		wanjushipin = wanjushipinService.selectView(new EntityWrapper<WanjushipinEntity>().eq("id", id));
        return R.ok().put("data", wanjushipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WanjushipinEntity wanjushipin = wanjushipinService.selectById(id);
		wanjushipin = wanjushipinService.selectView(new EntityWrapper<WanjushipinEntity>().eq("id", id));
        return R.ok().put("data", wanjushipin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WanjushipinEntity wanjushipin, HttpServletRequest request){
    	wanjushipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjushipin);
        wanjushipinService.insert(wanjushipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WanjushipinEntity wanjushipin, HttpServletRequest request){
    	wanjushipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjushipin);
        wanjushipinService.insert(wanjushipin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WanjushipinEntity wanjushipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wanjushipin);
        wanjushipinService.updateById(wanjushipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wanjushipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
