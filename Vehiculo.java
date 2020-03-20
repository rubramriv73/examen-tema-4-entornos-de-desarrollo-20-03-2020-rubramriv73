/**
 * @author Ruben Ramirez Rivera
 * @version 1.0
 */

/*
 * Clase Vehiculo que extiende de la clase Coche
 */
public class Vehiculo {

  protected int num_serie;
  protected String fabricante;
  protected Color color;

/*
 * Constructor de la clase Vehiculo
 */
  public Vehiculo() {
    super();
  }

 /*
  * Getter de Color
  * @return color
  */
  public Color getColor() {
  	return color;
  }
/*
 * Setter de Color
 * @param color
 */
  public void setColor(Color color) {
  	this.color = color;
  }

  /*
   * Getter de Num_serie
   * @return num_serie
   */
  public int getNum_serie() {
  	return num_serie;
  }
  /*
   * Setter de Num_serie
   * @param num_serie
   */
  public void setNum_serie(int num_serie) {
  	this.num_serie = num_serie;
  }
  /*
   * Getter de getFabricante
   * @return fabricante
   */
  public String getFabricante() {
  	return fabricante;
  }
  /*
   * Setter de Fabricante
   * @param fabricante
   */
  public void setFabricante(String fabricante) {
  	this.fabricante = fabricante;
  }

}