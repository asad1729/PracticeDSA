import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        for (int p = 0; p<t; p++)
        {
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();
            int a4 = in.nextInt();
            int cnt=0;
            int arr[] = {a1, a2, a3, a4};
            HashMap<Integer,Integer> frequency= findRepeating(arr,4);
            for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
                if(entry.getValue()>1)
                    cnt=cnt+entry.getValue();
            }

            if(cnt==0)
                System.out.println(2);
            else if(cnt==2)
                System.out.println(2);
            else if(cnt==3)
                System.out.println(1);
            else if(cnt==4)
            {
                if(a1==a2 && a3==a4 && a1!=a3)
                    System.out.println(1);
                if(a1==a3 && a2==a4 && a1!=a2)
                    System.out.println(1);
                if(a1==a4 && a3==a2 && a1!=a3)
                    System.out.println(1);
                if(a1==a2 && a3==a4 && a1==a3)
                    System.out.println(0);

            }

        }
    }
    static HashMap<Integer,Integer> findRepeating(int arr[] ,int size)
    {
        HashMap<Integer,Integer> frequency= new HashMap<Integer, Integer>();
        for (int k=0;k<size;k++)
        {
            if (frequency.containsKey(arr[k]))
            {
                frequency.put(arr[k], frequency.get(arr[k])+1);
            }
            else
            {
                frequency.put(arr[k],1);
            }
        }
        return frequency;
    }
}

