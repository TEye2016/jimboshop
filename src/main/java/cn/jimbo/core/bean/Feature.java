package cn.jimbo.core.bean;

import java.io.Serializable;
/**
 * 商品属性类
 * @author 笑匠
 *
 */
public class Feature implements Serializable{
	private static final long serialVersionUID = -977076379178711555L;
	private Integer id;
	private String value;
	private String name;
	private Integer sort;
	// 是否废弃:1:未废弃,0:废弃了
	private Integer isDel;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	

}
