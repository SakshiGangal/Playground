import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      int temp=1;
	   for(int num = 1; num <= n; num++)
              { 
                  temp=temp*num;// Type your code here
	}
      System.out.println(temp);
  // Type your code here
	}
}