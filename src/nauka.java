import java.util.InputMismatchException;
import java.util.Scanner;

public class nauka {

    static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("KALKULATOR by Tomas K !!!");
        while (true) {
            description();
            calculator();
            menu();
        }
    }

    public static void description() {
        System.out.println("Wybierz znak działania\n ");
        System.out.println("dodawanie?   wybierz '+' ");
        System.out.println("odejmowanie? wybierz '-' ");
        System.out.println("mnożenie?    wybierz '*' ");
        System.out.println("dzielenie?   wybierz '/' ");
        System.out.println("potęgowanie? wybierz '^' ");
        System.out.println("pierwiastek? wybierz '%' ");
    }

    public static void calculator() {
        String znak = user.next();
        if (znak.equals("+") || znak.equals("-") || znak.equals("*") || znak.equals("/") || znak.equals("^") || znak.equals("%")) {

        }else {
        System.out.println("Podałeś zły znak");
    }

        switch (znak) {
            case "+": {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba1 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba2 = user.nextDouble();
                    System.out.println("Wynik dodawania to: " + (liczba1 + liczba2));
                    break;
                } catch (InputMismatchException a) {
                    System.out.println("(+)Podałeś zły znak ");
                }
                user.nextLine();
                break;
            }
            case "-": {
                try {
                    System.out.println("(-)Podaj liczbe");
                    double liczba3 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba4 = user.nextDouble();
                    System.out.println("Wynik odejmowania to: " + (liczba3 - liczba4));
                } catch (InputMismatchException b) {
                    System.out.println("(-)Podałeś zły znak");
                }
                user.nextLine();
                break;
            }
            case "*": {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba5 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba6 = user.nextDouble();
                    System.out.println("Wynik mnożenia to: " + (liczba5 * liczba6));
                } catch (InputMismatchException c) {
                    System.out.println("(*)Podałeś zły znak ");
                }
                user.nextLine();
                break;
            }
            case "/": {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba7 = user.nextDouble();
                    System.out.println("Podaj druga liczbe ");
                    double liczba8 = user.nextDouble();
                    if (liczba8 > 0) {
                        System.out.println("Wynik dzielenia to: " + (liczba7 / liczba8));
                    }
                    if (liczba8 == 0 ){
                        System.out.println("Nie dzielimy przez zero");
                    } else{
                        System.out.println("Nie dzielimy przez liczby ujemne");
                    }
                } catch (InputMismatchException d) {
                    System.out.println("(/)Podałeś zły znak");
                }
                user.nextLine();
                break;
            }
            case "^": {
                try {
                    System.out.println("Podaj liczbe");
                    int liczba9 = user.nextInt();
                    System.out.println("Podaj druga liczbe ");
                    int liczba10 = user.nextInt();
                    int potega = (int) Math.pow(liczba9, liczba10);
                    System.out.println("Wynik potęgowania to: " + (potega));
                } catch (InputMismatchException e) {
                    System.out.println("(^)Podałeś zły znak ");
                }
                user.nextLine();
                break;
            }
            case "%": {
                try {
                    System.out.println("Podaj liczbe");
                    double liczba11 = user.nextInt();
                    double pierwiastek = Math.sqrt(liczba11);
                    System.out.println("Wynik pierwiastkowania to: " + pierwiastek);
                } catch (InputMismatchException f) {
                    System.out.println("Podałeś zły znak dla pierwiastkowania");
                }
                user.nextLine();
                break;
            }
        }

    }

    public static void menu() {
        System.out.println("\nChcesz wykonać jeszcze jakies działanie?\nTak? wybierz - 1.\nNie? wybierz - 2. ");
        try {
            while (true) {
                byte wybor = user.nextByte();
                if (wybor == 1) {
                    break;
                }
                if (wybor == 2) {
                    System.out.println("Dowidzenia");
                    System.exit(0);
                } else {
                    System.out.println("wybierz 1 lub 2");
                }
            }
        } catch (InputMismatchException g) {
            System.out.println("Podałeś zły znak Dowidzenia\n ");
            System.exit(0);
        }
    }
}


