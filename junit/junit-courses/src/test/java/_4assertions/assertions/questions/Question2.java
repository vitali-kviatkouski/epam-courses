package _4assertions.assertions.questions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Question2 {

	@Test
	public void testName() {
		Person p1 = new Person("Alex");
		Person p2 = new Person("Alex");
		Assert.assertEquals(p1, p2);
	}
	
	
	public class Person {
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
}
