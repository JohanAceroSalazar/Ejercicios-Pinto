public class exerciseThree {

    public static Principal pr = new Principal();

    public static void puntajeExamen() {

        pr.calcular = pr.a * 4;
        pr.calcular2 = pr.b * -1;
        pr.calcular3 = pr.calcular + pr.calcular2;

        if(pr.calcular3<0){
            System.out.println("Puntaje final menor a 0 " );
        }
        System.out.println("Puntaje final: " + pr.calcular3);
    }
}