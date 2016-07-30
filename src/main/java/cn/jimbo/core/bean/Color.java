package cn.jimbo.core.bean;

import java.io.Serializable;
/**
 * 颜色系
 * @author 笑匠
 *
 */
public class Color implements Serializable {

	private static final long serialVersionUID = 2240988842544613371L;
	private Integer id;
	private String name;
	private String imgUrl;
	private Integer parentId;
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
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
