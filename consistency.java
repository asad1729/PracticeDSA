import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
public class consistency {
    static boolean allCharactersSame(String s)
    {
        int n = s.length();
        for (int i = 1; i < n; i++)
            if (s.charAt(i) != s.charAt(0))
                return false;
        return true;
    }
    static char getVowel(String str)
    {
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            char ch1=str.charAt(i);
            if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')
                count[ch1]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++)
        {
            if (max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
    static char getCons(String str)
    {
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            char ch1=str.charAt(i);
            if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')
                continue;
            else {
                count[ch1]++;
            }
            ;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++)
        {
            if (max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException
    {

        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        consistency obj = new consistency();
        int t = Integer.parseInt(x.readLine());
        for (int i = 0; i < t; i++)
        {
            String s = x.readLine();
            int l = s.length();
            int vow = 0;
            int con = 0;
            int time = 0;
            int time1 =0;
            char ch2 = 0;
            char ch3= 0;
            String s2 = "";
            String s3 = "";
            int j = 0;
            if (l == 1)
            {
                System.out.println("Case #" + (i + 1) + ": " + 0);
            }
            else
            {
                for (j = 0; j < l; j++)
                {
                    char ch = s.charAt(j);
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    {
                        vow += 1;
                    }
                    else
                    {
                        con += 1;

                    }
                }
                    ch2=getVowel(s);
                    for (j = 0; j < l; j++)
                    {
                        char ch = s.charAt(j);
                        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                            s2 = s2 + ch;
                        else
                        {
                            s2 = s2 + ch2;
                            time = time + 1;
                        }
                    }
                        for (j = 0; j < l; j++)
                        {
                            char ch = s2.charAt(j);
                            if (ch != ch2)
                                time = time + 2;
                        }
                        ch3=getCons(s);
                    for (j = 0; j < l; j++)
                    {
                        char ch = s.charAt(j);
                        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                            s3 = s3 + ch3;
                            time1 = time1 + 1;
                        }
                        else
                        {
                            s3 = s3 + ch;
                        }
                    }
                        for (j = 0; j < l; j++)
                        {
                            char ch = s3.charAt(j);
                            if (ch != ch3)
                                time1 = time1 + 2;
                        }
                if(time < time1)
                    System.out.println("Case #"+(i+1)+": "+time);
                if(time1 < time)
                    System.out.println("Case #"+(i+1)+": "+time1);
            }
        }
    }
}