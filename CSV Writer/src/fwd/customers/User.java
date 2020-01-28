package fwd.customers;

public class User {

	public String name;
	public String lastName;
	public int age;
	public int salary;
	
	
	public User(String name, String lastName, int age, int salary) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;	
		this.salary = salary;
		
	}
	
	
	public String toString() {
		return this.name + " " + this.lastName + " " + this.age + " " + this.salary;
	}
	
	
	public String[] getStringValues() {
		String[] values = {this.name, this.lastName, this.age + "", this.salary +""	};
		return values;
	}
	
	
	public static String[] getFields() {
		String[] fields = {"Name", "Last Name", "Age", "Salary"};
		return fields;
	}
	
	
	public static void log(User user) {
		System.out.println(user.toString());
	}
	
	
	public static void log(User[] users) {
		for(int i = 0; i < users.length; i++)
			User.log(users[i]);
	}
	
	

	

	/*

	//Static with class 
	
	// Function for print one user
	
	public static void Log(User user) {
		System.out.println("Customer " + " :" + user.name + " " + user.lastName + " " + user.age);	
	}
	
	// Function for print more user
	public static void Log(User[] users) {
		for(int i = 0 ; i < users.length ; i++) {
			System.out.println("Customer " + i + " :" + users[i].name + " " + users[i].lastName + " " + users[i].age);				
		}
	}
	
	*/
	
}
