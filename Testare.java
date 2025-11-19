public class Testare {
    public static void main(String[] args) {
        System.out.println("--- Programul a pornit! ---");

        // cream un obiect tip Motorcycle
        Motorcycle m1 = new Motorcycle(
                2, "Rosu", "Yamaha", 2022, 7500, "Benzina", 110,
                "Manuala", 80, 15, 220, 15000, 2,
                "Lant", "ABS"
        );
        //testam toString
        System.out.println("\n\tTestare toString()");
        System.out.println(m1.toString());
        //testam metode din interfata
        System.out.println("\n\tTestam interfata");

        boolean esteSecondHand=m1.esteSH();
        System.out.println("Este Second Hand? "+esteSecondHand);

        int pretVanzare=m1.calcPretVanzare();
        System.out.println("Pret vanzare: "+pretVanzare);

        //testam un getter din Vehicle si unul din Motorcycle
        System.out.println("\n\tTestare Gettere");
        System.out.println("Brand:"+m1.getBrand());
        System.out.println("Tip frana: "+m1.getTipFrana());
    }
}
