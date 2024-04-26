import java.util.Scanner;

public class Deljivost {
    public static void main(String[] args) {
        Scanner broj = new Scanner(System.in);
        System.out.println("Unesite zeljeni broj :");
        double x = broj.nextDouble();



        if(x%2==0&&x%3==0){
            System.out.println("Broj je deljiv i sa dva i sa tri.");
}
    else if (x % 2 == 0) {
            System.out.println("Uneli ste broj" + x + ". Deljiv je sa 2");
        } else if (x % 3 == 0) {
            System.out.println("Broj je deljiv sa 3.");
        } else {
            System.out.println("Broj koji ste uneli nije deljiv ni sa dva ni sa tri");
    }
}
}