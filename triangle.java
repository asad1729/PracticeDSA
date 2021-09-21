import java.io.IOException;
import java.util.*;
public class triangle {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s="";
        int cnt=0;
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i =1;i<n;i++)
        {
            arr[i]=i+arr[i-1];
            if(n==arr[i])
                cnt=i;
        }
        for(int i =0;i<n;i++)
        {
            String s1=in.next();
            s=s+s1+" ";
        }
        for(int i =n-1;i>0;i--)
        {
            if(i==arr[i])
                System.out.println();
            else
                System.out.print(s.charAt(i)+" ");
        }

        }
    }