package cn.ch.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.ch.bean.Userinfo;
import cn.ch.dao.UserinfoDao;

public class UserinfoDaoImpl implements UserinfoDao{
	
	private HibernateTemplate UserinfoDaoImpl;
	

	public void setUserinfoDaoImpl(HibernateTemplate userinfoDaoImpl) {
		UserinfoDaoImpl = userinfoDaoImpl;
	}

	@Override
	public List<Userinfo> findAll(Userinfo userinfo) {
		List find = UserinfoDaoImpl.find
				("from Userinfo as s where s.uname = ? and s.upwd = ?",userinfo.getUname(),userinfo.getUpwd());
		if(find.size()==0 || find==null) {
			return null;
		}
		return find;
	}
	@Override
	public void add(Userinfo userinfo) {
		UserinfoDaoImpl.save(userinfo);	
	}
}
