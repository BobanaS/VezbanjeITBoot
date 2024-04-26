public class PrebrojavanjeImena {
    public static void main(String[] args) {
        /*
        2. Kreirati proizvoljan niz imena, i odaberite neko ime,
        i prebrojati koliko puta se to ime nalazi u nizu.
         */

        String [] imena={"Sofi","Jelena", "Bobana", "Marko", "Sofi", "Jefi", "Vanji", "Jelena", "Jovan", "Sofi", "Sofi"};
        int brojponavljanja=0;
        String ime ="Sofi";
        for (int i =0; i<imena.length; i++){
            if(imena[i].equalsIgnoreCase(ime)){
                brojponavljanja++;
            }
        }
        System.out.println("Ime " + ime + " se ponavlja " + brojponavljanja + " puta u nizu.");
    }
}
