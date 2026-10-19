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

// Zadanie 5
boolean czyPodzielnaPrzez3i5(int liczba) {
    return liczba % 3 == 0 && liczba % 5 == 0;
}

void main() {
    System.out.println(czyPodzielnaPrzez3i5(15));
}