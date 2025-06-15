public class Pacientes {

    public static void registrarPacientes(){

        for(int i = 0; i < 100; i ++){
            System.out.println("Introduce el nombre del paciente " + (i + 1) + ":");
            String nombre = Main.sc.nextLine();

            System.out.println("Introduce la edad del paciente " + (i + 1) + ":");
            String edad = Main.sc.nextLine();

            System.out.println("Introduce el número de teléfono del paciente " + (i + 1) + ":");
            String telefono = Main.sc.nextLine();

            System.out.println("Introduce el tipo de sangre " + (i + 1) + ":");
            String rh = Main.sc.nextLine();
        }
        System.out.println("Pacientes registrados:");
        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + ". " + Datos.Paciente[i]);
        }
    }
}