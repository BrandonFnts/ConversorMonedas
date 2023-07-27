public class Operaciones {
    double ope = 0;
    String res = "";

    public String conversorDinero(double moneda, int operacion) {
        switch (operacion) {
            case 0:
                ope = moneda*0.059;
                res = (moneda+" MXN es igual a "+ope+" USD");
                break;
            case 1:
                ope = moneda*0.054;
                res = (moneda+" MXN es igual a "+ope+" EUR");
                break;
            case 2:
                ope = moneda*0.046;
                res = (moneda+" MXN es igual a "+ope+" GBP");
                break;
            case 3:
                ope = moneda*8.27;
                res = (moneda+" MXN es igual a "+ope+" JPY");
                break;
            case 4:
                ope = moneda*76.09;
                res = (moneda+" MXN es igual a "+ope+" KRW");
                break;
            case 5:
                ope = moneda*16.88;
                res = (moneda+" USD es igual a "+ope+" MXN");
                break;
            case 6:
                ope = moneda*18.53;
                res = (moneda+" EUR es igual a "+ope+" MXN");
                break;
            case 7:
                ope = moneda*21.59;
                res = (moneda+" GBP es igual a "+ope+" MXN");
                break;
            case 8:
                ope = moneda*0.12;
                res = (moneda+" JPY es igual a "+ope+" MXN");
                break;
            case 9:
                ope = moneda*0.013;
                res = (moneda+" KRW es igual a "+ope+" MXN");
                break;
            default:
                break;
        }
        return res;
    }

    public String conversorMedida(double medida, int operacion) {
        switch (operacion) {
            case 0:
                ope = medida*1000;
                res = (medida+" m es igual a "+ope+" mm");
                break;
            case 1:
                ope = medida*100;
                res = (medida+" m es igual a "+ope+" cm");
                break;
            case 2:
                ope = medida/1000;
                res = (medida+" m es igual a "+ope+" km");
                break;
            case 3:
                ope = medida*39.3701;
                res = (medida+" m es igual a "+ope+" plg");
                break;
            case 4:
                ope = medida/1000;
                res = (medida+" mm es igual a "+ope+" m");
                break;
            case 5:
                ope = medida/100;
                res = (medida+" cm es igual a "+ope+" m");
                break;
            case 6:
                ope = medida*1000;
                res = (medida+" km es igual a "+ope+" m");
                break;
            case 7:
                ope = medida/39.3701;
                res = (medida+" plg es igual a "+ope+" m");
                break;
        }
        return res;
    }
}
