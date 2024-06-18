package datos;

import java.util.HashMap;

public interface ABMGeneric <T, K>{
    public void alta(T elemento) throws Exception;
    public void modificacion(T elemento) throws Exception;
    public void baja(K id) throws Exception;
    public T buscar(K id) throws Exception;
    public HashMap<K, T> listar();
}
