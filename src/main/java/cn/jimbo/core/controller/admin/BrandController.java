package cn.jimbo.core.controller.admin;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.common.page.Pagination;
import cn.jimbo.core.bean.Brand;
import cn.jimbo.core.bean.query.BrandQuery;
import cn.jimbo.core.service.product.BrandService;

/**
 * 品牌管理
 * 
 * @author lenovo
 * 
 */
@Controller
public class BrandController {
	@Autowired
	private BrandService brandService;

	@RequestMapping("/brand/list.do")
	public String list(String name, Integer isDisplay, Integer pageNo,
			ModelMap model) {
		StringBuilder param = new StringBuilder();
		Brand brand = new Brand();
		if (StringUtils.isNotBlank(name)) {
			brand.setName(name);
			param.append("name=").append(name);
		}
		if (isDisplay != null) {
			brand.setIsDisplay(isDisplay);
			param.append("&");
			param.append("isDisplay=").append(isDisplay);
		} else {
			brand.setIsDisplay(1);
			param.append("&").append("isDisplay=").append("1");
		}
		// 如果页号为null 或小于1 置为1

		// 页号
		brand.setPageNo(Pagination.cpn(pageNo));
		// 每页数
		brand.setPageSize(5);
		// 分页对象
		Pagination pagination = brandService.getBrandsBypage(brand);
		String url = "/brand/list.do";
		// Pagination的pageView方法，传递点击换页时需要访问的路径及传递的参数
		pagination.pageView(url, param.toString());
		model.addAttribute("pagination", pagination);//request.setAttribute
		model.addAttribute("name", name);//request.setAttribute
		model.addAttribute("isDisplay", isDisplay);//request.setAttribute
		return "brand/list";
	}
	@RequestMapping("/brand/toAdd.do")
	public String toAdd(){
		return "brand/add";
	}
	@RequestMapping(value = "/brand/add.do",method={RequestMethod.POST})
	public String add(Brand brand){
		this.brandService.save(brand);
		return "redirect:/brand/list.do";
	}
	@RequestMapping("/brand/toEdit.do")
	public String toEdit(BrandQuery brandQuery,ModelMap map){
//		BrandQuery brandQuery = new BrandQuery();
//		if(id != null){
//			brandQuery.setId(id);
			Brand brand = this.brandService.getBrandById(brandQuery);
			map.put("brand", brand);
//		}
		return "brand/edit";
	}
	@RequestMapping(value = "/brand/saveEdit.do",method=RequestMethod.POST)
	public String saveEdit(BrandQuery brandQuery,ModelMap map){
		this.brandService.upDateBrand(brandQuery);
		return "redirect:/brand/list.do";
	}
}
