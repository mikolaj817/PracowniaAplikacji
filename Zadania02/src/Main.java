import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }


        System.out.println("Podaj pierwszy bok:");
        int bok1 = scanner.nextInt();

        System.out.println("Podaj drugi bok:");
        int bok2 = scanner.nextInt();

        System.out.println("Podaj trzeci bok:");
        int bok3 = scanner.nextInt();

        if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
            System.out.println("Można zbudować trójkąt.");
        } else {
            System.out.println("Nie można zbudować trójkąta.");
        }
    }
}