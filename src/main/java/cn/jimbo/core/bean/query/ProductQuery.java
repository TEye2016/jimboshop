package cn.jimbo.core.bean.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ProductQuery extends BaseQuery {
	private static final long serialVersionUID = -6670301554842219434L;
	/**
	 * 支持模糊查询的字段
	 */
	private boolean nameLike;
	private boolean noLike;
	private boolean createUserIdLike;
	private boolean checkUserIdLike;
	private boolean keywordsLike;
	/**
	 * 需要查询出的字段
	 * 如：name,no的形式
	 */
	private Integer id;
	private String no;
	private String name;
	private Double weight;
	private Integer isNew = 0;
	private Integer isHot = 0;
	private Integer isCommend = 0;
	private Date createTime;
	private String createUserId;
	private Date checkTime;
	private String checkUserId;
	private Integer isShow = 0;
	private Integer isDel = 1;
	private Integer typeId;
	private Integer brandId;
	private String keywords;
	private Integer sales;
	private String description;
	private String packageList;
	private String feature;
	private String color;// 9,10,11,12
	private String size;// S,L,XXL
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getIsNew() {
		return isNew;
	}
	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
	public Integer getIsHot() {
		return isHot;
	}
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	public Integer getIsCommend() {
		return isCommend;
	}
	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckUserId() {
		return checkUserId;
	}
	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPackageList() {
		return packageList;
	}
	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public List<OrderField> getOrderFields() {
		return orderFields;
	}
	public void setOrderFields(List<OrderField> orderFields) {
		this.orderFields = orderFields;
	}
	private String fields;
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public boolean isNameLike() {
		return nameLike;
	}
	public void setNameLike(boolean nameLike) {
		this.nameLike = nameLike;
	}
	public boolean isNoLike() {
		return noLike;
	}
	public void setNoLike(boolean noLike) {
		this.noLike = noLike;
	}
	public boolean isCreateUserIdLike() {
		return createUserIdLike;
	}
	public void setCreateUserIdLike(boolean createUserIdLike) {
		this.createUserIdLike = createUserIdLike;
	}
	public boolean isCheckUserIdLike() {
		return checkUserIdLike;
	}
	public void setCheckUserIdLike(boolean checkUserIdLike) {
		this.checkUserIdLike = checkUserIdLike;
	}
	public boolean isKeywordsLike() {
		return keywordsLike;
	}
	public void setKeywordsLike(boolean keywordsLike) {
		this.keywordsLike = keywordsLike;
	}
	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * ========
	 **/
	 	public class OrderField {
		public OrderField(String fieldName, String order) {
			super();
			this.fieldName = fieldName;
			this.order = order;
		}
		private String fieldName;
		private String order;

		public String getFieldName() {
			return fieldName;
		}
		public OrderField setFieldName(String fieldName) {
			this.fieldName = fieldName;
			return this;
		}
		public String getOrder() {
			return order;
		}
		public OrderField setOrder(String order) {
			this.order = order;
			return this;
		}
	}
		/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * ========
	 **/
	/** 排序列表字段 **/
	private List<OrderField> orderFields = new ArrayList<OrderField>();
	/**
	 * 设置排序按属性：id
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyId(boolean isAsc) {
		orderFields.add(new OrderField("id", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：no
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyNo(boolean isAsc) {
		orderFields.add(new OrderField("no", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：name
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyName(boolean isAsc) {
		orderFields.add(new OrderField("name", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：weight
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyWeight(boolean isAsc) {
		orderFields.add(new OrderField("weight", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：is_new
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyIsNew(boolean isAsc) {
		orderFields.add(new OrderField("is_new", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：is_hot
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyIsHot(boolean isAsc) {
		orderFields.add(new OrderField("is_hot", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：is_commend
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyIsCommend(boolean isAsc) {
		orderFields.add(new OrderField("is_commend", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：create_time
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyCreateTime(boolean isAsc) {
		orderFields.add(new OrderField("create_time", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：create_user_id
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyCreateUserId(boolean isAsc) {
		orderFields.add(new OrderField("create_user_id", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：check_time
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyCheckTime(boolean isAsc) {
		orderFields.add(new OrderField("check_time", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：check_user_id
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyCheckUserId(boolean isAsc) {
		orderFields.add(new OrderField("check_user_id", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：is_show
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyIsShow(boolean isAsc) {
		orderFields.add(new OrderField("is_show", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：is_del
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：type_id
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyTypeId(boolean isAsc) {
		orderFields.add(new OrderField("type_id", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：brand_id
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyBrandId(boolean isAsc) {
		orderFields.add(new OrderField("brand_id", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：keywords
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyKeywords(boolean isAsc) {
		orderFields.add(new OrderField("keywords", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：sales
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbySales(boolean isAsc) {
		orderFields.add(new OrderField("sales", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：description
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyDescription(boolean isAsc) {
		orderFields.add(new OrderField("description", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：package_list
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyPackageList(boolean isAsc) {
		orderFields.add(new OrderField("package_list", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：feature
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyFeature(boolean isAsc) {
		orderFields.add(new OrderField("feature", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：color
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbyColor(boolean isAsc) {
		orderFields.add(new OrderField("color", isAsc ? "ASC" : "DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：size
	 * 
	 * @param isAsc
	 *            是否升序，否则为降序
	 */
	public ProductQuery orderbySize(boolean isAsc) {
		orderFields.add(new OrderField("size", isAsc ? "ASC" : "DESC"));
		return this;
	}
	
}
