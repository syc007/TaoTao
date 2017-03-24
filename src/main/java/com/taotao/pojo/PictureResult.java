package com.taotao.pojo;
/**
 * 这种类型的类，在实际开发中非常常见，是我们伪造的一个通信协议的响应类
 * 上传图片返回值
 */
public class PictureResult {

	public static final int SUCCESS = 0;
	public static final int FAIL = 1;
	/**
	 * 上传图片返回值，成功：0	失败：1	
	 */
	private Integer error;
	/**
	 * 回显图片使用的url
	 */
	private String url;
	/**
	 * 错误时的错误消息
	 */
	private String message;
	public PictureResult(Integer state, String url) {
		this.url = url;
		this.error = state;
	}
	public PictureResult(Integer state, String url, String errorMessage) {
		this.url = url;
		this.error = state;
		this.message = errorMessage;
	}
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
