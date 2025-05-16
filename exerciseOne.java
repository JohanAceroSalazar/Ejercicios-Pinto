import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velocidad, tiempo, distancia;

        System.out.print("Ingrese la velocidad: ");
        velocidad = scanner.nextInt();

        System.out.print("Ingrese el tiempo: ");
        tiempo = scanner.nextInt();

        distancia = velocidad * tiempo;

        System.out.println("La distancia es: " + distancia);
        scanner.close();
    }
}