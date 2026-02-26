package partOOP;
import java.util.Scanner;
public class MainOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("===== Welcome To AY University =====");
		System.out.println("1. IT Department \n2. Engineering Department");
		System.out.print("Enter Your Department(1-2): ");
		int choice = scanner.nextInt();
		if(choice == 1) {
			ITStudent itStudent = new ITStudent();
			itStudent.payFees(itStudent.getItStudentFees());
			itStudent.displayInfo();
		} else if(choice == 2) {
			EngineeringStudent engStudent = new EngineeringStudent();
			engStudent.payFees(engStudent.getEngineeringStudentFees());
			engStudent.displayInfo();
		} else {
			System.out.println("Invalid Input");
		}
	}

}
