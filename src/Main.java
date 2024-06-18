import com.login.Login;
import datos.Categoria;
import datos.ContenedoraSocio;
import datos.Socio;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       Login login = new Login();
       login.setVisible(true);
       login.pack();
       login.setLocationRelativeTo(null);

    }
}