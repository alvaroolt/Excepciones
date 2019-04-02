package ejerciciosExcepciones.gato;

/**
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
 * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
 * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * 
 * @author Alvaro Leiva Toledano
 * @version 1.0
 */

public class Gato {

	// atributos de gato
	@SuppressWarnings("unused")
	private String color; // no lo necesitamos para probar las excepciones
	@SuppressWarnings("unused")
	private String raza; // no lo necesitamos para probar las excepciones
	private String sexo;

	/**
	 * Constructor de la clase Gato
	 * 
	 * @param s
	 *          sexo
	 */
	public Gato(String s) {
		this.sexo = s;
	}

	/**
	 * método para la clase gato que hace maullar al gato
	 */
	public void maulla() {
		System.out.println("Miauuuu");
	}

	/**
	 * método que genera otro objeto Gato a partir de dos objetos Gato
	 * (apareamiento)
	 * 
	 * @param pareja
	 * @return nuevo objeto de Gato
	 * @throws ApareamientoNoPosibleException
	 */
	public Gato apareaCon(Gato pareja) throws ApareamientoNoPosibleException {

		if (this.sexo.equals(pareja.sexo)) {
			throw new ApareamientoNoPosibleException("No es posible ya que son dos gatos del mismo sexo.");
		}

		String hijo = (int) (Math.random() * 2) == 0 ? "hembra" : "macho";
		return new Gato(hijo);
	}

	/**
	 * método toString, devuelve el estado del objeto Gato
	 */
	@Override
	public String toString() {
		return "Hijo [sexo = " + sexo + "]\n";
	}
}
