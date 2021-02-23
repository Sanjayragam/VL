import java.util.Scanner;
class frequency {
    public static void main(String[] args)
    {
        //Step 1: Read a string from console
         Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char chartest = sc.next().charAt(0);
        int left, right = 0, count= 0;
        right = input.length();
        for (left=0;left<right;left++)
        {
          if (chartest==input.charAt(left)){
            ++count;
          }
        }
        System.out.println(+ count);
    }
}