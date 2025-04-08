package pruebab;
public class Iva {

    public static double calcularImpuesto(double importeBase, String tipoImpuesto) {
        double porcentajeImpuesto = 0.0;
        switch (tipoImpuesto.toLowerCase()) {
        case "general":
            porcentajeImpuesto = 0.21;
            break;
        case "reducido":
            porcentajeImpuesto = 0.10;
            break;
        case "superreducido":
            porcentajeImpuesto = 0.04;
            break;
        default:
            porcentajeImpuesto = 0.0; // Tipo de impuesto incorrecto
            break;
        }
        return importeBase * porcentajeImpuesto;
    }

    public static double aplicarDescuento(double importeConImpuesto, String codigoDescuento) {
        double montoDescuento = 0.0;
        switch (codigoDescuento.toLowerCase()) {
        case "nopro":
            montoDescuento = 0.0;
            break;
        case "mitad":
            montoDescuento = importeConImpuesto / 2;
            break;
        case "meno5":
            montoDescuento = 5.0;
            break;
        case "5porc":
            montoDescuento = importeConImpuesto * 0.05;
            break;
        default:
            montoDescuento = 0.0; // Código de descuento incorrecto
            break;
        }
        return importeConImpuesto - montoDescuento;
    }
}
