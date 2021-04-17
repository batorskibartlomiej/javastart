package Exercises.maps;

import java.util.HashMap;
import java.util.Map;

public class Company {

    private Map<String, Employee> employees = new HashMap<>();

    boolean addEmployee(Employee employes){
        String key = employes.getName() + employes.getLastName();
        if(employees.containsKey(key)){
            return false;
        }employees.put(key,employes);
        return true;
    }


    Employee getEmployee(String name, String lastName) {
        String key = name + lastName;
        return employees.get(key);
    }

}
