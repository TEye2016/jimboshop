package cn.jimbo.core.dao.product;

import java.util.List;

import cn.jimbo.core.bean.Img;
import cn.jimbo.core.bean.query.ImgQuery;

public interface ImgDao {
	public List<Img> getImgs(ImgQuery imgQuery);
}
