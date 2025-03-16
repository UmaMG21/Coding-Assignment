import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement{
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Uma", 20000));
        employees.add(new Employee(102, "Mahi", 25000));
        employees.add(new Employee(103, "Maheswari", 30000));

        System.out.println("Employee Details:");
        for(Employee emp : employees){
            emp.displayDetails();
        }
    }
}


