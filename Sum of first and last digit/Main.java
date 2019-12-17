import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner (System.in);
      int n =in.nextInt();
      int a=n%10;
      while (n>10)
      {
        n=n/10;
        
      }
        int num=n%10;
      int sum = num+a;
      System.out.println(sum);
        
	}
}