package org.login;



public class HomePageHdfcPojo {
	// private instance variable
	private int CustomerId;

	private String Password;

	// set - input // local variables
	public void setCustomerId(int CustomerId) {
		if (CustomerId == 123) {
			this.CustomerId = 1;
		} else if (CustomerId == 321) {
			this.CustomerId = 1;
		} else if (CustomerId == 456) {
			this.CustomerId = 1;

		} else if (CustomerId == 561) {
			this.CustomerId = 1;

		} 
		else {
			this.CustomerId = 0;

		}
		
		

	}

	public void setPassword(String Password) {
		if (CustomerId == 1 && Password.equals("Ravi@123")) {
			this.Password = "Ravi Account Authorized";

		} else if (CustomerId == 1 && Password.equals("Ram@321")) {
			this.Password = "Ram Account Authorized";

		} else if (CustomerId == 1 && Password.equals("Babu@456")) {
			this.Password = "Babu Account Authorized";

		} else {
			this.Password = "Invaid Account";

		}
	}

	public int getCustomerId() {
		if (Password.equals("Ravi Account Authorized")) {
			return 10000;
		} else if (Password.equals("Ram Account Authorized")) {
			return 20000;
		} else if (Password.equals("Babu Account Authorized")) {
			return 30000;

		} 

		else {
			return 0;
		}

	}

	public String getPassword() {
		return "Thank you for using HDFC";
	}
}
