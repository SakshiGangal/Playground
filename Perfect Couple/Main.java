import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in=new Scanner (System.in);
      int arr_size=in.nextInt();
        int arr[]=new int[arr_size];
      for (int index=0;index<=arr_size-1;index++)
      {
        arr[index]=in.nextInt();
      }
      int value =in.nextInt();
      
      function(arr_size, arr,value);
      }
  public static void function( int arr_size, int arr[],int value){
    int sum=0;
    
    for (int i=0;i<=arr_size-1;i++)
      { 
      for (int j=i+1;j<=arr_size-1;j++)
      { 
        sum=arr[i]+arr[j];
      if (sum==value)
      {
        System.out.print(arr[i]+","+" "+arr[j]);
      
        System.out.print("\n");}
      }
    }
  }
}