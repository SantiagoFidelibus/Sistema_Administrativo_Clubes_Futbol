package datos;

//import enviocorreo.EnvioCorreo;

import java.util.HashMap;
import java.util.Objects;

public class MenuPrincipal{
    private HashMap<Integer, Socio> socios;
    private HashMap<Integer, Empleado> empleados;

    public MenuPrincipal() {
        this.socios = new HashMap<>();
        this.empleados = new HashMap<>();
    }

    public void verificarPagos(Socio socio){
    if(!socio.isAptoCuota()){
        sendEmailDeuda(socio.email,socio.calcularPago());
        socio.setAptoCuota(true);
    }
    }

    public void pagarSueldo(Empleado empleado) {
        if(!empleado.isCobro()){
          sendEmailCobro(empleado.email,empleado.calcularPago());
          empleado.setCobro(true);
       }
    }

    public void sendEmailDeuda(String email, double Pago) {
        String subject = "NOTIFICACION DE DEUDA:";
        String content = "<html><body>"
                + "<h1>¡Su cuota de Socio ha vencido!</h1>"
                + "<p>Porfavor vaya a administracion a abonar el mes entrante para seguir con sus actividades.</p>"
                + "<img src=\"cid:image\">"
                + "</body></html>";
        String imagePath = "src/icons/DEUDA.png";

//        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
//        envio.createEmail();
//        envio.sendEmail();
    }
    public void sendEmailCobro(String email, double Pago) {
        String subject = "ACTUALIZACION SALARIO:";
        String content = "<html><body>"
                + "<h1>¡Se le ha abonado el sueldo!</h1>"
                + "<p>Disculpe la demora para abonarle el sueldo, sera bonificado con intereses. Su puesto es muy importante para el club y es lo minimo que podemos hacer !</p>"
                + "<img src=\"cid:image\">"
                + "</body></html>";
        String imagePath = "src/icons/COBRO.png";

//        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
//        envio.createEmail();
//        envio.sendEmail();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuPrincipal that = (MenuPrincipal) o;
        return Objects.equals(socios, that.socios) && Objects.equals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socios, empleados);
    }

    @Override
    public String toString() {
        return "MenuPrincipal{" +
                "socios=" + socios +
                ", empleados=" + empleados +
                '}';
    }
}
