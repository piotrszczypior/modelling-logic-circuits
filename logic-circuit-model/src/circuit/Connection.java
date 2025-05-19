/**
 */
package circuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuit.Connection#getSourceGate <em>Source Gate</em>}</li>
 *   <li>{@link circuit.Connection#getTargetGate <em>Target Gate</em>}</li>
 *   <li>{@link circuit.Connection#getSourceTerminal <em>Source Terminal</em>}</li>
 *   <li>{@link circuit.Connection#getTargetTerminal <em>Target Terminal</em>}</li>
 * </ul>
 *
 * @see circuit.CircuitPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends LogicElement {
	/**
	 * Returns the value of the '<em><b>Source Gate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.LogicGate#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Gate</em>' reference.
	 * @see #setSourceGate(LogicGate)
	 * @see circuit.CircuitPackage#getConnection_SourceGate()
	 * @see circuit.LogicGate#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	LogicGate getSourceGate();

	/**
	 * Sets the value of the '{@link circuit.Connection#getSourceGate <em>Source Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Gate</em>' reference.
	 * @see #getSourceGate()
	 * @generated
	 */
	void setSourceGate(LogicGate value);

	/**
	 * Returns the value of the '<em><b>Target Gate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.LogicGate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Gate</em>' reference.
	 * @see #setTargetGate(LogicGate)
	 * @see circuit.CircuitPackage#getConnection_TargetGate()
	 * @see circuit.LogicGate#getInputs
	 * @model opposite="inputs"
	 * @generated
	 */
	LogicGate getTargetGate();

	/**
	 * Sets the value of the '{@link circuit.Connection#getTargetGate <em>Target Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Gate</em>' reference.
	 * @see #getTargetGate()
	 * @generated
	 */
	void setTargetGate(LogicGate value);

	/**
	 * Returns the value of the '<em><b>Source Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.InputTerminal#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Terminal</em>' reference.
	 * @see #setSourceTerminal(InputTerminal)
	 * @see circuit.CircuitPackage#getConnection_SourceTerminal()
	 * @see circuit.InputTerminal#getInput
	 * @model opposite="input"
	 * @generated
	 */
	InputTerminal getSourceTerminal();

	/**
	 * Sets the value of the '{@link circuit.Connection#getSourceTerminal <em>Source Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Terminal</em>' reference.
	 * @see #getSourceTerminal()
	 * @generated
	 */
	void setSourceTerminal(InputTerminal value);

	/**
	 * Returns the value of the '<em><b>Target Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.OutputTerminal#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Terminal</em>' reference.
	 * @see #setTargetTerminal(OutputTerminal)
	 * @see circuit.CircuitPackage#getConnection_TargetTerminal()
	 * @see circuit.OutputTerminal#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	OutputTerminal getTargetTerminal();

	/**
	 * Sets the value of the '{@link circuit.Connection#getTargetTerminal <em>Target Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Terminal</em>' reference.
	 * @see #getTargetTerminal()
	 * @generated
	 */
	void setTargetTerminal(OutputTerminal value);

} // Connection
