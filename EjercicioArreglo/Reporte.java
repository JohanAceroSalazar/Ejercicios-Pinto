public class Reporte {
    public static void reportePacientes() {

        System.out.println("REPORTE DE PACIENTES");
        for (int i = 0; i < Datos.totalPaciente; i++) {
            String lugar = switch (Datos.estadoPaciente[i]) {
                case -1 -> "Sin ambulancia";
                case -2 -> "Carroza";
                default -> "Ambulancia " + (Datos.estadoPaciente[i] + 1);
            };
            System.out.println((i + 1) + ". " + Datos.Paciente[i] + " | " + lugar);
        }
        System.out.println("DIFUNTOS EN CARROZA");
        for (int i = 0; i < Datos.totalDifuntos; i++) {
            System.out.println((i + 1) + ". " + Datos.Carroza[i]);
        }
    }
}