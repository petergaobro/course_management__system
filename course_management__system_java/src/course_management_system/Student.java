package course_management_system;


import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Student {
		
	    Scanner sc = new Scanner(System.in);
		
		private String UploadResult;
		private String studentID;
		private String ID;
		public Student(String studentID) {
			this.studentID=studentID;
		}
		
		public String getStudentID()
		{	
			return studentID;
		}
		public String getID(){
			String id;
			
			int j=1;
			do{
			System.out.println("Please enter the ID you want to operate for: ");
			id=sc.nextLine();
			
			
			if(id.equals("001")||id.equals("002")||id.equals("003")||id.equals("004")||id.equals("005"))
			{
			UploadResult();
			}else {
				System.out.println("Please enter correct ID !");	
				
			}}while(j!=1);
			
			return id;
			
		}
		public  String UploadResult()throws InputMismatchException{
			Scanner sc= new Scanner(System.in);
			String res;			
			int j=1;
			do{	
				System.out.println("Please enter the result:");
							
				res=sc.nextLine();
				if(res.equals("HD")||res.equals("DI")||res.equals("CR")||res.equals("PA")||res.equals("FA")){
					try{
						FileWriter ResultStoring = new FileWriter (System.currentTimeMillis()+"Result.txt");
						BufferedWriter out =new BufferedWriter(ResultStoring);
						out.write(res);
						out.close();
					}catch(Exception e){
						System.out.println("Error: "+ e.getMessage());
					}
					System.out.println("Upload Successfully!");
					break;
				}else{
					System.out.println("Please enter the valid Result");
				}
			}while(j==1);
					return res;
		}

		public static void main(String[] args){
		}
}