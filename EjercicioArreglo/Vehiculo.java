public class Vehiculo {

    public static void asignarConductores() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Asignando conductor al carro " + (i + 1) + " ");
        
        for (int j = 0; j < 10; j++) {
            System.out.println((j + 1) + ". " + Datos.Conductor[j]);
        }

        System.out.print("Elige el número del conductor: ");
        int opcion = Integer.parseInt(Main.sc.nextLine()) - 1;

        if (opcion >= 0 && opcion < 10) {
            Datos.ambulancias[i] = Datos.Conductor[opcion];
        } else {
            System.out.println("Número fuera de rango. Intenta de nuevo.");
            i--; // repite el carro
        }
    }

    System.out.println("Conductores asignados");
    for (int i = 0; i < 10; i++) {
        System.out.println("Carro " + (i + 1) + ": " + Datos.ambulancias[i]);
        }
    }
}