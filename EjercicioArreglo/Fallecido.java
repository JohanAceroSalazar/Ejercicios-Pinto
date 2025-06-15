public class Fallecido {
    public static void marcarFallecidoTrasladar() {

        System.out.println("Pacientes vivos");
        int vivos = 0;
        for (int i = 0; i < Datos.totalPaciente; i++) {
            if (!Datos.Paciente[i].contains("FALLECIDO")) {
                vivos++;
                System.out.println((i + 1) + ". " + Datos.Paciente[i]);
            }
        }
        if (vivos == 0) { System.out.println("No hay pacientes vivos."); return; }

        System.out.print("Elige el número del paciente fallecido: ");
        int id = Integer.parseInt(Main.sc.nextLine()) - 1;

        if (id < 0 || id >= Datos.totalPaciente
                || Datos.Paciente[id].contains("FALLECIDO")) {
            System.out.println("Número inválido.");
            return;
        }

        Datos.Paciente[id] = Datos.Paciente[id].replace("VIVO", "FALLECIDO");
        Datos.estadoPaciente[id] = -2;    

        if (Datos.totalDifuntos >= Datos.MAX_DIFUNTOS) {
            System.out.println("La carroza está llena (15).");
            return;
        }

        Datos.Carroza[Datos.totalDifuntos++] = Datos.Paciente[id];
        System.out.println("Paciente marcado como fallecido y trasladado a la carroza.");
    }
}
