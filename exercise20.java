import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEmpleados, contador;
        double sueldoEmpleado, sumaSueldos = 0, sueldoPromedio;

        System.out.println("Numero Empleados: ");
            numeroEmpleados = scanner.nextInt();

        for(contador = 1; contador <= numeroEmpleados; contador++){
            System.out.println("Sueldo del empleado " + contador + ": ");
                sueldoEmpleado = scanner.nextDouble();
                sumaSueldos = sumaSueldos + sueldoEmpleado;
        }
        sueldoPromedio = sumaSueldos / numeroEmpleados;
        System.out.println("Sueldo promedio: " + sueldoPromedio);
    }
}