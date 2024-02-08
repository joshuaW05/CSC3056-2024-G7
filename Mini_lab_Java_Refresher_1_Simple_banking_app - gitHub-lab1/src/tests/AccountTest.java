package tests;

import Utils.TestUtils;
import model.Account;
import java.util.Date;


public class AccountTest {

	public static void testConstructor() {
		
		String test_account_number = "12345";
		String test_username_of_holder = "josh";
		String test_account_type = "standard";
		Date test_account_opeing_date = new Date(2024, 04, 13);
		
		Account testAccount = new Account (test_account_number, test_username_of_holder, test_account_type,  test_account_opeing_date);
		
		
		boolean passed = true;
		
		if (testAccount.getAccount_number()== test_account_number) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1 - account number passed"+
						TestUtils.TEXT_COLOR_RESET);
					}else {
						System.out.println(TestUtils.TEXT_COLOR_RED + "TC1 -getAccount_number -Failed"+
								TestUtils.TEXT_COLOR_RESET);
					}if (testAccount.getUsername_of_account_holder()== test_username_of_holder) {
						System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2 - username  passed"+
									TestUtils.TEXT_COLOR_RESET);
					}else {
						System.out.println(TestUtils.TEXT_COLOR_RED + "TC2 - getUsername_of_account_holder-Failed"
									+ TestUtils.TEXT_COLOR_RESET);
					}if (testAccount.getAccount_type() == test_account_type) {
						System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3 - account type passed"+
								TestUtils.TEXT_COLOR_RESET);
							}else {
								System.out.println(TestUtils.TEXT_COLOR_RED + "TC3- getAccount_type-Failed"+
										TestUtils.TEXT_COLOR_RESET);
					}if (testAccount.getAccount_opening_date()== test_account_opeing_date) {
						System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4 - opeing date passed"+
								TestUtils.TEXT_COLOR_RESET);
							}else {
								System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getAccount_opening_date-Failed"+
										TestUtils.TEXT_COLOR_RESET);
					}
					
					if (passed) {
						System.out.println("All TC's passed.");
					
					}
					if(testAccount.getAccount_number()!= test_account_number) {
						System.out.println("TC1 failed: account number did not match");
						passed = false;
					}
					
					if(testAccount.getUsername_of_account_holder()!= test_username_of_holder) {
						System.out.println("TC2 failed: username did not match");
						passed = false;
					}
					
					if (testAccount.getAccount_type()!= test_account_type) {
						System.out.println("TC3 failed: first_name did not match");
						passed = false;
					}
					
					if(testAccount.getAccount_opening_date()!= test_account_opeing_date) {
						System.out.println("TC4 failed: account opeing date did not match");
						passed = false;
					}
					
					//using Assert's
					
					assert testAccount.getAccount_number()== test_account_number;
					assert testAccount.getUsername_of_account_holder() == test_username_of_holder;
					assert testAccount.getAccount_type()== test_account_type;
					assert testAccount.getAccount_opening_date() == test_account_opeing_date;
					
					
					System.out.println("All java assertions for the getters in the account test suite passed (none failed).");
				
		}

	
	public static void testSetters() {
		
		String test_account_number = "12345";
		String test_username_of_holder = "josh";
		String test_account_type = "standard";
		Date test_account_opeing_date = new Date(2024, 04, 13);
		
		Account testAccount = new Account (test_account_number, test_username_of_holder, test_account_type,  test_account_opeing_date);
		
		testAccount.setAccount_number(test_account_number);
			assert testAccount.getAccount_number().equals(test_account_number);
			
		testAccount.setUsername_of_account_holder(test_username_of_holder);
			assert testAccount.getUsername_of_account_holder().equals(test_username_of_holder);
			
		testAccount.setAccount_type(test_account_type);
			assert testAccount.getAccount_type().equals(test_account_type);
			
		testAccount.setAccount_opening_date(test_account_opeing_date);
			assert testAccount.getAccount_opening_date().equals(test_account_opeing_date);
			
			System.out.println("All of the java Assertions for the setters in the account test suite have passed(none have failed).");
		
	}
	
	
	
	public static void main(String[] args) {
		testConstructor();
		testSetters();

	}

}
