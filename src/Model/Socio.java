package Model;

import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio extends Persona{

    private int telefono;
    private String domicilio;
    private String sexo;
    private boolean aptoMedico;
    private String obraSocial;
    private boolean aptoCuota;
    private Categoria categoria;
    private int cuota;
    private String codigoQR;

    public Socio() {
        this.telefono = 0;
        this.domicilio = "";
        this.sexo = "";
        this.aptoMedico = false;
        this.obraSocial = "";
        this.aptoCuota = false;
        this.categoria = null;
        this.cuota = 0;
    }

    public Socio(int telefono, String domicilio, String sexo, boolean aptoMedico, String obraSocial, boolean aptoCuota, Categoria categoria) {
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.sexo = sexo;
        this.aptoMedico = aptoMedico;
        this.obraSocial = obraSocial;
        this.aptoCuota = aptoCuota;
        this.categoria = categoria;
        this.cuota = 0;

    }

    public Socio(String nombre, String apellido, int dni, int legajo, String email, String fechaDeNacimiento, int telefono, String domicilio, String sexo, boolean aptoMedico, String obraSocial, boolean aptoCuota, Categoria categoria) {
        super(nombre, apellido, dni, legajo, email, fechaDeNacimiento);
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.sexo = sexo;
        this.aptoMedico = aptoMedico;
        this.obraSocial = obraSocial;
        this.aptoCuota = aptoCuota;
        this.categoria = categoria;
        this.cuota = 0;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAptoMedico() {
        return aptoMedico;
    }

    public void setAptoMedico(boolean aptoMedico) {
        this.aptoMedico = aptoMedico;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public boolean isAptoCuota() {
        return aptoCuota;
    }

    public void setAptoCuota(boolean aptoCuota) {
        if(aptoCuota){
            this.aptoCuota = aptoCuota;
        }else{
            this.aptoCuota = aptoCuota;
        }

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    public int calcularPagoConInteres() {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isAfter(this.fechaVencimientoPago) || fechaActual.isEqual(this.fechaVencimientoPago)) {
            long diasTranscurridos = ChronoUnit.DAYS.between(this.fechaVencimientoPago, fechaActual);
            int interesDiario = 50;
            int dias = (int) diasTranscurridos;
            return dias * interesDiario;
        }
        return 0;
    }

    public int pagarCuota(int importe) {
        LocalDate fechaActual = LocalDate.now();
        int intereses = calcularPagoConInteres();
        System.out.println("Intereses: " + intereses);

        this.cuota += intereses;
        System.out.println("Cuota total con intereses: " + this.cuota);

        this.cuota -= importe;
        System.out.println("Cuota restante después de pagar: " + this.cuota);

        if (this.cuota <= 0) {
            actualizarVencimientoPago(fechaActual, true);
        } else {
            actualizarVencimientoPago(fechaActual, false);
        }

        return this.cuota;
    }

    public void actualizarVencimientoPago(LocalDate today,boolean cuotaPagada) {
        if (cuotaPagada) {
            this.fechaRegistroPago = today;
            this.cuota = calcularPago(); // Reinicia la cuota para el próximo periodo

            // Actualiza la fecha de vencimiento del pago
            this.fechaVencimientoPago = this.fechaVencimientoPago.plusMonths(1);

            this.aptoCuota = true;
        } else {
            this.aptoCuota = false;
        }
    }


    @Override
    public int calcularPago() {
        switch (this.getCategoria()) {
            case CEBOLLITAS:
                this.cuota= 1000;
                break;
            case INFANTIL:
                this.cuota= 1500;
                break;
            case CADETES:
                this.cuota= 2000;
                break;
            case JUVENIL:
                this.cuota= 2500;
                break;
            case MAYORES:
                this.cuota= 3000;
                break;
            case PRIMERA:
                this.cuota= 3500;
                break;
            default:
                return 0;
        }
        return this.cuota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Socio socio = (Socio) o;
        return telefono == socio.telefono && aptoMedico == socio.aptoMedico && aptoCuota == socio.aptoCuota && Objects.equals(domicilio, socio.domicilio) && Objects.equals(sexo, socio.sexo) && Objects.equals(obraSocial, socio.obraSocial) && categoria == socio.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), telefono, domicilio, sexo, aptoMedico, obraSocial, aptoCuota, categoria);
    }

    @Override
    public String toString() {
        return "Socio{" +
                ", telefono=" + telefono +
                ", domicilio='" + domicilio + '\'' +
                ", sexo='" + sexo + '\'' +
                ", aptoMedico=" + aptoMedico +
                ", obraSocial='" + obraSocial + '\'' +
                ", aptoCuota=" + aptoCuota +
                ", categoria=" + categoria +
                "} " + super.toString();
    }

}