package cn.jimbo.core.service.product;

import java.util.List;

import cn.jimbo.core.bean.Feature;
import cn.jimbo.core.bean.query.FeatureQuery;

public interface FeatureService {
	public List<Feature> getAllFeatures(FeatureQuery featureQuery);
}
