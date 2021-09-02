package proxypattern;

public class RealObjectProxy extends RealObjectImpl 
{
    @Override
    public void doSomething() 
    {
        //Perform additional logic and security
        //Even we can block the operation execution
        System.out.println("Placeholder");
        super.doSomething();
    }
}
