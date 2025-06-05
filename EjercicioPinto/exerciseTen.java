public class exerciseTen {

    public static Principal pr = new Principal();

    public static void diferenciaDeEdad() {

        pr.calcular = pr.a - pr.b;
        pr.calcular2 = pr.b - pr.a;

        if(pr.a > pr.b){
            System.out.println("El primer hermano es el mayor: " + pr.calcular);
        }
        else{
            System.out.println("El segundo hermano es el mayor: " + pr.calcular2);
        }
    }
}
