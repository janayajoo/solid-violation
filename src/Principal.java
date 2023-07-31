public class  Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000, 12),
        new Envio("Internacional",25000, 190)
    };
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      System.out.println(coche.tipo + ": tiempo envio " + coche.tiempo + "horas");
    }
  }
}
