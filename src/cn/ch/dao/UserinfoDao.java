package cn.ch.dao;

import java.util.List;

import cn.ch.bean.Userinfo;

public interface UserinfoDao {
	public List<Userinfo> findAll(Userinfo userinfo) ;
	public void add(Userinfo userinfo);
}
