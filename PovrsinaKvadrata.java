import java.util.Scanner;

public class PovrsinaKvadrata {
    public static void main(String[] args) {
        /*
        Napisati program koji korisniku za uneti broj vraca povrsinu i obim kvadrata
         */
        Scanner skener= new Scanner(System.in);
        System.out.println("Unesite zeljeni broj: ");
        double a= skener.nextDouble();
        if(a<=0){
            System.out.println("Greska uneli ste negativan broj ili 0");
        }else{
            System.out.println("Uneti broj: " + a + ". Povrsina kvadrata je "+ (Math.pow(a,2)) + ". Obim kvadrata je: "+(4*a));
        }
    }
}
