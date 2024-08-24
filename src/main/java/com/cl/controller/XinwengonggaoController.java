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

import com.cl.entity.XinwengonggaoEntity;
import com.cl.entity.view.XinwengonggaoView;

import com.cl.service.XinwengonggaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 新闻公告
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@RestController
@RequestMapping("/xinwengonggao")
public class XinwengonggaoController {
    @Autowired
    private XinwengonggaoService xinwengonggaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinwengonggaoEntity xinwengonggao,
		HttpServletRequest request){
        EntityWrapper<XinwengonggaoEntity> ew = new EntityWrapper<XinwengonggaoEntity>();

		PageUtils page = xinwengonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwengonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinwengonggaoEntity xinwengonggao, 
		HttpServletRequest request){
        EntityWrapper<XinwengonggaoEntity> ew = new EntityWrapper<XinwengonggaoEntity>();

		PageUtils page = xinwengonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwengonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinwengonggaoEntity xinwengonggao){
       	EntityWrapper<XinwengonggaoEntity> ew = new EntityWrapper<XinwengonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinwengonggao, "xinwengonggao")); 
        return R.ok().put("data", xinwengonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinwengonggaoEntity xinwengonggao){
        EntityWrapper< XinwengonggaoEntity> ew = new EntityWrapper< XinwengonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinwengonggao, "xinwengonggao")); 
		XinwengonggaoView xinwengonggaoView =  xinwengonggaoService.selectView(ew);
		return R.ok("查询新闻公告成功").put("data", xinwengonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinwengonggaoEntity xinwengonggao = xinwengonggaoService.selectById(id);
		xinwengonggao = xinwengonggaoService.selectView(new EntityWrapper<XinwengonggaoEntity>().eq("id", id));
        return R.ok().put("data", xinwengonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinwengonggaoEntity xinwengonggao = xinwengonggaoService.selectById(id);
		xinwengonggao = xinwengonggaoService.selectView(new EntityWrapper<XinwengonggaoEntity>().eq("id", id));
        return R.ok().put("data", xinwengonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinwengonggaoEntity xinwengonggao, HttpServletRequest request){
    	xinwengonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwengonggao);
        xinwengonggaoService.insert(xinwengonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinwengonggaoEntity xinwengonggao, HttpServletRequest request){
    	xinwengonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwengonggao);
        xinwengonggaoService.insert(xinwengonggao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinwengonggaoEntity xinwengonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinwengonggao);
        xinwengonggaoService.updateById(xinwengonggao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinwengonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
