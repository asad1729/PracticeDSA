import java.util.*;
import java.lang.*;
import java.io.*;
class hashstring
{
    public static void main (String[] args)throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Testcase");
        int t=in.nextInt();
        System.out.println(("Enter String"));
        for(int i=0;i<t;i++)
        {
            String s=in.nextLine();
            Map<String,Integer> character=new HashMap<>();
            for (char ch = 'a'; ch <= 'z'; ++ch)
                character.put(String.valueOf(ch), 0);
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(character.containsKey(Character.toString(c))){
                 int k=character.get(Character.toString(c));
                 character.put(Character.toString(c),k+1);
                }
                System.out.println(character);
            }
        }
    }
}
