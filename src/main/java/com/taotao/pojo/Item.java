package com.taotao.pojo;

/*
 * 这个类表示商品
 */
//<th data-options="field:'ck',checkbox:true"></th>
//<th data-options="field:'id',width:60">商品ID</th>
//<th data-options="field:'title',width:200">商品标题</th>
//<th data-options="field:'cid',width:100">叶子类目</th>
//<th data-options="field:'sellPoint',width:100">卖点</th>
//<th data-options="field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice">价格</th>
//<th data-options="field:'num',width:70,align:'right'">库存数量</th>
//<th data-options="field:'barcode',width:100">条形码</th>
//<th data-options="field:'status',width:60,align:'center',formatter:TAOTAO.formatItemStatus">状态</th>
//<th data-options="field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建日期</th>
//<th data-options="field:'updated',

//`id` bigint(20) NOT NULL COMMENT '商品id，同时也是商品编号',
//`title` varchar(100) NOT NULL COMMENT '商品标题',
//`sell_point` varchar(500) DEFAULT NULL COMMENT '商品卖点',
//`price` bigint(20) NOT NULL COMMENT '商品价格，单位为：分',
//`num` int(10) NOT NULL COMMENT '库存数量',
//`barcode` varchar(30) DEFAULT NULL COMMENT '商品条形码',
//`image` varchar(500) DEFAULT NULL COMMENT '商品图片',
//`cid` bigint(10) NOT NULL COMMENT '所属类目，叶子类目',
//`status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除',
//`created` datetime NOT NULL COMMENT '创建时间',
//`updated` datetime NOT NULL COMMENT '更新时间',
//PRIMARY KEY (`id`),
public class Item {
	private Long id;
	private String title;
	private String sellPoint;
	private Long price;
	private Integer num;
	private String barcode;//条形码
	private String image;
	private Long cid;
	private Integer status;// DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除'
	private String created;//创建时间
	private String updated;//更新时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSellPoint() {
		return sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", sellPoint=" + sellPoint + ", price=" + price + ", num=" + num
				+ ", barcode=" + barcode + ", image=" + image + ", cid=" + cid + ", status=" + status + ", created="
				+ created + ", updated=" + updated + "]";
	}
}
