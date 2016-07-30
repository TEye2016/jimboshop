package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Feature;
import cn.jimbo.core.bean.query.FeatureQuery;

public interface FeatureDao {
	public List<Feature> getAllFeatures(FeatureQuery featureQuery);
}
