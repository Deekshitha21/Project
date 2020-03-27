package com.prft.spring;

public class Fruits //implements Market 
{
private String fr_name;
private int f_price;

//Constructor Method

public Fruits(String fr_name, int f_price) {
	super();
	this.fr_name = fr_name;
	this.f_price = f_price;
}

public void displayinfo()
{
	System.out.println("The price of "+fr_name+" is "+f_price);
}



/*public void ingredients()
	{
		System.out.println("fruit class is invoked");
	}
	public void price()
	{
		System.out.println("price of fruits are 500");
	}
*/
}
