public class Static
{
    private  void nonstatic()
    {
        System.out.println("Non static Method");
    }
    public static void statictest()
    {
        System.out.println("Static Method");
    }
    public static void main(String[] args) throws Exception
    {
        Static helloObject = new Static();
        System.out.println("Different Static Methods");
        helloObject.nonstatic();
        statictest();
    }
}