import java.util.InputMismatchException;
import java.util.Scanner;

public class nauka {

    static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {

        opis();
        kalkulator();
    }

    static void opis() {
        System.out.println("KALKULATOR by Tomas K !!!");
        System.out.println("Wybierz znak działania\n ");
        System.out.println("dodawanie?   wybierz '+' ");
        System.out.println("odejmowanie? wybierz '-' ");
        System.out.println("mnożenie?    wybierz '*' ");
        System.out.println("dzielenie?   wybierz '/' ");
        System.out.println("potęgowanie? wybierz '^' ");
    }

    public static void kalkulator() {

        char znak = user.next().charAt(0);
        if (znak != '+' && znak != '-' && znak != '*' && znak != '/' && znak != '^') {
            System.out.println("Błędny znak działania ");
        }

        switch (znak) {
            case '+' -> {
                try {

                    System.out.println("Podaj liczbe");
                    double liczba1 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba2 = user.nextDouble();
                    System.out.println("Wynik dodawania to: " + (liczba1 + liczba2));
                } catch (InputMismatchException a) {
                    System.out.println("Podałeś zły znak ");
                }
            }
            case '-' -> {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba3 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba4 = user.nextDouble();
                    System.out.println("Wynik odejmowania to: " + (liczba3 - liczba4));
                } catch (InputMismatchException b) {
                    System.out.println("Podałeś zły znak");
                }
            }
            case '*' -> {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba5 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba6 = user.nextDouble();
                    System.out.println("Wynik mnożenia to: " + (liczba5 * liczba6));
                } catch (InputMismatchException c) {
                    System.out.println("Podałeś zły znak ");
                }
            }
            case '/' -> {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba7 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba8 = user.nextDouble();
                    if (liczba8 > 0) {
                        System.out.println("Wynik dzielenia to: " + (liczba7 / liczba8));
                    } else
                        System.out.println("Nie dzielimy przez zero - ZACZNIJ OD NOWA");
                } catch (InputMismatchException e) {
                    System.out.println("Podałeś zły znak");
                }
            }
            case '^' -> {
                try {
                    System.out.println("Podaj liczbe");
                    int liczba9 = user.nextInt();
                    System.out.println("Podaj druga liczbe ");
                    int liczba10 = user.nextInt();
                    int potega = (int) Math.pow(liczba9, liczba10);
                    System.out.println("Wynik potęgowania to: " + (potega));
                } catch (InputMismatchException e) {
                    System.out.println("Błąd ( w potęgowaniu nie uzywamy znaków i liczb zmiennoprzecinkowych ");
                }
            }
        }

    }
}











