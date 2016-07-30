package cn.jimbo.core.service.test.product;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.query.ProductQuery;
import cn.jimbo.core.service.product.ProductService;
import cn.jimbo.core.service.test.SpringTest;

public class ProductServiceTest extends SpringTest {
	@Autowired
	private  ProductService productService;
	@Test
	public void test(){
		ProductQuery productQuery = new ProductQuery();
		productQuery.setPageNo(1);
		productQuery.setPageSize(5);
		productQuery.setIsHot(1);
		productQuery.setIsNew(0);
		productQuery.setIsShow(1);
		productQuery.setIsDel(1);
		Pagination p = productService.getProductWithPage(productQuery);
		System.out.println(p.getList().size());
	}
}
