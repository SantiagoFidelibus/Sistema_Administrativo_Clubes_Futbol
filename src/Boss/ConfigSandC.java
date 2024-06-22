package Boss;
import Model.Cargo;
import Model.Categoria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigSandC {


    private static final String ARCHIVO_CONFIGURACION = "src/Boss/salaryAndCuotes.properties";

    // Método para cargar la configuración desde el archivo
    public static void cargarConfiguracion() {
        Properties propiedades = new Properties();
        try {
            FileInputStream input = new FileInputStream(ARCHIVO_CONFIGURACION);
            propiedades.load(input);
            input.close();

            // Cargar valores de salario para Cargo
            for (Cargo cargo : Cargo.values()) {
                String key = cargo.name() + ".salario";
                if (propiedades.containsKey(key)) {
                    cargo.setSalario(Integer.parseInt(propiedades.getProperty(key)));
                }
            }

            // Cargar valores de cuota para Categoria
            for (Categoria categoria : Categoria.values()) {
                String key = categoria.name() + ".cuota";
                if (propiedades.containsKey(key)) {
                    categoria.setCuota(Integer.parseInt(propiedades.getProperty(key)));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar el archivo de propiedades con los nuevos valores
    public static void actualizarArchivoDePropiedades() {
        Properties propiedades = new Properties();

        try {
            FileInputStream input = new FileInputStream(ARCHIVO_CONFIGURACION);
            propiedades.load(input);
            input.close();

            // Actualizar valores de salario para Cargo
            for (Cargo cargo : Cargo.values()) {
                String key = cargo.name() + ".salario";
                propiedades.setProperty(key, String.valueOf(cargo.getSalario()));
            }

            // Actualizar valores de cuota para Categoria
            for (Categoria categoria : Categoria.values()) {
                String key = categoria.name() + ".cuota";
                propiedades.setProperty(key, String.valueOf(categoria.getCuota()));
            }

            FileOutputStream output = new FileOutputStream(ARCHIVO_CONFIGURACION);
            propiedades.store(output, "Valores actualizados");
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}