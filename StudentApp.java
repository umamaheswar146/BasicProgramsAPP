package com.regnant;

import java.util.ArrayList;

import java.util.List;

public class StudentApp {

	void StudentDetails() {

		List<Students> Details = new ArrayList<Students>();

		Students s = new Students();

		s.id = 146;

		s.Name = "Umamaheswar";

		s.Emailid = "kaveri146146@gmail.com";

		s.MobileNumber = "8297480953";

		Students s1 = new Students();

		s1.id = 140;

		s1.Name = "Rajesh";

		s1.Emailid = "Rajeshraju140@gmail.com";

		s1.MobileNumber = "9491844658";

		StudentsAdress j = new StudentsAdress();

		s.address = j;

		j.DoorNumber = 101;

		j.District = "nellore";

		j.Village = "madarajgudur";

		j.LandMark = "ganesh temple";

		j.Pincode = 524346;

		Details.add(s);

		Details.add(s1);

		for (Students g : Details) {

			System.out.println(g.id);

			System.out.println(g.Name);

			System.out.println(g.Emailid);

			System.out.println(g.MobileNumber);

			System.out.println("Door number is:" + s.address.DoorNumber);

			System.out.println("District  is:" + s.address.District);

			System.out.println("-------------------------");

		}

	}

}
