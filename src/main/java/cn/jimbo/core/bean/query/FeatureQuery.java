package cn.jimbo.core.bean.query;

import java.util.ArrayList;
import java.util.List;

public class FeatureQuery extends BaseQuery {
	private static final long serialVersionUID = -5441937542842868201L;
	private Integer id;
	private String value;
	private String name;
	private Integer sort;
	// 是否废弃:1:未废弃,0:废弃了
	private Integer isDel;
	private String fields;
	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public class OrderFields {
		String field;
		String order;

		public OrderFields(String field, String order) {
			super();
			this.field = field;
			this.order = order;
		}

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

	}

	private List<OrderFields> orderFields = new ArrayList<FeatureQuery.OrderFields>();

	public FeatureQuery orderById(boolean isAsc) {
		orderFields.add(new OrderFields("id", isAsc == true ? "asc" : "desc"));
		return this;
	}

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
