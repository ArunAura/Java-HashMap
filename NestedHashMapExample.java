import java.util.*;

public class NestedHashMapExample {
    static void main(String[] args) {
        HashMap<String,HashMap<String,Object>> college = new HashMap<>();
        HashMap<String,Object> cse = new HashMap<>();
        HashMap<String,Object> ece = new HashMap<>();
        cse.put("student",500);
        cse.put("teachers",500);
        ece.put("student",700);
        ece.put("teachers",600);
        college.put("cse",cse);
        System.out.println(college.get("cse").get("student"));

    }
}
