package Model;


public enum Categoria {
    CEBOLLITAS(5, 7),
    INFANTIL(8, 11),
    CADETES(12, 15),
    JUVENIL(16, 18),
    MAYORES(19, Integer.MAX_VALUE),
    PRIMERA(14, Integer.MAX_VALUE);

    private final int minEdad;
    private final int maxEdad;

    Categoria(int minEdad, int maxEdad) {
        this.minEdad = minEdad;
        this.maxEdad = maxEdad;
    }

    public int getMinEdad() {
        return minEdad;
    }

    public int getMaxEdad() {
        return maxEdad;
    }

    @Override
    public String toString() {
        return name();
    }

    public String toDisplayString() {
        if (maxEdad == Integer.MAX_VALUE) {
            return name() + " (+" + minEdad + ")";
        } else {
            return name() + " (" + minEdad + "-" + maxEdad + ")";
        }
    }
}
