package cn.jimbo.core.web.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
public class ResponseUtils {
	public static void render(HttpServletResponse response,String type,String data){
			response.setContentType(type);
			try {
				response.getWriter().write(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void renderJson(HttpServletResponse response,String data){
		render(response, "application/json;charset=UTF-8", data);
	}
	public static void renderXml(HttpServletResponse response,String data){
		render(response, "text/xml;charset=UTF-8", data);
	}
	public static void renderText(HttpServletResponse response,String data){
		render(response, "text/plain;charset=UTF-8", data);
	}
}
