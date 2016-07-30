package cn.jimbo.core.bean;

import java.io.Serializable;

public class Img implements Serializable{
	private static final long serialVersionUID = 2067423627546123972L;
	private Integer id;
	private Integer productId;
	private String url;
	//是否默认:0否 1:是
	private Integer isDef;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getIsDef() {
		return isDef;
	}
	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}
	
}
