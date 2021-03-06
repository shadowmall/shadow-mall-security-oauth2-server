package org.shadow.mall.shadowmallsecurityoauth2server.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_role模型
* @author tools
*/
@Table(name = "sys_role")
@Entity
public class SysRole{
	
    /*
     * 角色ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
    private int roleId;
	/*
     * 角色编号
     */
	@Column(name = "role_no")
    private String roleNo;
    /*
     * 角色名称
     */
	@Column(name = "role_name")
    private String roleName;
    /*
     * 角色类型
     */
	@Column(name = "role_type")
    private int roleType;
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
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleType() {
		return roleType;
	}
	public void setRoleType(int roleType) {
		this.roleType = roleType;
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