import java.util.Scanner;

public class DesafioVetorPensionato {

    /*
     * 1. Leia o nome, email e quarto do onde vai ficar hospedado, alocando cada
     * quarto em uma posição do vetor
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How manu rooms will be rented? ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Number of rooms must be between 1 and 10.");
            sc.close();
            return;
        }

        Rent[] rents = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine(); // consume the remaining newline
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            room -= 1; // Adjusting for 0-based index

            if (room <= 0 || room >= 10) {
                System.out.println("Invalid room number. It must be between 0 and " + (n - 1) + ".");
                i--; // decrement i to repeat this iteration
                continue;
            }

            rents[room] = new Rent(name, email, room);
        }
        System.out.println("Busy rooms: ");
        for(Rent rent : rents) {
            if (rent != null) {
                System.out.println(rent);
            }
        }
        sc.close();
    }

}

class Rent {
    String name;
    String email;
    int room;

    public Rent(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString() {
        return room + ": " + name + ", " + email;
    }

}