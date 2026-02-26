package part1;
import java.util.Scanner;
public class InsertionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        int[] arrayStudentsNumbers = new int[numberOfStudents]; //this is an array to store the students numbers.
        double[] arrayStudentsGrades = new double[numberOfStudents]; //this is an array to store the students grades.
        getStudentsNumbersAndGrades(numberOfStudents,arrayStudentsNumbers,arrayStudentsGrades,input);
        insertionSort(arrayStudentsNumbers,arrayStudentsGrades,numberOfStudents);
        
        System.out.println("==== Top Students ====");
        for(int i = 0; i < numberOfStudents; i++) {
        	System.out.println("Student Number: " + arrayStudentsNumbers[i] + " Student Grade: " + arrayStudentsGrades[i]);
        }
        System.out.println("==== End Of the Program ====");
	}
    
	static void getStudentsNumbersAndGrades(int numberOfStudents, int[] array,double[] array2, Scanner input) {
		for(int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter Student Number " + (i+1) + ": ");
			array[i] = input.nextInt();
			System.out.print("Enter Student Grade " + (i+1) + ": ");
			array2[i] = input.nextDouble();
		}
	}
	static void insertionSort(int[] arrayStudentsNumbers, double[] arrayStudentsGrades, int numberOfStudents) {
		for(int i = 1; i < numberOfStudents; i++) {
			double grade = arrayStudentsGrades[i];
			int number = arrayStudentsNumbers[i];
			int j = i-1;
			
			while(j >= 0 && arrayStudentsGrades[j] < grade) {
				arrayStudentsGrades[j+1] = arrayStudentsGrades[j]; 
				arrayStudentsNumbers[j+1] = arrayStudentsNumbers[j];
				j = j-1;
			}
			
			arrayStudentsGrades[j+1] = grade;	
			arrayStudentsNumbers[j+1] = number;
		}
	}
	
}

