public class Controlador {
    public void control() {
        // Declara variables globales
        double valorAConvertir = 0;
        int tipoConversion = 0;
        String resultado = "";
        // Iniciar Objeto de la clase Vista y Operaciones
        Vista vista = new Vista();
        Operaciones opera = new Operaciones();
        do {
            // Pedir el tipo de conversión a realizar
            int tipo = vista.tipoConversion();
            // Si el tipo de coversión es Moneda se llama al metodo Conversor de dinero
            if (tipo == 0) {
                // Solicitar valores de la moneda y el tipo de cambio
                valorAConvertir = vista.solicitarDinero();
                tipoConversion = vista.tipoCambioMonetario();
                // Encapsular los datos mediante el cosntructor de la clase Datos
                Datos dat = new Datos(valorAConvertir, tipoConversion);
                // Realizar Operación de conversión
                resultado = opera.conversorDinero(dat.getValor(), dat.getTipo());
                vista.visualizarResultado(resultado);
                // Si el tipo de coversión es Medida se llama al metodo Conversor de medidas
            } else if (tipo == 1) {
                valorAConvertir = vista.solicitarMedida();
                tipoConversion = vista.tipoCambioMedidas();
                Datos dat = new Datos(valorAConvertir, tipoConversion);
                resultado = opera.conversorMedida(dat.getValor(), dat.getTipo());
                vista.visualizarResultado(resultado);
            }
        } while (vista.salirLoop() != 1);
        vista.mensaje();
    }
}
