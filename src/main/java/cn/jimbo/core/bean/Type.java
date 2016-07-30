package cn.jimbo.core.bean;

import java.io.Serializable;
/**
 * 商品类型
 * @author 笑匠
 *
 */
public class Type implements Serializable{
	private static final long serialVersionUID = 1254883160013377350L;
	private Integer id;
	private String name;
	private Integer parentId;
	//用于google搜索页面描述
	private String note;
	private Integer isDisplay;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
}
