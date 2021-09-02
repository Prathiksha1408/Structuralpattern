package proxypattern;

public class RealObjectImpl implements RealObject
{
	@Override
	public void doSomething()
	{
		System.out.println("Real object");
	}
}
