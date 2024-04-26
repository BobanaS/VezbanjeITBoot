import java.util.Scanner;

public class Samoglasnici {
    /*
    Napraviti program koji uzima String i prebrojava sve njegove samoglasnike.
     */
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite zeljeni tekst: ");

        String tekst = skener.nextLine();
        int brojS = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.toLowerCase().charAt(i) == 'a' ||
                    tekst.toLowerCase().charAt(i) == 'i' ||
                    tekst.toLowerCase().charAt(i) =='o' ||
                    tekst.toLowerCase().charAt(i) == 'e' ||
                    tekst.toLowerCase().charAt(i) =='u') {
                brojS++;
            }

        }
        System.out.println("U vasem tekstu (" + tekst + ") se nalazi " + brojS + " samoglasnika.");

    }
}
