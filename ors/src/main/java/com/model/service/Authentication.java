package com.model.service;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Update.update;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.ors.model.FacebookLoginCollection;
import com.ors.model.LoginCollection;

public class Authentication {
	boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		
	}
	
	@SuppressWarnings("unused")
	public LoginCollection auth(String UserName, String password){
		ArrayList<LoginCollection> names = new ArrayList<LoginCollection>();
		LoginCollection login = new LoginCollection();
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
		MongoOperations mongo = (MongoOperations) ctx.getBean("anotherMongoTemplate");
		System.out.println("user name is:-"+UserName);
		Query query = new Query();
		query.addCriteria(where("user_name").is(UserName));
		query.addCriteria(where("passwd").is(password));
		System.out.println("query is:"+ query);
		login = mongo.findOne(query, LoginCollection.class);
	
		System.out.println("values for login"+ login);
		return login;
	}
	public LoginCollection enroll(String firstName, String lastName, String userName, String password,String emailId){
		ArrayList<LoginCollection> names = new ArrayList<LoginCollection>();
		LoginCollection login = new LoginCollection(firstName,lastName,userName,password,emailId);
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
		MongoOperations mongo = (MongoOperations) ctx.getBean("anotherMongoTemplate");
		System.out.println("user name is:-"+userName+"password is"+password+"emailId is:-"+ emailId);
		//login = mongo.findOne(query(where("user_name").is(userName)), LoginCollection.class);
		//mongo.insert(login);
		mongo.save(login);
		System.out.println("values for login"+ login);
		return login;
	}
	public FacebookLoginCollection fbenroll(String id,String email,String first_name, String gender,String last_name,
String locale,String timezone,String updated_time){
		FacebookLoginCollection fblogin = new FacebookLoginCollection(id,email,first_name,gender,last_name,locale,timezone,updated_time);
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
		MongoOperations mongo = (MongoOperations) ctx.getBean("anotherMongoTemplate");
		Query query = new Query();
		query.addCriteria(where("facebook.fb_email").is(email));
		FacebookLoginCollection fbl = new FacebookLoginCollection();
		fbl= mongo.findOne(query, FacebookLoginCollection.class);
		if(fbl == null){
		Query q = new Query();
		q.addCriteria(where("emailId").is(email));
		System.out.println("going to insert"+email);
		mongo.upsert(q, update("facebook",fblogin), FacebookLoginCollection.class);	
		//mongo.updateFirst(q, arg1, arg2)
		}
		
	return fblogin;
		
	}

}
