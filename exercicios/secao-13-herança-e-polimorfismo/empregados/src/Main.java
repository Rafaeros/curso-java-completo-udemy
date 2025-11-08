import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Employee;
import models.OutsorcedEmployee;

public class Main {

    /*
     * 1. Uma empresa possui funcionários próprios e terceirizados.
     * Para cada funcionário, deseja-se registrar nome, horas
     * trabalhadas e valor por hora. Funcionários terceirizado
     * possuem ainda uma despesa adicional.
     * O pagamento dos funcionários corresponde ao valor da hora
     * multiplicado pelas horas trabalhadas, sendo que os
     * funcionários terceirizados ainda recebem um bônus
     * correspondente a 110% de sua despesa adicional.
     * Fazer um programa para ler os dados de N funcionários (N
     * fornecido pelo usuário) e armazená-los em uma lista. Depois
     * de ler todos os dados, mostrar nome e pagamento de cada
     * funcionário na mesma ordem em que foram digitados.
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #" + i + " data:");
            System.out.print("\nOutsorced (y/n)? ");
            String outsorced = sc.nextLine();
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (outsorced.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee out = new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(out);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
            sc.nextLine();
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
