import java.util.Scanner;
class ReverseString {
    public static void main(String[] args)
    {
        //Step 1: Read a string from console
         Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // Step 2: Convert the string to a character array
        char[] temparray = input.toCharArray();
        int left, right = 0;
        char y;
        right = temparray.length - 1;
        for (left=0;left<temparray.length/2;left++)
        {
          y=temparray[left];
          temparray[left]=temparray[right];
          temparray[right]=y;
          right--;
        }
        //Step 4: Convert the swapped array into a string
        String reversed = String.valueOf(temparray);
        if(input.equals(reversed))
        {
          System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NONPALINDROME");
        }
    }
}