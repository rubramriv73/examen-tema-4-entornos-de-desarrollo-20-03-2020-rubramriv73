/**
 * @author Ruben Ramirez Rivera
 * @version 1.0
 */
/*
 * Enumeracion de los colores disponibles
 */
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

/*
 * Clase coche la cual extiende de vehiculo
 * 
 * Contiene los metodos getCilindrada y setCilindrada.
 */
public class Coche extends Vehiculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

/*
 * Metodo getCilindrada
 */
	public int getCilindrada() {
		return cilindrada;
	}

/*
 * Metodo setCilindrada
 * 
 * @param cilindrada
 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
