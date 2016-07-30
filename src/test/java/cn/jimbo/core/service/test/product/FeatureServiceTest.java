package cn.jimbo.core.service.test.product;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jimbo.core.bean.Feature;
import cn.jimbo.core.bean.query.FeatureQuery;
import cn.jimbo.core.service.product.FeatureService;
import cn.jimbo.core.service.test.SpringTest;

public class FeatureServiceTest extends SpringTest {
	@Autowired
	private FeatureService featureService;
	@Test
	public void test1(){
		List<Feature> list = featureService.getAllFeatures(null);
		for (Feature feature : list) {
			System.out.println(feature.getId());
		}
	}
}
