import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
	   Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int fn=num(n1);
      System.out.println(fn);
	}
  public static int num(int n)
  {
    int sum=0;
    for (int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
}
}