import java.util.*;
import java.io.*;
class CompoundInterest
{
    private static double p;
    private static double r;
    private static double n;
    private static double  t;
    private static double base;
    private static double exp;
    public CompoundInterest(double a , double b , double c, double d)
    {
        p = a;
        r = b;
        n = c;
        t = d;
        base = (1 + (r / (n * 100)));
        exp = n * t;
    }
    public double power(double base, double exp)
    {
        exp= (int) exp;
        double result=base;
        while(exp!=0)
        {
            result=result*base;
            exp--;
        }
        return result;
    }

    public void Cal_interest(){
        double a=p*(power(base, exp));
        System.out.println(a-p);
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Principal");
        double a1=in.nextDouble();
        System.out.println("Enter rate");
        double r1=in.nextDouble();
        System.out.println("Enter time");
        double n1=in.nextDouble();
        System.out.println("enter number of time periods elapsed");
        double t1=in.nextDouble();
        CompoundInterest obj = new CompoundInterest(a1,r1,n1,t1);
        System.out.print("Interest :  ");
        obj.Cal_interest();
    }
}