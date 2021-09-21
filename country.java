import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class country
{
    public static void main(String[] args)
    {
        List country=new ArrayList<>();
        country.add("Berlin");
        country.add("Tokyo");
        country.add("Rio");
        System.out.println(country);
        Map map=new HashMap();
        map.put("Father","son");
        map.put("Mother","daughter");
        System.out.println(map.get("Father"));
        System.out.println(map.get("Mother"));
        System.out.println(map.size());
    }
}
