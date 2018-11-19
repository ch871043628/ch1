package cn.ch.service.impl;

import java.util.List;

import cn.ch.bean.Userinfo;
import cn.ch.dao.UserinfoDao;
import cn.ch.service.Userinfoservice;

public class UserinfoserviceImpl implements Userinfoservice{
	
	private UserinfoDao dao;
	

	public void setDao(UserinfoDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(Userinfo userinfo) {
		dao.add(userinfo);
		
	}

	@Override
	public List<Userinfo> findAll(Userinfo userinfo) {
		return dao.findAll(userinfo);
	}


}
