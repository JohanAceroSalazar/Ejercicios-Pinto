import java.util.Scanner;

public class exerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notaOne, notaTwo, notaThree;
        int notaFinal;

        System.out.print("ingresa la primera nota: ");
        notaOne = sc.nextInt();

        System.out.print("ingresa la segunda nota: ");
        notaTwo = sc.nextInt();

        System.out.print("ingresa la tercera nota: ");
        notaThree = sc.nextInt();

        notaFinal = (notaOne + notaTwo + notaThree) / 3;

        System.out.println("el promedio final es: " + notaFinal);

        sc.close();
    }
}