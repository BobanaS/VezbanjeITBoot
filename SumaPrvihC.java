public class SumaPrvihC {
    public static void main(String[] args) {
       /* Zadatak 4:
        Izracunati sumu prvih parnih 40 brojeva.
    */

        System.out.print("Suma prvih parnih 40 brojeva iznosi: ");

        int suma=0;

        for(int i =0; i<=40; i++){
            if(i%2==0){
                suma+=i;
            }
         }
        System.out.println(suma);
    }

}
