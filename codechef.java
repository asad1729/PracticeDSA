import java.util.*;
import java.lang.*;
import java.io.*;

class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0;i<t;i++)
        {
            //System.out.println(0);
            int n=in.nextInt();
            int p=in.nextInt();
            int k=in.nextInt();
            int counter=0;
            int res[]=new int[n];
            int arr[]=new int[n];
            //System.out.println(1);
            for(int j=0;j<n;j++)
            {
                res[j]=j%k;
            }
            for(int j=0;j<n;j++)
            {
                arr[j]=j;
            }

            final List<Integer> stringList = Arrays.asList(res);
            List<String> sortedCopy = new ArrayList<String>(stringList);
            Collections.sort(sortedCopy, new Comparator<String>()
            {
                public int compare(String left, String right)
                {
                    return arr[stringList.indexOf(left)] - arr[stringList.indexOf(right)];
                }
            }
            );
            System.out.println(sortedCopy);
            }

        }
    }
