import java.util.Scanner;
class Main
{
   public static void main ( String args[]){ 
    Scanner in= new Scanner (System.in);
    int arr_size =in.nextInt();
    int arr[]=new int [arr_size];
    
    for ( int index=0;index<=(arr_size-1);index++)
    {
      arr[index]=in.nextInt();                                   
    }
    partition (arr_size,arr);
    for (int index=0; index<=(arr_size-1);index++)
    {
        System.out.print(arr[index]+" ");
    }
  }
  public static void partition(int arr_size,int arr[])
  {
    int neg[]=new int[arr_size];
    int neg_size=0;
    int pos[]=new int[arr_size];
    int pos_size=0;
    for(int index=0;index < arr_size;index++)
    {
      if(arr[index]==0)
      {
        pos[pos_size]=arr[index];
        pos_size++;
      }
      else{
        neg[neg_size]=arr[index];
        neg_size++;
      }
    }
      int arr_index=0;
      for(int index=0;index<=(neg_size-1);index++)
      { 
        arr[arr_index]=neg[index];
        arr_index++;
      }
      for( int index=0 ;index<=(pos_size-1); index++)
      {
        arr[arr_index]=pos[index];
        arr_index++;
      }
    }
  }