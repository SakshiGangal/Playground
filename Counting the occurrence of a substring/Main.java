import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan =new Scanner (System.in);
    String s1= scan.nextLine();
    String s2= scan.nextLine();
    int s1_len=s1.length();
     int s2_len=s2.length();
    int count=0;
    for (int i=0;i<(s1_len-s2_len+1);i++)
    {
      for (int j=0;j<s2_len;j++)
      {
        if (s1.charAt(i+j)==s2.charAt(j))
        {
          count++;
        break; }}}
       System.out.print(count);
      
    
  }
}