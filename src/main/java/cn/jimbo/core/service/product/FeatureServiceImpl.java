package cn.jimbo.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jimbo.core.bean.Feature;
import cn.jimbo.core.bean.query.FeatureQuery;
import cn.jimbo.core.dao.product.FeatureDao;
@Service("featureService")
public class FeatureServiceImpl implements FeatureService {
	@Autowired
	private FeatureDao featureDao;
	public List<Feature> getAllFeatures(FeatureQuery featureQuery) {
		return featureDao.getAllFeatures(featureQuery);
	}

}
