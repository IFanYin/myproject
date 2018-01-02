package com.yin.DepartmentStore;

public class GoldCustomer extends Customer{

	public GoldCustomer(int amount){
    super(amount);
    super.discount = 0.1f;
	}

}
