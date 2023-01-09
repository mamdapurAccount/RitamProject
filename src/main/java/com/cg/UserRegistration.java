package com.cg;

public class UserRegistration  {
	public void registerUser(String username, String userCountry) throws InvalidCountryException{
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException("User Outside india cannot be registered");
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
}
