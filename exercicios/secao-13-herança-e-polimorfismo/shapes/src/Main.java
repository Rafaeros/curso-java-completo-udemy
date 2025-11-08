import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Circle;
import models.Rectangle;
import models.Shape;
import models.enums.Color;

public class Main {

    /*
     * 3. Fazer um programa para ler os dados de N figuras (N fornecido
     * pelo usuário), e depois mostrar as áreas destas figuras na
     * mesma ordem em que foram digitadas.
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)?");
            char shapeType = sc.nextLine().charAt(0);
            System.out.println("Enter color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.nextLine());
            if (shapeType == 'r') {
                System.out.println("Enter width:");
                double width = sc.nextDouble();
                System.out.println("Enter height:");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);
            } else if (shapeType == 'c') {
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            } else {
                System.out.println("Invalid shape type.");
            }
            sc.nextLine();
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }
        sc.close();
    }
}
