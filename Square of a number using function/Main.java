import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int fn=sq(n);
      System.out.println(fn);
	} 
  public static int sq (int a)
    {
	 // Type your code here  
   
      int c=a*a;
      return c;
	} 
}