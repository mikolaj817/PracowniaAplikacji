void main() {
    Scanner scanner = new Scanner(System.in);
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
    /*// Zadanie 4

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
*/
    /*// Zadanie 5
    int[] liczby5 = new int[8];

    System.out.println("Podaj 8 liczb:");

    for (int i = 0; i < liczby5.length; i++) {
        liczby5[i] = scanner.nextInt();
    }

    for (int i = 0; i < liczby5.length - 1; i++) {
        for (int j = 0; j < liczby5.length - 1 - i; j++) {
            if (liczby5[j] > liczby5[j + 1]) {
                int temp = liczby5[j];
                liczby5[j] = liczby5[j + 1];
                liczby5[j + 1] = temp;
            }
        }
    }

    System.out.println("Posortowana tablica:");

    for (int liczba : liczby5) {
        System.out.println(liczba);
    }*/
    // Zadanie 6
    int[] liczby6 = new int[5];

    System.out.println("Podaj 5 liczb:");

    for (int i = 0; i < liczby6.length; i++) {
        liczby6[i] = scanner.nextInt();
    }

    for (int liczba : liczby6) {
        long silnia = 1;

        for (int i = 1; i <= liczba; i++) {
            silnia *= i;
        }

        System.out.println(liczba + "! = " + silnia);
    }
}