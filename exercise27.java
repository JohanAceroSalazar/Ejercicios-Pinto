import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero, segundoNumero, operador;
        double resultado;

        System.out.print("Primer número: ");
        primerNumero = scanner.nextInt();

        System.out.print("Segundo número: ");
        segundoNumero = scanner.nextInt();

        System.out.print("Operador (1=suma, 2=resta, 3=multiplicacion, 4=potencia): ");
        operador = scanner.nextInt();

        switch (operador) {
            case 1:
                resultado = primerNumero + segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = primerNumero - segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = primerNumero * segundoNumero;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = Math.pow(primerNumero, segundoNumero);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }

        scanner.close();
    }
}