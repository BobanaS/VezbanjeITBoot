import java.util.Scanner;

public class Tekst {
    public static void main(String[] args) {
        /*
        Program koji vraca tekst Napisan velikim slovima
         */

        Scanner tekst = new Scanner(System.in);

        System.out.println("Unesite zeljeni tekst: ");
                String te=tekst.nextLine();
        System.out.println(te.toUpperCase());
    }
}
