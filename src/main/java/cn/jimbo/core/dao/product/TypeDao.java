package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Type;
import cn.jimbo.core.bean.query.TypeQuery;

public interface TypeDao {
	public List<Type> types(TypeQuery typeQuery);
}
