package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();
        gpaMap.put("breanna", 3.6);
        gpaMap.put("amir", 3.8);
        gpaMap.put("jerry", 3.9);
        gpaMap.put("scott", 4.0);

        System.out.println(gpaMap);

        // print gpas ove 3.5
        Collection<Double> gpaValues = gpaMap.values();

        for (Double value : gpaValues) {
            if (value >= 3.5) {
                System.out.println(value);
            }
        }
        dumpMap(gpaMap);
    }
    private static void dumpMap(Map<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
