package cn.jimbo.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control")
public class FrameController {
	@RequestMapping("frame/product_main.do")
	public String productMain(){
		return "frame/product_main";
	}
	@RequestMapping("frame/product_left.do")
	public String productLeft(){
		return "frame/product_left";
	}
}
