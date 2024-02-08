package tests;

import Utils.TestUtils;
import model.User;

public class UserTest {
	
	public static void testConstuctor() {
		
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		User testUser = new User(test_username, test_password, test_first_name,
				test_last_name, test_mobile_number);
	
		
		boolean passed = true;
	
	if (testUser.getUsername()== test_username) {
		System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1 - Username passed"+
					TestUtils.TEXT_COLOR_RESET);
				}else {
					System.out.println(TestUtils.TEXT_COLOR_RED + "TC1 -getUsername -Failed"+
							TestUtils.TEXT_COLOR_RESET);
				}if (testUser.getPassword()== test_password) {
					System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2 - Password  passed"+
								TestUtils.TEXT_COLOR_RESET);
				}else {
					System.out.println(TestUtils.TEXT_COLOR_RED + "TC2 - getPassword-Failed"
								+ TestUtils.TEXT_COLOR_RESET);
				}if (testUser.getFirst_name() == test_first_name) {
					System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3 - First name passed"+
							TestUtils.TEXT_COLOR_RESET);
						}else {
							System.out.println(TestUtils.TEXT_COLOR_RED + "TC3- getFirstName-Failed"+
									TestUtils.TEXT_COLOR_RESET);
				}if (testUser.getLast_name()== test_last_name) {
					System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4 - Last name passed"+
							TestUtils.TEXT_COLOR_RESET);
						}else {
							System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLastName-Failed"+
									TestUtils.TEXT_COLOR_RESET);
				}if (testUser.getMobile_number() == test_mobile_number) {
					System.out.println (TestUtils.TEXT_COLOR_GREEN + "TC5 - Mobile Number passed"+
							TestUtils.TEXT_COLOR_RESET);
						}else {
							System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobile-number-Failed"+
									TestUtils.TEXT_COLOR_RESET);
				}
				
				if (passed) {
					System.out.println("All TC's passed.");
				
				}
				if(testUser.getUsername()!= test_username) {
					System.out.println("TC1 failed: username did not match");
					passed = false;
				}
				
				if(testUser.getPassword()!= test_password) {
					System.out.println("TC2 failed: password did not match");
					passed = false;
				}
				
				if (testUser.getFirst_name()!= test_first_name) {
					System.out.println("TC3 failed: first_name did not match");
					passed = false;
				}
				
				if(testUser.getLast_name()!= test_last_name) {
					System.out.println("TC4 failed: last_name did not match");
					passed = false;
				}
				
				if(testUser.getMobile_number()!= test_mobile_number) {
					System.out.println("TC5 failed: mobile_number did not match");
					passed = false;
				}
				//using Assert's
				
				assert testUser.getUsername()== test_username;
				assert testUser.getPassword() == test_password;
				assert testUser.getFirst_name()== test_first_name;
				assert testUser.getLast_name() == test_last_name;
				assert testUser.getMobile_number() == test_mobile_number;
				
				
				System.out.println("All java assertions in thie test suite passed (none failed).");
			
	}

	
	

	public static void main (String[] args) {
		testConstuctor();
		User testUser = new User("mike", "my_password", "Mike", "Smith", "07771234567");
		
		System.out.println(testUser);
		
	}

	
}
