public class App {
    //Nombre: NUnfa Isabel Rodríguez Briceño
    //Carnet: 2024-1649U
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Jose perez", "123", 48000.00);
        empleados[1] = new EmpleadoMedioTiempo("Maria Lopez", "456", 15.0, 20);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: " + empleado.calcularSalario());
        }
    }

}
