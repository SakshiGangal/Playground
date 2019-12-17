import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int front=0;
      int end=n-1;
      boolean flag=false;
      while(front<end)
      {
        if(arr[front]!=arr[end])
        {
          flag=true;
          break;
        }
        front++;
        end--;
      }
      if(flag==false)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
        
    }
}