import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x); // format with two decimal places
        System.out.printf("%.4f%n", x); // format with four decimal places
        Locale.setDefault(Locale.US); // set locale to US
        System.out.printf("%.4f%n", x); // format with four decimal places in US locale

        System.out.println("Resultado = " + x + " Metros ");
        System.out.printf("Resultado = %.2f Metros%n", x); // formatted output with two decimal places

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}