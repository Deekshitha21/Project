package com.prft.spring;

public class Vegetables //implements Market
{
	private String veg_name;
	private int price;
	//Setter method
	public void setVeg_name(String veg_name) {
		this.veg_name = veg_name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void display()
	{
		System.out.println("The price of "+ veg_name +" is "+price);
	}
	
	/*
	 * public void ingredients() { System.out.println("vegetable class is invoked");
	 * } public void price() { System.out.println("price of veggies are 100"); }
	 */
	 
}
