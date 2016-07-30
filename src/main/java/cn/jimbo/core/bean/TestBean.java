package cn.jimbo.core.bean;

import java.util.Date;

public class TestBean {
	private Integer id;
	private String name;
	private Date birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public TestBean(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
}