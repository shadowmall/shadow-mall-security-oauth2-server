package org.shadow.mall.shadowmallsecurityoauth2server.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_permission模型
* @author tools
*/
@Table(name = "sys_permission")
@Entity
public class SysPermission{
	
    /*
     * 权限ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_id")
    private int permissionId;
    /*
     * 资源ID
     */
	@Column(name = "resource_no")
    private String resourceNo;
    /*
     * 角色ID
     */
	@Column(name = "role_no")
    private String roleNo;
	/*
	 * 权限类型 
	 */
	@Column(name = "permission_type")
	private int permissionType;
    /*
     * 权限状态
     */
	@Column(name = "permission_status")
    private int permissionStatus;
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
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public String getResourceNo() {
		return resourceNo;
	}
	public void setResourceNo(String resourceNo) {
		this.resourceNo = resourceNo;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
	public int getPermissionType() {
		return permissionType;
	}
	public void setPermissionType(int permissionType) {
		this.permissionType = permissionType;
	}
	public int getPermissionStatus() {
		return permissionStatus;
	}
	public void setPermissionStatus(int permissionStatus) {
		this.permissionStatus = permissionStatus;
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