import java.util.Scanner;

public class ProveraGodina {
    public static void main(String[] args) {
        /*
        Uneti preko Scanner-a broj godina,
        ukoliko korisnik ima 18 i vise godina, ispisati poruku da moze da konzumira alkohol,
        u suprotnom ispisati poruku da ne moze.

         */

        Scanner skener = new Scanner(System.in);
        System.out.println("Upisite vase godine: ");
        int god = skener.nextInt();

        if(god>=18){
            System.out.println("Dovoljno ste stari da pijete alkohol");
        } else {
            System.out.println("Za vas je alkohol zabranjen.");
        }
    }
}
