public class Recoger {
    public static void recogerPaciente(){
        if(Datos.totalPaciente >= 100){
            System.out.println("No hay pacientes registrados");
            return;
        }
        System.out.println("Pacientes Disponibles");
        for(int i = 0; i < Datos.totalPaciente; i++){
            if(Datos.AmbulanciaPaciente[i] == -1) {
                System.out.println((i + 1) + Datos.Paciente[i]);
            }
        }
        System.out.print("Elige el número del paciente a recoger: ");
    int idx = Integer.parseInt(Main.sc.nextLine()) - 1;

    if (idx < 0 || idx >= Datos.totalPaciente || Datos.AmbulanciaPaciente[idx] != -1) {
        System.out.println("Número inválido o paciente ya asignado.");
        return;
    }

    System.out.print("¿A qué ambulancia (1-10) lo envías?: ");
    int amb = Integer.parseInt(Main.sc.nextLine()) - 1;

    if (amb < 0 || amb >= 10) {
        System.out.println("Número de ambulancia fuera de rango.");
        return;
    }

    Datos.AmbulanciaPaciente[idx] = amb;      
    System.out.println("Paciente colocado en la ambulancia " + (amb + 1) + ".");
    }
}