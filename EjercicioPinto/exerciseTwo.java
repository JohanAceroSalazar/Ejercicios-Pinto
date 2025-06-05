import java.util.Scanner;

public class exerciseTwo {

    public static Principal pr = new Principal();

    public static void Promedio() {

        pr.calcular = (pr.a+ pr.b + pr.c) / 3;

        System.out.println("el promedio final es: " + pr.calcular);
    }
}