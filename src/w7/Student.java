package w7;
import java.io.*;
class Student
{
	String name,course; int rno;
	float ia1,ia2,ia3,avg;
	Student()
	{
	     try
	     {
	    	     InputStreamReader isr = new InputStreamReader (System.in);
		         BufferedReader br=new BufferedReader(isr);
			     System.out.println("Enter Roll Number of Student.");
				 rno=Integer.parseInt(br.readLine());
				 System.out.println("Enter Name of Student.");
				 name=br.readLine();
				 System.out.println("Enter Course of Student.");
				 course=br.readLine();
				 System.out.println("Enter First CIE score of the Student.");
				 ia1=Float.parseFloat(br.readLine());
				 System.out.println("Enter Second CIE score of the Student.");
				 ia2=Float.parseFloat(br.readLine());
				 System.out.println("Enter Third CIE score of the Student.");
				 ia3=Float.parseFloat(br.readLine());
				 avg=(ia1 + ia2 + ia3) / 3;
		    }
		 catch(Exception e)
        {
           System.out.println("Run Time Error Occured while reading input..."); e.printStackTrace();
        }
     }
     void displayStudentDetails()
     {
         System.out.println(rno+"\t"+name+"\t\t"+course+"\t"+ia1+"\t"+ia2+"\t"+ia3+"\t"+avg);
     }
}
class arrayofstudents
{
	public static void main(String args[])
	{
		Student list[]=new Student[5];
		for(int i=0;i<list.length;i++)
			list[i]=new Student();
		System.out.println("\n*********************************************************************");
		System.out.println("R.no\tName\t\tCourse\tCIE-1\tCIE-2\tCIE-3\tAvg");
		System.out.println("\n**********************************************************************");
		for(int i=0;i<3;i++)
			list[i].displayStudentDetails();
		System.out.println("\n***********************************************************************");
	}
}

