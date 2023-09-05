public class Datos {
    private double valor = 0;
    private int tipo = 0;

    public Datos(double valorAConvertir, int tipo) {
        this.valor = valorAConvertir;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getTipo() {
        return tipo;
    }
}