import java.util.Scanner;

public class Slova_vezba {
    public static void main(String[] args) {
        /*
        Zadatak koji za uneto pice, vraca preporuku knjige
         caj = Sreca je piti caj s tobom Mamen Sances
         kafa = Na kafi sa mačkom Ana Soliom
         koktel = Kokteli - za zdravlje i dobro raspoloženje Violeta Ilić
         voda= Crvena voda Jurica Pavicic
         limunada =  Limunovi na mesečini Djina Majer
         */
        Scanner text = new Scanner(System.in);
        System.out.println("U kaficu ste, imate priliku da narucite samo jedno pice" +
                " od ponudjenih caj, kafa, koktel, voda i limunada. Sta cete naruciti? ");
        String izbor = text.nextLine();
        if (izbor.equalsIgnoreCase("caj")){
            System.out.println("Za vas je knjiga Sreca je piti caj s tobom, Mamen Sances");
        } else if (izbor.equalsIgnoreCase("kafa" )) {
            System.out.println("Za vas je knjiga Na kafi sa mačkom, Ana Soliom");
        } else if (izbor.equalsIgnoreCase("koktel" )) {
            System.out.println("Za vas je knjiga Kokteli - za zdravlje i dobro raspoloženje, Violeta Ilić");
        } else if (izbor.equalsIgnoreCase("voda")) {
            System.out.println("Za vas je knjiga  Crvena voda Jurica Pavicic");
        } else if (izbor.equalsIgnoreCase("limunada")) {
            System.out.println("Za vas je knjiga  Limunovi na mesečini Djina Majer");
        } else {
            System.out.println("Morate uneti jednu od reci sa spiska");
        }
    }
}