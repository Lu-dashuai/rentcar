package com.aaa.rent.entity;

import java.util.List;

/***
 *@className:TreeNode.java
 *@discripton:
 *@author:zz
 *@createTime:2018-10-9上午11:11:54
 *@version:
 */
public class TreeNode {

	 private Integer id;
	 private String name;
	 private Integer parentId;
	 private String state;
	 private String iconCls;
	 private String url;
	 //因为要选择树节点
	 private String checked;
	 public TreeNode(int id, String name, int parentId, String state,
			String iconCls, String url, String checked) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.state = state;
		this.iconCls = iconCls;
		this.url = url;
		this.checked = checked;
	}


	/**
	  * 带参构造
	  * @param id
	  * @param name
	  * @param parentId
	  * @param state
	  * @param iconCls
	  * @param url
	  */
	 public TreeNode(int id, String name, int parentId, String state,
			String iconCls, String url) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.state = state;
		this.iconCls = iconCls;
		this.url = url;
	}
	 
	 
	public String getChecked() {
		return checked;
	}


	public void setChecked(String checked) {
		this.checked = checked;
	}


	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}


	private List<TreeNode> children;


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

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
}
