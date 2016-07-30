package cn.jimbo.core.service.product;

import java.util.List;

import cn.jimbo.core.bean.Color;
import cn.jimbo.core.bean.query.ColorQuery;

public interface ColorService {
	public List<Color> getAllColors(ColorQuery c);
}
