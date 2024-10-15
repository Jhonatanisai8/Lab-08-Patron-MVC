package modelo;

public class Empleado {

    private String codigo;
    private String nombres;
    private int añosExperiencia;
    private String cargo;

    private double sueldoBruto;
    private double montoAdicional;
    private double sueldoFinal;
    private static int contador = 0;

    public Empleado() {
        contador++;
    }

    public Object[] registro() {
        Object[] fila = {contador, codigo, nombres, añosExperiencia, cargo, sueldoBruto, montoAdicional,sueldoFinal};
        return fila;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getMontoAdicional() {
        return montoAdicional;
    }

    public void setMontoAdicional(double montoAdicional) {
        this.montoAdicional = montoAdicional;
    }

    public double getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

    private double calcularSueldoBruto() {
        double sueldo = 0;
        switch (cargo) {
            case "Asociado de Almacén":
                sueldo = 2000;
                break;
            case "Inspector de Calidad":
                sueldo = 2500;
                break;
            case "Gerente de Operaciones":
                sueldo = 3200;
                break;
        }
        return sueldo;
    }

    private double calculaMontoAdicional() {
        double monto = 0;
        if (getAñosExperiencia() <= 10) {
            monto = calcularSueldoBruto() * 0.03;
        } else {
            monto = calcularSueldoBruto() * 0.08;
        }
        return monto;
    }

    public void actualizarPagos(Empleado e) {
        sueldoBruto = e.calcularSueldoBruto();
        montoAdicional = e.calculaMontoAdicional();
        e.setSueldoBruto(sueldoBruto);
        e.setMontoAdicional(montoAdicional);
        //pagos finales

        sueldoFinal = sueldoBruto + montoAdicional;
        e.setSueldoFinal(sueldoFinal);
    }

}
