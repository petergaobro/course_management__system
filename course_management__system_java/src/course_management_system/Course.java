package course_management_system;
import java.io.*;
import java.util.*;

public class Course {
	private String CourseID;
	private String coursename;
	private String prereqs;
	private String description;
	private String LecturerID;
    private int MAXMUNLOAD;
	
	public Course (String CourseID,String coursename, String prereqs, String description, String LecturerID, int MAXMUNLOAD)
	{
		this.CourseID = CourseID;
		this.coursename = coursename;
		this.prereqs = prereqs;
		this.description = description;
		this.LecturerID = LecturerID;
		this.MAXMUNLOAD = MAXMUNLOAD;
	}
	
	public String getCourseID(){
		return CourseID;
	}
	public String getCoursename()
	{
		return coursename;
	}
	
	public String getPrereqs()
	{
		return prereqs;
	}
	
	public String getDescription()
	{
		return description;
	}
	public String getLectureID(){
		return LecturerID;
	}
	
	public int getMAXMUNLOAD(){
		return MAXMUNLOAD;
	}
	
	public void print()
	{
		System.out.println("Course ID            " + CourseID);
		System.out.println("Course Name          " + coursename);
		System.out.println("Prerequistes         " + prereqs);
		System.out.println("Course Description   " + description);
	}
	
	public void read(StringTokenizer st)
	{
		coursename = st.nextToken();
		prereqs = st.nextToken();
		description = st.nextToken();
	}

	public void write(PrintWriter p)
	{
		p.println("Course ID: "+ CourseID);
		p.println("Course Name: " + coursename);
		p.println("Prerequistes : " + prereqs);
		p.println("Course Description : " + description );
	}

	public void AssignLecturer(String enterLectureID){
		LecturerID = enterLectureID;
	}
	
	public void AddMAXMUNLOAD(int enterMAXMUNLOAD){
		MAXMUNLOAD = enterMAXMUNLOAD;
	}
}
