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
    private int cuota;

    // Constructor para inicializar minEdad y maxEdad
    Categoria(int minEdad, int maxEdad) {
        this.minEdad = minEdad;
        this.maxEdad = maxEdad;
        // Aquí puedes establecer un valor por defecto o dejarlo en cero
        this.cuota = 0;
    }

    // Getter y Setter para la cuota
    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
}