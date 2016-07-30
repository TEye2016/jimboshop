package cn.jimbo.core.service.product;

import java.util.List;

import cn.jimbo.core.bean.Type;
import cn.jimbo.core.bean.query.TypeQuery;

public interface TypeService {
	public List<Type> types(TypeQuery typeQuery);
}
