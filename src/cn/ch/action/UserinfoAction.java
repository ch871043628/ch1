package cn.ch.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.ch.bean.Userinfo;
import cn.ch.service.Userinfoservice;

public class UserinfoAction extends ActionSupport{
		private Userinfo userinfo;
		private List<Userinfo> list;
		private String uname;
		private String upwd;

	public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getUpwd() {
			return upwd;
		}

		public void setUpwd(String upwd) {
			this.upwd = upwd;
		}

	public List<Userinfo> getList() {
		return list;
	}

	public void setList(List<Userinfo> list) {
		this.list = list;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	private Userinfoservice userinfoservice;
	private List<Userinfo> findAll;
	

		public void setUserinfoservice(Userinfoservice userinfoservice) {
		this.userinfoservice = userinfoservice;
	}

		public String add() {
			userinfoservice.add(userinfo);
			return SUCCESS;
		}
		
		public String findAll() {
			findAll = userinfoservice.findAll(userinfo);
			if(findAll==null) {
				return ERROR;
			}
			System.out.println(findAll.get(0));
			System.out.println(userinfo.getUname());
			System.out.println(userinfo.getUpwd());
				return SUCCESS;
		}
}
