abstract class Shape
{
    abstract void numberOfSides();
    
    
    
        public static void main(String args[])
    {
        Shape s;
        s=new Rectangle();
        s.numberOfSides();
        s=new Triangle();
        s.numberOfSides();
        s=new Hexagon();
        s.numberOfSides();
    }
    
    
}
class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("No. of sides of Rectangle is : 4");
    }
}
class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("No. of sides of Triangle is : 3");
    }
}
class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("No. of sides of Hexagon is : 6");
    }
}
