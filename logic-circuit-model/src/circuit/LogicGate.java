/**
 */
package circuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuit.LogicGate#getType <em>Type</em>}</li>
 *   <li>{@link circuit.LogicGate#getInputs <em>Inputs</em>}</li>
 *   <li>{@link circuit.LogicGate#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see circuit.CircuitPackage#getLogicGate()
 * @model
 * @generated
 */
public interface LogicGate extends LogicElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link circuit.GateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see circuit.GateType
	 * @see #setType(GateType)
	 * @see circuit.CircuitPackage#getLogicGate_Type()
	 * @model required="true"
	 * @generated
	 */
	GateType getType();

	/**
	 * Sets the value of the '{@link circuit.LogicGate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see circuit.GateType
	 * @see #getType()
	 * @generated
	 */
	void setType(GateType value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link circuit.Connection}.
	 * It is bidirectional and its opposite is '{@link circuit.Connection#getTargetGate <em>Target Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see circuit.CircuitPackage#getLogicGate_Inputs()
	 * @see circuit.Connection#getTargetGate
	 * @model opposite="targetGate" required="true"
	 * @generated
	 */
	EList<Connection> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuit.Connection#getSourceGate <em>Source Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Connection)
	 * @see circuit.CircuitPackage#getLogicGate_Output()
	 * @see circuit.Connection#getSourceGate
	 * @model opposite="sourceGate" required="true"
	 * @generated
	 */
	Connection getOutput();

	/**
	 * Sets the value of the '{@link circuit.LogicGate#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Connection value);

} // LogicGate
