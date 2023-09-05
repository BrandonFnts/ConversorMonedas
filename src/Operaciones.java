public class Operaciones {
    double operacion = 0;
    String resultado = "";

    public String conversorDinero(double moneda, int tipoConversion) {
        switch (tipoConversion) {
            case 0:
                operacion = moneda*0.059;
                resultado = (moneda+" MXN es igual a "+operacion+" USD");
                break;
            case 1:
                operacion = moneda*0.054;
                resultado = (moneda+" MXN es igual a "+operacion+" EUR");
                break;
            case 2:
                operacion = moneda*0.046;
                resultado = (moneda+" MXN es igual a "+operacion+" GBP");
                break;
            case 3:
                operacion = moneda*8.27;
                resultado = (moneda+" MXN es igual a "+operacion+" JPY");
                break;
            case 4:
                operacion = moneda*76.09;
                resultado = (moneda+" MXN es igual a "+operacion+" KRW");
                break;
            case 5:
                operacion = moneda*16.88;
                resultado = (moneda+" USD es igual a "+operacion+" MXN");
                break;
            case 6:
                operacion = moneda*18.53;
                resultado = (moneda+" EUR es igual a "+operacion+" MXN");
                break;
            case 7:
                operacion = moneda*21.59;
                resultado = (moneda+" GBP es igual a "+operacion+" MXN");
                break;
            case 8:
                operacion = moneda*0.12;
                resultado = (moneda+" JPY es igual a "+operacion+" MXN");
                break;
            case 9:
                operacion = moneda*0.013;
                resultado = (moneda+" KRW es igual a "+operacion+" MXN");
                break;
            default:
                break;
        }
        return resultado;
    }

    public String conversorMedida(double medida, int tipoConversion) {
        switch (tipoConversion) {
            case 0:
                operacion = medida*1000;
                resultado = (medida+" m es igual a "+operacion+" mm");
                break;
            case 1:
                operacion = medida*100;
                resultado = (medida+" m es igual a "+operacion+" cm");
                break;
            case 2:
                operacion = medida/1000;
                resultado = (medida+" m es igual a "+operacion+" km");
                break;
            case 3:
                operacion = medida*39.3701;
                resultado = (medida+" m es igual a "+operacion+" plg");
                break;
            case 4:
                operacion = medida/1000;
                resultado = (medida+" mm es igual a "+operacion+" m");
                break;
            case 5:
                operacion = medida/100;
                resultado = (medida+" cm es igual a "+operacion+" m");
                break;
            case 6:
                operacion = medida*1000;
                resultado = (medida+" km es igual a "+operacion+" m");
                break;
            case 7:
                operacion = medida/39.3701;
                resultado = (medida+" plg es igual a "+operacion+" m");
                break;
        }
        return resultado;
    }
}
