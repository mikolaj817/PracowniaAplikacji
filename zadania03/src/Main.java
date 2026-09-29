import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner scanner = new Scanner(System.in);

    /*
    // Zadanie 1
    System.out.println("Podaj liczbę całkowitą dodatnią:");
    int liczba = scanner.nextInt();

    for (int i = 1; i <= liczba; i += 2) {
        System.out.println(i);
    }
    */
/*
// Zadanie 3
    System.out.println("Podawaj liczby. Wpisz 0, aby zakończyć:");

    int suma = 0;
    int liczba3;

    do {
        liczba3 = scanner.nextInt();
        suma += liczba3;
    } while (liczba3 != 0);

    System.out.println("Suma: " + suma);
*/
/*
// Zadanie 4
    System.out.println("Podawaj liczby. Wpisz 0, aby zakończyć:");

    int liczba4 = scanner.nextInt();

    if (liczba4 == 0) {
        System.out.println("Nie podano żadnych liczb.");
    } else {
        int min = liczba4;
        int max = liczba4;
        int suma4 = liczba4;
        int ile = 1;

        while (true) {
            liczba4 = scanner.nextInt();

            if (liczba4 == 0) {
                break;
            }

            suma4 += liczba4;
            ile++;

            if (liczba4 < min) {
                min = liczba4;
            }

            if (liczba4 > max) {
                max = liczba4;
            }
        }

        System.out.println("Suma największej i najmniejszej: " + (min + max));
        System.out.println("Średnia: " + (double) suma4 / ile);
    }*/
    // Zadanie 5
    Random random = new Random();
    int wylosowana = random.nextInt(100) + 1;

    System.out.println("Zgadnij liczbę od 1 do 100:");

    while (true) {
        int strzal = scanner.nextInt();

        if (strzal > wylosowana) {
            System.out.println("Podałeś za dużą wartość");
        } else if (strzal < wylosowana) {
            System.out.println("Podałeś za małą wartość");
        } else {
            System.out.println("Gratulacje");
            break;
        }
    }
}