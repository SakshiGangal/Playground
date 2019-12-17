
import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    int end = str_len - 1;
    int front = 0;
    boolean flag=false;
    while(front < end)
    {
      if(sb.charAt(front)!=sb.charAt(end))
      {
        flag=true;
        break;
    }
    front++;
    end--;
    }
   if (flag==false)
   {
     System.out.println("Yes");
   }
      else
   {
        System.out.println("No");
    }
     
  }
}
