import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in =new Scanner (System.in);
    int n =in.nextInt();
    int a = n/100;
    
      int b= (n%100)/10;
      int c = (n%100)%10;
      int rev = c*100+b*10+a;
      System.out.println(rev);
  }
}