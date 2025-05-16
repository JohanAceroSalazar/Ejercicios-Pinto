import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montoVenta, totalBonificacion;
        int categoria;

        System.out.println("Monto de venta: ");
            montoVenta = scanner.nextDouble();

        if (montoVenta >= 0 && montoVenta < 1000){
            categoria = 1;
        } else if (montoVenta >= 1000 && montoVenta < 5000) {
            categoria = 2;
        } else if (montoVenta >= 5000 && montoVenta < 20000) {
            categoria = 3;
        } else if (montoVenta >= 20000) {
            categoria = 4;
        } else {
            categoria = 0; 
        }

        switch (categoria) {
            case 1:
                totalBonificacion = (0 * montoVenta) / 100;
                break;
            case 2:
                totalBonificacion = (3 * montoVenta) / 100;
                break;
            case 3:
                totalBonificacion = (5 * montoVenta) / 100;
                break;
            case 4:
                totalBonificacion = (8 * montoVenta) / 100;
                break;
            default:
                totalBonificacion = 0;
                System.out.println("Monto inválido.");
                break;
        }
            System.out.println("Bonficanion Total: " + totalBonificacion);
            scanner.close();
    }
}