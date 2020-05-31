package org.shadow.mall.shadowmallsecurityoauth2server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_user_role模型
* @author tools
*/
@Table(name = "sys_user_role")
@Entity
public class SysUserRole{
	
    /*
     * 用户-角色关联ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_role_id")
    private int userRoleId;
    /*
     * 用户编号
     */
	@Column(name = "user_no")
    private String userNo;
    /*
     * 角色编号
     */
	@Column(name = "role_no")
    private String roleNo;
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
}