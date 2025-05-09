package com.salinokl.springboot.data.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.annotation.PersistenceCreator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(onConstructor = @__({@PersistenceCreator}))
@RedisHash("people")
@Getter
public class Person {
	@Id String id;
	final String firstname;
	final String lastname;
}