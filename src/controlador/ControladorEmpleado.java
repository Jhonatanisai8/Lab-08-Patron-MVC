package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import procesos.ProcesosEmpleado;
import vista.frmRegistro;

public class ControladorEmpleado
        implements ActionListener {

    //atributos 
    private frmRegistro vista;
    private Empleado empleado;
    private String columnas[] = {"NUM", "CODIGO", "NOMBRES",
        "AÑOS EXPERIENCIA", "CARGO", "SUELDO BRUTO",
        "MONTO ADICIONAL", "SUELDO FINAL"};
    DefaultTableModel modelo;
    
    public ControladorEmpleado(frmRegistro r) {
        this.vista = r;
        this.modelo = new DefaultTableModel(null, columnas);
        this.vista.tblDatos.setModel(modelo);

        //para los eventos de los botones
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnNuevo.addActionListener(this);

        //llamamos a la clase encarga de iniciar y crear el empleado
        ProcesosEmpleado.presentacion(vista);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnRegistrar) {
            empleado = ProcesosEmpleado.leerDocente(vista);
            modelo.addRow(empleado.registro());
        }
        
        if (e.getSource() == this.vista.btnNuevo) {
            ProcesosEmpleado.limipiarCampos(vista);
        }
    }
    
}
