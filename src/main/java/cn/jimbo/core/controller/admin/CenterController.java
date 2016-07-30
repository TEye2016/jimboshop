package cn.jimbo.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control")
public class CenterController {
	@RequestMapping("/index.do")
	public String index(){
		return "index";
	}
	@RequestMapping("/main.do")
	public String main(){
		return "main";
	}
	@RequestMapping("/top.do")
	public String top(){
		return "top";
	}
	@RequestMapping("/left.do")
	public String left(){
		return "left";
	}
	@RequestMapping("/right.do")
	public String right(){
		return "right";
	}
}
