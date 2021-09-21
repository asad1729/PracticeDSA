/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef12
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            if(n==2)
                System.out.println(2);
            else
            {
                double j1=Math.round(2.5);
                System.out.println(j1);
                if(n%j1==0)
                {
                    j1=j1+1;
                }
                System.out.println(j1);
            }
        }
    }
}
