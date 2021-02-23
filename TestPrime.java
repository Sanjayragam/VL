/*
 *  Name: Sanjay PV
 *  Roll Number:49
 *  KTU ID:IDK19CS051
 */

// Use a class name which is matching to the file name.
import java.util.Scanner; // Import the Scanner class
public class TestPrime {

    public static void main(String[] args) {	
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println("PRIME");
	else
	   System.out.println("NONPRIME");
   }
}