package collection;

import java.util.HashMap;
import java.util.Map;

// https://stackoverflow.com/questions/25932730/hashmap-with-null-key-and-null-value
// https://howtodoinjava.com/java-hashmap/
public class HashMapWithNullKey {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(null, "A");
    map.put(null, "B");
    System.out.println(" -> " + map.get(null));
  }
}
