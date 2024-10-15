package main;

import controlador.ControladorEmpleado;
import modelo.Empleado;
import vista.frmRegistro;

public class NewMain {

    public static void main(String[] args) {
        frmRegistro de = new frmRegistro();
        ControladorEmpleado cd = new ControladorEmpleado(de);
    }
}
