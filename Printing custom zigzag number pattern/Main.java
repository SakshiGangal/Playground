import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
  		int n =in.nextInt();
       for (int i=1;i<=n;i++)
       {
        if(i%2!=0){
             for (int j=1;j<=n-1;j++) 
            {
               System.out.print(i);
             }
            for (int j=1;j<=1;j++) 
            {
               System.out.print(i+1);
             }}
          else{
          for (int j=1;j<=1;j++) 
            {
               System.out.print(i+1);
             }
            for (int j=1;j<=n-1;j++) 
            {
               System.out.print(i);
             }}
           System.out.print("\n");
        }
    }
}