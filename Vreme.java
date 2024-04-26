import java.util.Scanner;

public class Vreme {
    public static void main(String[] args) {
        /*
        Uneti mesec preko Skenera, ako korisnik unese Jun Jul ili Avgust,
        ispisati poruku da je strasno toplo, ako unese Decembar, Januar i Februrar,
         ispisati kako je jako hladno,
u suprotnom ispisati da nije tako strasno.
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi mesec u godine: ");

        String text = skener.nextLine();

        switch (text.toLowerCase()) {

            case "jun", "jul", "avgust":
                System.out.println("Strasno je toplo.");
                break;
            case "decembar", "januar", "februar":
                System.out.println("Jako je hladno.");
                break;
            case "mart", "april", "maj", "septembar", "oktobar", "novembar":
                System.out.println("Nije tako strasno.");
                break;
            default:
                System.out.println("Uneli ste pogresan mesec.");
                break;

        }
    }
}
