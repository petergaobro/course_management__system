package course_management_system;
import java.io.*;
import java.util.*;

public class ProgramCoordinator {
	private String options[];
	private String grantexemption;
	private String grantpermission;
	private char priorstudy = 'Y';
	private char student = 'Y';
	
	public ProgramCoordinator (String opts[])
	{
		options = opts;
	}
	
	public ProgramCoordinator (String grantexemption,String grantpermission)
	{
		this.grantpermission = grantpermission;
		this.grantexemption = grantexemption;
	}
	
	public void display()
	{
		System.out.println("\n______________________________Details______________________________");
		for(int i=0; i<options.length; i++)
		{
			System.out.println("\t\t"+options[i] + "\t" + (i+1));
			
		}
	}
	
	public int getValidChoice()
	{
		Scanner sc = new Scanner(System.in);
		int n; 
		System.out.println("\nPlease enter a number within 1-3:");
		do{
			n = Integer.parseInt(sc.nextLine());
			if( n< 0 || n> options.length)
			{
				System.out.print("Invalid number. Please enter a number within 1-3:  ");
			}
		}while(n<0 || n>options.length);
		return n;
	}
	
	public static class ManageParts2
	{
		private Course courseList[];
		private int count;
		Scanner sc;
		
		public ManageParts2()
		{
			courseList = new Course[100];
			count = 0;
			sc = new Scanner(System.in);	
		}

	
	public void addCourse()
	{
		System.out.print("Enter Course ID : ");
		String CourseID = sc.nextLine();
		System.out.print("Enter Course Name : ");
		String coursename = sc.nextLine();
		System.out.print("Enter Prerequisites : ");
		String prereqs = sc.nextLine();
		System.out.print("Enter Description : ");
		String description = sc.nextLine();
		
		Course course = new Course (CourseID, coursename, prereqs, description,"empty", 0);
		courseList[count++] = course;
		for( int i = 0; i <count; i++)
		{
			System.out.println("\nCourse ID:\n" + courseList[i].getCourseID());
			System.out.println("\nCourse Name:\n" + courseList[i].getCoursename());
			System.out.println("\nPrereqs:\n" + courseList[i].getPrereqs());
			System.out.println("\nCourse Description:\n" + courseList[i].getDescription());
			
		}
		System.out.print("\nThe course has been created !! \n ");
	}
	
	public void pause()
	{
		System.out.print("\nPausing ...... Please enter to continue");
		sc.nextLine();
	}
	
	/*public void displayCourse()
	{
		for(int i=0; i<count; i++)
		{
			c[i].print();
			pause();
		}
		
	}*/
	
	public double grantexemption(char priorstudy)
	{
		if(priorstudy == 'Y')
		{
			priorstudy = 0;
		}
		return priorstudy;
		
	}
	
	public double grantpremission(char student)
	{
		if(student == 'Y')
		{
			student = 100;
		}
		return student;
		
	}
	
	
	public void saveCourse() 
	{
		try
		{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("course.txt")));
			for( int i = 0; i <count; i++)
			{
				System.out.println("\nCourse ID:\n" + courseList[i].getCourseID());
				System.out.println("\nCourse Name:\n" + courseList[i].getCoursename());
				System.out.println("\nPrereqs:\n" + courseList[i].getPrereqs());
				System.out.println("\nCourse Description:\n" + courseList[i].getDescription());
				courseList[i].write(pw);
			}
			pw.close();
			System.out.println("\nData saved to course.txt");
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}


	public static void main(String[] args) throws IOException
	{
		String options[] = {"Add Course			"
				, "Saving				"
				,"Exit				 "};
		ProgramCoordinator menu = new ProgramCoordinator(options);
		ManageParts2 m = new ManageParts2();
		int n;
		do
		{
			menu.display();
			n = menu.getValidChoice();
		
			switch(n)
			{
			case 1:
				m.addCourse();
				break;
			case 2:
				m.saveCourse();
				break;
			case 4:
				System.exit(0);
			}
		}while (n != 0);
		m.saveCourse();
	}

	}

}
