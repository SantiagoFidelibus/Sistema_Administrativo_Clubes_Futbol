package Model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Empleado extends Persona {
    private String contraseña;
    private Cargo cargo;
    private boolean cobro;
    private int salario;

    public Empleado() {
        this.contraseña = "";
        this.cargo = null;
        this.cobro = false;
        this.salario = 0;
    }

    public Empleado(String contraseña, Cargo cargo, boolean cobro) {
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.cobro = cobro;
        this.salario = calcularPago();
    }

    public Empleado(String nombre, String apellido, int dni, int legajo, String email, String fechaDeNacimiento, String contraseña, Cargo cargo, boolean cobro) {
        super(nombre, apellido, dni, legajo, email, fechaDeNacimiento);
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.cobro = cobro;
        this.salario = calcularPago();
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
                this.salario=345000;
                return 345000;
            case ENTRENADOR:
                this.salario=750000;
                return 750000;
            case PREPARADOR_FISICO:
                this.salario=480000;
                return 480000;
            case UTILERO:
                this.salario=320000;
                return 320000;
            case LIMPIEZA:
                this.salario=270000;
                return 270000;
            default:
                return 0;
        }
    }




    public int calcularPagoConInteres() {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isAfter(this.fechaVencimientoPago.plusDays(5))) {
            long diasTranscurridos = ChronoUnit.DAYS.between(this.fechaVencimientoPago, fechaActual);
            int interesDiario = 1200;
            int dias = (int) diasTranscurridos;
            return (dias * interesDiario)-(5 * interesDiario);
        }
        return 0;
    }

    public int pagarCuota(int importe) {
        LocalDate fechaActual = LocalDate.now();
        int intereses = calcularPagoConInteres();
        System.out.println("Intereses: " + intereses);

        this.salario += intereses;
        System.out.println("Cuota total con intereses: " + this.salario);

        this.salario -= importe;
        System.out.println("Cuota restante después de pagar: " + this.salario);

        if (this.salario <= 0) {
            actualizarVencimientoPago(fechaActual, true);
        } else {
            actualizarVencimientoPago(fechaActual, false);
        }

        return this.salario;
    }

    public void actualizarVencimientoPago(LocalDate today,boolean cuotaPagada) {
        if (cuotaPagada) {
            this.fechaRegistroPago = today;
            this.salario = calcularPago(); // Reinicia la cuota para el próximo periodo

            // Actualiza la fecha de vencimiento del pago
            this.fechaVencimientoPago = this.fechaVencimientoPago.plusMonths(1);

            this.cobro = true;
        } else {
            this.cobro = false;
        }
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
