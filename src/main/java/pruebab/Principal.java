package pruebab;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduzca la base imponible:");
		        double baseImponible = scanner.nextDouble();
		        double importeTotal = 0;

		        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
		        String tipoImpuesto = scanner.next();

		        System.out.println("Introduzca el código promocional (nopro, mitad, meno5, o 5porc):");
		        String codigoDescuento = scanner.next();

		        double importeIVA = Iva.calcularImpuesto(baseImponible, tipoImpuesto);
		        double precioConImpuestos = baseImponible + importeIVA;
		        double precioFinalConDescuento = Iva.aplicarDescuento(precioConImpuestos, codigoDescuento);

		    }
		}
