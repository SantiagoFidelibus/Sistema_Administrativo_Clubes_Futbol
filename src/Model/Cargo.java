package Model;

public enum Cargo {
    RECEPCIONISTA,
    ENTRENADOR,
    PREPARADOR_FISICO,
    UTILERO,
    LIMPIEZA;
    private int salario;


    static {
        RECEPCIONISTA.salario = 345000;
        ENTRENADOR.salario = 750000;
        PREPARADOR_FISICO.salario = 480000;
        UTILERO.salario = 320000;
        LIMPIEZA.salario = 270000;
    }


    public void setSalario(int salario) {
        this.salario = salario;
    }


    public int getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
