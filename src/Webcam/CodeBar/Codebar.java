package Webcam.CodeBar;
import Model.Socio;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Codebar {

    private static final String RUTA_CARPETA_CODIGOS = "src/com/barcodes/";

    public static void generarQR(Socio socio) {
        // Si el socio ya tiene un QR asignado, verificar si existe el archivo
        if (socio.getCodigoQR() != null) {
            File archivo = new File(socio.getCodigoQR());
            if (archivo.exists()) {
                System.out.println("El código QR ya existe para el socio: " + socio.getLegajo());
                return;
            }
        }

        String datos = String.valueOf(socio.getLegajo());

        // Configurar parámetros para generar el código QR
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        try {
            // Generar el código QR como una matriz de bits
            BitMatrix bitMatrix = new MultiFormatWriter().encode(datos, BarcodeFormat.QR_CODE, 200, 200, hints);

            // Crear la carpeta si no existe
            File carpeta = new File(RUTA_CARPETA_CODIGOS);
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            // Crear la ruta completa del archivo de imagen del código de barras
            String rutaArchivo = RUTA_CARPETA_CODIGOS + socio.getLegajo() + ".png";
            Path archivoCodigo = new File(rutaArchivo).toPath();

            // Guardar la matriz de bits como imagen PNG
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", archivoCodigo);

            // Asignar el nombre del archivo de imagen como código de barras del socio
            socio.setCodigoQR(rutaArchivo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
