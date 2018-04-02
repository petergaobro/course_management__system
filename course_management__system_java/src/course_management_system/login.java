package course_management_system;
import java.util.Scanner;
public class login{
	/*private  static String CourseID;
	private  static int point = 0;*/
	private double courseQTY;
	
	
	private static final Course[] courseList = new Course[3];
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		String userSelection;
        Course courseList[] = new Course[3];
		courseList[0] = new Course("C100","web programming","Intro to programming","Design web pages","empty",100);
	    courseList[1] = new Course("C101","Database concept","DCNC","Learning SQL and ER diagram","L101",0);
	    courseList[2] = new Course("C102","Programming 1","Intro to programming","Java", "empty",0);
	    do{
	    	 System.out.println("Course Management System Menu");
	         System.out.println("-------------------");
	         System.out.println();

	         System.out.printf("%-28s%s\n", "Student", "A");
	         System.out.printf("%-28s%s\n", "Lecturer", "B");
	         System.out.printf("%-28s%s\n", "Admin", "C");
	         System.out.println();
	         System.out.print("Enter selection: ");
	         userSelection = sc.nextLine().toUpperCase();
	         System.out.println();
	         // process user's selection
	         switch (userSelection)
	         {
	            case "A":
	               student();
	               break;

	            case "B":
	               lecturer();
	               break;

	            case "C":
	               admin();
	               break;
	               
	            case "X":
	                System.out.println("Exiting the program...");
	                break;

	             default:
	                System.out.println("Error - invalid selection!");
	          }
	       } while (!userSelection.equals("X"));
	    }
		private static void student(){
			
			
			int i;
			String userName,passWord,coursename,prereqs,description,chooseCoursename;
			System.out.println("Please enter your userName: ");
			userName = sc.nextLine();
			System.out.println("Please enter your passWord: ");
			passWord = sc.nextLine();
			
			
				if(userName.equals("student")&& passWord.equals("student123")){
					//------------extend program coordinator
					System.out.println("Welcome to student page\n");
					System.out.println("\n");		
					
				}
				else{ 
					System.out.println("Your account is invaild, please re-enter again");
				}
				for(int i = 0; i < courseList.length; i++){
				coursename = courseList[i].getCoursename();
		    	prereqs = courseList[i].getPrereqs();
		    	description = courseList[i].getDescription();
				
		    	System.out.println("No."+ i +" coursename:" + " " + coursename
			  			+ ", " + "prereqs:" + " " + prereqs
			  			+ ", " + "description:" + " " + description);
				}
				
				//Enrollment
				System.out.println("Which is your favor courses? Please select course: ");
				chooseCoursename = sc.nextLine();
				if(courseList[i].getCoursename().indexOf(chooseCoursename) >= 0){
					System.out.println(courseList[i].getCourseID() + " - " + courseList[i].getCoursename());
				}
				
				if(){
					
				}
				System.out.println("\n");
				
				
				
		}
			
		private static void lecturer(){
			String userName;
			String passWord;
			System.out.println("Please enter your userName: ");
			userName = sc.nextLine();
			System.out.println("Please enter your passWord: ");
			passWord = sc.nextLine();
			
			if(userName.equals("lecturer")&& passWord.equals("lecturer123")){
				//------------extend program coordinator
				System.out.println("Welcome to lecturer page\n");	
			}
			else{
				System.out.println("Your account is invaild, please re-enter again");
			}
			
		}
		
		private static void admin(){
			String userName;
			String passWord;
			System.out.println("Please enter your userName: ");
			userName = sc.nextLine();
			System.out.println("Please enter your passWord: ");
			passWord = sc.nextLine();
			
			if(userName.equals("admin")&& passWord.equals("admin123")){
				//------------extend program coordinator
				System.out.println("Welcome to admin page\n");	
			}
			else{
				System.out.println("Your account is invaild, please re-enter again");
			}
		}
		/*private static int search(Course courseList[])
		{
			for(int i=0;i<courseList.length;i++)
			{
				if(CourseID.equals(courseList[i].getCourseID()))
				{
					return i;
				}
			}
			return -1;
		}*/
}
