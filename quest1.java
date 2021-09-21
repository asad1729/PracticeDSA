import java.util.*;
public class quest1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[]=new int[1000];
        int p=0;
        for (int j = 1; j < 1667; j++)
        {
            if (j % 3 == 0 || j % 10 == 3)
                continue;
            else
            {
                arr[p] = j;
                p=p+1;
            }
        }
        for (int i = 0; i < t; i++)
        {
            int n = in.nextInt();
            System.out.println(arr[n-1]);
        }
}}



