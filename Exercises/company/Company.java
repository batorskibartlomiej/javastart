package Exercises.company;

public class Company {

    public static void main(String[] args) {

        Employee[] employees = createEmployess();
        double totalMonthlySalary = totalMonthlySalary(employees);
        double totalYearlySalaries = totalYearlySalaries(employees);


        printEmployees(employees);
        System.out.println("Suma miesięcznych wynagrodzeń: " + totalMonthlySalary);
        System.out.println("Suma rocznych wynagrodzeń: " + totalYearlySalaries);


    }

    private static double totalMonthlySalary(Employee[] employees) {
        double totalMonthlySalary = 0;
        for (Employee employee : employees) {
            totalMonthlySalary += employee.getMonthlySalary();


        }


        return totalMonthlySalary;
    }

    private static double totalYearlySalaries(Employee[] employees) {
        double totalYearlySalaries = 0;
        for (Employee employee : employees) {
            totalYearlySalaries += employee.getYearlySalary();


        }


        return totalYearlySalaries;
    }



    private static void printEmployees(Employee[] employees) {
        System.out.println("Pracownicy");
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }


    private static Employee[] createEmployess() {

        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Jan", "Kowalski", 5000);
        employees[1] = new PartTimeEmployee("Anna", "Borowska", 10, 80);
        return employees;


    }


}

