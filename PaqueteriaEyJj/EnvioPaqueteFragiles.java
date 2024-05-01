package PaqueteriaEyJj;



public class ClasePrincipal extends ClasePrincipal {
      @Override
    protected void calcularCostoEnvio() {
          System.out.println("Recuerda que la Opcion de envios fragiles tiene un costo adicional de 15 mil pesos colombianos");
     costoEnvio +=15.000;
    }
}