import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) throws IOException
    {
        BufferedReader x= new BufferedReader((new InputStreamReader(System.in)));
        int t=Integer.parseInt(x.readLine());
        for(int i=0;i<t;i++)
        {
            int X=Integer.parseInt(x.readLine());
            System.out.println(countDivisors(X));
        }
        }
     static int countDivisors(int n)
     {
         int cnt = 0;
         for (int i = 1; i <= Math.sqrt(n); i++)
         {
             if (n % i == 0) {
                 // If divisors are equal,
                 // count only one
                 if (n / i == i)
                     cnt++;

                 else // Otherwise count both
                     cnt = cnt + 2;
             }
         }
         return cnt;
     }
    }