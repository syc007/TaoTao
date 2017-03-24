package com.taotao.pojo;

import java.util.List;

/*
 * 返回给EasyUI的页面的数据,我们到时候把这个转为json返回给前端,用来分页显示用
 */
public class EasyUIResult<E>{
	private Integer total;//需要一个总的条数
	private List<E> rows;//这个是一个页面保护了多少E对象
	public EasyUIResult() {
		super();
	}
	/*
	 * Long转为int
	 */
	public EasyUIResult(Integer total, List<E> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public EasyUIResult(Long total, List<E> rows) {
		super();
		this.total = total.intValue();
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<E> getRows() {
		return rows;
	}
	public void setRows(List<E> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "EasyUIResult [total=" + total + ", rows=" + rows + "]";
	}
}
