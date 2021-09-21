import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class question39
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String s=x.readLine();
        String word[]=s.split(" ");
        Set<String>mySet = new HashSet<String>(Arrays.asList(word));
        for (String address : mySet) {
            System.out.println (address);
        }
    }
}

