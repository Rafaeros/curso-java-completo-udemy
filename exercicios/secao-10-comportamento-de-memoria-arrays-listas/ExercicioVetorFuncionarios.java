import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExercicioVetorFuncionarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine(); // consume the remaining newline
            String name = sc.nextLine();
            System.out.print("Salary: ");
            float salary = sc.nextFloat();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            float percentage = sc.nextFloat();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees: ");
        employees.forEach(System.out::println);
        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}

class Employee {
    private int id;
    private String name;
    private float salary;

    // Constructor
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
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

    // Encapsulaption
    public float increaseSalary(float percentage) {
        return salary += salary * percentage / 100;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
