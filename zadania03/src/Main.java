import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    // Zadanie 1
    System.out.println("Podaj liczbę całkowitą dodatnią:");
    int liczba = scanner.nextInt();

    for (int i = 1; i <= liczba; i += 2) {
        System.out.println(i);
    }
}