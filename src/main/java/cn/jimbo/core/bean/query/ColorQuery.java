package cn.jimbo.core.bean.query;

import java.util.ArrayList;
import java.util.List;
public class ColorQuery extends BaseQuery {

	private static final long serialVersionUID = 5513763261936951049L;
	private Integer id;
	private String name;
	private String imgUrl;
	private Integer parentId;
	private String fields;

	// orderfield.field
	public class Orderfield {
		String field;
		String order;

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getOrder() {
			return order;
		}

		public void setOrder(String order) {
			this.order = order;
		}

		public Orderfield(String field, String order) {
			super();
			this.field = field;
			this.order = order;
		}
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

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	private List<Orderfield> orderFields = new ArrayList<Orderfield>();

	public ColorQuery iDIsAsc(boolean asc) {
		orderFields.add(new Orderfield("id", asc ? "asc" : "desc"));
		return this;
	}
}
