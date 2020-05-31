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
@Table(name = "sys_menu")
@Entity
public class SysMenu{
	/*
     * 菜单ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id")
    private int menuId;
	/*
     * 菜单编号
     */
	@Column(name = "menu_no")
    private String menuNo;
	/*
     * 父菜单编号
     */
	@Column(name = "menu_parent")
    private String menuParent;
	/*
     * 菜单ICON
     */
	@Column(name = "menu_icon")
    private String menuIcon;
    /*
     * 菜单名称
     */
	@Column(name = "menu_name")
    private String menuName;
    /*
     * 菜单路由
     */
	@Column(name = "menu_router")
    private String menuRouter;
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
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuParent() {
		return menuParent;
	}
	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}
	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuRouter() {
		return menuRouter;
	}
	public void setMenuRouter(String menuRouter) {
		this.menuRouter = menuRouter;
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