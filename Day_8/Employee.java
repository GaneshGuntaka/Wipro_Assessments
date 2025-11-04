import java.util.*;


class Main {       
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", 55000.00, "development");
        Employee e2 = new Employee(11, "xyz", 43500.00, "development");
        Employee e3 = new Employee(5, "fname", 100000.00, "production");
        Employee e4 = new Employee(21, "name123", 75000, "support");
        Employee e5 = new Employee(17, "someName", 85000, "development");

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        double sum = 0;
        int count = 0;

        for (Employee e : empList) {
            if (e.department.equalsIgnoreCase("development")) {
                sum += e.salary;
                count++;
            }
        }

        if (count > 0)
            System.out.println(sum / count);
        else
            System.out.println(0);
    }
}
class Employee {   
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}