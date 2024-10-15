package procesos;

import modelo.Empleado;
import vista.frmRegistro;

public class ProcesosEmpleado {

    public static void presentacion(frmRegistro registro) {
        registro.setTitle("registro de datos de empleados".toUpperCase());
        registro.setLocationRelativeTo(null);

        //para el tema de los cargos
        registro.cbxCargo.removeAllItems();

        registro.cbxCargo.addItem("Asociado de Almacén");
        registro.cbxCargo.addItem("Inspector de Calidad");
        registro.cbxCargo.addItem("Gerente de Operaciones");

        registro.setVisible(true);
    }

    //para limpiar los campos de las entradas
    public static void limipiarCampos(frmRegistro r) {
        r.txtNombres.setText("");
        r.txtCodigo.setText("");
        r.spnExperiencia.setValue(0);
        r.cbxCargo.setSelectedIndex(0);
        r.txtNombres.requestFocus();
    }

    public static Empleado leerDocente(frmRegistro r) {
        Empleado e = new Empleado();
        e.setNombres(r.txtNombres.getText());
        e.setCodigo(r.txtCodigo.getText());
        e.setCargo(r.cbxCargo.getSelectedItem().toString());
        e.setAñosExperiencia(Integer.parseInt(r.spnExperiencia.getValue().toString()));
        e.actualizarPagos(e);
        return e;
    }

}
