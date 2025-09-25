import java.util.Scanner;
import java.util.Locale;

public class ExerciciosDeFixacaoVetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        negatives(sc);
        sumAndAverage(sc);
        height(sc);
        evenNumbers(sc);
        biggestNumber(sc);
        arrayAverage(sc);
        elementsBelowAverage(sc);
        oldestPerson(sc);
        approvedStudents(sc);
        heightPerGenre(sc);

        sc.close();
    }

    /*
     * 1. Faça um programa que leia um número inteiro positivo N (máximo = 10) e
     * depois N números inteiros
     * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números
     * negativos lidos.
     */
    public static void negatives(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Numeros Negativos: ");
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }
        sc.nextLine();
    }

    /*
     * 2. Faça um programa que leia N números reais e armazene-os em um vetor. Em
     * seguida:
     * - Imprimir todos os elementos do vetor
     * - Mostrar na tela a soma e a média dos elementos do vetor
     */
    public static void sumAndAverage(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        float sum = 0;
        float[] array = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextFloat();
        }

        System.out.print("Valores:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%f ", array[i]);
            sum += array[i];
        }

        System.out.println("\nSoma: " + sum);
        System.out.println("Media: " + sum / 3);
        sc.nextLine();
    }

    /*
     * 3. Fazer um programa para ler nome, idade e altura de N pessoas, conforme
     * exemplo. Depois, mostrar na
     * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
     * com menos de 16 anos,
     * bem como os nomes dessas pessoas caso houver.
     */
    public static void height(Scanner sc) {
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        float[] height = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("\nIdade: ");
            age[i] = sc.nextInt();
            System.out.print("\nAltura: ");
            height[i] = sc.nextFloat();
        }

        float sumHeight = 0;
        int ageCount = 0;

        for (int i = 0; i < n; i++) {
            sumHeight += height[i];

            if (age[i] < 16) {
                ageCount++;
            }

        }

        double agePercentage = ((double) ageCount / n) * 100.0;
        System.out.println("\nAltura media: " + sumHeight / n);
        System.out.printf("Pessoas com menos de 16 anos: %.2f %%\n", agePercentage);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }
        sc.nextLine();
    }

    /*
     * 4. Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
     * seguida, mostre na
     * tela todos os números pares, e também a quantidade de números pares.
     */
    public static void evenNumbers(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Numeros Pares: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        sc.nextLine();
    }

    /*
     * 5. Faça um programa que leia N números reais e armazene-os em um vetor. Em
     * seguida, mostrar na tela
     * o maior número do vetor (supor não haver empates). Mostrar também a posição
     * do maior elemento,
     * considerando a primeira posição como 0 (zero).
     */
    public static void biggestNumber(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        double largest = array[0];
        int position = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
                position = i;
            }
        }

        System.out.println("Maior valor: " + largest);
        System.out.println("Posicao do maior valor: " + position);
        sc.nextLine();
    }

    /*
     * 6. Fazer um programa para ler um número inteiro N e depois um vetor de N
     * números reais. Em seguida,
     * mostrar na tela a média aritmética de todos elementos com três casas
     * decimais. Depois mostrar todos
     * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
     */
    public static void arrayAverage(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        double average = sum / n;
        System.out.println("Media: " + average);

        for (int i = 0; i < n; i++) {
            if (array[i] < average) {
                System.out.println(array[i]);
            }
        }
        sc.nextLine();
    }

    /*
     * 7. Fazer um programa para ler um número inteiro N e depois um vetor de N
     * números reais. Em seguida,
     * mostrar na tela a média aritmética de todos elementos com três casas
     * decimais. Depois mostrar todos
     * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
     */

    public static void elementsBelowAverage(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        double average = sum / n;
        System.out.println("Media: " + average);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < n; i++) {
            if (array[i] < average) {
                System.out.printf("%.1f\n", array[i]);
            }
        }
    }

    /*
     * 8. Fazer um programa para ler um conjunto de nomes de pessoas e suas
     * respectivas idades. Os nomes
     * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois,
     * mostrar na tela o nome
     * da pessoa mais velha.
     */

    public static void oldestPerson(Scanner sc) {
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("\nIdade: ");
            age[i] = sc.nextInt();
        }

        int oldestAge = age[0];
        String oldestName = name[0];

        for (int i = 1; i < n; i++) {
            if (age[i] > oldestAge) {
                oldestAge = age[i];
                oldestName = name[i];
            }
        }

        System.out.println("Pessoa mais velha: " + oldestName);
        sc.nextLine();
    }

    /*
     * 9. Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
     * notas que eles tiraram
     * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um
     * vetor. Depois, imprimir
     * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das
     * notas seja maior ou
     * igual a 6.0 (seis).
     */

    public static void approvedStudents(Scanner sc) {
        System.out.print("Quantos alunos serao digitados: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] note1 = new double[n];
        double[] note2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("\nNota 1: ");
            note1[i] = sc.nextDouble();
            System.out.print("\nNota 2: ");
            note2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            double media = (note1[i] + note2[i]) / 2;
            if (media >= 6) {
                System.out.println(name[i]);
            }
        }
        sc.nextLine();
    }

    /*
     * 10. Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N
     * pessoas. Fazer um programa
     * que calcule e escreva a maior e a menor altura do grupo, a média de altura
     * das mulheres, e o número
     * de homens.
     */

    public static void heightPerGenre(Scanner sc) {
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        float[] height = new float[n];
        String[] genre = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            height[i] = sc.nextFloat();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genre[i] = sc.next();
        }
        float tallets = 0;
        float smallest = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                tallets = height[i];
                smallest = height[i];
            } else {
                if (height[i] > tallets) {
                    tallets = height[i];
                }
                if (height[i] < smallest) {
                    smallest = height[i];
                }
            }

            int maleCount = 0;
            float femaleHeightSum = 0;

            for (i = 0; i < n; i++) {
                if (genre[i].equals("M")) {
                    maleCount++;
                } else if (genre[i].equals("F")) {
                    femaleHeightSum += height[i];
                }
            }

            float femaleAverageHeight = femaleHeightSum / (n - maleCount);

            System.out.println("Menor altura: " + smallest);
            System.out.println("Maior altura: " + tallets);
            System.out.println("Media das mulheres: " + femaleAverageHeight);
            System.out.println("Quantidade de homens: " + maleCount);
            sc.nextLine();

        }

    }
}
