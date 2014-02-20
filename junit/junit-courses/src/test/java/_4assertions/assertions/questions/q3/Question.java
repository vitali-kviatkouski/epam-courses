package _4assertions.assertions.questions.q3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Question {

	@Test
	public void testName() {
		Person p1 = new Person("Alex", "Smith");
		Person p2 = new Person("Alex", "Ivanou");
		Assert.assertEquals(p1, p2);
	}
	
	
	public class Person {
		private String name;
		private String lastName;
		
		public Person(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}
		
		public String getName() {
			return name;
		}

		public String getLastName() {
			return lastName;
		}

		public boolean equals(Object p) {
			return name.equals(((Person) p).name);
		}
	}
}
