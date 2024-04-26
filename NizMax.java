public class NizMax {
    public static void main(String[] args) {
        /*
        3. Kreirati niz brojeva i kao rezultat istampati najveci broj iz niza.

         */
        int[] niz = {1, 2, 3, 30, 4, -8, 5, 9, 10, 5, -29};
        int maxNiza = niz[0];
        int i = 0;
        int pozicija=0;
        System.out.print("Nas niz brojeva je:[ ");
        for (i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println("].");
        for (i = 0; i < niz.length - 1; i++) {
            if (maxNiza < niz[i]) {
                maxNiza = (niz[i]);
                pozicija=i+1;
            }
        }
        System.out.println("A najveci broj je " + maxNiza + ", a nalazi se na poziciji: " + pozicija);
    }
}
