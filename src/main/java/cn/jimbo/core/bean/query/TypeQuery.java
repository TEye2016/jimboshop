package cn.jimbo.core.bean.query;
/**
 * 商品类型查询对象
 * @author 笑匠
 *
 */
public class TypeQuery extends BaseQuery {
	private static final long serialVersionUID = 8709627304191342662L;
	private Integer id;
	private String name;
	private Integer parentId;
	//用于google搜索页面描述
	private String note;
	private Integer isDisplay;
	//查询字段的指定，如select name,id..
	private String fields;
	private boolean noteLike;
	public boolean isNoteLike() {
		return noteLike;
	}
	public void setNoteLike(boolean noteLike) {
		this.noteLike = noteLike;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
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
