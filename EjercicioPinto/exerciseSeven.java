public class exerciseSeven {

    public static Principal pr = new Principal();

    public static void numeroCd() {

        pr.N1= pr.A * 1024;
        pr.N2 = (pr.N1 / 700) + 1;

        System.out.println("Numero de CDs: " + pr.N2);
        
    }
}