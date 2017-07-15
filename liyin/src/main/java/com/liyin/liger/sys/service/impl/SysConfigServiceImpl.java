package com.liyin.liger.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysConfigDao;
import com.liyin.liger.sys.dto.SysConfigDto;
import com.liyin.liger.sys.model.SysConfig;
import com.liyin.liger.sys.service.SysConfigService;

@Service
public class SysConfigServiceImpl extends BaseServiceImpl<SysConfigDao,SysConfig,SysConfigDto> implements SysConfigService{

	@Autowired
	public SysConfigDao baseDao;

	@Override
	BaseDao<SysConfig> getBaseDaoImpl() {
		return baseDao;
	}
}
