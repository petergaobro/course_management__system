package course_management_system;
import java.util.*;
import java.io.*;
public class Lecturer  {

		


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 Student[] student=new Student[]{new Student("001"),
										 new Student("002"),
										 new Student("003"),
										 new Student("004"),
										 new Student("005")};//change result into student array
			String choice =null;
			Scanner sc= new Scanner(System.in);
			
			for( int i = 0;i<5;i++){
				System.out.println("Please choose an operation:");
				System.out.println("A. Upload Result");
				System.out.println("B. View Perfoemance");
				System.out.println("C. Exit");
				choice=sc.nextLine();
				switch(choice){
				case "A":	
						student[i].getID();
					break;
				case"B":
					//read res from file
					break;
				case"C":
					System.out.println("Successfully exit");
					return;
					
					}
				
			}
			
			
		}

	}


