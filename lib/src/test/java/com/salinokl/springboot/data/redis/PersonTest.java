package com.salinokl.springboot.data.redis;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.salinokl.springboot.data.redis.repositories.PersonRepository;

@SpringBootTest
public class PersonTest {
	@Autowired PersonRepository repo;

	@Test
	public void basicCrudOperations() {
		try {
			Person rand = new Person("rand", "al'thor");
			
			repo.save(rand);
			Optional<Person> result = repo.findById(rand.getId());
			
			Person person = result.get();
			
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(repo.count());
			
			repo.delete(rand);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
