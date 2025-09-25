import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = calcularArea(scanner);
        System.out.println("A area do Retangulo = " + area);
        exibirDadosUsuario(scanner);
        scanner.close();
    }

    public static void exibirDadosUsuario(Scanner scanner) {
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        char firstChar = nome.charAt(0);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consume the pending line break
        System.out.printf("Nome: %s%nIdade: %d%nSalario: %.2f%nPrimeira letra do Nome: %c", nome, idade, salario,
                firstChar);
    }

    public static double calcularArea(Scanner scanner) {
        System.out.print("Digite a base do Retangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do Retangulo: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consume the pending line break
        return (base * altura) / 2;
    }

}