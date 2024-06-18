package datos;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona {
    private String contraseña;
    private Cargo cargo;
    private boolean cobro;

    public Empleado() {
        this.contraseña = "";
        this.cargo = null;
        this.cobro = false;
    }

    public Empleado(String contraseña, Cargo cargo, boolean cobro) {
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.cobro = cobro;
    }

    public Empleado(String nombre, String apellido, int dni, int legajo, String email, String fechaDeNacimiento, String contraseña, Cargo cargo, boolean cobro) {
        super(nombre, apellido, dni, legajo, email, fechaDeNacimiento);
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.cobro = cobro;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public boolean isCobro() {
        return cobro;
    }

    public void setCobro(boolean cobro) {
        this.cobro = cobro;
    }

    public void VerificarEntrada(Socio socio){
        //Probablemente usemos Json
        if(!socio.isAptoMedico()){
            //Error
        }else if(socio.isAptoCuota()){

        }
    }

    @Override
    public int calcularPago() {
        switch (this.getCargo()) {
            case RECEPCIONISTA:
                return 2525;
            case ENTRENADOR:
                return 652;
            case PREPARADOR_FISICO:
                return 545;
            case UTILERO:
                return 5454;
            case LIMPIEZA:
                return 658;
            default:
                return 0;
        }
    }

    public void vencimientoPago() {
        LocalDate fechaActual = LocalDate.now();

        if (this.fechaVencimientoPago != null && this.fechaVencimientoPago.isEqual(fechaActual)) {
            this.setCobro(false);
        }
    }

    public int calcularPagoConInteres() {
        LocalDate fechaActual = LocalDate.now();
        long diasTranscurridos = this.fechaVencimientoPago.until(fechaActual).getDays();
        int interesDiario = 15;

        int cuota = this.calcularPago();
        cuota += diasTranscurridos * interesDiario;

        return cuota;
    }

    public void actualizarVencimientoPago(int year, int month, int day, boolean ToF) {
        LocalDate fechaElegida = LocalDate.of(year, month, day);
        this.fechaRegistroPago = fechaElegida;
        if(ToF)
            this.fechaVencimientoPago.plusMonths(1);
        this.vencimientoPago();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return cobro == empleado.cobro && Objects.equals(contraseña, empleado.contraseña) && cargo == empleado.cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contraseña, cargo, cobro);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "contraseña='" + contraseña + '\'' +
                ", cargo=" + cargo +
                ", cobro=" + cobro +
                "} " + super.toString();
    }
}
