import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        // Zadanie 1
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }


        // Zadanie 2
        System.out.println("Podaj pierwszy bok:");
        int bok1 = scanner.nextInt();

        System.out.println("Podaj drugi bok:");
        int bok2 = scanner.nextInt();

        System.out.println("Podaj trzeci bok:");
        int bok3 = scanner.nextInt();

        if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
            System.out.println("Można zbudować trójkąt.");
        } else {
            System.out.println("Nie można zbudować trójkąta.");
        }


        // Zadanie 3
        System.out.println("Podaj pierwszą liczbę:");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int liczba2 = scanner.nextInt();

        if (liczba1 > liczba2) {
            System.out.println("Większa liczba: " + liczba1);
        } else {
            System.out.println("Większa liczba: " + liczba2);
        }


        // Zadanie 4
        System.out.println("Podaj pierwszą liczbę:");
        int liczba3 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int liczba4 = scanner.nextInt();

        System.out.println("Podaj trzecią liczbę:");
        int liczba5 = scanner.nextInt();

        int najwieksza = liczba3;

        if (liczba4 > najwieksza) {
            najwieksza = liczba4;
        }

        if (liczba5 > najwieksza) {
            najwieksza = liczba5;
        }

        System.out.println("Największa liczba: " + najwieksza);


        // Zadanie 5
        System.out.println("Podaj numer miesiąca:");
        int miesiac = scanner.nextInt();

        switch (miesiac) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
        }
        */
        /*
        // Zadanie 6
        System.out.println("Podaj imię:");
        String imie = scanner.next();

        if (imie.equals("Mikolaj")) {
            System.out.println("Tak, masz takie samo imię jak ja.");
        } else {
            System.out.println("Nie, masz inne imię.");
        }
        */
        /*
        // Zadanie 7
        System.out.println("Podaj wiek:");
        int wiek = scanner.nextInt();

        boolean pelnoletni = wiek >= 18 ? true : false;

        System.out.println(pelnoletni);
         */
        /*
        // Zadanie 8
        System.out.println("Podaj rok:");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok jest przestępny.");
        } else {
            System.out.println("Rok nie jest przestępny.");
        }
        */
        /*
        // Zadanie 9
        System.out.println("Podaj wagę w kg:");
        double waga = scanner.nextDouble();

        System.out.println("Podaj wzrost w metrach:");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        } else {
            System.out.println("nadwaga");
        }
         */
        /*
        // Zadanie 10
        double cena;
        int liczbaRat;

        while (true) {
            System.out.println("Podaj cenę towaru (100 - 10000):");
            cena = scanner.nextDouble();

            if (cena >= 100 && cena <= 10000) {
                break;
            }

            System.out.println("Nieprawidłowa cena.");
        }

        while (true) {
            System.out.println("Podaj liczbę rat (6 - 48):");
            liczbaRat = scanner.nextInt();

            if (liczbaRat >= 6 && liczbaRat <= 48) {
                break;
            }

            System.out.println("Nieprawidłowa liczba rat.");
        }

        double oprocentowanie;

        if (liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

        double kwota = cena + cena * oprocentowanie;
        double rata = kwota / liczbaRat;

        System.out.println("Miesięczna rata: " + rata + " zł");
         */
        // Zadanie 11
        System.out.println("Prosty kalkulator");

        System.out.println("Podaj pierwszą liczbę:");
        double kalkulatorLiczba1 = scanner.nextDouble();

        System.out.println("Podaj działanie (+, -, *, /):");
        String dzialanie = scanner.next();

        System.out.println("Podaj drugą liczbę:");
        double kalkulatorLiczba2 = scanner.nextDouble();

        switch (dzialanie) {
            case "+":
                System.out.println("Wynik: " + (kalkulatorLiczba1 + kalkulatorLiczba2));
                break;
            case "-":
                System.out.println("Wynik: " + (kalkulatorLiczba1 - kalkulatorLiczba2));
                break;
            case "*":
                System.out.println("Wynik: " + (kalkulatorLiczba1 * kalkulatorLiczba2));
                break;
            case "/":
                if (kalkulatorLiczba2 == 0) {
                    System.out.println("Nie można dzielić przez zero.");
                } else {
                    System.out.println("Wynik: " + (kalkulatorLiczba1 / kalkulatorLiczba2));
                }
                break;
            default:
                System.out.println("Nieprawidłowy symbol działania.");
        }
    }
}