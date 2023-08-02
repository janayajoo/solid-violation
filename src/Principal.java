public class  Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000, 12),
        new Envio("Internacional",90, 190)
    };
    ImprimirTiempoDeEnvio imprimir = new ImprimirTiempoDeEnvio();
    imprimir.imprimirTiempoDeEnvio(envios);
  }

  public static class ImprimirTiempoDeEnvio{
    public void imprimirTiempoDeEnvio(Envio[] envios){
      for (Envio envio : envios) {
        System.out.println(envio.permitidoEnAvion());
      }
    }
  }
}