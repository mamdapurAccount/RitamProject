package com.cg;

// pojo class

public class Customer implements Comparable<Customer>{
	
	
	int cId;
	String cName;
	String city;
	int age;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.cId;
		
	}
	
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	 Customer c =(Customer)obj;
	 if(this.cId==c.getcId())
		 return true;
	 
		 return false;
		 
	}

	public Customer() {
		super();
	}

	public Customer(int cId, String cName, String city) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.city = city;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Customer c) {
		// TODO Auto-generated method stub
		return this.cName.compareTo(c.getcName());
		

		
		
	}
	

	
		

}
