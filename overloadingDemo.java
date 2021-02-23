class overloadingDemo
{
    void test()
    {
        System.out.println("Dummy method");
    }
    void test(int a)
    {
        System.out.println(a+10);
    }
     void test(String str)
    {
        System.out.println(str.length());
    }
     void test(int a,int b)
    {
        System.out.println(a+b);
    }

public static void main(String[] arg)
{
    overloadingDemo display = new overloadingDemo();
    display.test();
    display.test(7);
    display.test("sanjay");
    display.test(7,5);
}
}