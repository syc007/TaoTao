package com.taotao.pojo;

/*
 * 给前端展示树形的目录
 */
public class TreeNode {
	private Integer id;//当前的节点的id
	private String text;//当前节点的内容
	private String state;//当前节点是打开还是关闭，如果这个节点也是父节点，那么就是closed，如果不是父节点，open
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", state=" + state + "]";
	}
}
