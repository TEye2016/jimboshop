package cn.jimbo.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jimbo.core.bean.Color;
import cn.jimbo.core.bean.query.ColorQuery;
import cn.jimbo.core.dao.product.ColorDao;
@Service("colorService")
public class ColorServiceImpl implements ColorService {
	@Autowired 
	private ColorDao colorDao;
	public List<Color> getAllColors(ColorQuery c) {
		return colorDao.getAllColors(c);
	}

}
