package com.liyin.liger.sys.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liyin.liger.sys.service.BaseService;

public abstract class AbstractController<M, D> {
	
	
	/**
	 * 具体Controller实现,由它提供Service实例
	 * @return
	 */
	abstract BaseService<M,D> getBaseServiceImpl();
	
	/** 
     * 保存一个对象 
     *  
     * @param o 
     * @return 
     */  
	@RequestMapping("insertM")
    public Serializable insert(M m){
    	return getBaseServiceImpl().insert(m);
    }  
   
    /** 
     * 删除一个对象 
     *  
     * @param o 
     */  
	@RequestMapping("deleteM")
    public void delete(M m){
    	getBaseServiceImpl().delete(m);
    }  
   
    /** 
     * 更新一个对象 
     *  
     * @param o 
     */  
	@RequestMapping("updateM")
    public void update(M m){
    	getBaseServiceImpl().update(m);
    }  
   
    /** 
     * 获得一个对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
	@RequestMapping("selectByIdM")
    public M selectById(Serializable id){
    	return getBaseServiceImpl().selectById(id);
    } 
   
    
    /** 
     * 获得一组对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
	@RequestMapping("selectListM")
	@ResponseBody
    public List<M> selectList(M m){
    	return getBaseServiceImpl().selectList(m);
    }  
}
