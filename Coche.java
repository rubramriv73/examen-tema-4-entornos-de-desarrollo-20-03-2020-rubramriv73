/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorización
Extrae una superclase Vehículo con los campos
	num_serie
	fabricante
	color
y los métodos
	getNum_serie(), setNum_serie()
	getFabricante(), setFabricante()
	getColor(), setColor()*/
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

public class Coche {
	private int num_serie;
	private int cilindrada;
	private String fabricante;
	Color color;

	
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
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


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
