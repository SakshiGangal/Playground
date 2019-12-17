import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		int n1 =in.nextInt();
        int n2 =in.nextInt();
        int n3 =in.nextInt();
      System.out.println(greatest(n1,n2,n3));
    }
  public static int greatest(int a,int b,int c){
    
    int min,gcd=0;
    if(a<b && a<c)
    {
      min=a;
    }
    else if(b<c) {
      min=b;
    }
    else
    {
      min=c;
    }
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0)&&(c%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
}