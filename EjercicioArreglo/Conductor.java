public class Conductor {

    public static void registrarConductores() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el nombre del conductor " + (i + 1) + ":");
            String nombre = Main.sc.nextLine();

            System.out.println("Introduce el apellido del conductor " + (i + 1) + ":");
            String apellido = Main.sc.nextLine();

            System.out.println("Introduce el número de teléfono del conductor " + (i + 1) + ":");
            String telefono = Main.sc.nextLine();

            Datos.Conductor[i] = nombre + " " + apellido + " - Tel: " + telefono;
        }

        System.out.println("Conductores registrados:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + Datos.Conductor[i]);
        }
    }
}