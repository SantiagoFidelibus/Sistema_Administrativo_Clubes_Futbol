package datos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona implements Serializable, Pagos {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int legajo;
    protected String email;
    protected String fechaDeNacimiento;
    protected LocalDate fechaRegistroPago;
    protected LocalDate fechaVencimientoPago;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 00000000;
        this.legajo = 0;
        this.email = "";
        this.fechaDeNacimiento = "";
        this.fechaRegistroPago = null;
        this.fechaVencimientoPago = null;
    }

    public Persona(String nombre, String apellido, int dni, int legajo, String email, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.email = email;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaRegistroPago = null;
        this.fechaVencimientoPago = null;
        this.registrarPago();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public LocalDate getFechaRegistroPago() {
        return fechaRegistroPago;
    }

    public void setFechaRegistroPago(LocalDate fechaRegistroPago) {
        this.fechaRegistroPago = fechaRegistroPago;
    }

    public LocalDate getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    public void setFechaVencimientoPago(LocalDate fechaVencimientoPago) {
        this.fechaVencimientoPago = fechaVencimientoPago;
    }

    public void registrarPago() {
        LocalDate fechaActual = LocalDate.now();

        this.fechaRegistroPago = fechaActual;
        this.fechaVencimientoPago = fechaActual.plusMonths(1);
    }

    @Override
    public int calcularPago() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && legajo == persona.legajo && Objects.equals(fechaDeNacimiento, persona.fechaDeNacimiento) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, legajo, email, fechaDeNacimiento);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                ", email='" + email + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                '}';
    }
}
