import java.io.*;
import java.util.Scanner;

public class codeforces2
{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            String s=in.next();
            int cnta=0;
            int cntb=0;
            for(int j=0;j<n;j++)
            {
                char ch=s.charAt(j);
                if(ch=='a')
                    cnta+=1;
                else
                    cntb+=1;



            }
        }
    }
}
