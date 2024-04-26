public class ZbirDvaNizaRazlicitihDuzina {
    public static void main(String[] args) {
        /*
        5. ** Sabrati dva niza razlicitih duzina.

         */
        int [] niz1={1,2,3,4,5};
        int[] niz2={1,2,3,4,5,6,8,9};
        int[] niz3= new int[Math.max(niz1.length, niz2.length)];
        System.out.print("Nas novi niz je [ ");
        for(int i =0; i<niz3.length; i++){
            if(i<niz1.length&&i<niz2.length){
                niz3[i]=niz1[i] +niz2[i];
            }
            else if(i>niz1.length-1){
                niz3[i] =niz2[i];
            }
            else if(i>niz2.length-1){
                niz3[i]=niz1[i];
            }
            System.out.print(niz3[i] + " ");
            }
        System.out.println("].");

    }
    }

