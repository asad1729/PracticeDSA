import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s)
    {
        String pass = "";
        int i = 0;
        while (i < s.length() - 1)
        {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if (Character.isLowerCase(ch2) && Character.isUpperCase(ch) && Character.isSpecia;) {
                pass = pass + ch2 + ch + "*";
                i = i + 2;
            }
            if (Character.isDigit(ch)) {
                pass = "0"+pass;
                i = i + 1;
            } else {
                pass = pass + ch;
                i = i + 1;
            }
        }
        return pass;
    }
}

    public class Solution {
        public static void main(String[] args) throws IOException {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String result = Result.decryptPassword(s);
            System.out.println(result);
        }
    }


