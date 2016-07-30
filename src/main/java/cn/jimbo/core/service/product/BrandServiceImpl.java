package cn.jimbo.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.bean.query.BrandQuery;
import cn.jimbo.core.dao.product.BrandDao;
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandDao brandDao;
	@Transactional(readOnly = true)
	public Pagination getBrandsBypage(Brand brand) {
		List<Brand> list = brandDao.getBrandsBypage(brand);
		Pagination pagination = new Pagination(brand.getPageNo(), brand.getPageSize(), brandDao.getBrandCount(brand));
		pagination.setList(list);
		return pagination;
	}
	public void save(Brand brand) {
		this.brandDao.save(brand);
	}
	public Brand getBrandById(BrandQuery brandQuery) {
		return this.brandDao.getBrandById(brandQuery);
	}
	public void upDateBrand(BrandQuery brandQuery) {
		this.brandDao.upDateBrand(brandQuery);
	}
	public List<Brand> getBrandList(BrandQuery brandQuery) {
		return brandDao.getBrandList(brandQuery);
	}

}
