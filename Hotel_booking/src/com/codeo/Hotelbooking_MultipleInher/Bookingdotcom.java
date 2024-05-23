package com.codeo.Hotelbooking_MultipleInher;

public class Bookingdotcom extends Hotel {
	public void book_ac_room(double ac_room_price) {
		double ac_room_disc=7;
		double total_ac_room_fare=
				ac_room_price-(ac_room_disc*ac_room_price/100);
		System.out.println("booked room fare for ac are as :"+total_ac_room_fare);
	}
	public void book_nonac_room(double nonac_room_price) {
		double nonac_room_disc=9;
		double total_nonac_room_fare=
				nonac_room_price-(nonac_room_disc*nonac_room_price/100);
		System.out.println("booked room fare for nonac are as :"+total_nonac_room_fare);
	}
}
