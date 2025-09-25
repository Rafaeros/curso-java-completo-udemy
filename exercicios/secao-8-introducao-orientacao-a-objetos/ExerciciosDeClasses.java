
import java.util.Scanner;

public class ExerciciosDeClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Rectangle
        System.out.print("Digite a largura do retangulo: ");
        double width = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle);
        sc.nextLine();

        // 2. Employee
        System.out.print("Digite o nome do funcionario: ");
        String name = sc.nextLine();
        System.out.print("Digite o salario do funcionario: ");
        double salary = sc.nextDouble();
        System.out.print("Digite o imposto do funcionario: ");
        double tax = sc.nextDouble();
        Employee employee = new Employee(name, salary, tax);
        System.out.println("Qual o percentual de aumento do salario? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Dados atualizados: " + employee);
        sc.nextLine();

        // 3. Student
        Student student = new Student();
        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        student.grade3 = sc.nextDouble();
        System.out.println(student);
        sc.nextLine();

        sc.close();
    }
}

// 1. Crie uma classe "Rectangle" que tenha atributos para largura e altura.
// Adicione métodos para calcular a área, o perímetro e a diagonal do retângulo.
// Em seguida, crie um objeto dessa classe e exiba os resultados dos cálculos.
// Class
class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Cinstructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Methods
    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return "Largura: " +
                width +
                "\nAltura: " +
                height +
                "\nArea: " +
                area() +
                "\nPerimetro: " +
                perimeter() +
                "\nDiagonal: " +
                diagonal();
    }
}

// 2. Crie um programa para ler dados de um funcionario (nome, salario bruto e
// imposto), e depois mostrar o nome, o salario liquido e aumentar o salario com
// base em uma porcentagem, em seguida mostrar os dados atualizados.

class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    double netSalary() {
        return grossSalary - tax;
    }

    void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return "Nome: " + name + ", Salario Liquido: " + netSalary();
    }
}

class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    Student() {
    }

    double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    boolean isApproved() {
        return finalGrade() >= 60.0;
    }

    double missingPoints() {
        if (isApproved()) {
            return 0.0;
        } else {
            return 60.0 - finalGrade();
        }
    }

    public String toString() {
        if (isApproved()) {
            return "Nota Final = " + finalGrade() + "Aluno: " + name + "\nAprovado";
        } else {
            return "Nota Final = " + finalGrade() + "Aluno: " + name + "\nReprovado, faltaram " + missingPoints()
                    + " pontos.";
        }
    }
}