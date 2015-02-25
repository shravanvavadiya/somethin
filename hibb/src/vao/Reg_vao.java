package vao;


import javax.persistence.*;

public class Reg_vao {
	
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	int id;
	
	@Column(name="First Name")
	String fn;
	@Column(name="Last Name")
	String ln;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	

}
