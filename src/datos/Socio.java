package datos;

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
        this.cuota = calcularPago();

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
        this.cuota = calcularPago();
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


    public int calcularPagoConInteres(int importe) {
        LocalDate fechaActual = LocalDate.now();
        long diasTranscurridos = this.fechaVencimientoPago.until(fechaActual).getDays();
        int interesDiario = 50;
        this.cuota += (int) (diasTranscurridos * interesDiario);
        this.cuota -= importe;
        if(cuota<=0){
            actualizarVencimientoPago(fechaActual,true);
        }else{
            actualizarVencimientoPago(fechaActual,false);
        }
        return cuota;
    }

    public void actualizarVencimientoPago(LocalDate today,boolean ToF) {
        LocalDate fechaElegida = today;
        if (ToF){
            this.fechaRegistroPago = fechaElegida;
            this.cuota = calcularPago();
        this.fechaVencimientoPago= today.plusMonths(1);
        this.aptoCuota = true;
        }else{
            this.aptoCuota = false;
        }
    }




    @Override
    public int calcularPago() {
        switch (this.getCategoria()) {
            case CEBOLLITAS:
                return 1000;
            case INFANTIL:
                return 1500;
            case CADETES:
                return 2000;
            case JUVENIL:
                return 2500;
            case MAYORES:
                return 3000;
            case PRIMERA:
                return 3500;
            default:
                return 0;
        }
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