import java.util.Scanner;
class shapes
{
  public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        if(str.equals("RECTANGLE"))
            { 
                int l,b;
                l=sc.nextInt();
                b=sc.nextInt();
                rectangle rect=new rectangle();
                rect.displayArea(l, b);
            }
        else if(str.equals("CIRCLE"))
             {
                 int r;
                 r=sc.nextInt();
                 circle cir=new circle();
                 cir.displayArea(r);
              }
        else if(str.equals("TRIANGLE"))
             {
                 int b,h;
                 b=sc.nextInt();
                 h=sc.nextInt();
                 triangle tria=new triangle();
                 tria.displayArea(b, h);
}
       
   }
    
}
class rectangle
{
   void displayArea(int l,int b)
    {
        int area=l*b;
         System.out.println(area);
    }
    
}
class circle
{
   void displayArea(int r)
    {
         int area=(22*r*r)/7;
         System.out.println(area);
    }
    
}
class triangle
{
   void displayArea(int b,int h)
    {
        int area=(b*h)/2;
        System.out.println(area);
    }
    
}