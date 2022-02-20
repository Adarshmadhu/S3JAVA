/*Java program to concatenate two numbers and strings using method
overloading concept.*/
class concatenate
{ 
  public static void main(String args[])
   {
   concatenate Obj=new concatenate();
   Obj.consum("6"+"5");
   Obj.consum("Adarsh"+" "+"T M");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
 }
