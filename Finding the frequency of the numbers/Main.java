
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int list[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            list[i] = sc.nextInt();
        }
      for(int j=1;j<=k;j++)
      {
       int search_elem=j;
        int count=0;
        for(int m=0;m<=n-1;m++)
        {
          if(search_elem==list[m])
             {
               count++;
             }
        }
        System.out.println(j+" "+count);
      }
    }
}