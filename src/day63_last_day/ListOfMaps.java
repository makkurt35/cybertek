package day63_last_day;

import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {
        //declare List of Map<String,String>
      List<Map<String, String>> employees = new ArrayList<>();

      Map<String, String> emp1Data = new LinkedHashMap<>();
      emp1Data.put("EmpID","123");
      emp1Data.put("EmpName","John Doe");
      emp1Data.put("JobTitle","SDET");
      emp1Data.put("Salary","103000");
        //emp1Data.put("EmpID","124"); INCORRECT
      Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID","124");
        emp2Data.put("EmpName","Ahmet Toran");
        emp2Data.put("JobTitle","Developer");
        emp2Data.put("Salary","250000");

        employees.add(emp1Data);
        employees.add(emp2Data);

        System.out.println(employees.size());

        System.out.println(employees.get(0).get("EmpName"));
        System.out.println(employees.get(1).get("EmpName"));

        System.out.println(employees.get(0));
        System.out.println(employees.get(1));

        //Using for each loop. print job title for each employee
        int totalSalary = 0;
        //add each employees salary to this variable, then print out after loop
        for(Map<String, String> empMap : employees){
            System.out.println(empMap.get("JobTitle"));
            totalSalary += Integer.parseInt(empMap.get("Salary"));
        }
        System.out.println("totalSalary = " + totalSalary);

    }
}








