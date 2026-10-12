
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class jsonSolution {
    static void main(String[] args) {



        //  INDIA
        //TAMILNADU STUDENT

        //CITY MODEL SCHOOL
        HashMap<String,Object> tnStudentArun = new HashMap<>();
        tnStudentArun.put("studentId", "ST-01");
        tnStudentArun.put("name", "Arun");
        tnStudentArun.put("age", 16);
        tnStudentArun.put("grade", "10-A");
        tnStudentArun.put("email", "arun@gmail.com");

        HashMap<String,Object> tnStudentKarthik =  new HashMap<>();
        tnStudentKarthik.put("studentId", "ST-02");
        tnStudentKarthik.put("name", "Karthik");
        tnStudentKarthik.put("age", 15);
        tnStudentKarthik.put("grade","9-B");
        tnStudentKarthik.put("email","karthik@gmail.com");

        ArrayList<HashMap<String,Object>> scienceStudents = new ArrayList<>();
        scienceStudents.add(tnStudentArun);
        scienceStudents.add(tnStudentKarthik);

        HashMap<String,Object> cityModelSchoolScienceDepartment = new HashMap<>();
        cityModelSchoolScienceDepartment.put("departmentId" ,"DEP-01");
        cityModelSchoolScienceDepartment.put("departmentName","Science");
        cityModelSchoolScienceDepartment.put("students",scienceStudents);

        ArrayList<HashMap<String,Object>> cityModelSchoolDepartments = new ArrayList<>();
        cityModelSchoolDepartments.add(cityModelSchoolScienceDepartment);





        HashMap<String,Object> tnStudentPriya = new HashMap<>();
        tnStudentPriya.put("studentId", "ST-03");
        tnStudentPriya.put("name", "Priya");
        tnStudentPriya.put("age", 16);
        tnStudentPriya.put("grade", "10-C");
        tnStudentPriya.put("email", "priya@gmail.com");

        ArrayList<HashMap<String,Object>> commerceStudents = new ArrayList<>();
        commerceStudents.add(tnStudentPriya);

        HashMap<String,Object> cityModelSchoolCommerceDepartment = new HashMap<>();
        cityModelSchoolCommerceDepartment.put("departmentId", "DEP-02");
        cityModelSchoolCommerceDepartment.put("departmentName", "Commerce");
        cityModelSchoolCommerceDepartment.put("students",commerceStudents);

        cityModelSchoolDepartments.add(cityModelSchoolCommerceDepartment);


        //GREEN VALLEY SCHOOL

        HashMap<String,Object> greenValleySchoolStudentVijay = new HashMap<>();
        greenValleySchoolStudentVijay.put("studentId","ST-04");
        greenValleySchoolStudentVijay.put("name","Vijay");
        greenValleySchoolStudentVijay.put("age",14);
        greenValleySchoolStudentVijay.put("grade","8-A");
        greenValleySchoolStudentVijay.put("email","vijay@gmail.com");

        HashMap<String,Object> greenValleySchoolStudentAnitha = new HashMap<>();
        greenValleySchoolStudentAnitha.put("studentId", "ST-05");
        greenValleySchoolStudentAnitha.put("name", "Anitha");
        greenValleySchoolStudentAnitha.put("age", 14);
        greenValleySchoolStudentAnitha.put("grade", "8-B");
        greenValleySchoolStudentAnitha.put("email", "anitha@gmail.com");

        ArrayList<HashMap<String,Object>> mathematicsStudents = new ArrayList<>();
        mathematicsStudents.add(greenValleySchoolStudentAnitha);
        mathematicsStudents.add(greenValleySchoolStudentVijay);

        HashMap<String,Object> greenValleySchoolMathematicsDepartment = new HashMap<>();
        greenValleySchoolMathematicsDepartment.put("departmentId", "DEP-03");
        greenValleySchoolMathematicsDepartment.put("departmentName", "Mathematics");
        greenValleySchoolMathematicsDepartment.put("students",mathematicsStudents);

        ArrayList<HashMap<String,Object>> greenValleySchoolDepartments = new ArrayList<>();
        greenValleySchoolDepartments.add(greenValleySchoolMathematicsDepartment);


        //ROYAL MATRIC SCHOOL
        HashMap<String,Object> royalMatricSchoolStudentSuresh = new HashMap<>();
        royalMatricSchoolStudentSuresh.put("studentId", "ST-06");
        royalMatricSchoolStudentSuresh.put("name", "Suresh");
        royalMatricSchoolStudentSuresh.put("age", 17);
        royalMatricSchoolStudentSuresh.put("grade", "11-A");
        royalMatricSchoolStudentSuresh.put("email", "suresh@gmail.com");

        HashMap<String,Object> royalMatricSchoolStudentMeena = new HashMap<>();
        royalMatricSchoolStudentMeena.put( "studentId", "ST-07");
        royalMatricSchoolStudentMeena.put( "name", "Meena");
        royalMatricSchoolStudentMeena.put( "age", 17);
        royalMatricSchoolStudentMeena.put( "grade", "11-B");
        royalMatricSchoolStudentMeena.put( "email", "meena@gmail.com");


        ArrayList<HashMap<String,Object>> royalMatricSchoolCSEStudents = new ArrayList<>();
        royalMatricSchoolCSEStudents.add(royalMatricSchoolStudentMeena);
        royalMatricSchoolCSEStudents.add(royalMatricSchoolStudentSuresh);

        HashMap<String,Object> royalMatricSchoolCSEDepartments = new HashMap<>();
        royalMatricSchoolCSEDepartments.put("departmentId","DEP-04");
        royalMatricSchoolCSEDepartments.put("departmentName","Computer Science");
        royalMatricSchoolCSEDepartments.put("students", royalMatricSchoolCSEStudents);

        ArrayList<HashMap<String,Object>> royalMatricSchoolDepartments = new ArrayList<>();
        royalMatricSchoolDepartments.add(royalMatricSchoolCSEDepartments);

        //ST MARRY SCHOOL
        HashMap<String,Object> stMarrySchoolStudentRahul = new HashMap<>();
        stMarrySchoolStudentRahul.put( "studentId", "ST-08");
        stMarrySchoolStudentRahul.put( "name", "Rahul");
        stMarrySchoolStudentRahul.put( "age", 16);
        stMarrySchoolStudentRahul.put( "grade", "10-D");
        stMarrySchoolStudentRahul.put( "email", "rahul@gmail.com");

        ArrayList<HashMap<String,Object>> stMarrySchoolArtsStudent = new ArrayList<>();
        stMarrySchoolArtsStudent.add(stMarrySchoolStudentRahul);

        HashMap<String,Object> stMarrySchoolArtsDepartment = new HashMap<>();
        stMarrySchoolArtsDepartment.put("departmentId", "DEP-05");
        stMarrySchoolArtsDepartment.put("departmentName", "Arts");
        stMarrySchoolArtsDepartment.put("students",stMarrySchoolArtsStudent);

        ArrayList<HashMap<String,Object>> stMarrySchoolDepartments = new ArrayList<>();
        stMarrySchoolDepartments.add(stMarrySchoolArtsDepartment);


        // Oxford Public School

        HashMap<String,Object> oxfordPublicSchoolSteudentSneha = new HashMap<>();
        oxfordPublicSchoolSteudentSneha.put( "studentId", "ST-09");
        oxfordPublicSchoolSteudentSneha.put( "name", "Sneha");
        oxfordPublicSchoolSteudentSneha.put( "age", 15);
        oxfordPublicSchoolSteudentSneha.put( "grade", "9-A");
        oxfordPublicSchoolSteudentSneha.put( "email", "sneha@gmail.com");

        HashMap <String,Object> oxfordPublicSchoolSteudentRamesh = new HashMap<>();
        oxfordPublicSchoolSteudentRamesh.put( "studentId", "ST-10");
        oxfordPublicSchoolSteudentRamesh.put( "name", "Ramesh");
        oxfordPublicSchoolSteudentRamesh.put( "age", 15);
        oxfordPublicSchoolSteudentRamesh.put( "grade", "9-C");
        oxfordPublicSchoolSteudentRamesh.put( "email", "ramesh@gmail.com");

        ArrayList<HashMap<String,Object>> oxfordPublicSchoolHistoryStudent = new ArrayList<>();
        oxfordPublicSchoolHistoryStudent.add(oxfordPublicSchoolSteudentSneha);
        oxfordPublicSchoolHistoryStudent.add(oxfordPublicSchoolSteudentRamesh);

        HashMap<String,Object> oxfordPublicSchoolHistoryDepartment = new HashMap<>();
        oxfordPublicSchoolHistoryDepartment.put( "departmentId" ,"DEP-06");
        oxfordPublicSchoolHistoryDepartment.put( "departmentName", "History");
        oxfordPublicSchoolHistoryDepartment.put( "students",oxfordPublicSchoolHistoryStudent);

        ArrayList<HashMap<String,Object>> oxfordPublicSchoolDepartments = new ArrayList<>();
        oxfordPublicSchoolDepartments.add(oxfordPublicSchoolHistoryDepartment);

        HashMap<String,Object> cityModelSchool = new HashMap<>();
        cityModelSchool.put( "schoolId", "SCH-01");
        cityModelSchool.put( "schoolName", "City Model School");
        cityModelSchool.put( "departments",cityModelSchoolDepartments);

        HashMap<String,Object> greenValleySchool = new HashMap<>();
        greenValleySchool.put( "schoolId", "SCH-02");
        greenValleySchool.put( "schoolName", "Green Valley School");
        greenValleySchool.put( "departments",greenValleySchoolDepartments);

        HashMap<String,Object> royalMatricSchool = new HashMap<>();
        royalMatricSchool.put( "schoolId", "SCH-03");
        royalMatricSchool.put( "schoolName", "Royal Matric School");
        royalMatricSchool.put( "departments",royalMatricSchoolDepartments);

        HashMap<String,Object> stMarySchool =new HashMap<>();
        stMarySchool.put("schoolId", "SCH-04");
        stMarySchool.put("schoolName" ,"St Mary School");
        stMarySchool.put("departments",stMarrySchoolDepartments);

        HashMap<String,Object> oxfordPublicSchool = new HashMap<>();
        oxfordPublicSchool.put( "schoolId" ,"SCH-05");
        oxfordPublicSchool.put( "schoolName", "Oxford Public School");
        oxfordPublicSchool.put( "departments",oxfordPublicSchoolDepartments);

        ArrayList<HashMap<String,Object>> tamilnaduSchool = new ArrayList<>();
        tamilnaduSchool.add(cityModelSchool);
        tamilnaduSchool.add(greenValleySchool);
        tamilnaduSchool.add(royalMatricSchool);
        tamilnaduSchool.add(stMarySchool);
        tamilnaduSchool.add(oxfordPublicSchool);

        HashMap<String,Object> tamilnadu = new HashMap<>();
        tamilnadu.put("stateId", "S-01");
        tamilnadu.put("stateName", "Tamil Nadu");
        tamilnadu.put("schools",tamilnaduSchool);

        //KARNATAKA

        HashMap<String,Object>banglorePublicSchoolStudentNaveen= new HashMap<>();
        banglorePublicSchoolStudentNaveen.put( "studentId", "ST-11");
        banglorePublicSchoolStudentNaveen.put( "name", "Naveen");
        banglorePublicSchoolStudentNaveen.put( "age", 16);
        banglorePublicSchoolStudentNaveen.put( "grade", "10-A");
        banglorePublicSchoolStudentNaveen.put( "email", "naveen@gmail.com");

        ArrayList<HashMap<String,Object>> banglorePublicSchoolPhysicsStudents = new ArrayList<>();
        banglorePublicSchoolPhysicsStudents.add(banglorePublicSchoolStudentNaveen);

        HashMap<String,Object> banglorePublicSchoolPhysicsDepartment = new HashMap<>();
        banglorePublicSchoolPhysicsDepartment.put( "departmentId", "DEP-07");
        banglorePublicSchoolPhysicsDepartment.put( "departmentName", "Physics");
        banglorePublicSchoolPhysicsDepartment.put( "students",banglorePublicSchoolPhysicsStudents);

        ArrayList<HashMap<String,Object>> banglorePublicSchoolDepartments = new ArrayList<>();
        banglorePublicSchoolDepartments.add(banglorePublicSchoolPhysicsDepartment);

        HashMap<String,Object> banglorePublicSchool = new HashMap<>();
        banglorePublicSchool.put("schoolId", "SCH-06");
        banglorePublicSchool.put("schoolName", "Bangalore Public School");
        banglorePublicSchool.put("departments",banglorePublicSchoolDepartments);

        ArrayList<HashMap<String,Object>> karnantakaSchools = new ArrayList<>();
        karnantakaSchools.add(banglorePublicSchool);

        HashMap<String,Object> karnataka = new HashMap<>();
        karnataka.put( "stateId", "S-02");
        karnataka.put( "stateName", "Karnataka");
        karnataka.put( "schools",karnantakaSchools);


        ArrayList<HashMap<String,Object>> states = new ArrayList<>();
        states.add(tamilnadu);
        states.add(karnataka);

        HashMap<String,Object> india = new HashMap<>();
        india.put( "countryId", "C-01");
        india.put( "countryName", "India");
        india.put( "states",states);


        //USA

        HashMap<String,Object> sunrisePublicSchoolStudentJhon = new HashMap<>();
        sunrisePublicSchoolStudentJhon.put( "studentId", "ST-12");
        sunrisePublicSchoolStudentJhon.put( "name", "John");
        sunrisePublicSchoolStudentJhon.put( "age", 17);
        sunrisePublicSchoolStudentJhon.put( "grade", "11-A");
        sunrisePublicSchoolStudentJhon.put( "email", "john@gmail.com");


        HashMap<String,Object> sunrisePublicSchoolStudentEmma = new HashMap<>();
        sunrisePublicSchoolStudentEmma.put( "studentId", "ST-13");
        sunrisePublicSchoolStudentEmma.put( "name", "Emma");
        sunrisePublicSchoolStudentEmma.put( "age", 16);
        sunrisePublicSchoolStudentEmma.put( "grade", "10-B");
        sunrisePublicSchoolStudentEmma.put( "email", "emma@gmail.com");

        ArrayList<HashMap<String,Object>>sunrisePublicSchoolEconomicsStudents = new ArrayList<>();
        sunrisePublicSchoolEconomicsStudents.add(sunrisePublicSchoolStudentJhon);
        sunrisePublicSchoolEconomicsStudents.add(sunrisePublicSchoolStudentEmma);

        HashMap<String,Object> sunrisePublicSchoolEconomicsDepartment = new HashMap<>();
        sunrisePublicSchoolEconomicsDepartment.put( "departmentId", "SCH-08");
        sunrisePublicSchoolEconomicsDepartment.put( "departmentName", "Economics");
        sunrisePublicSchoolEconomicsDepartment.put( "students",sunrisePublicSchoolEconomicsStudents);

        ArrayList<HashMap<String,Object>> sunriseSchoolDepartment = new ArrayList<>();
        sunriseSchoolDepartment.add(sunrisePublicSchoolEconomicsDepartment);

        HashMap<String,Object> sunrisePublicSchool = new HashMap<>();
        sunrisePublicSchool.put( "schoolId", "SCH-07");
        sunrisePublicSchool.put( "schoolName", "Sunrise Public School");
        sunrisePublicSchool.put( "departments",sunriseSchoolDepartment);

        ArrayList<HashMap<String,Object>> californiaSchools = new ArrayList<>();
        californiaSchools.add(sunrisePublicSchool);

        HashMap<String,Object> california = new HashMap<>();
        california.put( "stateId", "S-03");
        california.put( "stateName", "California");
        california.put( "schools",californiaSchools);

        ArrayList<HashMap<String,Object>> usaStates = new ArrayList<>();
        usaStates.add(california);

        HashMap<String,Object> usa = new HashMap<>();
        usa.put("countryId", "C-02");
        usa.put("countryName", "USA");
        usa.put("states",usaStates);

        ArrayList<HashMap<String, Object>> countries = new ArrayList<>();
        countries.add(india);
        countries.add(usa);


        /*System.out.println(countries);*/

        jsonSolution object = new jsonSolution();
        object.findStudentDepartmentByStudentName(countries,"Arun");

    }




    public void findStudentDepartmentByStudentName(ArrayList<HashMap<String,Object>> countries,String name){
        for(HashMap<String,Object> countriesList : countries){
            ArrayList<HashMap<String,Object>> stateList = (ArrayList<HashMap<String, Object>>) countriesList.get("states");

            for (HashMap<String,Object> state : stateList){
                ArrayList<HashMap<String,Object>> schoolList = (ArrayList<HashMap<String, Object>>) state.get("schools");

                for (HashMap<String,Object>school :schoolList){
                    ArrayList<HashMap<String,Object>> departmentList = (ArrayList<HashMap<String, Object>>) school.get("departments");

                    for(HashMap<String,Object>department : departmentList){
                        ArrayList<HashMap<String,Object>> studentList = (ArrayList<HashMap<String, Object>>) department.get("students");

                        for (HashMap<String,Object>student : studentList){
                            if (student.get("name").equals(name)){
                                System.out.println(student);
                                System.out.println(department);
                            }
                        }
                    }
                }
            }

        }
    }

}
