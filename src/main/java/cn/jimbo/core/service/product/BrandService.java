package cn.jimbo.core.service.product;

import java.util.List;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.bean.query.BrandQuery;

public interface BrandService {
	/**
	 * 分页获取品牌信息
	 * 
	 * @param brand
	 * @return
	 */
	public Pagination getBrandsBypage(Brand brand);

	public void save(Brand brand);

	public Brand getBrandById(BrandQuery brandQuery);

	public void upDateBrand(BrandQuery brandQuery);

	// 查询集合
	public List<Brand> getBrandList(BrandQuery brandQuery);
}
