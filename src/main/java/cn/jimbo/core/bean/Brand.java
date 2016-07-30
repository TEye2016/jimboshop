package cn.jimbo.core.bean;

import java.io.Serializable;

import cn.jimbo.core.web.common.Constants;

/**
 * 品牌实体类
 * @author jimboLix@163.com
 *
 */
public class Brand implements Serializable{
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -3291502066090647377L;
	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private String webSite;
	private Integer sort;
	private Integer isDisplay;
	//页号
	private Integer pageNo = 1;
	//开始行
	private Integer startRow;
	//每页数
	private Integer pageSize = 10;
	//图片全部路径
	public String getAllUrl(){
		return Constants.IMG_URL+this.imgUrl;
	}
	public Integer getStartRow() {
			return startRow;
		}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
		}
	public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			//计算一次开始行
			this.startRow = (pageNo - 1)*pageSize;
			this.pageSize = pageSize;
		}
		public Integer getPageNo() {
			return pageNo;
		}
		public void setPageNo(Integer pageNo) {
			//计算一次开始行
			this.startRow = (pageNo - 1)*pageSize;
			this.pageNo = pageNo;
		}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	

	
}
