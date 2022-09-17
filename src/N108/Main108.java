package N108;

/**
 * 
 * Crea una Functional Interface que contingui un mètode anomenat reverse().
 * Aquest mètode ha de rebre i ha de retornar un String. En el main() de la
 * classe principal, injecta a la interfície creada mitjançant una lambda, el
 * cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre
 * però al revés. Invoca la instància de la interfície passant-li una cadena i
 * comprova si el resultat és correcte.
 * 
 * @author Carlos
 *
 */
public class Main108 {

	public static void main(String[] args) {
		
		InterfazFuncional2 gestorStrings = (string) -> new StringBuilder(string).reverse().toString();
		
		System.out.println(gestorStrings.reverse("Adios"));
	}
}
