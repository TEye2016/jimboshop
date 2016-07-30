package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Product;
import cn.jimbo.core.bean.query.ProductQuery;

public interface ProductDao {
	public List<Product> getProductWithPage(ProductQuery productQuery);
	public Integer getCounts(ProductQuery productQuery);
}
