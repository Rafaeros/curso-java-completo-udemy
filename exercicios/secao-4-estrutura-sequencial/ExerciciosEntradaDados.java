import java.util.Scanner;

public class ExerciciosEntradaDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        soma(sc);
        areaCirculo(sc);
        diferenca(sc);
        calcularSalarioFuncionario(sc);
        calcularValorPagar(sc);
        sc.close();
    }

    public static void soma(Scanner sc) {
        // Exercicio 1: Soma de dois valores inteiros
        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor inteiro:");
        int valor2 = sc.nextInt();
        int soma = valor1 + valor2;
        System.out.printf("A soma de %d + %d = %d%n", valor1, valor2, soma);
    }

    public static void areaCirculo(Scanner sc) {
        // Exercicio 2: Área de um círculo
        System.out.println("Digite o valor do raio do círculo:");
        double raio = sc.nextDouble();
        sc.nextLine();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);
        System.out.printf("A área do círculo com raio %.2f é: %.4f%n", raio, area);
    }

    public static void diferenca(Scanner sc) {
        int a, b, c, d;
        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        c = sc.nextInt();
        System.out.println("Digite o valor de D:");
        d = sc.nextInt();
        sc.nextLine(); // Consume the pending line break
        int diferenca = (a * b) - (c * d);
        System.out.printf("Diferenca: %n(%d * %d) - (%d * %d) = %d%n", a, b, c, d, diferenca);
    }

    public static void calcularSalarioFuncionario(Scanner sc) {
        // Exercicio 4: Cálculo do salário de um funcionário
        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora:");
        double valorPorHora = sc.nextDouble();
        sc.nextLine(); // Consume the pending line break
        double salario = horasTrabalhadas * valorPorHora;
        System.out.printf("Número do funcionário: %d%nSalário: %.2f%n", numeroFuncionario, salario);
    }

    public static void calcularValorPagar(Scanner sc) {
        // Exercicio 5: Cálculo do valor a ser pago por duas peças
        int quantidade, valorUnitario;
        int quantidade2, valorUnitario2;
        System.out.println("Digite o código da peça 1:");
        sc.nextInt();
        System.out.println("Digite a quantidade da peça 1:");
        quantidade = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1:");
        valorUnitario = sc.nextInt();
        System.out.println("Digite o código da peça 2:");
        sc.nextInt();
        System.out.println("Digite a quantidade da peça 2:");
        quantidade2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2:");
        valorUnitario2 = sc.nextInt();
        sc.nextLine(); // Consume the pending line break
        double valorPagar = (quantidade * valorUnitario) + (quantidade2 * valorUnitario2);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
    }

    public static void calcularArea(Scanner sc) {
        // Exercicio 6: Cálculo de áreas
        System.out.println("Digite o valor de A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        double c = sc.nextDouble();
        sc.nextLine(); // Consume the pending line break

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("Área do triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Área do círculo: %.3f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);
    }
}
