package Sena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("1. Registrar sena ");
            System.out.println("2. Definir cantidad de ambientes, asignar ambiente a la linea y programa de formacion, identificar si el ambiente es especializado");
            System.out.println("3. Registrar instructor, asociarlo a una linea y programa, asignarle un horario");
            System.out.println("4. Descripcion ambientes, asignar un instructor a un ambiente");
            System.out.println("5. Asignar un horario a los aprendices");
            System.out.println("6. Mostrar Programas de formacion por linea");
            System.out.println("7. Reporte de instructores registrados");
            System.out.println("8. Reporte de centro y sede, instructor en el ambiente asignado, cantidad de aprendices y descripcion del ambiente");
            System.out.println("9. Reporte de la linea y programa de formacion, ambiente al que pertenece y aprendices que hay por ambiente");
            System.out.println("10. Reporte horario por jornada, cantidad de alumnos por jornada e instructores en cada jornada");
            System.out.println("0. Para salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Sena.registrarSena();
                break;

                case 2:
                    Sena.registrarAmbiente();
                break;

                case 3:
                    Sena.registrarIntructor();
                break;

                case 4:
                    Sena.descripcionAmbientes();
                break;

                case 5:
                    Sena.horarioAprendiz();
                break;

                case 6:
                    Sena.mostrarProgramasLinea();
                break;

                case 7:
                    Sena.reporteInstructores();
                break;

                case 8:
                    Sena.reporteAsignacionesAmbientes();
                break;

                case 9:
                    Sena.reporteAprendices();
                break;

                case 10:
                    Sena.reporteHorarios();
                break;

                case 0:
                    System.out.println("Hasta luego");
                break;
            
                default:
                    System.out.println("Opcion invalida");
                break;
            }

        } while(opcion !=0);
        sc.close();
    }
}
