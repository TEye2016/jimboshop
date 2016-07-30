package cn.jimbo.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.Product;
import cn.jimbo.core.bean.query.ProductQuery;
import cn.jimbo.core.dao.product.ProductDao;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Transactional(readOnly = true)
	public Pagination getProductWithPage(ProductQuery productQuery) {
		List<Product> products = this.productDao.getProductWithPage(productQuery);
		int i = productDao.getCounts(productQuery);
		Pagination pagination = new Pagination(productQuery.getPageNo(), productQuery.getPageSize(),
				i);
		pagination.setList(products);
		return pagination;
	}

}
