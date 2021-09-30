import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortObject {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Bar","Alt");
        Employee employee2=new Employee(2,"sar","blt");
        Employee employee3=new Employee(3,"car","clt");
        Employee employee4=new Employee(4,"dar","dlt");
        Employee employee5=new Employee(5,"ear","elt");

        List<Employee> employees=new ArrayList<>();
        employees.add(employee1);
        employees.add(employee3);
        employees.add(employee2);
        employees.add(employee5);
        employees.add(employee4);
        System.out.println("employees = " + employees);
        employees.sort(Comparator.comparing(Employee::getId));
        System.out.println("employees = " + employees);
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("employees = " + employees);


    }
}
