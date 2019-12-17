import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
     
        int size = in.nextInt();
        int arr[] = new int[size];
       
        for(int i = 0; i <= size - 1; i++)
        {
            arr[i] = in.nextInt();
        }
        int max_no;
          int index=0;
        if(arr[0] > arr[1])
        {
            max_no = arr[0];
        }
        else{
             max_no = arr[1];
        }
        
        for(int i = 2; i <= size - 1; i++)
        {
            if(max_no < arr[i])
            {
                max_no = arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}