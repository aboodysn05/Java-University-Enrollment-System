package part2Procedural;

import java.util.Scanner;
import java.util.ArrayList;

public class ProceduralExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = { //this is a string that includes the subjects
            "Programming --> 3 Credit Hours",
            "Networking --> 3 Credit Hours",
            "Professional Practice --> 3 Credit Hours",
            "Fundamental Of Computing --> 4 Credit Hours",
            "Professional Skills --> 1 Credit Hour",
            "Math For Computing --> 3 Credit Hours",
            "Remedial Arabic --> 2 Credit Hours",
            "Arabic Level 2 --> 1 Credit Hour",
            "Bootcamp --> 4 Credit Hours",
            "Computer Project Research --> 6 Credit Hours",
            "Database --> 3 Credit Hours"
        };

        welcome();
        
        try {
        	String name = scanner.nextLine();
        	System.out.println("Welcome " + name + ", This program will help you in registering in this semester!");
        } catch(NullPointerException e) {
        	System.err.println("The name is Null");
        }
        
        System.out.println("List of subjects available this semester, there are " + numberOfSubjectsInArray() + " subjects: ");
        printArray(subjects);

        double totalPrice = 0;
        int creditHours = 0;
        int maxCreditHours = 18;
        ArrayList<String> selectedSubjects = new ArrayList<String>(); //array list to add the selected subjects

        while (creditHours < maxCreditHours) {
            System.out.print("Select the subject you want this semester according to their number (1-11) or 0 to finish: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; 
            }

            if (choice < 1 || choice > 11) {
                System.err.println("Invalid choice. Please choose a number between 1 and 11.");
                continue;
            }
            
            switch (choice) {
                case 1: case 2: case 3: case 6: case 11:
                    if (creditHours + 3 <= maxCreditHours) {
                        totalPrice += 225;
                        creditHours += 3;
                        int position = subjects[choice - 1].indexOf('>') + 3;
                        selectedSubjects.add(subjects[choice - 1].substring(0, position));
                    } else {
                        System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    }
                    break;
                case 4: case 9:
                    if (creditHours + 4 <= maxCreditHours) {
                        totalPrice += 300;
                        creditHours += 4;
                        int position = subjects[choice - 1].indexOf('>') + 3;
                        selectedSubjects.add(subjects[choice - 1].substring(0, position));
                    } else {
                        System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    }
                    break;
                case 5: case 8:
                    if (creditHours + 1 <= maxCreditHours) {
                        totalPrice += 75;
                        creditHours += 1;
                        int position = subjects[choice - 1].indexOf('>') + 3;
                        selectedSubjects.add(subjects[choice - 1].substring(0, position));
                    } else {
                        System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    }
                    break;
                case 7:
                    if (creditHours + 2 <= maxCreditHours) {
                        totalPrice += 150;
                        creditHours += 2;
                        int position = subjects[choice - 1].indexOf('>') + 3;
                        selectedSubjects.add(subjects[choice - 1].substring(0, position));
                    } else {
                        System.out.println("Cannot register this subject. Credit hours will exceed the maximum allowed.");
                    }
                    break;
                case 10:
                    if (creditHours + 6 <= maxCreditHours) {
                        totalPrice += 450;
                        creditHours += 6;
                        int position = subjects[choice - 1].indexOf('>') + 3;
                        selectedSubjects.add(subjects[choice - 1].substring(0, position));
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
        System.out.println("The most important subjects you have registered according to the credit hours: ");

        insertionSort(selectedSubjects); //this function will sort the subjects according to the credit hours

        for (String subject : selectedSubjects) {
            System.out.println(subject);
        }

        scanner.close();
    }

    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
            System.out.println("----------");
        }
    }

    static int findCreditHour(String subject) {
        int position = subject.indexOf(">");
        return Integer.parseInt(subject.substring(position + 2, position + 3)); //this function will return the integer type of the credit hour from the string array
    }

    static void insertionSort(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            String key = list.get(i);
            int keyCreditHours = findCreditHour(key);
            int j = i - 1;

            while (j >= 0 && findCreditHour(list.get(j)) < keyCreditHours) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
    
    static void welcome() {
    	System.out.println("===== Welcome To AY University =====");
        System.out.print("Enter Your Name: ");
    }
    
    static int numberOfSubjectsInArray() {
    	return 11;
    }
}


