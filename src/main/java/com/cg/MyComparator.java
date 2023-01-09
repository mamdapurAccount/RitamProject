package com.cg;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getcId()==c2.getcId())
		
	return 0;
	else if(c1.getcId()>c2.getcId())
		return -1;
	else
		return 1;
	}
	

}
