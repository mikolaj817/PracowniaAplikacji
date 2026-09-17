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
    }
}