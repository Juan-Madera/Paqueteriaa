package PaqueteriaEyJj;
import java.util.Scanner;

public class Salida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sn;

        do {
            System.out.println("------Paqueteria_EyJ------");
            System.out.println("1.Envío de paquetes normales");
            System.out.println("2.Envío de paquetes frágiles");
            System.out.println("3.Envío de documentos");
            System.out.println("4.Salir");
            System.out.print("Seleccione una opción: ");
            sn = scanner.nextInt();

            switch (sn) {
                case 1:
                    PaquetesNormales manejarEnvioNormales = new PaquetesNormales();
                    manejarEnvioNormales.manejarEnvioPaqueteria();
                    break;
                case 2:
                    ClasePrincipal manejarEnvioFragiles = new ClasePrincipal();
                    manejarEnvioFragiles.manejarEnvioPaqueteria();
                    break;
                case 3:
                    EnvioDocumentos manejarEnvioDocumentos = new EnvioDocumentos();
                    manejarEnvioDocumentos.manejarEnvioDocumentacion();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (sn != 4);
    }
}