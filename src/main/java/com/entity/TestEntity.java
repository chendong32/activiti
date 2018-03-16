package com.entity;

import java.util.Date;

public class TestEntity {
	
	protected String id;
	protected String remarks;	// 备注
	protected TestUser createBy;	// 创建者
	protected Date createDate;	// 创建日期
	protected TestUser updateBy;	// 更新者
	protected Date updateDate;	// 更新日期
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public TestUser getCreateBy() {
		return createBy;
	}
	public void setCreateBy(TestUser createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public TestUser getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(TestUser updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", remarks=" + remarks + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + ", delFlag=" + delFlag + "]";
	}
	
}
