package partOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineeringStudent extends Student{
    private int studentEngineeringMajor;
    private double engineeringStudentFees;
    
    public double getEngineeringStudentFees() {
		return engineeringStudentFees;
	}
	public void setEngineeringStudentFees(double engineeringStudentFees) {
		this.engineeringStudentFees = engineeringStudentFees;
	}
	
	Subject uSub1 = new Subject("Fundamental Of Computing", 4, 75);
    Subject uSub2 = new Subject("Professional Practice", 3, 75);
    Subject uSub3 = new Subject("Professional Skills", 1, 75);
    Subject uSub4 = new Subject("Bootcamp", 4, 100);
    Subject uSub5 = new Subject("Functional Math", 3, 75);
    public EngineeringStudent() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("1. Electrical Engineering \n2. Mechanical Engineering");
    	System.out.print("Enter Your Engineering Major(1-2): ");
    	this.studentEngineeringMajor = scanner.nextInt();
    	
    	if(studentEngineeringMajor == 1) {
    		Subject sub7 = new Subject("Electrical and Electronic Principles ", 4, 100);
    		Subject sub8 = new Subject("Advanced Workshop for Electrical Engineers ", 1, 75);
    		Subject sub9 = new Subject("Further Mathematics ", 4, 100);
    		System.out.println("List of subjects available this semester for Electrical Engineering major: ");
    		System.out.println("1." + sub7.getSubjectName() + " --> " + sub7.getSubjectCreditHours() + " Credit Hours --> " + sub7.getSubjectCreditHoursCost() + " JD");
    		System.out.println("2." + sub8.getSubjectName() + " --> " + sub8.getSubjectCreditHours() + " Credit Hours --> " + sub8.getSubjectCreditHoursCost() + " JD");
    		System.out.println("3." + sub9.getSubjectName() + " --> " + sub9.getSubjectCreditHours() + " Credit Hours --> " + sub9.getSubjectCreditHoursCost() + " JD");
    		System.out.println("4." + uSub1.getSubjectName() + " --> " + uSub1.getSubjectCreditHours() + " Credit Hours --> " + uSub1.getSubjectCreditHoursCost() + " JD");
    		System.out.println("5." + uSub2.getSubjectName() + " --> " + uSub2.getSubjectCreditHours() + " Credit Hours --> " + uSub2.getSubjectCreditHoursCost() + " JD");
    		System.out.println("6." + uSub3.getSubjectName() + " --> " + uSub3.getSubjectCreditHours() + " Credit Hours --> " + uSub3.getSubjectCreditHoursCost() + " JD");
    		System.out.println("7." + uSub4.getSubjectName() + " --> " + uSub4.getSubjectCreditHours() + " Credit Hours --> " + uSub4.getSubjectCreditHoursCost() + " JD");
    		System.out.println("8." + uSub5.getSubjectName() + " --> " + uSub5.getSubjectCreditHours() + " Credit Hours --> " + uSub5.getSubjectCreditHoursCost() + " JD");
    		
    		double totalPrice = 0;
            int creditHours = 0;
            int maxCreditHours = 18;
            ArrayList<String> selectedSubjects = new ArrayList<String>();
            ArrayList<Integer> creditHoursList = new ArrayList<Integer>();

            while (creditHours < maxCreditHours) {
                System.out.print("Select the subject you want this semester according to their number (1-8) or 0 to finish: ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    break; 
                }

                if (choice < 1 || choice > 11) {
                    System.out.println("Invalid choice. Please choose a number between 1 and 11.");
                    continue;
                }
                
                switch(choice) {
                    case 1: {
                    	if(creditHours + sub7.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub7.getSubjectCreditHoursCost() * sub7.getSubjectCreditHours();
                        	creditHours += sub7.getSubjectCreditHours();
                        	selectedSubjects.add(sub7.getSubjectName());
                        	creditHoursList.add(sub7.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 2: {
                    	if(creditHours + sub8.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub8.getSubjectCreditHoursCost() * sub8.getSubjectCreditHours();
                        	creditHours += sub8.getSubjectCreditHours();
                        	selectedSubjects.add(sub8.getSubjectName());
                        	creditHoursList.add(sub8.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 3: {
                    	if(creditHours + sub9.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += sub9.getSubjectCreditHoursCost() * sub9.getSubjectCreditHours();
                        	creditHours += sub9.getSubjectCreditHours();
                        	selectedSubjects.add(sub9.getSubjectName());
                        	creditHoursList.add(sub9.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 4: {
                    	if(creditHours + uSub1.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub1.getSubjectCreditHoursCost() * uSub1.getSubjectCreditHours();
                        	creditHours += uSub1.getSubjectCreditHours();
                        	selectedSubjects.add(uSub1.getSubjectName());
                        	creditHoursList.add(uSub1.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 5: {
                    	if(creditHours + uSub2.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub2.getSubjectCreditHoursCost() * uSub2.getSubjectCreditHours();
                        	creditHours += uSub2.getSubjectCreditHours();
                        	selectedSubjects.add(uSub2.getSubjectName());
                        	creditHoursList.add(uSub2.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 6: {
                    	if(creditHours + uSub3.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += uSub3.getSubjectCreditHoursCost() * uSub3.getSubjectCreditHours();
                        	creditHours += uSub3.getSubjectCreditHours();
                        	selectedSubjects.add(uSub3.getSubjectName());
                        	creditHoursList.add(uSub3.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 7: {
                    	if(creditHours + uSub4.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub4.getSubjectCreditHoursCost() * uSub4.getSubjectCreditHours();
                        	creditHours += uSub4.getSubjectCreditHours();
                        	selectedSubjects.add(uSub4.getSubjectName());
                        	creditHoursList.add(uSub4.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 8: 
                    	if(creditHours + uSub5.getSubjectCreditHours() <= maxCreditHours) {
                		totalPrice += uSub5.getSubjectCreditHoursCost() * uSub5.getSubjectCreditHours();
                    	creditHours += uSub5.getSubjectCreditHours();
                    	selectedSubjects.add(uSub5.getSubjectName());
                    	creditHoursList.add(uSub5.getSubjectCreditHours());
                	} else {
                		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                	}
                	break;
                }
                
                if(creditHours < 12) {
                	System.out.println("The minimum amount of Credit Hours is 12, " + (12 - creditHours) + " Credit Hours left.");
                }
            }
            
            System.out.println("The number of credit hours you registered: " + creditHours);
            System.out.println("The total price of credit hours you registered: " + totalPrice);
            System.out.println("The estimated cost including registration fees: " + (totalPrice + 325.5));
            Student.displayInfo(selectedSubjects);
            Subject.insertionSort(selectedSubjects, creditHoursList);
            System.out.println("The most important subjects you have registered according to it's credit hours: ");
            for(int i = 0; i < selectedSubjects.size(); i++) {
            	System.out.println(selectedSubjects.get(i) + " --> " + creditHoursList.get(i));
            }
            engineeringStudentFees = totalPrice + 325.5;
    		
    	} else if(studentEngineeringMajor == 2) {
    		Subject sub10 = new Subject("Materials, Properties and Testing", 4, 100);
    		Subject sub11 = new Subject("Fluid Mechanics  ", 3, 75);
    		Subject sub12 = new Subject("Health, Safety, and Environment  ", 1, 75);
    		System.out.println("List of subjects available this semester for Mechanical Engineering major: ");
    		System.out.println("1." + sub10.getSubjectName() + " --> " + sub10.getSubjectCreditHours() + " Credit Hours --> " + sub10.getSubjectCreditHoursCost() + " JD");
    		System.out.println("2." + sub11.getSubjectName() + " --> " + sub11.getSubjectCreditHours() + " Credit Hours --> " + sub11.getSubjectCreditHoursCost() + " JD");
    		System.out.println("3." + sub12.getSubjectName() + " --> " + sub12.getSubjectCreditHours() + " Credit Hours --> " + sub12.getSubjectCreditHoursCost() + " JD");
    		System.out.println("4." + uSub1.getSubjectName() + " --> " + uSub1.getSubjectCreditHours() + " Credit Hours --> " + uSub1.getSubjectCreditHoursCost() + " JD");
    		System.out.println("5." + uSub2.getSubjectName() + " --> " + uSub2.getSubjectCreditHours() + " Credit Hours --> " + uSub2.getSubjectCreditHoursCost() + " JD");
    		System.out.println("6." + uSub3.getSubjectName() + " --> " + uSub3.getSubjectCreditHours() + " Credit Hours --> " + uSub3.getSubjectCreditHoursCost() + " JD");
    		System.out.println("7." + uSub4.getSubjectName() + " --> " + uSub4.getSubjectCreditHours() + " Credit Hours --> " + uSub4.getSubjectCreditHoursCost() + " JD");
    		System.out.println("8." + uSub5.getSubjectName() + " --> " + uSub5.getSubjectCreditHours() + " Credit Hours --> " + uSub5.getSubjectCreditHoursCost() + " JD");
    		
    		double totalPrice = 0;
            int creditHours = 0;
            int maxCreditHours = 18;
            ArrayList<String> selectedSubjects = new ArrayList<String>();
            ArrayList<Integer> creditHoursList = new ArrayList<Integer>();

            while (creditHours < maxCreditHours) {
                System.out.print("Select the subject you want this semester according to their number (1-8) or 0 to finish: ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    break; 
                }

                if (choice < 1 || choice > 11) {
                    System.out.println("Invalid choice. Please choose a number between 1 and 11.");
                    continue;
                }
                
                switch(choice) {
                    case 1: {
                    	if(creditHours + sub10.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub10.getSubjectCreditHoursCost() * sub10.getSubjectCreditHours();
                        	creditHours += sub10.getSubjectCreditHours();
                        	selectedSubjects.add(sub10.getSubjectName());
                        	creditHoursList.add(sub10.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 2: {
                    	if(creditHours + sub11.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub11.getSubjectCreditHoursCost() * sub11.getSubjectCreditHours();
                        	creditHours += sub11.getSubjectCreditHours();
                        	selectedSubjects.add(sub11.getSubjectName());
                        	creditHoursList.add(sub11.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 3: {
                    	if(creditHours + sub12.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += sub12.getSubjectCreditHoursCost() * sub12.getSubjectCreditHours();
                        	creditHours += sub12.getSubjectCreditHours();
                        	selectedSubjects.add(sub12.getSubjectName());
                        	creditHoursList.add(sub12.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 4: {
                    	if(creditHours + uSub1.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub1.getSubjectCreditHoursCost() * uSub1.getSubjectCreditHours();
                        	creditHours += uSub1.getSubjectCreditHours();
                        	selectedSubjects.add(uSub1.getSubjectName());
                        	creditHoursList.add(uSub1.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 5: {
                    	if(creditHours + uSub2.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub2.getSubjectCreditHoursCost() * uSub2.getSubjectCreditHours();
                        	creditHours += uSub2.getSubjectCreditHours();
                        	selectedSubjects.add(uSub2.getSubjectName());
                        	creditHoursList.add(uSub2.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 6: {
                    	if(creditHours + uSub3.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += uSub3.getSubjectCreditHoursCost() * uSub3.getSubjectCreditHours();
                        	creditHours += uSub3.getSubjectCreditHours();
                        	selectedSubjects.add(uSub3.getSubjectName());
                        	creditHoursList.add(uSub3.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 7: {
                    	if(creditHours + uSub4.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += uSub4.getSubjectCreditHoursCost() * uSub4.getSubjectCreditHours();
                        	creditHours += uSub4.getSubjectCreditHours();
                        	selectedSubjects.add(uSub4.getSubjectName());
                        	creditHoursList.add(uSub4.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 8: 
                    	if(creditHours + uSub5.getSubjectCreditHours() <= maxCreditHours) {
                		totalPrice += uSub5.getSubjectCreditHoursCost() * uSub5.getSubjectCreditHours();
                    	creditHours += uSub5.getSubjectCreditHours();
                    	selectedSubjects.add(uSub5.getSubjectName());
                    	creditHoursList.add(uSub5.getSubjectCreditHours());
                	} else {
                		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                	}
                	break;
                }
                
                if(creditHours < 12) {
                	System.out.println("The minimum amount of Credit Hours is 12, " + (12 - creditHours) + " Credit Hours left.");
                }
            }
            
            System.out.println("The number of credit hours you registered: " + creditHours);
            System.out.println("The total price of credit hours you registered: " + totalPrice);
            System.out.println("The estimated cost including registration fees: " + (totalPrice + 325.5));
            Student.displayInfo(selectedSubjects);
            Subject.insertionSort(selectedSubjects, creditHoursList);
            System.out.println("The most important subjects you have registered according to it's credit hours: ");
            for(int i = 0; i < selectedSubjects.size(); i++) {
            	System.out.println(selectedSubjects.get(i) + " --> " + creditHoursList.get(i));
            }
            engineeringStudentFees = totalPrice + 325.5;
    	}
    }
    
    public void displayInfo() {
    	System.out.println("You are an Engineering Student, Your Information: Your name is " + this.getName() + ", your student number is " + this.getStudentID() + ", you entered the university in " + this.getEnterYear() + ".");
    }
}

