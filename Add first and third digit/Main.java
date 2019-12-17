import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in =new Scanner (System.in);
      int n= in.nextInt();
      int sum =( n/100)+ (n%10);
      System.out.println(sum);
		// Type your code here
	}
}