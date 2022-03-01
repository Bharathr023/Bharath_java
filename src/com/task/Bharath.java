package com.task;

public class Bharath implements Ravi , Sasi {
	public void bike ()  {
		System.out.println("Also Bharath Can Drive This Bike");
	}
		
	
	public void gold ()  {
		System.out.println("I Used This Gold To Intiate My Bussiness");
	}
	
	
	
	public static void main(String[] args) {
		Bharath c=new Bharath();
		c.bike();
		c.gold();
		
	}
	

}
