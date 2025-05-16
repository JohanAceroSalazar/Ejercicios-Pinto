import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letras, SEMAF = "V";

        while (SEMAF.equals("V")){
            System.out.println("Ingrese letra: ");
            letras = scanner.nextLine();

        switch (letras.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                SEMAF = "R";
                break;
            default:
                SEMAF = "V";
                break;
        }
    }
        System.out.println("Se ingreso una vocal");
        scanner.close();
    }
}