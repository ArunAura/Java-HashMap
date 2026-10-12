/*Companies
        │
        ├── Google
        │   ├── Engineering
        │   │   ├── employee1 → Rahul, 25, Java
        │   │   └── employee2 → Sneha, 28, Python
        │   │
        │   └── HR
        │       ├── employee1 → Amit, 30, HR
        │       └── employee2 → Priya, 26, Recruitment
        │
        ├── Microsoft
        │   ├── Engineering
        │   │   ├── employee1 → Kiran, 24, C++
        │   │   └── employee2 → Anjali, 27, Java
        │   │
        │   └── Marketing
        │       ├── employee1 → Rohan, 29, SEO
        │       └── employee2 → Meera, 31, Sales
        │
        └── Amazon
        ├── Development
        │   ├── employee1 → Arjun, 26, Java
        │   └── employee2 → Neha, 25, Python
        │
        └── Cloud
        ├── employee1 → Vijay, 30, AWS
        └── employee2 → Divya, 27, Azure*/



import java.util.ArrayList;
import java.util.HashMap;

public class ListOfNestedHashMapPractice {

    // =====================================================
    // MAIN LIST
    // =====================================================

    static ArrayList<HashMap<String,HashMap<String,HashMap<String, Object>>>> companies = new ArrayList<>();


    public static void main(String[] args) {

        // =====================================================
        // GOOGLE
        // =====================================================

        HashMap<String, HashMap<String, Object>> googleDepartments = new HashMap<>();

        HashMap<String, Object> rahul = new HashMap<>();
        rahul.put("name", "Rahul");
        rahul.put("age", 25);
        rahul.put("skill", "Java");

        HashMap<String, Object> sneha = new HashMap<>();
        sneha.put("name", "Sneha");
        sneha.put("age", 28);
        sneha.put("skill", "Python");

        HashMap<String, Object> amit = new HashMap<>();
        amit.put("name", "Amit");
        amit.put("age", 30);
        amit.put("skill", "HR");

        HashMap<String, Object> priya = new HashMap<>();
        priya.put("name", "Priya");
        priya.put("age", 26);
        priya.put("skill", "Recruitment");


        HashMap<String, Object> googleEngineering = new HashMap<>();
        googleEngineering.put("employee1", rahul);
        googleEngineering.put("employee2", sneha);

        HashMap<String, Object> googleHR = new HashMap<>();
        googleHR.put("employee1", amit);
        googleHR.put("employee2", priya);


        googleDepartments.put("Engineering", googleEngineering);
        googleDepartments.put("HR", googleHR);


        HashMap<String, HashMap<String, HashMap<String, Object>>> google = new HashMap<>();

        google.put("Google", googleDepartments);

        companies.add(google);


        // =====================================================
        // MICROSOFT
        // =====================================================

        HashMap<String, HashMap<String, Object>> microsoftDepartments = new HashMap<>();

        HashMap<String, Object> kiran = new HashMap<>();
        kiran.put("name", "Kiran");
        kiran.put("age", 24);
        kiran.put("skill", "C++");

        HashMap<String, Object> anjali = new HashMap<>();
        anjali.put("name", "Anjali");
        anjali.put("age", 27);
        anjali.put("skill", "Java");

        HashMap<String, Object> rohan = new HashMap<>();
        rohan.put("name", "Rohan");
        rohan.put("age", 29);
        rohan.put("skill", "SEO");

        HashMap<String, Object> meera = new HashMap<>();
        meera.put("name", "Meera");
        meera.put("age", 31);
        meera.put("skill", "Sales");


        HashMap<String, Object> microsoftEngineering = new HashMap<>();
        microsoftEngineering.put("employee1", kiran);
        microsoftEngineering.put("employee2", anjali);

        HashMap<String, Object> microsoftMarketing = new HashMap<>();
        microsoftMarketing.put("employee1", rohan);
        microsoftMarketing.put("employee2", meera);


        microsoftDepartments.put("Engineering", microsoftEngineering);
        microsoftDepartments.put("Marketing", microsoftMarketing);


        HashMap<String, HashMap<String, HashMap<String, Object>>> microsoft = new HashMap<>();

        microsoft.put("Microsoft", microsoftDepartments);

        companies.add(microsoft);


        // =====================================================
        // AMAZON
        // =====================================================

        HashMap<String, HashMap<String, Object>> amazonDepartments = new HashMap<>();

        HashMap<String, Object> arjun = new HashMap<>();
        arjun.put("name", "Arjun");
        arjun.put("age", 26);
        arjun.put("skill", "Java");

        HashMap<String, Object> neha = new HashMap<>();
        neha.put("name", "Neha");
        neha.put("age", 25);
        neha.put("skill", "Python");

        HashMap<String, Object> vijay = new HashMap<>();
        vijay.put("name", "Vijay");
        vijay.put("age", 30);
        vijay.put("skill", "AWS");

        HashMap<String, Object> divya = new HashMap<>();
        divya.put("name", "Divya");
        divya.put("age", 27);
        divya.put("skill", "Azure");


        HashMap<String, Object> amazonDevelopment = new HashMap<>();
        amazonDevelopment.put("employee1", arjun);
        amazonDevelopment.put("employee2", neha);

        HashMap<String, Object> amazonCloud = new HashMap<>();
        amazonCloud.put("employee1", vijay);
        amazonCloud.put("employee2", divya);


        amazonDepartments.put("Development", amazonDevelopment);
        amazonDepartments.put("Cloud", amazonCloud);


        HashMap<String, HashMap<String, HashMap<String, Object>>> amazon = new HashMap<>();

        amazon.put("Amazon", amazonDepartments);

        companies.add(amazon);


        // =====================================================
        // OBJECT
        // =====================================================

        ListOfNestedHashMapPractice obj = new ListOfNestedHashMapPractice();


        // =====================================================
        // YOUR METHODS
        // =====================================================

        obj.findByName("Rahul");

        // obj.findByName("Rahul");

        // obj.findByAge(30);

        // obj.findBySkill("Java");

    }


    // =====================================================
    // TASK 1
    // =====================================================

    public void findByName(String name) {
        for (HashMap<String,HashMap<String,HashMap<String, Object>>> getCompanyNameFromList : companies){
           for (String companyName : getCompanyNameFromList.keySet()){
               HashMap<String,HashMap<String, Object>> companyList = getCompanyNameFromList.get(companyName);
               for (String departmentName : companyList.keySet()){
                   HashMap<String,Object> departmentList =  companyList.get(departmentName);
                   for (String employeName : departmentList.keySet()){
                       HashMap<String,Object> employeList = (HashMap<String, Object>) departmentList.get(employeName);
                       if (employeList.get("name").equals(name)){
                           //System.out.println(employeList);
                           System.out.println("name of employe : " + employeList.get("name"));
                           System.out.println("age of employe : " + employeList.get("age"));
                           System.out.println("skill of employe : " + employeList.get("skill"));
                           System.out.println("Name of Company : " + companyName);
                           System.out.println("Name of dept : " + departmentName);
                       }
                   }

               }
           }

        }



    }


    // =====================================================
    // TASK 2
    // =====================================================

    public void findByAge(int age) {

        // WRITE YOUR LOGIC HERE

    }


    // =====================================================
    // TASK 3
    // =====================================================

    public void findBySkill(String skill) {

        // WRITE YOUR LOGIC HERE

    }
}