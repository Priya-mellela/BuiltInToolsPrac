public class Main {
    public static void main(String[] args) {

        A obj1=A.getInstance();
        A obj2=A.getInstance();
    }
}

class A
{
    static A obj=new A();

    private A()
    {
        System.out.println("Instance created");
    }
    public static A getInstance()
    {
        return obj;
    }
}