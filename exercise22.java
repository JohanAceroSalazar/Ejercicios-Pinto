import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero, segundoNumero, producto, contador;

        System.out.println("Primer numero: ");
            primerNumero = scanner.nextInt();
        System.out.println("Segundo numero: ");
            segundoNumero = scanner.nextInt();

        producto = 0;

        for(contador = 1; contador <= segundoNumero; contador++){
            producto = producto + primerNumero;
        scanner.close();
        }
        System.out.println("Producto: " + producto);
    }
}