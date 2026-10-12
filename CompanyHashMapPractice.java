import java.util.HashMap;

public class CompanyHashMapPractice {

    static HashMap<String,
            HashMap<String,
                    HashMap<String, Object>>> company = new HashMap<>();

    public static void main(String[] args) {

        HashMap<String, HashMap<String, Object>> google = new HashMap<>();

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

        google.put("Engineering", googleEngineering);
        google.put("HR", googleHR);


        HashMap<String, HashMap<String, Object>> microsoft = new HashMap<>();

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

        microsoft.put("Engineering", microsoftEngineering);
        microsoft.put("Marketing", microsoftMarketing);


        company.put("Google", google);
        company.put("Microsoft", microsoft);

        CompanyHashMapPractice obj = new CompanyHashMapPractice();

        obj.findEmployee("Rahul");
        obj.findEmployeeByAge(29);
    }

    public void findEmployee(String name) {
        for (String companyName : company.keySet()){
            HashMap<String,HashMap<String, Object>> companyList = company.get(companyName);
            for (String companyRoleName : companyList.keySet()){
                HashMap<String, Object> companyRoleList = companyList.get(companyRoleName);
                for (String employeName : companyRoleList.keySet()){
                    HashMap<String,Object> employeList = (HashMap<String, Object>) companyRoleList.get(employeName);
                    if (employeList.get("name").equals(name)){
                        System.out.println(employeList);
                        System.out.println(companyName);
                        System.out.println(company);

                    }

                }
            }


        }

    }
    public void findEmployeeByAge(Integer age) {
        for (String companyName : company.keySet()){
            HashMap<String,HashMap<String, Object>> companyList = company.get(companyName);
            for (String companyRoleName : companyList.keySet()){
                HashMap<String, Object> companyRoleList = companyList.get(companyRoleName);
                for (String employeName : companyRoleList.keySet()){
                    HashMap<String,Object> employeList = (HashMap<String, Object>) companyRoleList.get(employeName);
                    if (employeList.get("age").equals(age)){
                        System.out.println(employeList);
                        System.out.println(companyName);


                    }

                }
            }


        }

    }
}