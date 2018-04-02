package course_management_system;
import java.util.Scanner;

public class Enrollment {
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		String courseID,studentName;
		double payment;
		

		System.out.println("Please enter your name: ");
		studentName = src.nextLine();
		System.out.println("Please choose your favour course: ");
		courseID = src.nextLine();
		System.out.println("Please pay your fee: ");
		payment = src.nextDouble();

	}

}
