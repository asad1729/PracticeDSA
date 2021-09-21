import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class ccodingden1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = in.nextInt();
        int q = in.nextInt();
        int m[] = new int[q];
        Arrays.sort(x);
        for (int i = 0; i < q; i++)
        {
            int m1=in.nextInt();
            int sol=binarysearch(n,0,m1, x);
            System.out.println(sol);
    }
    }
    public static int binarysearch(int right, int left,int temp, int arr[])
    {
        if(left+1>= right)
        {
            if(arr[left]<=temp)
                return right;
            else
                return left;
        }
        int mid = (left+right)/2;
        if(arr[mid]<=temp)
        {
            return binarysearch(right,mid,temp ,arr);
        }
        else
            return binarysearch(mid,left,temp,arr);
    }
}

