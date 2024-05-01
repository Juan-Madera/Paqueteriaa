package PaqueteriaEyJj;

import java.util.Scanner;

public abstract class ClasePrincipal {
    protected String ciudadSalida;
    protected String ciudadDestino;
    protected int codigoPostal;
    protected String nombreDestinatario;
    protected String celularDestinatario;
    protected double costoEnvio;
    protected double altura;
    protected double anchura;
    protected double largo;
    protected double peso;

    public void manejarEnvioDocumentacion() {
        documentacion();
        calcularCostoEnvio();
        mostrarDatosEnvio();
        imprimirCostoEnvio();
    }
    public void manejarEnvioPaqueteria() {
        documentacion();
        paqueteria();
        calcularCostoEnvio();
        mostrarDatosEnvio();
        imprimirCostoEnvio();
    }
    
    protected void documentacion() {
        Scanner sn = new Scanner(System.in);

        System.out.print("Ingrese la ciudad de salida: ");
        ciudadSalida = sn.nextLine();
        System.out.print("Ingrese la ciudad de destino: ");
        ciudadDestino = sn.nextLine();
        System.out.print("Ingrese el código postal de la ciudad: ");
        codigoPostal = sn.nextInt();
        sn.nextLine();

        System.out.print("Ingrese el nombre de quien recibe: ");
        nombreDestinatario = sn.nextLine();
        System.out.print("Ingrese el número de celular de quien recibe: ");
        celularDestinatario = sn.nextLine();
        
       System.out.print("¿Desea cambiar los datos? (Sí/No): ");
    String respuesta = sn.next();
    if (respuesta.equalsIgnoreCase("Sí")) {
        System.out.println("Ingrese los nuevos datos:");
        sn.nextLine(); // Consumir el salto de línea antes de volver a leer
        System.out.print("Nueva ciudad de salida: ");
        ciudadSalida = sn.nextLine();
        System.out.print("Nueva ciudad de destino: ");
        ciudadDestino = sn.nextLine();
        System.out.print("Nuevo código postal de la ciudad: ");
        codigoPostal = sn.nextInt();
        sn.nextLine(); // Consumir el salto de línea
        System.out.print("Nuevo nombre de quien recibe: ");
        nombreDestinatario = sn.nextLine();
        System.out.print("Nuevo número de celular de quien recibe: ");
        celularDestinatario = sn.nextLine();
    }
}
    
    protected  void paqueteria(){
         Scanner sn = new Scanner(System.in);

        sn.nextLine();
        System.out.print("Ingrese la altura del paquete: ");
        altura = sn.nextDouble();
        System.out.print("Ingrese la anchura del paquete: ");
        anchura = sn.nextDouble();
        System.out.print("Ingrese el largo del paquete: ");
        largo = sn.nextDouble();
        System.out.print("Ingrese el peso del paquete: ");
        peso = sn.nextDouble();
        System.out.print("Ingrese la distancia en kilómetros: ");
        double distancia = sn.nextDouble();
        System.out.print("¿Desea entrega rápida? (Sí/No): ");
        String respuesta = sn.next();
        boolean entregaRapida = respuesta.equalsIgnoreCase("Sí");

        if (largo> 600 || anchura > 600 || altura > 600) {//excepción
            System.out.println("El paquete excede las dimensiones máximas permitidas (600 cm).");
            return;
        }
        double volumen = largo * anchura * altura;
        costoEnvio = (volumen / 1000000) * 500; // Se cobra $500 por cada metro cúbico
        costoEnvio += (peso / 1000) * 100; // Se cobra $100 por cada kilogramo

        if (entregaRapida) {
            costoEnvio += 15000; // Costo adicional por entrega rápida
        }
        costoEnvio += distancia * 0.50; // Se cobra $0.50 por cada kilómetro
    }
    
    protected abstract void calcularCostoEnvio();

    protected void mostrarDatosEnvio() {
        System.out.println("\nPor favor, verifique los datos del envío:");
        System.out.println("Ciudad de salida: " + ciudadSalida);
        System.out.println("Ciudad de destino: " + ciudadDestino);
        System.out.println("Código postal: " + codigoPostal);
        System.out.println("Nombre de quien recibe: " + nombreDestinatario);
        System.out.println("Número de celular de quien recibe: " + celularDestinatario);
    }
    protected void imprimirCostoEnvio() {
        System.out.println("El costo total del envío es: $" + costoEnvio+" mil pesos colombianos");
        System.out.println("Gracias por elegir paqueteria EyJ");
    }
}