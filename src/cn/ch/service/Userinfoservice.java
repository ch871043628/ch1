package cn.ch.service;

import java.util.List;

import cn.ch.bean.Userinfo;

public interface Userinfoservice {
	public List<Userinfo> findAll(Userinfo userinfo);
	
	public void add(Userinfo userinfo);

}
