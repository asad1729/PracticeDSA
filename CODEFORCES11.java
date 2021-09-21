import java.nio.Buffer;
import java.util.*;
public class CODEFORCES11
{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            String s=in.next();
            int check=0;
            for(int j=0;j<n-1;j++)
                {
                    if(s.charAt(j) == 'a' && s.charAt(j+1)=='b')
                    {
                        System.out.println((j+1) + " " + (j+2));
                        check++;
                        break;
                    }
                    if(s.charAt(j) == 'b' && s.charAt(j+1)=='a')
                    {
                        System.out.println((j+1) + " " + (j+2));
                        check++;
                        break;
                    }
                }
            if(check==0) {
                System.out.println("-1" + " " + "-1");
            }
            }
        }
    }

