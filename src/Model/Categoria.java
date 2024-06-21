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
    private int cuota;

    static {
        CEBOLLITAS.cuota = 17000;
        INFANTIL.cuota = 18000;
        CADETES.cuota = 20000;
        JUVENIL.cuota = 21000;
        MAYORES.cuota = 24000;
        PRIMERA.cuota = 26000;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
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
