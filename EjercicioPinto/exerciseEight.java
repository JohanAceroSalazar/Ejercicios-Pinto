public class exerciseEight {

    public static Principal pr = new Principal();

    public static void distanciaPlanoCartesiano() {

        pr.N1 = Math.pow(pr.A - pr.B, 2) + Math.pow(pr.C - pr.D, 2);

        System.out.println("Distancia: " + pr.N1);
        
    }
}