package com.liyin.liger.sys.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface BaseDao<M> {
	
	/**
	 * 获取hibernate session
	 * @return
	 */
	public Session getCurrentSession();
	
	/** 
     * 保存一个对象 
     *  
     * @param m 
     * @return 
     */  
    public Serializable insert(M m);  
   
    /** 
     * 删除一个对象 
     *  
     * @param m 
     */  
    public void delete(M m);  
   
    /** 
     * 更新一个对象 
     *  
     * @param m 
     */  
    public void update(M m);  
   
    /** 
     * 获得一个对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
    public M selectById(Serializable id);  
   
    
    /** 
     * 获得一组对象 
     *  
     * @param c 
     *            对象类型 
     * @param id 
     * @return Object 
     */  
    public List<M> selectList(M m);  
    
    

}
