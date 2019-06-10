package com.rock.ssm.entities;

public class Userinfo {
    private Integer userid;

    private String username;

    private String sex;

    private String email;

    private Integer levelid;
    
    @Override
	public String toString() {
		return "Userinfo [userid=" + userid + ", username=" + username + ", sex=" + sex + ", email=" + email
				+ ", levelid=" + levelid + ", userlevel=" + userlevel + "]";
	}

	private Userlevel userlevel;
    

    public Userlevel getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(Userlevel userlevel) {
		this.userlevel = userlevel;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

  



	public Userinfo(Integer userid, String username, String sex, String email, Integer levelid, Userlevel userlevel) {
		super();
		this.userid = userid;
		this.username = username;
		this.sex = sex;
		this.email = email;
		this.levelid = levelid;
		this.userlevel = userlevel;
	}

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }
}