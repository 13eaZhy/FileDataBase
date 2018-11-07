package main;

import database.Apartment;

public class DbApp {

	public static void main(String[] args) {
		Apartment my_apartment = new Apartment(
				"Eminescu 77, Chisinau",
				1000000F,
				200F,
				8
				);
		
		my_apartment.toFile();
		
		System.out.println(my_apartment);

	}

}
