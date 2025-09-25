import java.util.Scanner;

public class ExerciciosDeCondicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        negativoOuNao(sc);
        parOuImpar(sc);
        multiplos(sc);
        sc.close();
    }

    public static void negativoOuNao(Scanner sc) {
        // 1. Fazer um programa para ler um número inteiro, e depois dizer se este
        // número é negativo ou não.
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número não é negativo.");
        }
    }

    public static void parOuImpar(Scanner sc) {
        // 2. Fazer um programa para ler um número inteiro e dizer se este número é par
        // ou ímpar
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }

    public static void multiplos(Scanner sc) {
        // 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
        // mensagem "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
        // números devem poder ser digitados em
        // ordem crescente ou decrescente.
        System.out.print("Digite dois números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é multiplo de " + num2);
        } else {
            System.out.println(num1 + " não é multiplo de " + num2);
        }
    }

    public static void duracaoDoJogo(Scanner sc) {
        // 4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
        // do jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas.
        System.out.print("Digite a hora inicial e a hora final do jogo: ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        sc.nextLine();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas.");
    }

    public static void valorDaConta(Scanner sc) {
        // 5. Com base na tabela abaixo, escreva um programa que leia o código de um
        // item e a quantidade deste item. A
        // seguir, calcule e mostre o valor da conta a pagar.
        System.out.print("Digite o código do item e a quantidade: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        sc.nextLine();

        double valorTotal = 0.0;
        switch (codigo) {
            case 1:
                valorTotal = quantidade * 4.00;
                break;
            case 2:
                valorTotal = quantidade * 4.50;
                break;
            case 3:
                valorTotal = quantidade * 5.00;
                break;
            case 4:
                valorTotal = quantidade * 2.00;
                break;
            case 5:
                valorTotal = quantidade * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", valorTotal);
    }

    public static void valoresIntervalo(Scanner sc) {
        // 6. Você deve fazer um programa que leia um valor qualquer e apresente uma
        // mensagem dizendo em qual dos
        // seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
        // encontra. Obviamente se o valor não estiver em
        // nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

    public static void coordenadasPlano(Scanner sc) {
        // 7. Leia 2 valores com uma casa decimal (x e y), que devem representar as
        // coordenadas
        // de um ponto em um plano. A seguir, determine qual o quadrante ao qual
        // pertence o
        // ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        // Se o ponto estiver na origem, escreva a mensagem “Origem”.
        // Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
        // for a
        // situação.
        System.out.print("Digite as coordenadas (x e y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.nextLine();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else {
            System.out.println("Quadrante Q4");
        }
    }

    public static void salario(Scanner sc) {
        // 8. Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
        // em pagar seus impostos, pois sabem
        // que nele não existem políticos corruptos e os recursos arrecadados são
        // utilizados em benefício da população, sem
        // qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        // Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
        // de Lisarb. Em seguida, calcule e
        // mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a
        // tabela abaixo.
        // Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
        // sobre R$ 1000.00, pois a faixa de
        // salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No
        // exemplo fornecido (abaixo), a taxa é
        // de 8% sobre R$ 1000.00 + 18% sobre R$ 2000.00, ou seja, R$ 1080.00 de Imposto
        // de Renda.
        // O valor deve ser impresso com duas casas decimais.
        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();
        sc.nextLine();
        double imposto = 0.0;
        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
        }
        System.out.printf("Imposto: R$ %.2f%n", imposto);
    }
}
