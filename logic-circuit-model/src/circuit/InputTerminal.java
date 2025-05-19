/**
 */
package circuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuit.InputTerminal#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see circuit.CircuitPackage#getInputTerminal()
 * @model
 * @generated
 */
public interface InputTerminal extends LogicElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.Connection#getSourceTerminal <em>Source Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Connection)
	 * @see circuit.CircuitPackage#getInputTerminal_Input()
	 * @see circuit.Connection#getSourceTerminal
	 * @model opposite="sourceTerminal" required="true"
	 * @generated
	 */
	Connection getInput();

	/**
	 * Sets the value of the '{@link circuit.InputTerminal#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Connection value);

} // InputTerminal
