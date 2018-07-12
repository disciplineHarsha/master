package com.jdbc.cc;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class User implements Comparable<User> {

    private Integer id;
	private String name;
	private Date lastLoginTime;
	private Contact contact;

	User(String name, Date lastLoginTime, Contact contact) {

		this.name = name;
		this.lastLoginTime = lastLoginTime;
		this.contact = contact;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public int compareTo(User o) {
		/*
		 * SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		 * 
		 * String date1=sdf.format(o.getLastLoginTime()); String
		 * date2=sdf.format(this.lastLoginTime);
		 */

		return this.lastLoginTime.compareTo(o.getLastLoginTime());
	}

	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		String date2=sdf.format(this.lastLoginTime);
		return String.format("%-15s %-15s %-15s %-25s %-15s %-15s", this.name, date2,
				this.getContact().getOrgName(), this.getContact().getStreet(),this.getContact().getCity(),this.getContact().getState());
	}

}
