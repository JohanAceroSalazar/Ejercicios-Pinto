public class exercise17 {

    public static Principal pr = new Principal();

    public static void cocienteEntero() {

        pr.calcular =  pr.a / 10;
        pr.calcular2 = pr.a - (pr.calcular * 10);

        System.out.println("Numero de decenas: " + pr.calcular);
        System.out.println("Numero de unidades: " + pr.calcular2);

    }
}