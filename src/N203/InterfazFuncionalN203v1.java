package N203;

/**
 * Crea una Functional Interface que contingui un mètode anomenat operacio().
 * Aquest mètode ha de retornar un float. Injecta a la interfície creada
 * mitjançant una lambda, el cos del mètode, de manera que es pugui transformar
 * l’operació amb una suma, una resta, una multiplicació i una divisió.
 * 
 * @author Carlos
 *
 */
@FunctionalInterface
public interface InterfazFuncionalN203v1 {
	
	public float operacion(Integer n1, Integer n2, String operacion);

}
