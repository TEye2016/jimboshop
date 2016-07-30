package cn.jimbo.core.service.product;


import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.query.ProductQuery;

public interface ProductService {
	public Pagination getProductWithPage(ProductQuery productQuery);
}
