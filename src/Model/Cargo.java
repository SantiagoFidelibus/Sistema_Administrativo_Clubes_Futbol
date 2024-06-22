package Model;

public enum Cargo {
    RECEPCIONISTA,
    ENTRENADOR,
    PREPARADOR_FISICO,
    UTILERO,
    LIMPIEZA;

    private int salario;

    // Constructor privado para inicializar el salario
    private Cargo() {
        // Aquí puedes establecer un valor por defecto o dejarlo en cero
        this.salario = 0;
    }

    // Getter y Setter para el salario
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        switch (this) {
            case RECEPCIONISTA:
                return "Recepcionista";
            case ENTRENADOR:
                return "Entrenador";
            case PREPARADOR_FISICO:
                return "Preparador Físico";
            case UTILERO:
                return "Utilero";
            case LIMPIEZA:
                return "Limpieza";
            default:
                return super.toString();
        }
    }
}
