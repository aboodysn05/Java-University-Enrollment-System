package partOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String enterYear;
    private int studentID;
    private double balance;
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnterYear() {
		return enterYear;
	}

	public void setEnterYear(String enterYear) {
		this.enterYear = enterYear;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Student() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter Your Name: ");
    	this.name = scanner.nextLine();
    	System.out.print("Enter The Year You Entered The University: ");
    	this.enterYear = scanner.nextLine();
    	System.out.print("Enter Your Student Number: ");
    	this.studentID = scanner.nextInt();
    	System.out.print("Enter Your Balance: ");
    	this.balance = scanner.nextDouble();
    	
    	System.out.println("Welcome " + this.name + ", This program will help you in registering in this semester!");
    }
    
    public void payFees(double fees) {
    	double result = this.balance - fees;
    	System.out.println("Hey Student you have to pay " + fees + " and your remaining balance will be " + result + ".");
    }
    public void displayInfo() {
    	System.out.println("You are a Student, Your Information: Your name is " + this.getName() + ", your student number is " + this.getStudentID() + ", you entered the university in " + this.getEnterYear() + ".");
    }
    public static void displayInfo(ArrayList<String> selectedSubjects) {
    	System.out.println("You will study " + selectedSubjects.size() + " subjects this semester.");
    }
    
}
