package cn.jimbo.core.service.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jimbo.core.bean.TestBean;
import cn.jimbo.core.service.TestService;

public class ServiceTest extends SpringTest{
	@Autowired TestService testService;
	@Test
	public void test(){
		testService.save(new TestBean("aaaa", new Date()));
	}
}
