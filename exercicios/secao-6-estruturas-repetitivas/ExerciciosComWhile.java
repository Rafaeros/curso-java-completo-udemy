import java.util.Scanner;

public class ExerciciosComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkPassword(sc);
        readCoordinates(sc);
        fuelChoosed(sc);
        sc.close();
    }

    public static void checkPassword(Scanner sc) {
        /*
         * 1. Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha
         * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
         * informada corretamente deve ser
         * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
         * a senha correta é o valor 2002.
         */
        int senhaCorreta = 2002;
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        while (senha != senhaCorreta) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.nextLine(); // Limpa o buffer do scanner
    }

    public static void readCoordinates(Scanner sc) {
        /*
         * 2. Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
         * indeterminada de pontos no sistema
         * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
         * algoritmo será encerrado quando pelo
         * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
         * alguma).
         */
        System.out.print("Digite as coordenadas X e Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
            System.out.print("Digite as coordenadas X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.nextLine(); // Limpa o buffer do scanner
    }

    public static void fuelChoosed(Scanner sc) {
        /*
         * 3. Um Posto de combustíveis deseja determinar qual de seus produtos tem a
         * preferência de seus clientes. Escreva
         * um algoritmo para ler o tipo de combustível abastecido (codificado da
         * seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
         * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
         * deve ser solicitado um novo código (até
         * que seja válido). O programa será encerrado quando o código informado for o
         * número 4. Deve ser escrito a
         * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
         * tipo de combustível, conforme
         * exemplo.
         */
        int alcool = 0, gasolina = 0, diesel = 0;
        System.out.println("Selecione o tipo de combustivel: ");
        System.out.print("1. Alcool\n2. Gasolina\n3. Diesel\n4. Encerrar\n");
        int codigo = sc.nextInt();
        while (codigo != 4) {
            System.out.println("Selecione o tipo de combustivel: ");
            System.out.print("1. Alcool\n2. Gasolina\n3. Diesel\n4. Encerrar\n");
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + alcool);
                    System.out.println("Gasolina: " + gasolina);
                    System.out.println("Diesel: " + diesel);
                    break;
                default:
                    System.out.println("Codigo invalido, tente novamente.");
            }
            codigo = sc.nextInt();
        }
        sc.nextLine(); // Limpa o buffer do scanner
    }
}
