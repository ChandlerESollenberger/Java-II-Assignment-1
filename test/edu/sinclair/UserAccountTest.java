package edu.sinclair;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAccountTest {
	
	//Verifies that getUserName returns the supplied username
	@Test
	void testUsernameIsCorrect() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");
		
		assertEquals(Chandler.getUsername(), "Chandler");
	}
	
	//Verifies that isPasswordCorrect passes with a correct password
	@Test
	void testPasswordIsCorrect() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");

		assertTrue(Chandler.isPasswordCorrect("CS123"));
	}
	
	//Verifies that isPasswordCorrect does not pass with an incorrect password
	@Test
	void testPasswordIsIncorrect() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");

		assertFalse(Chandler.isPasswordCorrect("Chandler123"));
	}
	
	//Verifies that isPasswordCorrect does not return true with a null password
	@Test
	void testPasswordIsNull() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");

		assertFalse(Chandler.isPasswordCorrect(null));
	}
	
	//Verifies that toString properly overrides Chandler and equals the stored username
	@Test
	void testToStringEqualsGetUsername() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");

		assertEquals(Chandler.toString(), Chandler.getUsername());
	}
	
	//Verifies that the equals method returns true with equivalent usernames
	@Test
	void testUserNamesEquivalent() {
		UserAccount Chandler1 = new UserAccount("Chandler","CS123");
		UserAccount Chandler2 = new UserAccount("Chandler","CS123");
		
		assertTrue(Chandler1.equals(Chandler2));
	}
	
	//Verifies that the equals method does not pass with different usernames
	@Test
	void testUserNamesInequivalent() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");
		UserAccount Robert = new UserAccount("Robert","CS123");
		
		assertFalse(Chandler.equals(Robert));
	}
	
	//Verifies that the equals method does not return a false positive when given a 
	//different object type
	@Test
	void testObjectsAreDifferent() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");
		Object obj = new Object();
		assertFalse(Chandler.equals(obj));
	}
	
	//Verifies that the hashcode of a userAccount does not return 0 
	@Test
	void testHashNotEqualToZero() {
		UserAccount Chandler = new UserAccount("Chandler","CS123");
		assertNotEquals(Chandler.hashCode(), 0);
	}
	
}