package N105;

/**
 * Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de
 * retornar un double. Des del main() de la classe principal, instància la
 * interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i
 * imprimeix el resultat.
 * 
 * @author Carlos
 *
 */
public class MainN105 {

	public static void main(String[] args) {

		InterfazFuncional1 interfazPi = () ->  3.1415;

		System.out.println(interfazPi.getPiValue());
	}
}
