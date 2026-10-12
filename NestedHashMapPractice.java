import java.util.HashMap;

public class NestedHashMapPractice {

    static HashMap<String,
            HashMap<String,
                    HashMap<String,
                            HashMap<String, Object>>>> country = new HashMap<>();

    public static void main(String[] args) {

        HashMap<String,
                HashMap<String,
                        HashMap<String, Object>>> indiaState = new HashMap<>();

        HashMap<String,
                HashMap<String, Object>> indiaCity = new HashMap<>();

        HashMap<String, Object> arun = new HashMap<>();
        arun.put("name", "Arun");
        arun.put("age", 16);
        arun.put("grade", "10-A");
        arun.put("email", "arun@gmail.com");

        HashMap<String, Object> rahul = new HashMap<>();
        rahul.put("name", "Rahul");
        rahul.put("age", 17);
        rahul.put("grade", "11-B");
        rahul.put("email", "rahul@gmail.com");

        HashMap<String, Object> priya = new HashMap<>();
        priya.put("name", "Priya");
        priya.put("age", 16);
        priya.put("grade", "10-C");
        priya.put("email", "priya@gmail.com");

        HashMap<String, Object> karthik = new HashMap<>();
        karthik.put("name", "Karthik");
        karthik.put("age", 15);
        karthik.put("grade", "9-B");
        karthik.put("email", "karthik@gmail.com");

        HashMap<String, Object> mysore = new HashMap<>();
        mysore.put("person1", arun);
        mysore.put("person2", rahul);

        HashMap<String, Object> bangalore = new HashMap<>();
        bangalore.put("person1", priya);
        bangalore.put("person2", karthik);

        indiaCity.put("mysore", mysore);
        indiaCity.put("bangalore", bangalore);

        indiaState.put("karnataka", indiaCity);

        HashMap<String,
                HashMap<String,
                        HashMap<String, Object>>> usaState = new HashMap<>();

        HashMap<String,
                HashMap<String, Object>> usaCity = new HashMap<>();

        HashMap<String, Object> john = new HashMap<>();
        john.put("name", "John");
        john.put("age", 17);
        john.put("grade", "11-A");
        john.put("email", "john@gmail.com");

        HashMap<String, Object> emma = new HashMap<>();
        emma.put("name", "Emma");
        emma.put("age", 16);
        emma.put("grade", "10-B");
        emma.put("email", "emma@gmail.com");

        HashMap<String, Object> michael = new HashMap<>();
        michael.put("name", "Michael");
        michael.put("age", 15);
        michael.put("grade", "9-A");
        michael.put("email", "michael@gmail.com");

        HashMap<String, Object> sophia = new HashMap<>();
        sophia.put("name", "Sophia");
        sophia.put("age", 17);
        sophia.put("grade", "11-C");
        sophia.put("email", "sophia@gmail.com");

        HashMap<String, Object> california = new HashMap<>();
        california.put("person1", john);
        california.put("person2", emma);

        HashMap<String, Object> newYork = new HashMap<>();
        newYork.put("person1", michael);
        newYork.put("person2", sophia);

        usaCity.put("california", california);
        usaCity.put("newYork", newYork);

        usaState.put("california", usaCity);

        country.put("india", indiaState);
        country.put("usa", usaState);

        /*System.out.println(country);*/
        //System.out.println(country.get("india").get("karnataka").get("mysore").get("person1"));  -->arun
        //System.out.println(country.get("india").get("karnataka").get("mysore").get("person2"));  -->rahul
        NestedHashMapPractice obj = new NestedHashMapPractice();
        obj.findperson("Sophia");

    }

    public void findperson(String name) {

        for (String countryName : country.keySet()) {

            HashMap<String, HashMap<String, HashMap<String, Object>>> countryList =country.get(countryName);

            for (String stateName : countryList.keySet() ){
                HashMap<String, HashMap<String, Object>> stateList = countryList.get(stateName);

                for (String cityName : stateList.keySet() ){
                    HashMap<String, Object> cityList = stateList.get(cityName);


                    for (String person : cityList.keySet()){
                        HashMap<String, Object> personList=(HashMap<String, Object>)cityList.get(person);
                        if ( personList.get("name").equals(name) ) {
                            System.out.println(personList);


                        }


                    }
                }

            }


        }



    }



}

