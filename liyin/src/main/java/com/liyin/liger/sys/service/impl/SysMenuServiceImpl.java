package com.liyin.liger.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysMenuDao;
import com.liyin.liger.sys.dto.SysMenuDto;
import com.liyin.liger.sys.model.SysMenu;
import com.liyin.liger.sys.service.SysMenuService;

@Service
public class SysMenuServiceImpl extends AbstractBaseServiceImpl< SysMenu, SysMenuDto>  implements SysMenuService{

	@Autowired
	public SysMenuDao baseDao;

	@Override
	BaseDao<SysMenu> getBaseDaoImpl() {
		return baseDao;
	}

	
}
