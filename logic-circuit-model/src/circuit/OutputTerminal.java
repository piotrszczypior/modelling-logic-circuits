/**
 */
package circuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuit.OutputTerminal#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see circuit.CircuitPackage#getOutputTerminal()
 * @model
 * @generated
 */
public interface OutputTerminal extends LogicElement {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.Connection#getTargetTerminal <em>Target Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Connection)
	 * @see circuit.CircuitPackage#getOutputTerminal_Output()
	 * @see circuit.Connection#getTargetTerminal
	 * @model opposite="targetTerminal" required="true"
	 * @generated
	 */
	Connection getOutput();

	/**
	 * Sets the value of the '{@link circuit.OutputTerminal#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Connection value);

} // OutputTerminal
