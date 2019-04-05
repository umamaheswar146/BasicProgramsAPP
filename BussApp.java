package com.regnant;

import java.util.ArrayList;

import java.util.List;

public class BussApp {

	void Data() {

		List<CollectionBuss> Details = new ArrayList<CollectionBuss>();

		CollectionBuss c = new CollectionBuss();

		c.BussName = "Kaveri Travels";

		c.BussNumber = 829748095;

		c.Seating = 40;

		c.colour = "White";

		PassengerDetails p = new PassengerDetails();

		c.information = p;

		p.Name = "Umamaheswar";

		p.Age = 23;

		p.SearNumber = 15;

		p.Location = "Nellore";

		CollectionBuss c1 = new CollectionBuss();

		c1.BussName = "SRS Travels";

		c1.BussNumber = 6300322;

		c1.Seating = 50;

		c1.colour = "Red";

		PassengerDetails p1 = new PassengerDetails();

		c1.information = p1;

		p1.Name = "Koti";

		p1.Age = 23;

		p1.SearNumber = 18;

		p1.Location = "Nellore";
		
		 Details.add(c);
		 
		 Details.add(c1);
		

		for (CollectionBuss cc : Details) {

			System.out.println("Name of the Travels is    :"+cc.BussName);

			System.out.println("Buss Number is            :"+cc.BussNumber);

			System.out.println("Total Seating Capacity is :"+cc.Seating);

			System.out.println("Colour of the buss is     :"+cc.colour);
			
			System.out.println("------------------------------------------");


		}

		System.out.println("Name of the Passenger is :"+c.information.Name);
		
		System.out.println("Age of the Passenger is  :"+c.information.Age);
		
		System.out.println("Name of the Passenger is :"+c1.information.Name);
		
		System.out.println("Age of the Passenger is  :"+c1.information.Age);
	}

}
