import java.io.IOException;
import java.util.*;
public class codeforces3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int first[] = new int[n];
        int second[] = new int[n - 1];
        int third[] = new int[n - 2];
        for (i = 0; i < n; i++)
            first[i] = in.nextInt();
        for (i = 0; i < n - 1; i++)
            second[i] = in.nextInt();
        for (i = 0; i < n - 2; i++)
            third[i] = in.nextInt();
        Arrays.sort(first);
        Arrays.sort(second);
        Arrays.sort(third);
        int cnt = 0;
        for (i = 0; i < n - 1; i++) {
            if (first[i] != second[i]) {
                System.out.println(first[i]);
                cnt++;
                break;
            }
        }
        if (cnt == 0)
            System.out.println(first[n - 1]);
        int cnt2=0;
        for (i = 0; i < n - 2; i++)
        {
            if (second[i] != third[i])
            {
                System.out.println(second[i]);
                cnt2++;
                break;
            }
        }
        if (cnt2 == 0)
            System.out.println(second[n - 2]);
    }
}
