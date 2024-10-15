package main;

import modelo.Empleado;

public class NewMain {

    public static void main(String[] args) {
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
