package Containers;

import Interfaces.ABMGeneric;
import Model.Socio;
import Webcam.CodeBar.Codebar;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;

public class ContenedoraSocio implements ABMGeneric<Socio, Integer> {

    private HashMap<Integer, Socio> socios = new HashMap<>();

    public ContenedoraSocio(HashMap<Integer, Socio> socios) {
        this.socios = socios;
    }

    public ContenedoraSocio() {
    }

    @Override
    public void alta(Socio objeto) throws Exception {
        if (socios.containsKey(objeto.getLegajo())) {
            throw new Exception("El socio con legajo " + objeto.getLegajo() + " ya existe.");
        }
        socios.put(objeto.getLegajo(), objeto);
    }

    @Override
    public void modificacion(Socio objeto) throws Exception {
        if (!socios.containsKey(objeto.getLegajo())) {
            throw new Exception("El socio con legajo " + objeto.getLegajo() + " no existe.");
        }
        socios.remove(objeto.getLegajo());
        socios.put(objeto.getLegajo(), objeto);
    }

    @Override
    public void baja(Integer id) throws Exception {
        if (!socios.containsKey(id)) {
            throw new Exception("El socio con legajo " + id + " no existe.");
        }
        socios.remove(id);
    }

    @Override
    public Socio buscar(Integer id) throws Exception {
        Socio socio = socios.get(id);
        if (socio == null) {
            throw new Exception("El socio con legajo " + id + " no existe.");
        }
        return socio;
    }

    @Override
    public HashMap<Integer, Socio> listar() {
        if (socios.isEmpty()) {
            System.out.println("No hay socios registrados.");
        }
        return socios;
    }

    public void guardarSociosEnJson(String archivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.writeValue(new File(archivo), socios);
    }

    public void cargarSociosDeJson(String archivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        socios = mapper.readValue(new File(archivo), new TypeReference<HashMap<Integer, Socio>>() {
        });
    }

    public void verificarQr() {
        for (Socio socio :  socios.values()) {
            Codebar.generarQR(socio);
        }
    }

}
