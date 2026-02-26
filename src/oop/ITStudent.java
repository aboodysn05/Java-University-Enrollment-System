package partOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ITStudent extends Student{
    private int studentItMajor;
    private double itStudentFees;
    
    public double getItStudentFees() {
		return itStudentFees;
	}
	public void setItStudentFees(double itStudentFees) {
		this.itStudentFees = itStudentFees;
	}
	
	Subject uSub1 = new Subject("Fundamental Of Computing", 4, 75);
    Subject uSub2 = new Subject("Professional Practice", 3, 75);
    Subject uSub3 = new Subject("Professional Skills", 1, 75);
    Subject uSub4 = new Subject("Bootcamp", 4, 100);
    Subject uSub5 = new Subject("Functional Math", 3, 75);
    public ITStudent() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("1. Computer Science \n2. Artificial Intelligence");
    	System.out.print("Enter Your IT Major(1-2): ");
    	this.studentItMajor = scanner.nextInt();
    	if(studentItMajor == 1) {
    		Subject sub1 = new Subject("Advanced Programming", 3, 100);
    		Subject sub2 = new Subject("Software Development Life Cycle", 4, 75);
    		Subject sub3 = new Subject("Website Development", 3, 75);
    		System.out.println("List of subjects available this semester for Computer Science major: ");
    		System.out.println("1." + sub1.getSubjectName() + " --> " + sub1.getSubjectCreditHours() + " Credit Hours --> " + sub1.getSubjectCreditHoursCost() + " JD");
    		System.out.println("2." + sub2.getSubjectName() + " --> " + sub2.getSubjectCreditHours() + " Credit Hours --> " + sub2.getSubjectCreditHoursCost() + " JD");
    		System.out.println("3."+ sub3.getSubjectName() + " --> " + sub3.getSubjectCreditHours() + " Credit Hours --> " + sub3.getSubjectCreditHoursCost() + " JD");
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
                    	if(creditHours + sub1.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub1.getSubjectCreditHoursCost() * sub1.getSubjectCreditHours();
                        	creditHours += sub1.getSubjectCreditHours();
                        	selectedSubjects.add(sub1.getSubjectName());
                        	creditHoursList.add(sub1.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 2: {
                    	if(creditHours + sub2.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub2.getSubjectCreditHoursCost() * sub2.getSubjectCreditHours();
                        	creditHours += sub2.getSubjectCreditHours();
                        	selectedSubjects.add(sub2.getSubjectName());
                        	creditHoursList.add(sub2.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 3: {
                    	if(creditHours + sub3.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += sub3.getSubjectCreditHoursCost() * sub3.getSubjectCreditHours();
                        	creditHours += sub3.getSubjectCreditHours();
                        	selectedSubjects.add(sub3.getSubjectName());
                        	creditHoursList.add(sub3.getSubjectCreditHours());
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
            itStudentFees = totalPrice + 325.5;
    	} else if(studentItMajor == 2) {
    		Subject sub4 = new Subject("Data Science Programming", 3, 100);
    		Subject sub5 = new Subject("Data Analytics ", 3, 75);
    		Subject sub6 = new Subject("Modeling and Simulation ", 6, 75);
    		System.out.println("List of subjects available this semester for Artificial Intelligence major: ");
    		System.out.println("1." + sub4.getSubjectName() + " --> " + sub4.getSubjectCreditHours() + " Credit Hours --> " + sub4.getSubjectCreditHoursCost() + " JD");
    		System.out.println("2." + sub5.getSubjectName() + " --> " + sub5.getSubjectCreditHours() + " Credit Hours --> " + sub5.getSubjectCreditHoursCost() + " JD");
    		System.out.println("3." + sub6.getSubjectName() + " --> " + sub6.getSubjectCreditHours() + " Credit Hours --> " + sub6.getSubjectCreditHoursCost() + " JD");
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
                    	if(creditHours + sub4.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub4.getSubjectCreditHoursCost() * sub4.getSubjectCreditHours();
                        	creditHours += sub4.getSubjectCreditHours();
                        	selectedSubjects.add(sub4.getSubjectName());
                        	creditHoursList.add(sub4.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 2: {
                    	if(creditHours + sub5.getSubjectCreditHours() <= maxCreditHours) {
                    		totalPrice += sub5.getSubjectCreditHoursCost() * sub5.getSubjectCreditHours();
                        	creditHours += sub5.getSubjectCreditHours();
                        	selectedSubjects.add(sub5.getSubjectName());
                        	creditHoursList.add(sub5.getSubjectCreditHours());
                    	} else {
                    		System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    	}
                    	break;
                    }
                    case 3: {
                    	if(creditHours + sub5.getSubjectCreditHours()<= maxCreditHours) {
                    		totalPrice += sub5.getSubjectCreditHoursCost() * sub5.getSubjectCreditHours();
                        	creditHours += sub5.getSubjectCreditHours();
                        	selectedSubjects.add(sub5.getSubjectName());
                        	creditHoursList.add(sub6.getSubjectCreditHours());
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
            itStudentFees = totalPrice + 325.5;
    	}
    	
    }
    
    public void displayInfo() {
    	System.out.println("You are an IT Student, Your Information: Your name is " + this.getName() + ", your student number is " + this.getStudentID() + ", you entered the university in " + this.getEnterYear() + ".");
    }
    
}
