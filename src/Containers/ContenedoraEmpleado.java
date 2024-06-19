package Containers;

import Interfaces.ABMGeneric;
import Model.Empleado;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;


public class ContenedoraEmpleado implements ABMGeneric<Empleado, Integer> {
    private HashMap<Integer, Empleado> empleados = new HashMap<>();

    public ContenedoraEmpleado(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public ContenedoraEmpleado() {
    }

    @Override
    public void alta(Empleado objeto) throws Exception {
        if (empleados.containsKey(objeto.getLegajo())) {
            throw new Exception("El empleado con legajo " + objeto.getLegajo() + " ya existe.");
        }
        empleados.put(objeto.getLegajo(), objeto);
    }

    @Override
    public void modificacion(Empleado objeto) throws Exception {
        if (!empleados.containsKey(objeto.getLegajo())) {
            throw new Exception("El empleado con legajo " + objeto.getLegajo() + " no existe.");
        }
        empleados.remove(objeto.getLegajo());
        empleados.put(objeto.getLegajo(), objeto);
    }

    @Override
    public void baja(Integer id) throws Exception {
        if (!empleados.containsKey(id)) {
            throw new Exception("El empleado con legajo " + id + " no existe.");
        }
        empleados.remove(id);
    }

    @Override
    public Empleado buscar(Integer id) throws Exception {
        Empleado empleado = empleados.get(id);
        if (empleado == null) {
            throw new Exception("El empleado con legajo " + id + " no existe.");
        }
        return empleado;
    }

    @Override
    public HashMap<Integer, Empleado> listar() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        }
        return empleados;
    }

    public void guardarEmpleadosEnJson(String archivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
        mapper.writeValue(new File(archivo), empleados);
    }

    public void cargarEmpleadosDeJson(String archivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        empleados = mapper.readValue(new File(archivo), new TypeReference<HashMap<Integer, Empleado>>() {});
    }
}
