package fwd.main;

import java.io.FileWriter;
import java.io.IOException;

import fwd.customers.*;

import fwd.utils.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		String path = "C:\\Users\\NuttornEk-Apinya\\JavaData\\test.txt";
						
		FileWriter writer = new FileWriter(path);
		writer.append("Hi");
		writer.append( " Jack");
		writer.append("\nthis is new line");
		writer.flush();
		writer.close();
		*/
		
		//User naiKor = new User();
		//User[] customers = new User(10);
		//customers[0] = naiKor;
		
	
		User[] customers = {
				new User("Honey", "Lemon", 18, 10000),
				new User("Daeng", "Manao", 20, 20000),
				new User("ChaThai", "Ga/Ga", 30, 30000),
				new User("Milo", "Kamu", 40, 40000)
				
		};
		
		
		/*
		for(int i = 0; i < customers.length; i++) {
			System.out.println("Customer " + i + " :" + customers[i].name + " " + customers[i].lastName + " " + customers[i].age);
				
		}
		*/
		
		
		
		User.log(customers);     //Use class from User for print more users
		//User.Log(customers[2]);  //Use class from User for print only one user
	
		
		

		// Write CSV file by manual
		
		/*
		String path = "C:\\Users\\NuttornEk-Apinya\\JavaData\\test.csv";
						
		FileWriter writer = new FileWriter(path);
		writer.append("Name,Last Name,Age\n");
		writer.append("Honey,Lemon,18\n");
		writer.append("ChaThai,Ga/Ga,30");
		writer.flush();
		writer.close();

		*/
		

		// Write CSV file from class
		/*
		String path = "C:\\Users\\NuttornEk-Apinya\\JavaData\\test.csv";
		SmartCsv.write(customers, path);  */
		
		String path = "C:\\Users\\NuttornEk-Apinya\\JavaData\\test.csv";
		SmartCsv csv1 = new SmartCsv(path, "Windows", "|");
		csv1.write(customers);
		
		SmartCsv csv2 = new SmartCsv("C:\\Users\\NuttornEk-Apinya\\JavaData\\test2.csv");
		csv2.write(customers);
		
		
		
		

	}

}
