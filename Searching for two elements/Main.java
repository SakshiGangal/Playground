import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner (System.in);
    int size=in.nextInt();
      int arr[]=new int[size];
      
   for (int i=0;i<=size-1;i++){
      arr[i]=in.nextInt();}
    int elem1=in.nextInt();
    int elem2=in.nextInt();
    int flag=0;
    int sum=0;
      int num1=0;
      int num2=0;
    for(int i=0;i<=size-1;i++)
      {
      if ( elem1==arr[i] ){
        flag=1;
        num1=i;
        break;}
    }
    for(int i=0;i<=size-1;i++)
      {
      if ( elem2==arr[i] ){
       sum=1;
        num2=i;
        break;}
    }
      if (flag==1){
        System.out.println(num1);}
      else {
          System.out.println("-1");}
        if (sum==1){
        System.out.println(num2);}
        else {
          System.out.println("-1");}
 }
  }
