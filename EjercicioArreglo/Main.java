import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 6) {
            System.out.println(" Menú ");
            System.out.println("1. Registrar conductores");
            System.out.println("2. Asignar conductores a carros");
            System.out.println("3. Registrar pacientes");          
            System.out.println("4. Recoger paciente");             
            System.out.println("5. Marcar fallecido y trasladar");
            System.out.println("6. Reporte de pacientes");        
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Conductor.registrarConductores();
                    break;
                case 2:
                    Vehiculo.asignarConductores();
                    break;
                case 3:
                    Pacientes.registrarPacientes();
                    break;
                case 4:
                    Recoger.recogerPaciente();
                    break;
                case 5:
                    Fallecido.marcarFallecidoTrasladar();
                    break;
                case 6:
                    Reporte.reportePacientes();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}