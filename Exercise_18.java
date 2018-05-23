package SorteOpgaver.ch11.aske1208_a_11_18;

import java.util.HashMap;
import java.util.Map;

public class eighteen
{
    public Map<String, String> reverse(Map<String, String> m)
    {
        Map<String, String> reversedMap = new HashMap<>();

        for (Map.Entry<String, String> map : m.entrySet())
        {
            reversedMap.put(map.getValue(), map.getKey());
        }
        return reversedMap;
    }
}
