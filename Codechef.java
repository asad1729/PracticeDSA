/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = in.nextInt();
            long k1 = in.nextLong();
            long arr[]=new long[n];
            for (int j=0;j<n;j++)
                arr[j]=in.nextLong();
            long b[]=arr.clone();

            for (int j=1; j<=k1; j++)
            {
                for (int k=0;k<n;k++)
                {
                    if(k==0 && b[k]>0 )
                    {
                        arr[k+1]++;
                        arr[n-k-1]++;
                    }
                    else if(k==n-1 && b[k]>0 )
                    {
                        arr[k-1]++;
                        arr[0]++;
                    }
                    else if(b[k]>0 )
                    {
                        arr[k+1]++;
                        arr[k-1]++;
                    }
                }
                b=arr.clone();
            }
            long sum=LongStream.of(arr).sum();

            System.out.println(sum);
        }
    }
}
