import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, suma, promedio;

        System.out.print("Numero 1: ");
        numero1 = scanner.nextDouble();

        System.out.print("Numero 2: ");
        numero2 = scanner.nextDouble();

        suma = numero1 + numero2;
        promedio = suma / 2;
        
        System.out.println("Resultado: " + promedio);

        scanner.close();
    }
}