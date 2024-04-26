import java.util.Scanner;

public class RadnaPozicija {
    public static void main(String[] args) {
        /*
        Zadatak 2:
Uneti radnu poziciju u bolnici (Tehnicar, Hirurg, Pedijatar),
i ispisati koliko ko zaradjuje para ako znamo da Pedijatar zaradjuje 70000,
Tehnicar 40% manje od Pedijatra,
a Hirurg 2.5 vise od Tehnicara.
         */
        Scanner tekst = new Scanner(System.in);
        System.out.println("Upisite zeljenu poziciju");
        String pozicija = tekst.nextLine();
        double plataP = 70000;

        switch (pozicija.toLowerCase()) {
            case "tehnicar":
                System.out.println("Plata za tu poziciju je: " + (70000 - (70000 * 0.4)));
                break;
            case "pedijatar":
                System.out.println("Plata za tu poziciju je: " + plataP);
                break;
            case "hirurg":
                System.out.println("Plata za tu pozicuju je: " + ((70000 - (70000 * 0.4)) * 2.5));
                break;
            default:
                System.out.println("Uneli ste pogresnu poziciju.");
                break;
        }
    }
}
