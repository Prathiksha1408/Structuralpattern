package proxypattern;

public class ProxyPatternDemo
{  
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Vinutha");  
        access.grantInternetAccess();  
    }  
}  
