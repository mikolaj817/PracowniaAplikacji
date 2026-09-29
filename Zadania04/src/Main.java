void main() {

    // Zadanie 1
    int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};
    int[] tablicaNieparzysta = {1, 2, 3, 4, 5};

    System.out.println("Tablica parzysta:");

    for (int i = 0; i < tablicaParzysta.length; i += 2) {
        System.out.println(tablicaParzysta[i]);
    }

    System.out.println("Tablica nieparzysta:");

    for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
        System.out.println(tablicaNieparzysta[i]);
    }
}