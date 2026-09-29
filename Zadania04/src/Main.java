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
    /*// Zadanie 6
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
    }*/
    /*// Zadanie 7
    String[] tablicaA = {"Java", "C++", "Python"};
    String[] tablicaB = {"Java", "C++", "Python"};

    boolean takieSame = true;

    if (tablicaA.length != tablicaB.length) {
        takieSame = false;
    } else {
        for (int i = 0; i < tablicaA.length; i++) {
            if (!tablicaA[i].equals(tablicaB[i])) {
                takieSame = false;
                break;
            }
        }
    }

    if (takieSame) {
        System.out.println("Tablice są takie same.");
    } else {
        System.out.println("Tablice nie są takie same.");
    }*/
    // Zadanie 8
    Random random = new Random();

    int[] liczby8 = new int[10];
    int suma8 = 0;

    for (int i = 0; i < liczby8.length; i++) {
        liczby8[i] = random.nextInt(21) - 10;
        suma8 += liczby8[i];
    }

    System.out.println("Tablica:");

    for (int liczba : liczby8) {
        System.out.print(liczba + " ");
    }

    int min8 = liczby8[0];
    int max8 = liczby8[0];

    for (int i = 1; i < liczby8.length; i++) {
        if (liczby8[i] < min8) {
            min8 = liczby8[i];
        }

        if (liczby8[i] > max8) {
            max8 = liczby8[i];
        }
    }

    double srednia8 = (double) suma8 / liczby8.length;

    int mniejsze = 0;
    int wieksze = 0;

    for (int liczba : liczby8) {
        if (liczba < srednia8) {
            mniejsze++;
        } else if (liczba > srednia8) {
            wieksze++;
        }
    }

    System.out.println();
    System.out.println("Najmniejszy element: " + min8);
    System.out.println("Największy element: " + max8);
    System.out.println("Średnia: " + srednia8);
    System.out.println("Elementów mniejszych od średniej: " + mniejsze);
    System.out.println("Elementów większych od średniej: " + wieksze);

    System.out.println("Tablica w odwrotnej kolejności:");

    for (int i = liczby8.length - 1; i >= 0; i--) {
        System.out.print(liczby8[i] + " ");
    }

    System.out.println();
}