import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
       int b = in.nextInt();
		 int c = in.nextInt();
      // Type your code here
      if (a>b)
      {
        if (a>c)
        {
          System.out.println(a);
        }
        else
        {
          System.out.println(b);
        }
      }
      else
      {
        System.out.println(c);
      }
        
    }
}