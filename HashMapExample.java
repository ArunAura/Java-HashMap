import java.util.HashMap;

public class HashMapExample {
    static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple",50);
        map.put("banna",10);
        map.put("mango",100);
        map.put("guava",20);
        System.out.println(map);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("watermelon"));
    }
}