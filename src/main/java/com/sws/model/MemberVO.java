package com.sws.model;

public class MemberVO {
	private int num;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private int birth;
	private int hit;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public MemberVO(int num, String id, String pwd, String name, String email, String phone, int birth, int hit) {
		super();
		this.num = num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birth = birth;
		this.hit = hit;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	

}
