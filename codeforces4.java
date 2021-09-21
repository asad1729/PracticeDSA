import java.io.IOException;
import java.util.*;
public class codeforces4 {
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path)
    {
        if (index == arr.length)
        {
            int cnt = 0;
            if (path.size() >= 3)
            {
                int len = path.size();
                int k;
                for ( k = 0; k < len; k++)
                {
                    if (path.get(k) == path.get(len - k - 1))
                        continue;
                    else
                        cnt = cnt + 1;
                }
            }
            if (cnt == 0)
            {
                System.out.println("YES");
                return ;
            }
            else
                System.out.println("NO");
        }
        else
        {
            printSubsequences(arr, index + 1, path);
            path.add(arr[index]);
            printSubsequences(arr, index + 1, path);
            path.remove(path.size() - 1);
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = in.nextInt();
            ArrayList<Integer> path = new ArrayList<>();
            printSubsequences(arr, 0, path);
        }
    }
}
