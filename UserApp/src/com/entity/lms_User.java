package com.entity;

public class lms_User {
	private int user_id;
	private String first_name;
	private String last_name;
	private int role_id;
	private String email;
	private String password;
	private String created_by;
	private String update_by;
	private lms_User created_ts;
	private lms_User updated_ts;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public lms_User getCreated_ts() {
		return created_ts;
	}
	public void setCreated_ts(lms_User created_ts) {
		this.created_ts = created_ts;
	}
	public lms_User getUpdated_ts() {
		return updated_ts;
	}
	public void setUpdated_ts(lms_User updated_ts) {
		this.updated_ts = updated_ts;
	}
	@Override
	public String toString() {
		return "lms_User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", role_id="
				+ role_id + ", email=" + email + ", password=" + password + ", created_by=" + created_by
				+ ", update_by=" + update_by + ", created_ts=" + created_ts + ", updated_ts=" + updated_ts + "]";
	}

}
