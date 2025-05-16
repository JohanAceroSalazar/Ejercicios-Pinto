import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letra;
        int contador, numeroVocales, numeroConsonantes;

        numeroVocales = 0;
        numeroConsonantes = 0;

        for(contador = 1; contador <= 10; contador++){
            System.out.println("Ingrese la letra" + contador + ": ");
        
            letra= scanner.nextLine();

            switch (letra.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                numeroVocales++;
                break;
            default:
                numeroConsonantes++;
                break;
            }
        }
            System.out.println("Número de vocales ingresadas: " + numeroVocales);
            System.out.println("Número de consonantes ingresadas: " + numeroConsonantes);
    }
}