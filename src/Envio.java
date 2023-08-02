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

  public int getPrecio() {
    return precio;
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
  public String permitidoEnAvion() {
    if ("Internacional".equals(this.tipo) && this.precio < precioBusqueda) {
      return this.tipo + ": tiempo envio " + this.tiempo + " horas y precio de $" + this.getPrecio();
    } else {
      return "No permitido en avion porque el precio es mayor a $" + this.precioBusqueda;
    }
  }
}
