package datos;

public enum Cargo {
    RECEPCIONISTA,
    ENTRENADOR,
    PREPARADOR_FISICO,
    UTILERO,
    LIMPIEZA;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
