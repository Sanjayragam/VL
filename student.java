import java.util.Scanner;
class student
{
    String name;
    int age;
    String address;
    student()
    {
        
        name="unknown";
        age=0;
        address="not available";
        
    }
    
    void setinfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
     void setinfo(String name,int age)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student s[] = new student[10];
        
        for(int i=0;i<10;i++)
        {
            s[i] = new student();
            System.out.println("student "+(i+1));
            System.out.println("----------");
            System.out.println("Name :");
            String name=sc.nextLine();
            System.out.println("Age  :");
            int age=sc.nextInt();
            System.out.println("Address :");
            sc.nextLine();
            String address=sc.nextLine();
            s[i].setinfo(name,age,address);
        }
  
         for(int i=0;i<10;i++)
        {
            System.out.println("student "+(i+1)+"[ name =" +s[i].name+", age = "+s[i].age+", address = "+s[i].address +"]");
        }
    }
}