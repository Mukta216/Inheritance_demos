package com.codeo.Hotelbooking_MultipleInher;
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		Hotel ho=new Hotel();
		ho.book_ac_room(2000);
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter vendor name:");
		String vendor_name = sc.next();
		System.out.println("Enter Room category name:");
		String Romm_cat = sc.next();
		//String x=String.toUpperCase();
		//System.out.println("room categeory"+Romm_cat);
		//System.out.println("Enter room cat");
		Goibib goi=new Goibib();
		
		Bookingdotcom bokd=new Bookingdotcom();
		if(vendor_name.equals("Bookingdotcom")) {
			if ( Romm_cat.equals("AC")){
				System.out.println("hi1b");
			bokd.book_ac_room(2000);
			}else {
				System.out.println("hi2b");
				bokd.book_nonac_room(3000);
			}
		}
		else if (vendor_name.equals("Goibib")){
			
			if ( Romm_cat.equals("AC")){
				goi.book_ac_room(2000);
				}else{
					bokd.book_nonac_room(3000);
				}
			
		}
		else {
			System.out.println("given input is wrong");
		}
		}

	}


