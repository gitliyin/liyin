package com.liyin.liger.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysRoleDao;
import com.liyin.liger.sys.dto.SysRoleDto;
import com.liyin.liger.sys.model.SysRole;
import com.liyin.liger.sys.service.SysRoleService;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRole, SysRoleDto>  implements SysRoleService{

	@Autowired
	SysRoleDao baseDao;

	@Override
	BaseDao<SysRole> getBaseDaoImpl() {
		return baseDao;
	}
	
	
}
