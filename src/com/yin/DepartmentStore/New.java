package com.yin.DepartmentStore;

import java.util.ArrayList;

public class New {

	public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();
    customers.add(new Customer(10000));
    customers.add(new SilverCustomer(10000));
    customers.add(new GoldCustomer(10000));
    for (int i=0;i<customers.size();i++){
    	Customer c = customers.get(i);
    	c.print();
    }
	}

}
