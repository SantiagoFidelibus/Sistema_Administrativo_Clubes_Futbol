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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public int calcularPago() {
        this.salario = this.getCargo().getSalario();
        return this.salario;
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

            this.cobro = true;
            // Actualiza la fecha de vencimiento del pago
            this.fechaVencimientoPago = this.fechaVencimientoPago.plusMonths(1);
            this.salario = calcularPago(); // Reinicia la cuota para el próximo periodo

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
