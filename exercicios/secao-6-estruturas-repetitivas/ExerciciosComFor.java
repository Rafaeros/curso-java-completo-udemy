import java.util.Scanner;

public class ExerciciosComFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isEven(sc);
        numberInterval(sc);
        averageTest(sc);
        zeroDivision(sc);
        factorial(sc);
        allDivisors(sc);
        doubleLine(sc);
        sc.close();
    }

    public static void isEven(Scanner sc) {
        /*
         * 1. Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de
         * 1 até X, um valor por linha, inclusive o
         * X, se for o caso.
         */
        System.out.print("Digite um valor inteiro X (1 <= X <= 1000): ");
        int x = sc.nextInt();
        while (x < 1 || x > 1000) {
            System.out.print("Valor invalido.\nDigite um valor inteiro X (1 <= X <= 1000): ");
            x = sc.nextInt();
        }

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println("Impar:" + i);
            }
        }
        sc.nextLine(); // Limpa o buffer do scanner
    }

    public static void numberInterval(Scanner sc) {
        /*
         * 2. Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
         * X que serão lidos em seguida.
         * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
         * estão fora do intervalo, mostrando
         * essas informações conforme exemplo (use a palavra "in" para dentro do
         * intervalo, e "out" para fora do intervalo).
         */

        System.out.print("Digite um valor inteiro N para saber quantos valores serao lidos: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in\n" + out + " out");
        sc.nextLine(); // Limpa o buffer do scanner
    }

    public static void averageTest(Scanner sc) {
        /*
         * 3. Leia 1 valor inteiro N, que representa o número de casos de teste que vem
         * a seguir. Cada caso de teste consiste
         * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
         * ponderada para cada um destes
         * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
         * valor tem peso 3 e o terceiro valor tem
         * peso 5.
         */
        System.out.print("Digite o numero de casos de teste: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite os 3 valores reais separados por espaco: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("Media: %.1f%n", media);
        }
    }

    public static void zeroDivision(Scanner sc) {
        /*
         * 4. Fazer um programa para ler um número N. Depois leia N pares de números e
         * mostre a divisão do primeiro pelo
         * segundo. Se o denominador for igual a zero, mostrar a mensagem
         * "divisao impossivel".
         */
        System.out.print("Digite o numero de pares de numeros: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o par de numeros " + (i + 1) + ": ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Divisao impossivel");
            } else {
                double resultado = (double) a / b;
                System.out.printf("Resultado: %.1f%n", resultado);
            }
        }
        sc.nextLine(); // Limpa o buffer do scanner
    }

    public static void factorial(Scanner sc) {
        /*
         * 5. Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N
         * = N * (N-1) * (N-2) * (N-3) * ... * 1.
         * Lembrando que, por definição, fatorial de 0 é 1.
         */
        System.out.print("Digite um valor N para calcular o fatorial: ");
        int n = sc.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);
    }

    public static void allDivisors(Scanner sc) {
        /* 6. Ler um número inteiro N e calcular todos os seus divisores. */
        System.out.print("Digite um numero inteiro N para calcular seus divisores: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void doubleLine(Scanner sc) {
        /*
         * 7. Fazer um programa para ler um número inteiro positivo N. O programa deve
         * então mostrar na tela N linhas,
         * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o
         * quadrado e o cubo do valor, conforme
         * exemplo.
         */

        System.out.print("Digite um numero inteiro positivo N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }
    }
}
