package org.shadow.mall.shadowmallsecurityoauth2server.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_resource模型
* @author tools
*/
@Table(name = "sys_resource")
@Entity
public class SysResource{
	
    /*
     * 资源ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "resource_id")
    private int resourceId;
	/*
     * 资源编号
     */
	@Column(name = "resource_no")
    private String resourceNo;
    /*
     * 资源名称
     */
	@Column(name = "resource_name")
    private String resourceName;
    /*
     * 资源路径
     */
	@Column(name = "resource_url")
    private String resourceUrl;
    /*
     * 资源所属模块
     */
	@Column(name = "resource_module")
    private String resourceModule;
    
    /*
     * 记录创建时间
     */
	@Column(name = "create_date")
    private Timestamp createDate;
    /*
     * 排序号
     */
	@Column(name = "order_by")
    private int orderBy;
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceNo() {
		return resourceNo;
	}
	public void setResourceNo(String resourceNo) {
		this.resourceNo = resourceNo;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceUrl() {
		return resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public String getResourceModule() {
		return resourceModule;
	}
	public void setResourceModule(String resourceModule) {
		this.resourceModule = resourceModule;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}
    
}