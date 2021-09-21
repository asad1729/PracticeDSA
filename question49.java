import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class question49 {
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String w1 = x.readLine();
        String s[]=w1.split(" ");
        int arr[] = new int[s.length];
        for(int i=0; i < s.length; i++)
        {
            arr[i] = Integer.valueOf(s[i]);
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
