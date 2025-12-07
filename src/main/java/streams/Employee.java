package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;

    public static void objectStreams(){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 28, 50000, "IT"),
                new Employee(2, "Alice", 32, 70000, "Finance"),
                new Employee(3, "Bob", 25, 45000, "IT"),
                new Employee(4, "Charlie", 30, 65000, "HR"),
                new Employee(8, "Grace", 26, 48000, "Marketing"),
                new Employee(10, "Ivy", 31, 75000, "Finance"),
                new Employee(12, "John", 32, 62000.0, "Finance"),
                new Employee(11, "Charlie", 30, 70000.0, "HR")
        );

//        Find all employees older than 30
//        Get the names of all employees
//        Find employee with maximum salary
//        Sort employees by salary (ascending)
//        Group employees by department
//        Group employees by department and count
//        Average salary by department
//        Find total salary expense
//        Find duplicate employees by name
//        Partition employees into <30 and >=30
//        Increase salary of all employees by 10%
//        Convert list of employees to Map<department, List<names>>

        //Find all employees older than 30
        System.out.println(employees.stream()
                .filter(e -> e.getAge() > 30)
                .toList());

        //Get the names of all employees
        System.out.println(employees.stream()
                .map(e -> e.getName())
                .toList());

        //Find employee with maximum salary
        System.out.println(employees.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary()))
                .get());

        //Sort employees by salary (ascending)
        System.out.println(employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).toList());

//        Sort employees by age, then by name
        System.out.println(employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getSalary))
                .toList());

//        Group employees by department
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment())));

//        Group employees by department and count
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting())));

//        Average salary by department
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(Employee::getSalary)))
        );

//        Find total salary expense
        System.out.println(employees.stream()
                .map(Employee::getSalary)
                .reduce((a,b) -> a+b)
                .get());

//        Find duplicate employees by name
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()))
                .entrySet().stream()
                .filter(e -> e.getValue().size() >1)
                .toList());

//        Partition employees into <30 and >=30
        System.out.println(employees.stream()
                .collect(Collectors.partitioningBy(e-> e.getAge()>= 30)));

//        Increase salary of all employees by 10%
        System.out.println(employees.stream()
                .map(e -> {
                    e.setSalary(e.getSalary() * 1.1);
                    return e;
                })
                .toList());

//        Convert list of employees to Map<department, List<names>>
        HashMap<String, List<String>> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        HashMap::new,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        System.out.println(map);

    }

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
