import java.util.Arrays;
import javax.swing.JOptionPane;

public class Vista {

    public double solicitarDinero() {
        double dinero = 0;
        boolean esValido = false;
    
        do {
            String valorIngresado = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor del dinero:",
                    "Solicitar Dinero",
                    JOptionPane.QUESTION_MESSAGE);
    
            try {
                dinero = Double.parseDouble(valorIngresado);
                esValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Valor no válido. Ingresa solo números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                esValido = false;
            }
        } while (!esValido);
    
        return dinero;
    }

    public double solicitarMedida() {
        double dinero = 0;
        boolean esValido = false;
    
        do {
            String valorIngresado = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor de la medida:",
                    "Solicitar Medida",
                    JOptionPane.QUESTION_MESSAGE);
    
            try {
                dinero = Double.parseDouble(valorIngresado);
                esValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Valor no válido. Ingresa solo números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                esValido = false;
            }
        } while (!esValido);
    
        return dinero;
    }

    public void mensajeFinal() {
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }

    public void visualizarResultado(String r) {
        JOptionPane.showMessageDialog(null, r);
    }

    public Integer tipoConversion() {
        Object[] opciones = { "Moneda", "Medida" };

        // Mostrar el cuadro de diálogo con el menú desplegable
        Object opcionSeleccionada = JOptionPane.showInputDialog(
                null,            // Componente padre (null para el centro de la pantalla)
                "Selecciona una opción", // Mensaje del cuadro de diálogo
                "Elegir",                  // Título del cuadro de diálogo
                JOptionPane.QUESTION_MESSAGE,    // Tipo de mensaje (pregunta)
                null,                       // Icono personalizado (null para el por defecto)
                opciones,                        // Opciones personalizadas (array de objetos)
                opciones[0]);                    // Opción seleccionada por defecto

        // Verificar si el usuario hizo una selección y retornar la opción seleccionada como una cadena
        if (opcionSeleccionada != null) {
            int indiceSeleccionado = Arrays.asList(opciones).indexOf(opcionSeleccionada);
            return indiceSeleccionado;
        } else {
            return null; 
        }
    }

    public Integer salirLoop() {
        // Mostrar el cuadro de diálogo con el menú desplegable
        int opcionSeleccionada = JOptionPane.showConfirmDialog(
                null,
                "¿Quieres continuar?",
                "Elegir",
                JOptionPane.YES_NO_OPTION);

        // Verificar si el usuario hizo una selección y retornar la opción seleccionada como un Integer
        if (opcionSeleccionada == JOptionPane.YES_OPTION || opcionSeleccionada == JOptionPane.NO_OPTION) {
            return opcionSeleccionada;
        } else {
            return null;
        }
    }
    
    public Integer tipoCambioMonetario() {
        Object[] opciones = {"MXN->Dolar", "MXN->Euros", "MXN->Libras Esterlinas", "MXN->Yen Japonés", "MXN->Won sul-coreano", "Dolar->MXN", "Euros->MXN", "Libras Esterlinas->MXN", "Yen Japonés-MXN", "Won sul-coreano->MXN" };

        // Mostrar el cuadro de diálogo con el menú desplegable
        Object opcionSeleccionada = JOptionPane.showInputDialog(
                null,                     // Componente padre (null para el centro de la pantalla)
                "Selecciona una opción",  // Mensaje del cuadro de diálogo
                "Elegir",                 // Título del cuadro de diálogo
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                null,                     // Icono personalizado (null para el por defecto)
                opciones,                 // Opciones personalizadas (array de objetos)
                opciones[0]);             // Opción seleccionada por defecto
        // Verificar si el usuario hizo una selección y retornar la opción seleccionada como una cadena
        if (opcionSeleccionada != null) {
            int indiceSeleccionado = Arrays.asList(opciones).indexOf(opcionSeleccionada);
            return indiceSeleccionado;
        } else {
            return null; 
        }  
    }

    public Integer tipoCambioMedidas() {
        Object[] opciones = {"Metros->Milimetros", "Metros->Centímetros", "Metros->Kilometros", "Metros->Pulgadas", "Milimetros->Metros", "Centimetros->Metros", "Kilometros->Metros", "Pulgadas->Metros"};

        // Mostrar el cuadro de diálogo con el menú desplegable
        Object opcionSeleccionada = JOptionPane.showInputDialog(
                null,                     // Componente padre (null para el centro de la pantalla)
                "Selecciona una opción",  // Mensaje del cuadro de diálogo
                "Elegir",                 // Título del cuadro de diálogo
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                null,                     // Icono personalizado (null para el por defecto)
                opciones,                 // Opciones personalizadas (array de objetos)
                opciones[0]);             // Opción seleccionada por defecto
        // Verificar si el usuario hizo una selección y retornar la opción seleccionada como una cadena
        if (opcionSeleccionada != null) {
            int indiceSeleccionado = Arrays.asList(opciones).indexOf(opcionSeleccionada);
            return indiceSeleccionado;
        } else {
            return null; 
        }   
    }
}
