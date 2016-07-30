package cn.jimbo.core.controller.admin;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.bean.query.BrandQuery;
import cn.jimbo.core.bean.query.ColorQuery;
import cn.jimbo.core.bean.query.FeatureQuery;
import cn.jimbo.core.bean.query.ProductQuery;
import cn.jimbo.core.bean.query.TypeQuery;
import cn.jimbo.core.service.product.BrandService;
import cn.jimbo.core.service.product.ColorService;
import cn.jimbo.core.service.product.FeatureService;
import cn.jimbo.core.service.product.ProductService;
import cn.jimbo.core.service.product.TypeService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private TypeService  typeService;
	@Autowired
	private FeatureService featureService;
	@Autowired
	private ColorService colorService;
	@RequestMapping("/list.do")
	public String list(Integer pageNo,String name,Integer brandId,Integer isShow,ModelMap model) {
		//品牌条件对象
				BrandQuery brandQuery = new BrandQuery();
				//设置指定字段
				brandQuery.setFields("id,name");
				//设置可见
				brandQuery.setIsDisplay(1);
				//加载品牌
				List<Brand> brands = brandService.getBrandList(brandQuery);
				//显示在页面
				model.addAttribute("brands", brands);
				
				
				//分页参数
				StringBuilder params = new StringBuilder();
				
				//商品条件对象
				ProductQuery productQuery = new ProductQuery();
				//1:判断条件是为Null
				if(StringUtils.isNotBlank(name)){
					productQuery.setName(name);
					//要求模糊查询
					productQuery.setNameLike(true);
					
					params.append("&name=").append(name);
					
					//回显查询条件
					model.addAttribute("name", name);
				}
				//判断品牌ID
				if(null != brandId){
					productQuery.setBrandId(brandId);
					params.append("&").append("brandId=").append(brandId);
					
					//回显查询条件
					model.addAttribute("brandId", brandId);
				}
				//判断上下架状态
				if(null != isShow){
					productQuery.setIsShow(isShow);
					params.append("&").append("isShow=").append(isShow);
					//回显查询条件
					model.addAttribute("isShow", isShow);
				}else{
					productQuery.setIsShow(0);
					params.append("&").append("isShow=").append(0);
					//回显查询条件
					model.addAttribute("isShow", 0);
				}
				//设置页号
				productQuery.setPageNo(Pagination.cpn(pageNo));
				//设置每页数
				productQuery.setPageSize(5);
				//按照ID倒排
				productQuery.orderbyId(false);
				
				//加载带有分页的商品
				Pagination pagination = productService.getProductWithPage(productQuery);
				
				//分页页面展示    //String params = "brandId=1&name=2014瑜伽服套装新款&pageNo=1";
				String url = "/product/list.do";
				pagination.pageView(url, params.toString());
				model.addAttribute("pagination", pagination);
				return "product/list";
	}
	@RequestMapping("/toAdd.do")
	public String toAdd(ModelMap map){
		TypeQuery t = new TypeQuery();
		t.setFields("name,id");
		BrandQuery brandQuery = new BrandQuery();
		brandQuery.setFields("id,name");
		brandQuery.setIsDisplay(1);
		t.setIsDisplay(0);
		t.setParentId(0);
		FeatureQuery featureQuery = new FeatureQuery();
		featureQuery.setFields("id,name");
		featureQuery.setIsDel(0);
		ColorQuery c = new ColorQuery();
		c.setFields("id,name");
		c.setParentId(0);
		map.addAttribute("brands", brandService.getBrandList(brandQuery));
		map.addAttribute("types", typeService.types(t));
		map.addAttribute("features", featureService.getAllFeatures(null));
		map.addAttribute("colors", colorService.getAllColors(c));
		return "product/add";
	}
}
