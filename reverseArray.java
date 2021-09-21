import java.util.*;
import java.io.*;
import java.lang.*;
public class reverseArray
{
    public static void main(String[] args) throws java.lang.Exception
    {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
           arr[i]=in.nextInt();
       for(int i=n-1;i>=0;i--)
           System.out.print(arr[i] + " ");
    }
}
