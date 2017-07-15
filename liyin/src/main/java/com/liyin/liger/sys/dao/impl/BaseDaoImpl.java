package com.liyin.liger.sys.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<M>  {
 
	@Autowired
    private SessionFactory sessionFactory;
	private Class<M> clazz;
	
	public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.clazz = (Class) type.getActualTypeArguments()[0];
    }
	
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public Serializable insert(M m) {
        return this.getCurrentSession().save(m);
    }
 
    public void delete(M m) {
        this.getCurrentSession().delete(m);
    }
 
    public void update(M m) {
        this.getCurrentSession().update(m);
    }
 
   
 
    public M selectById(Serializable id) {
        return (M) this.getCurrentSession().get(clazz, id);
    }

	public List<M> selectList(M m) {
		Criteria criteria = getCurrentSession().createCriteria(clazz);
		
		List<M> list = criteria.list();
		
		if(list == null || list.isEmpty()) {
			return null;
		}
		return list;
	}
 


}