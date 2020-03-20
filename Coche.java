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

public class Coche extends Vehiculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
