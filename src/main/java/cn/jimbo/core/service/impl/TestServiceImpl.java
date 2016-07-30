package cn.jimbo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jimbo.core.bean.TestBean;
import cn.jimbo.core.dao.TestDao;
import cn.jimbo.core.service.TestService;
@Service
@Transactional
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	public void save(TestBean testBean) {
			testDao.save(testBean);
			throw new RuntimeException();
	}

}
