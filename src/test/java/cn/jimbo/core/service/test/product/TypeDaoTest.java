package cn.jimbo.core.service.test.product;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jimbo.core.bean.Type;
import cn.jimbo.core.bean.query.TypeQuery;
import cn.jimbo.core.service.product.TypeService;
import cn.jimbo.core.service.test.SpringTest;

public class TypeDaoTest extends SpringTest {
	@Autowired
	private TypeService typeService;
	@Test
	public void testTypes(){
		TypeQuery query = new TypeQuery();
		List<Type> types = typeService.types(query);
		System.out.println(types.size());
		for (Type type : types) {
			System.out.println(type.getName());
		}
	}
}
