import java.util.Scanner;

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
// Zadanie 3
    System.out.println("Podawaj liczby. Wpisz 0, aby zakończyć:");

    int suma = 0;
    int liczba3;

    do {
        liczba3 = scanner.nextInt();
        suma += liczba3;
    } while (liczba3 != 0);

    System.out.println("Suma: " + suma);

}