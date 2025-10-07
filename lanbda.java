import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Age=" + age + "]";
    }
}

public class SortEmployeesUsingLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 75000, 28));
        employees.add(new Employee(102, "Bob", 50000, 35));
        employees.add(new Employee(103, "Charlie", 65000, 25));
        employees.add(new Employee(104, "David", 80000, 30));

        System.out.println("=== Original List ===");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        System.out.println("\n=== Sorted by Name ===");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\n=== Sorted by Salary (Descending) ===");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\n=== Sorted by Age (Ascending) ===");
        employees.forEach(System.out::println);
    }
}
