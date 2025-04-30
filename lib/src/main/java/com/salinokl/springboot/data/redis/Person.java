package com.salinokl.springboot.data.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("people")
public class Person {
	@Id String id;
	String firstname;
	String lastname;

	// 기본생성자 필수
	public Person() {
		this.firstname = null;
		this.lastname = null;
	}
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
}