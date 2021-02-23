/*
 *  Name: Sanjay PV
 *  Roll Number:49
 *  KTU ID:IDK19CS051
 */

// Use a class name which is matching to the file name.
import java.util.Scanner; // Import the Scanner class

class SecondSmallest
{
  public static void main(String[] args) 
  
  {
    int n,secsmall=0,i,count=0,min;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    n = myObj.nextInt(); 
    int[] array = new int[n] ;
    for(i=0; i<n; i++ ) 
      {
         array[i] =myObj.nextInt();
      }
      
      int smallest = Integer.MAX_VALUE;
      int secondSmallest = Integer.MAX_VALUE;
      
      for(i=0; i<n; i++ ) 
      {
          if(array[i]==array[0])
             {
                 count++;
                     
              }
      }
        
      if(count==n)
                         {
                             System.out.println('X');
                         }
        else
        {
            for(int j = 0; j <n; j++)
               {
                    if(array[j] < smallest) 
                       { 
                           secondSmallest = smallest;
                           smallest = array[j]; 
                       } 
 
                         if(array[j] > smallest && array[j] < secondSmallest ) 
                               {
                                    secondSmallest = array[j];
                                }
                 }
      
          
        
                System.out.println(secondSmallest);
      
      }
    
      
      
   
  }
} 
