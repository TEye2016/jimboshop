package cn.jimbo.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jimbo.core.bean.Type;
import cn.jimbo.core.bean.query.TypeQuery;
import cn.jimbo.core.dao.product.TypeDao;
@Service("typeService")
public class TypeServiceImpl implements TypeService {
	@Autowired
	private TypeDao typeDao;
	public List<Type> types(TypeQuery typeQuery) {
		return typeDao.types(typeQuery);
	}

}
