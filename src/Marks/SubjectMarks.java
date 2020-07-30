package Marks;

import java.util.Scanner;
public class SubjectMarks {
	
	public static void main(String agrs[])
	{
		//char Fail='F';
		//char Pass='P';
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Student name:");
		String name=s.next();
		System.out.print("Enter Student Department:");
		String dept=s.next();
		System.out.print("Enter Student Marks:");
		int marks=s.nextInt();
		/*if(marks<=40)
		{
			System.out.println("Student fail:");
		}
		else
		{
			System.out.println("Student Pass:");
		}*/
		System.out.print("RESULT!!!!!\n");
		System.out.println("Name is:\n" +name);
		System.out.println("Department is:\n" +dept);
		System.out.println("Marks is:\n" +marks);
		if(marks<=40)
		{
			System.out.println("Student fail");
		}
		else
		{
			System.out.println("Student Pass");
		}
		//System.out.println("According to student marks He/She is:\n" );
		
		
	}
	
	

}
