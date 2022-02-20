//Java program to create a class employee with details such as empno, name and phone number. Read details of at least 5employees and print
import java.util.*; 
class emp
 { 
  public static void main(String args[])
   {
	   System.out.println("Enter the number of Employees:");
	   Scanner obj = new Scanner(System.in);
	   int num= obj.nextInt();
    try
	{
        for(int i=1;i<=num;i++)
        { 
          System.out.println("Details of employee "+i);
          System.out.println("Enter the employee number:");
          obj.nextInt();
          System.out.println("Enter the employee Name:");
          obj.next();
          System.out.println("Enter the employee's phone number:");
          obj.next();
        }
    }
	catch (Exception e)
	{
		 System.out.println(e);
	}
   }
}