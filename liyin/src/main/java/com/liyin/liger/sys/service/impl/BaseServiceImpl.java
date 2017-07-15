package com.liyin.liger.sys.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysUserDao;
import com.liyin.liger.sys.service.BaseService;
import com.liyin.liger.sys.utils.SpringConfigTool;

public abstract class BaseServiceImpl<DAO,M,D> implements BaseService<M,D>{
	
	/**
	 * 该方法用于获取子类的dao，用于该类的增删该查方法
	 * @return
	 */
	 abstract BaseDao<M> getBaseDaoImpl();
	
	
	/** 
     * 保存一个对象 
     *  
     * @param o 
     * @return 
     */  
    public Serializable insert(M m){
    	return getBaseDaoImpl().insert(m);
    }  
   
    /** 
     * 删除一个对象 
     *  
     * @param o 
     */  
    public void delete(M m){
    	getBaseDaoImpl().delete(m);
    }  
   
    /** 
     * 更新一个对象 
     *  
     * @param o 
     */  
    public void update(M m){
    	getBaseDaoImpl().update(m);
    }  
   
    /** 
     * 获得一个对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
    public M selectById(Serializable id){
    	return getBaseDaoImpl().selectById(id);
    } 
   
    
    /** 
     * 获得一组对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
    public List<M> selectList(M m){
    	return getBaseDaoImpl().selectList(m);
    }  
    
    

}
