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
    }

}