package com.ors.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="login")
public class FacebookLoginCollection {
	private String fb_id;
	private String fb_email;
	private String fb_first_name;
	private String fb_gender;
	private String fb_last_name;
	private String fb_locale;
	private String fb_timezone;
	private String fb_updated_time;
	public FacebookLoginCollection()
	{}
		public FacebookLoginCollection(String id, String email, String first_name,
	
			String gender, String last_name, String locale, String timezone,
			String updated_time) {
		// TODO Auto-generated constructor stub
		this.fb_id=id;
		this.fb_email=email;
		this.fb_first_name=first_name;
		this.fb_gender=gender;
		this.fb_last_name=last_name;
		this.fb_locale=locale;
		this.fb_timezone=timezone;
		this.fb_updated_time=updated_time;
	}
	public String getFb_id() {
		return fb_id;
	}
	public void setFb_id(String fb_id) {
		this.fb_id = fb_id;
	}
	public String getFb_email() {
		return fb_email;
	}
	public void setFb_email(String fb_email) {
		this.fb_email = fb_email;
	}
	public String getFb_first_name() {
		return fb_first_name;
	}
	public void setFb_first_name(String fb_first_name) {
		this.fb_first_name = fb_first_name;
	}
	public String getFb_gender() {
		return fb_gender;
	}
	public void setFb_gender(String fb_gender) {
		this.fb_gender = fb_gender;
	}
	public String getFb_last_name() {
		return fb_last_name;
	}
	public void setFb_last_name(String fb_last_name) {
		this.fb_last_name = fb_last_name;
	}
	public String getFb_locale() {
		return fb_locale;
	}
	public void setFb_locale(String fb_locale) {
		this.fb_locale = fb_locale;
	}
	public String getFb_timezone() {
		return fb_timezone;
	}
	public void setFb_timezone(String fb_timezone) {
		this.fb_timezone = fb_timezone;
	}
	public String getFb_updated_time() {
		return fb_updated_time;
	}
	public void setFb_updated_time(String fb_updated_time) {
		this.fb_updated_time = fb_updated_time;
	}
	
}
