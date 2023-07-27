public class Controlador {
    public void control() {
        // Declara variables globales
        double moneda = 0;
        int tipoConversion = 0;
        String res = "";
        // Iniciar Objeto de la clase Vista y Operaciones
        Vista vis = new Vista();
        Operaciones ope = new Operaciones();
        do {
            // Pedir el tipo de conversión a realizar
            int tipo = vis.tipoConversion();
            // Si el tipo de coversión es Moneda se llama al metodo Conversor de dinero
            if (tipo == 0) {
                // Solicitar valores de la moneda y el tipo de cambio
                moneda = vis.solicitarDinero();
                tipoConversion = vis.tipoCambioMonetario();
                // Encapsular los datos mediante el cosntructor de la clase Datos
                Datos dat = new Datos(moneda, tipoConversion);
                // Realizar Operación de conversión
                res = ope.conversorDinero(dat.getValor(), dat.getTipo());
                vis.visualizarResultado(res);
                // Si el tipo de coversión es Medida se llama al metodo Conversor de medidas
            } else if (tipo == 1) {
                moneda = vis.solicitarMedida();
                tipoConversion = vis.tipoCambioMedidas();
                Datos dat = new Datos(moneda, tipoConversion);
                res = ope.conversorMedida(dat.getValor(), dat.getTipo());
                vis.visualizarResultado(res);
            }
        } while (vis.salirLoop() != 1);
        vis.mensaje();
    }
}
