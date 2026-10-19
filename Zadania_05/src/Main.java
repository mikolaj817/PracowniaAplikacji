/*
int pobierzWiek() {
    return 19;
}
*/

/*
String pobierzImie() {
    return "Mikołaj";
}
*/

/*
void obliczDzialania(int a, int b) {
    System.out.println("Suma: " + (a + b));
    System.out.println("Różnica: " + (a - b));
    System.out.println("Iloczyn: " + (a * b));
}
*/

/*
boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
}
*/

/*
boolean czyPodzielnaPrzez3i5(int liczba) {
    return liczba % 3 == 0 && liczba % 5 == 0;
}
*/

/*
int doTrzeciejPotegi(int liczba) {
    return liczba * liczba * liczba;
}
*/

/*
double pierwiastek(double liczba) {
    return Math.sqrt(liczba);
}
*/

/*
boolean czyTrojkatProstokatny(double a, double b, double c) {
    if (a <= 0 || b <= 0 || c <= 0) {
        return false;
    }

    double najwiekszy = Math.max(a, Math.max(b, c));
    double sumaKwadratow = a * a + b * b + c * c
            - najwiekszy * najwiekszy;

    return Math.abs(najwiekszy * najwiekszy - sumaKwadratow)
            < 0.000001;
}
*/

/*
char ostatniZnak(String tekst) {
    return tekst.charAt(tekst.length() - 1);
}
*/

/*
boolean czyPalindrom(String tekst) {
    tekst = tekst.toLowerCase();

    int lewy = 0;
    int prawy = tekst.length() - 1;

    while (lewy < prawy) {
        if (tekst.charAt(lewy) != tekst.charAt(prawy)) {
            return false;
        }

        lewy++;
        prawy--;
    }

    return true;
}
*/

// Zadanie 11
int sumaTablicy(int[] liczby) {
    int suma = 0;

    for (int liczba : liczby) {
        suma += liczba;
    }

    return suma;
}

void main() {
    int[] liczby = {1, 7, 20, 100};

    System.out.println(sumaTablicy(liczby));
}