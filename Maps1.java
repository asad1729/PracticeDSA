import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;
public class Maps1
{
    public static void main(String[] args)
    {
        Map<String,Integer>numbers=new HashMap<>();
         numbers.put("1",1);
         numbers.put("2",2);
         numbers.put("5",5);
         numbers.putIfAbsent("1",10);
         System.out.println(numbers.get("5"));
         System.out.println(numbers.containsKey("four"));
         System.out.println(numbers.containsValue(2));
         numbers.remove("2");
         numbers.put("nine",98);
         System.out.println(numbers);
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());
        Set<Map.Entry<String,Integer>> entries= numbers.entrySet();
        for(Map.Entry<String,Integer> entry: numbers.entrySet()){
            entry.setValue(entry.getValue()*100);
        }
        System.out.println(numbers.entrySet());
        System.out.println(getHash("CAT"));
        System.out.println(getHash("DOG"));
        System.out.println(getHash("GOD"));
    }
    public static int getHash(String s)
    {
        int hash=0;
        for(int i=0;i<s.length();i++){
            hash+=s.charAt(i);
        }
        return hash;
    }
}