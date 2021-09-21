/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef23
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            String ans="";
            int n = in.nextInt();
            if (n != 2) {
                int cnt = 0;
                String pk = "";
                for (int j = 0; j < n*n; j++)
                {
                    if(j%n==0)
                    {
                        System.out.println(pk);
                        pk="";
                    }
                    if (j == cnt)
                    {
                        pk = pk + "-1" + " ";
                        cnt = cnt + n + 1;
                    }
                    else
                        pk = pk + "1" + " ";
                }
                System.out.println(pk);

            }
            else
            {
                System.out.println(-1 + " " + -1);
                System.out.println(-1 + " " + -1);
            }
        }
    }
}