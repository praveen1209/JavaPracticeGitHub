package javaLearing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysDemo {
// this is comment
	public static void main(String[] args) throws NumberFormatException, IOException {
		//int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//System.out.println("April has " + month_days[3] + " days.");
//System.out.println("Jan has"+ month_days[0]+ " days");
//double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5,15.5}; 
//double result = 0; 
//int i;
//for(i=0; i<6; i++) 
	//result = result + nums[i];
//System.out.println("Average is " + result / 6);
		while(true){
			System.out.println("Praveen");
		//int n=2001;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the number");
		int a= Integer.parseInt(br.readLine());
		  if (a%4==0){
		  System.out.println("The given year is a leap year");
		  }
		  else{
		  System.out.println("This is not a leap year");
		  }
}

		
		
		System.out.println("Line 31");

	}}

