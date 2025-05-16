import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador, numero;

        System.out.println("Numero: ");
            numero = scanner.nextInt();

        for(contador = 1; contador <= 4; contador++){
            numero = numero + 2;
            System.out.println("Numero: " + numero);
        scanner.close();
        }
    } 
}