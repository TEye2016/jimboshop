package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Color;
import cn.jimbo.core.bean.query.ColorQuery;

public interface ColorDao {
	public List<Color> getAllColors(ColorQuery c);
}
