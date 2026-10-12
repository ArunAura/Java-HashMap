import java.util.HashMap;

public class NestedHashMapExample2 {
    static void main(String[] args) {
        HashMap<String,HashMap<String,HashMap<String,HashMap<String,Object>>>> country = new HashMap<>();
        HashMap<String, HashMap<String, HashMap<String, Object>>>state = new HashMap<>();
        HashMap<String, HashMap<String, Object>>city = new HashMap<>();
        HashMap<String, Object> person = new HashMap<>();
        HashMap<String, Object> person2 = new HashMap<>();

        //credential--->Mysore
        HashMap<String, Object> credential1 = new HashMap<>();
        HashMap<String, Object> credential2 = new HashMap<>();
        HashMap<String, Object> credential3 = new HashMap<>();

        //credential--->banglore
        HashMap<String, Object> credential4 = new HashMap<>();
        HashMap<String, Object> credential5 = new HashMap<>();
        HashMap<String, Object> credential6 = new HashMap<>();




        //person data ---->mysore
        credential1.put("name","arun");
        credential1.put("age",21);

        credential2.put("name","rahul");
        credential2.put("age",25);

        credential3.put("name","priya");
        credential3.put("age",20);

        //person data ----> banglore
        credential4.put("name","akshay");
        credential4.put("age",21);

        credential5.put("name","shreya");
        credential5.put("age",25);

        credential6.put("name","ankush");
        credential6.put("age",20);

        person.put("person1",credential1);
        person.put("person2",credential2);
        person.put("person3",credential3);


        person2.put("person4",credential4);
        person2.put("person5",credential5);
        person2.put("person6",credential6);


        city.put("mysore",person);
        city.put("banglore",person2);
        state.put("karnataka",city);
        country.put("india",state);








    }
}
