package cn.jimbo.core.service.test.product;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.service.product.BrandService;
import cn.jimbo.core.service.test.SpringTest;

public class BrandServiceTest extends SpringTest{
	@Autowired
	private BrandService brandService;
	@Test
	public void testGetBrandsBypage(){
		Brand brand = new Brand();
		System.out.println(brandService.getBrandsBypage(brand));
	}
}
