package com.liyin.liger.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyin.liger.sys.dao.BaseDao;
import com.liyin.liger.sys.dao.SysLogDao;
import com.liyin.liger.sys.dto.SysLogDto;
import com.liyin.liger.sys.model.SysLog;
import com.liyin.liger.sys.service.SysLogService;

@Service
public class SysLogServiceImpl extends BaseServiceImpl<SysLogDao,SysLog, SysLogDto>  implements SysLogService{

	@Autowired
	public SysLogDao baseDao;

	@Override
	BaseDao<SysLog> getBaseDaoImpl() {
		return baseDao;
	}
}
