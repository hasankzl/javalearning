import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

class EmployeeClass {
    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return employeeNumber == that.employeeNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }
}


// record is field can not be changed after the creation
// can not use extends and they can be extended
record EmployeeRecord(String name, int employeeNumber) implements Runnable {

    public static final String defaultEmpName="George";

    public EmployeeRecord{
        if(employeeNumber<0){
            throw new IllegalArgumentException("can not be negative");
        }
    }
    public  String nameUpperCase(){
        return name.toUpperCase(Locale.ROOT);
    }

    public static void print(){
        System.out.println("you are using a static method");
    }

    @Override
    public void run() {

    }
}

public class RecordsExample {

    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Jerry",1545);
        System.out.println(employee.getName());
        EmployeeRecord employeeRecord = new EmployeeRecord("Hasan",1212);
        System.out.println(employeeRecord.nameUpperCase());
        System.out.println(employeeRecord);
    }

}
