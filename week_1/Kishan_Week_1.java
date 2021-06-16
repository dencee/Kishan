import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kishan_Week_1 {

    public static void main(String[] args) {

        // List
        System.out.println("List:");
        List<Object> lst = Arrays.asList(1, "one", 5.5);
        lst.stream().forEach((e) -> System.out.println(e));

        // Tuple/Array
        System.out.println("\nArray (Tuple):");
        Object[] arr = { 1, "one", 5.5 };
        Arrays.stream(arr).forEach((e) -> System.out.println(e));

        System.out.println("\nSet:");
        Set<Object> my_set = new HashSet<>();
        my_set.add(1);
        my_set.add("one");
        my_set.add(5.5);
        my_set.stream().forEach((e) -> System.out.println(e));

        System.out.println("\nDictionary:");
        Map<Object, Object> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        map.put(5.5, 500);
        for( Object key : map.keySet() ) {
            System.out.println(key.toString() + " " + map.get(key));
        }
    }
}
