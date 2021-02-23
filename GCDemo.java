class GCDemo
{
    GCDemo()
    {
        System.out.println("constructor");
    }
    protected void finalize() throws Throwable
    {
        System.out.println("Finalize method");
    }
    public static void main(String[] args)
    {
        GCDemo object = new GCDemo();
        object=null;
        try
        {
            System.out.println("Before calling garbage collector");
            System.gc();
            System.out.println("garbage collected");
        }
        catch (Throwable e)
        {
            
        }
    }
}