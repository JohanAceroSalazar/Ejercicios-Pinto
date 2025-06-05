public class exercise19 {

    public static Principal pr = new Principal();

    public static void diezPar() {

        for(pr.contador = 1; pr.contador <= 4; pr.contador++){
            pr.a = pr.a + 2;
            System.out.println("Los 10 primeros numero pares son: " + pr.a);
        }
    } 
}