import java.util.Scanner;
public class Main1 {


    public static void main(String[] args) {

        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        String imie = "Mikołaj";
        int rokUrodzenia = 2007;
        double liczba = 0.66;
        System.out.println("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę w stopniach Celsjusza:");
        double stopnie = scanner.nextDouble();

        double fahrenheit = 1.8 * stopnie + 32.0;

        System.out.println("Temperatura w Fahrenheitach: " + fahrenheit);



        System.out.println("Podaj pierwszy bok:");

        double bok1 = scanner.nextDouble();

        System.out.println("Podaj drugi bok:");
        double bok2 = scanner.nextDouble();

        System.out.println("Podaj trzeci bok:");
        double bok3 = scanner.nextDouble();

        double obwod = bok1 + bok2 + bok3;

        System.out.println("Obwód trójkąta: " + obwod);

        System.out.println("Podaj pierwsze słowo:");
        String slowo1 = scanner.next();

        System.out.println("Podaj drugie słowo:");
        String slowo2 = scanner.next();

        System.out.println("Podaj trzecie słowo:");
        String slowo3 = scanner.next();

        System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);
        System.out.println("Podaj wyraz:");
        String wyraz = scanner.next();

        System.out.println("Liczba znaków: " + wyraz.length());

        int x = 5;
        int y = 2;

        double wynik = (double) x / y;

        System.out.println(wynik);
        System.out.println("Podaj słowo:");
        String slowo = scanner.next();

        System.out.println(slowo.toUpperCase());
        System.out.println("Podaj promień koła:");
        int promien = scanner.nextInt();

        double pole = Math.PI * promien * promien;

        System.out.println("Pole koła: " + pole);
    }

}