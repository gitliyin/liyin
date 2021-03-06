package com.liyin.liger.sys.model;

// default package
// Generated 2017-7-15 11:28:57 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * SysUser generated by hbm2java
 */
public class SysUser implements java.io.Serializable {

	private Long id;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private Byte status;
	private Long createUserId;
	private Date createTime;

	public SysUser() {
	}

	public SysUser(String username) {
		this.username = username;
	}
	public SysUser(String username, String password, String email,
			String mobile, Byte status, Long createUserId, Date createTime) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.status = status;
		this.createUserId = createUserId;
		this.createTime = createTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
	public Long getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
