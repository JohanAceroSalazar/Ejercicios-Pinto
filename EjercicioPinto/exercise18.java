public class exercise18 {

    public static Principal pr = new Principal();

    public static void numeroParImpar() {

        pr.calcular = pr.a / 2;
        pr.calcular2 = pr.a - (pr.calcular * 2);

        if (pr.calcular2 == 0) {
            System.out.println("El numero es par");
        } 
        else{
            System.out.println("El numero es impar");
        }
    }
}