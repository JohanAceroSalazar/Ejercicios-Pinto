import java.util.Scanner;

public class exercise20 {

    public static Principal pr = new Principal();

    public static void sueldoPromedio() {
        Scanner scanner = new Scanner(System.in);
        pr.calcular = 0;

        for(pr.contador = 1; pr.contador <= pr.a; pr.contador++){
            System.out.println("Sueldo del trabajador " + pr.contador);
            pr.b = scanner.nextInt();
            pr.calcular = pr.calcular + pr.b;
        }
        pr.calcular2 = pr.calcular / pr.a;

        System.out.println("Sueldo promedio: " + pr.calcular2);
    }
}