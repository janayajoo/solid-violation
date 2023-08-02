public class  Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000, 12),
        new Envio("Internacional",25000, 190)
    };
    ImprimirTiempoDeEnvio imprimir = new ImprimirTiempoDeEnvio();
    imprimir.imprimirTiempoDeEnvio(envios);
  }

  public static class ImprimirTiempoDeEnvio{
    public void imprimirTiempoDeEnvio(Envio[] envios){
      for (Envio envio : envios) {
        if("Internacional".equals(envio.tipo)){
          System.out.println(envio.permitidoEnAvion());
        } else {
          System.out.println(envio.tipo + ": tiempo envio " + envio.tiempo + " horas y precio de $" + envio.getPrecio());
        }
      }
    }
  }
}