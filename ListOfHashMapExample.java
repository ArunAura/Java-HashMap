//list of HastMap examples


import java.util.*;



public class ListOfHashMapExample {
    static void main(String[] args) {
        ArrayList<HashMap<String,Object>> employee = new ArrayList<>();
        HashMap<String,Object> emp1 = new HashMap<>();
        emp1.put("name", "Arun");
        emp1.put("age", 21);
        emp1.put("salary", 50000.0);

        employee.add(emp1);
        System.out.println(employee.get(0));
        System.out.println(employee.get(0).get("name"));


    }
}
