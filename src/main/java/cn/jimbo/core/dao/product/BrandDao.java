package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.bean.query.BrandQuery;

/**
 * 品牌管理的数据
 * 
 * @author jimboLix@163.com
 *
 */
public interface BrandDao {
	/**
	 * 分页获取品牌信息
	 * 
	 * @param brand
	 * @return
	 */
	public List<Brand> getBrandsBypage(Brand brand);

	public Integer getBrandCount(Brand brand);

	public void save(Brand brand);

	public Brand getBrandById(BrandQuery brandQuery);

	public void upDateBrand(BrandQuery brandQuery);

	// 查询集合
	public List<Brand> getBrandList(BrandQuery brandQuery);
}
