package com.liyin.liger.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liyin.liger.sys.dto.SysUserDto;
import com.liyin.liger.sys.model.SysUser;
import com.liyin.liger.sys.service.BaseService;
import com.liyin.liger.sys.service.SysUserService;

@Controller
@RequestMapping("sysUser")
public class SysUserController extends AbstractController<SysUser,SysUserDto>{

	@Autowired
	private SysUserService sysUserService;
	
	@Override
	BaseService<SysUser, SysUserDto> getBaseServiceImpl() {
		return sysUserService;
	}

	@RequestMapping("ddd")
	public String pp() {
		return "index";
	}
}
