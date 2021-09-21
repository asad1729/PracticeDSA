import java.io.*;
import java.util.*;
public class codeforces1
{
    public static void main(String[] args)throws IOException
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int ans=1;
            int p=2;
            while (p<=n)
            {
                if(p%3==0 || p%10==3) {
                    ans = ans + 2;
                    p = p + 1;
                }
                else
                {
                    ans=ans+1;
                    p=p+1;
                }

            }


            int o= 010;
            int j= 10;
            System.out.println(o+j);
        }
    }
}
