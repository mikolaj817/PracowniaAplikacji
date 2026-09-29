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
    /*
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
    }*/
    // Zadanie 6
    System.out.println("Podaj znak wypełnienia:");
    char znak = scanner.next().charAt(0);

    System.out.println("Podaj x:");
    int x = scanner.nextInt();

    System.out.println("Podaj y:");
    int y = scanner.nextInt();

    System.out.println("Podaj długość boku a:");
    int a = scanner.nextInt();

    System.out.println("Podaj długość boku b:");
    int b = scanner.nextInt();

    for (int i = 1; i < y; i++) {
        System.out.println();
    }

    for (int i = 0; i < b; i++) {
        for (int j = 1; j < x; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < a; j++) {
            System.out.print(znak);
        }

        System.out.println();
    }
}