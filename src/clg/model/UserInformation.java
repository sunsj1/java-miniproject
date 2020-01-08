package clg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInformation {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mobile;
	private String email;
	private String gender;
	private String role;
	private String sub1;
	private String sub2;
	private String sub3;
	private String sub4;
	private String sub5;
	private String sub6;
	private String subject;
	private String country;
	private String state;
	private String city;
	private String password;
	private String collegeName;
	private int sub1mark;
	private int sub2mark;
	private int sub3mark;
	private int sub4mark;
	private int sub5mark;
	private int sub6mark;
  private int outoff;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	public String getSub4() {
		return sub4;
	}

	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}

	public String getSub5() {
		return sub5;
	}

	public void setSub5(String sub5) {
		this.sub5 = sub5;
	}

	public String getSub6() {
		return sub6;
	}

	public void setSub6(String sub6) {
		this.sub6 = sub6;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

	public int getSub1mark() {
		return sub1mark;
	}

	public void setSub1mark(int sub1mark) {
		this.sub1mark = sub1mark;
	}

	public int getSub2mark() {
		return sub2mark;
	}

	public void setSub2mark(int sub2mark) {
		this.sub2mark = sub2mark;
	}

	public int getSub3mark() {
		return sub3mark;
	}

	public void setSub3mark(int sub3mark) {
		this.sub3mark = sub3mark;
	}

	public int getSub4mark() {
		return sub4mark;
	}

	public void setSub4mark(int sub4mark) {
		this.sub4mark = sub4mark;
	}

	public int getSub5mark() {
		return sub5mark;
	}

	public void setSub5mark(int sub5mark) {
		this.sub5mark = sub5mark;
	}

	public int getSub6mark() {
		return sub6mark;
	}

	public void setSub6mark(int sub6mark) {
		this.sub6mark = sub6mark;
	}

	public int getOutoff() {
		return outoff;
	}

	public void setOutoff(int outoff) {
		this.outoff = outoff;
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", gender="
				+ gender + ", role=" + role + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4
				+ ", sub5=" + sub5 + ", sub6=" + sub6 + ", subject=" + subject + ", country=" + country + ", state="
				+ state + ", city=" + city + ", password=" + password + ", collegeName=" + collegeName + "]";
	}
	

}
