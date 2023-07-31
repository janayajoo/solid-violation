public class Envio implements IEnvio {

  String tipo;
  Integer precio;
  Integer precioBusqueda = 100;
  Integer tiempo;

  Envio(String tipo, Integer precio, Integer tiempo) {
    this.tipo = tipo;
    this.precio = precio;
    this.tiempo = tiempo;
  }

  String getTipoEnvio() {
    return this.tipo;
  }

  void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }

  @Override
  public void cargarMercancia() {
    //Cargando mercancia
  }

  @Override
  public void rastrearPaquete() {
    //rastreando paquete
  }

  @Override
  public boolean permitidoEnAvion() {
    if ("Internacional".equals(this.tipo)) {
      if (this.precio < precioBusqueda) {
        return true;
      } else {
        return false;
      }
    }
    throw new IllegalArgumentException("no es posible cargar en avion un envio que no sea internacional");
  }
}