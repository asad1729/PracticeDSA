import java.util.Scanner;
import java.util.Arrays;

public class maxmin {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        System.out.println("Minimum="+arr[0]);
        System.out.println("Maximum="+arr[n-1]);


    }
}
