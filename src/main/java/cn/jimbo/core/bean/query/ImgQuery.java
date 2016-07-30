package cn.jimbo.core.bean.query;

public class ImgQuery extends BaseQuery {
	private static final long serialVersionUID = 2614322893104414130L;
	private Integer id;
	private Integer productId;
	private String url;
	//是否默认:0否 1:是
	private Integer isDef;
	private String fields;
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
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	

}
