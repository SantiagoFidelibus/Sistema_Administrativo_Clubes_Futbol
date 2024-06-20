import Login.Login;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

       Login login = new Login();
       login.setVisible(true);
       login.pack();
       login.setLocationRelativeTo(null);

    }
}