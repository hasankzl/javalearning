package streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class FilterAndMap {

    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();
       List<Employee> updatedEmployees = new ArrayList<>();
        employeeList.add(new Employee(1,"hasan",100));
        employeeList.add(new Employee(2,"mustafa",200));
        employeeList.add(new Employee(3,"alex",300));


        updatedEmployees =employeeList.stream().filter(e -> e.salary<=200).map(e -> {
            e.salary += 50;
            return e;
        }).collect(Collectors.toList());

        System.out.println(updatedEmployees);
    }
}
