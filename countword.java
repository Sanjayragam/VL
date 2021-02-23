import java.util.Scanner;
public class countword 
{
   public static void main(String args[])
     {
      int flag = 0,count = 0,i = 0;
      
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();

      while (i < str.length()) 
      {
         if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
         {
            flag = 0;
         }
         else if (flag == 0)
         {
            flag = 1;
            count++;
         }
         
         i++;
      }
      System.out.println(count);
   }
}