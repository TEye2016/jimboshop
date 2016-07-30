package cn.jimbo.core.controller.admin;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import cn.jimbo.core.web.common.Constants;
import cn.jimbo.core.web.common.ResponseUtils;
import net.fckeditor.response.UploadResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

@Controller
public class UploadController {
	@RequestMapping("/upload/uploadPic.do")
	public void uploadPic(@RequestParam(required = false) MultipartFile pic,HttpServletResponse response){
		//获取图片的扩展名
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
		//生成图片的随机名称
		DateFormat format = new SimpleDateFormat("yyyyMMddhhmmssSS");
		String dateformat = format.format(new Date());
		//生成三位的随机数
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			dateformat+=random.nextInt(10);
		}
		String path = "pic/"+dateformat+"."+ext;
		String url = Constants.IMG_URL+path;
		Client client = new Client();
		WebResource resource = client.resource(url);
		try {
			resource.put(String.class,pic.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject obj = new JSONObject();
		obj.put("path", path);
		obj.put("url", url);
		ResponseUtils.renderJson(response,obj.toString());
	}
	/**
	 * 使用不知道上传文件名的方式处理fck上传的文件
	 * @param request
	 */
	@RequestMapping("/upload/uploadFck.do")
	public void fckUpload(HttpServletRequest request,HttpServletResponse response){
		//1.将HttpServletRequest转化为MultipartResuest
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
		//2.获取所有的file对象
		Map<String, MultipartFile> files = mr.getFileMap();
		//3.遍历map，转化为set
		Set<Entry<String,MultipartFile>> set = files.entrySet();
		Client client = new Client();
		for (Entry<String, MultipartFile> entry : set) {
			MultipartFile mfile = entry.getValue();
			String ext = FilenameUtils.getExtension(mfile.getOriginalFilename());
			//随机生成名称
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmssSS");
			String format = dateFormat.format(new Date());
			//随机生成0-9之间的数
			Random random = new Random();
			for (int i = 0; i < 3; i++) {
				format +=random.nextInt(10);
			}
			StringBuilder path = new StringBuilder();
			path.append("pic/").append(format).append(".").append(ext);
			StringBuilder url = new StringBuilder();
			String paths = path.toString();
			url.append(Constants.IMG_URL).append(paths);
			String urls = url.toString();
			WebResource resource = client.resource(urls);
			try {
				resource.put(String.class, mfile.getBytes());
			} catch (UniformInterfaceException e) {
				e.printStackTrace();
			} catch (ClientHandlerException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			UploadResponse upok = UploadResponse.getOK(urls);
			try {
				response.getWriter().print(upok);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
