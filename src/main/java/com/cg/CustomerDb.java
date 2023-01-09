package com.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class CustomerDb {

	
	public void getCustomerById(int id) throws CustomerException {
		
		if(id==0)
			throw new CustomerException("Sorry Cname u dont have exist");
		
	}
	
	public static HashMap<String,Integer>  getCustomerCity(HashMap<Integer,Customer> hm){
		
		HashMap<String,Integer> newList = new HashMap<String,Integer>();
		for(Integer i : hm.keySet())
		{
			Customer c = hm.get(i);
			String city = c.getCity();
			if(newList.containsKey(city))
			{
				int val = newList.get(city);
				newList.put(city, (val+1));
				
			}
			else
			{
				newList.put(city, 1);
			}
		}
		return newList;
		
	} 
	
	public static List<Customer> getCustomerByCity(List<Customer> custList, String city){
		List<Customer> newcList=new ArrayList<Customer>();
		for(Customer c:custList) {
			if(c.getCity().equals(city)) {
				newcList.add(c);
			}
		}
	return newcList;
		
		
	}
	
	public static List<String> getCustomerNames(List<Customer> custList,int id){
		
		List<String> cName=new ArrayList<String>();
		for(Customer c:custList) {
			if(c.getcId()==id) {
				cName.add(c.getcName());
			}
		}
		return cName;
	}
	
	
	
	
}
