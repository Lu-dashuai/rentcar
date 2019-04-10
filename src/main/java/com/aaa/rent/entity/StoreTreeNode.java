package com.aaa.rent.entity;

import java.util.List;

public class StoreTreeNode {
	 private Integer id;
	 private String name;
	 private Integer parentId;
	 private String state;
	 private String iconCls;
	 private String url;	 
	 /**
	  * 门店权限树有参构造
	  * @param id
	  * @param name
	  * @param parentId
	  * @param state
	  * @param iconCls
	  * @param url
	  */
	
	public StoreTreeNode(int id, String name, int parentId, String state,
			String iconCls, String url) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.state = state;
		this.iconCls = iconCls;
		this.url = url;
	}
	/**
	 * 无参构造
	 */
	public StoreTreeNode(){};

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
