package com.corejava;

public class Checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a Number:");
	        int num=sc.nextInt();
	        if (num%2==0)
	        {
	            System.out.println("Number is Even:"+num);

	        }
	        else
	        {
	            System.out.println("Number is odd:"+num);
	        }

	}

}