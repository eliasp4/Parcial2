import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        Empleado juan = new Empleado("Juan", "Desarrollador", 50000);
        Empleado maria = new Empleado("María", "Diseñadora", 45000);
        Empleado pedro = new Empleado("Pedro", "Gerente", 60000);

        Empleados empleados = new Empleados(new Empleado[0]);
        empleados.añadirEmpleado(juan);
        empleados.añadirEmpleado(maria);
        empleados.añadirEmpleado(pedro);

      
        System.out.print(TextoConsola.INTRODUZCA_PORCENTAJE_AUMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println("Lista de Empleados:");
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
