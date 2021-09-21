import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class question19
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(x.readLine());
        int arr[]=new int[n];
        int eve[]=new int[n];
        int ev=0;
        int od=0;
        int odd[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(x.readLine());
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                eve[ev]=arr[i];
                ev++;
            }
            if(arr[i]%2==1)
            {
                odd[od]=arr[i];
                od++;
            }
        }
        System.out.print("[");
        for(int i=0;i<ev;i++)
                System.out.print(eve[i]+" ");
        System.out.print("]");
        System.out.println();
        System.out.print("[");
        for(int i=0;i<od;i++)
            System.out.print(odd[i]+" ");
        System.out.print("]");
    }
}
