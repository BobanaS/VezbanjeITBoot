public class SabiranjeDvaNiza {
    public static void main(String[] args) {
        /*
        1. Sabrati dva niza brojeva iste duzine, kao rezultat vraca treci niz.

         */
        int[] niz = {1, 2, 3, 4, 5};
        int[] niz1 = {5, 6, 7, 8, 9};
        int[] niz3 = new int[niz.length];

        for (int i = 0; i < niz.length; i++) {
            niz3[i] = niz[i] + niz1[i];
        }
        System.out.println("Novi niz je ");
        for (int i = 0; i < niz3.length; i++) {
            System.out.print(niz3[i] + " ");
        }


    }
}
