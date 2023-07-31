public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Internacional",25000)
    };
    imprimirTiempoDeEnvio(envios);
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      if("Municipal".equals(coche.tipo)) System.out.println("Tiempo envio 12 horas");
      if("Internacional".equals(coche.tipo)) System.out.println("Tiempo envio 190 horas");
    }
  }
}
