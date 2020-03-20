
public class Vehiculo {

  protected int num_serie;
  protected String fabricante;
  protected Color color;

  public Vehiculo() {
    super();
  }

  public Color getColor() {
  	return color;
  }

  public void setColor(Color color) {
  	this.color = color;
  }

  public int getNum_serie() {
  	return num_serie;
  }

  public void setNum_serie(int num_serie) {
  	this.num_serie = num_serie;
  }

  public String getFabricante() {
  	return fabricante;
  }

  public void setFabricante(String fabricante) {
  	this.fabricante = fabricante;
  }

}