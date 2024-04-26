public class NajkraciString {
    public static void main(String[] args) {
        /*
        4. Kreireati niz Stringova i kao rezultat istampati najkraci String iz niza.

         */

        String[] niz = {"Prolece", "Leto", "zima", "jesen", "Plaza","Bo", "Sladoled", "kisa", "Sneg", "Knjiga", "grom"};

        int duzina=niz[0].length();
        String najKraci="";

        for(int i=0; i<niz.length; i++){
            if(duzina>niz[i].length()){
                duzina=niz[i].length();
                najKraci=niz[i];
            }
        }
        System.out.println("Najkraci string ovog niza je '"+ najKraci + "'.");
    }
}
