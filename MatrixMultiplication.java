import java.util.Scanner;
 
class MatrixMultiplication
{
  public static void main(String args[])
  {
    int m, n, p, q, sum = 0, c, d, k;
 
    Scanner in = new Scanner(System.in);
  
    m = in.nextInt();
    n = in.nextInt();
 
    int first[][] = new int[m][n];
 
   
 
    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        first[c][d] = in.nextInt();
 
   
    p = in.nextInt();
    q = in.nextInt();
 
    if (n != p)
      System.out.println("X");
    else
    {
      int second[][] = new int[p][q];
      int multiply[][] = new int[m][q];
 
    
 
      for (c = 0; c < p; c++)
        for (d = 0; d < q; d++)
          second[c][d] = in.nextInt();
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++) {
          for (k = 0; k < p; k++)
            sum = sum + first[c][k]*second[k][d];
 
          multiply[c][d] = sum;
          sum = 0;
        }
      }
 
   
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++)
          System.out.print(multiply[c][d]+"\t");
 
        System.out.print("\n");
      }
    }
  }
}



