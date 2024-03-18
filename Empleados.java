public class Empleados {
    private Empleado[] empleados_lista;

    public Empleados(Empleado[] empleados) {
        this.empleados_lista = empleados;
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados_lista) {
            System.out.println(empleado);
        }
    }

    public void añadirEmpleado(Empleado empleado) {
        Empleado[] nuevosEmpleados = new Empleado[empleados_lista.length + 1];
        System.arraycopy(empleados_lista, 0, nuevosEmpleados, 0, empleados_lista.length);
        nuevosEmpleados[empleados_lista.length] = empleado;
        empleados_lista = nuevosEmpleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados_lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}
