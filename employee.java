import java.util.Scanner;
class employee
{
public String name;
public double salary;
public int age;
public String address;
public long phoneNumber;
public Scanner sc=new Scanner(System.in);
static void print_salary(double salary)
{
System.out.println("Salary is "+salary);
}
static void display(String name,int age,String address,long phoneNumber)
{
System.out.println("Name is "+name);
System.out.println("Age is "+age);
System.out.println("Address is "+address);
System.out.println("Phone number is "+phoneNumber);
}
public static void main(String[] args)
{
officer o=new officer();
manager m=new manager();
o.specialisation();
m.departement();
System.out.println("\n\nDISPLAYING OFFICER DETAILS");
display(o.name,o.age,o.address,o.phoneNumber);
print_salary(o.salary);
System.out.println("\n\nDISPLAYING MANAGER DETAILS");
display(m.name,m.age,m.address,m.phoneNumber);
print_salary(m.salary);
}}
class officer extends employee
{
void specialisation()
{
System.out.println("Enter the name of officer");
name=sc.nextLine();
System.out.println("Enter the age of officer");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter address of officer");
address=sc.nextLine();
System.out.println("Enter phone number of officer");
phoneNumber=sc.nextLong();
System.out.println("Enter the salary of officer");
salary=sc.nextDouble();
}}
class manager extends employee
{
void departement()
{
System.out.println("Enter the name of manager");
name=sc.nextLine();
System.out.println("Enter the age of manager");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter address of manager");
address=sc.nextLine();
System.out.println("Enter phone number of manager");
phoneNumber=sc.nextLong();
System.out.println("Enter the salary of manager");
salary=sc.nextDouble();
}
}