package main;

import controlador.ControladorEmpleado;
import modelo.Empleado;
import vista.frmRegistro;

public class NewMain {

    public static void main(String[] args) {
        frmRegistro de = new frmRegistro();
        ControladorEmpleado cd = new ControladorEmpleado(de);
    }

    public static void ejemplo() {
        System.out.println("HOLA MUNDO");
        Empleado empleado = new Empleado();
        empleado.setAñosExperiencia(5);
        empleado.setCargo("Inspector de Calidad");
        empleado.setCodigo("12312");
        empleado.setNombres("Asociado de Almacén");
        empleado.actualizarPagos(empleado);

        System.out.println("Pago Bruto: " + empleado.getSueldoBruto());
        System.out.println("Pago Adicional: " + empleado.getMontoAdicional());
        System.out.println("Pago Final: " + empleado.getSueldoFinal());
    }

}
