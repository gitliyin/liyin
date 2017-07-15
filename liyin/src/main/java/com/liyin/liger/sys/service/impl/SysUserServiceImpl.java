package com.liyin.liger.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysUserDao;
import com.liyin.liger.sys.dto.SysUserDto;
import com.liyin.liger.sys.model.SysUser;
import com.liyin.liger.sys.service.SysUserService;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao,SysUser, SysUserDto>  implements SysUserService{
	
	@Autowired
	private SysUserDao baseDao;

	@Override
	BaseDao<SysUser> getBaseDaoImpl() {
		return baseDao;
	}
	
	
}
