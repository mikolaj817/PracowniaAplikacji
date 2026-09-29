import java.util.Scanner;
void main() {

    /*// Zadanie 1
    int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};
    int[] tablicaNieparzysta = {1, 2, 3, 4, 5};

    System.out.println("Tablica parzysta:");

    for (int i = 0; i < tablicaParzysta.length; i += 2) {
        System.out.println(tablicaParzysta[i]);
    }

    System.out.println("Tablica nieparzysta:");

    for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
        System.out.println(tablicaNieparzysta[i]);
    }*/
    /*// Zadanie 2
    int[] liczby2 = {12, 5, 38, 7, 24, 19};

    int najwieksza = liczby2[0];

    for (int i = 1; i < liczby2.length; i++) {
        if (liczby2[i] > najwieksza) {
            najwieksza = liczby2[i];
        }
    }

    System.out.println("Największa liczba: " + najwieksza);*/
   /* // Zadanie 3
    String[] slowa3 = {"Java", "programowanie", "tablica", "zadanie"};

    for (String slowo : slowa3) {
        System.out.println(slowo.toUpperCase());
    }*/
    // Zadanie 4
    Scanner scanner = new Scanner(System.in);

    String[] slowa4 = new String[5];

    System.out.println("Podaj 5 słów:");

    for (int i = 0; i < slowa4.length; i++) {
        slowa4[i] = scanner.next();
    }

    for (int i = slowa4.length - 1; i >= 0; i--) {
        String odwrocone = "";

        for (int j = slowa4[i].length() - 1; j >= 0; j--) {
            odwrocone += slowa4[i].charAt(j);
        }

        System.out.println(odwrocone);
    }

}