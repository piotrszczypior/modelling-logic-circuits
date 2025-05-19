/**
 */
package circuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuit.LogicCircuit#getName <em>Name</em>}</li>
 *   <li>{@link circuit.LogicCircuit#getGates <em>Gates</em>}</li>
 *   <li>{@link circuit.LogicCircuit#getConnections <em>Connections</em>}</li>
 *   <li>{@link circuit.LogicCircuit#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link circuit.LogicCircuit#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see circuit.CircuitPackage#getLogicCircuit()
 * @model abstract="true"
 * @generated
 */
public interface LogicCircuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see circuit.CircuitPackage#getLogicCircuit_Name()
	 * @model changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link circuit.LogicGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see circuit.CircuitPackage#getLogicCircuit_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicGate> getGates();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link circuit.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see circuit.CircuitPackage#getLogicCircuit_Connections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link circuit.OutputTerminal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see circuit.CircuitPackage#getLogicCircuit_Outputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputTerminal> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link circuit.InputTerminal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see circuit.CircuitPackage#getLogicCircuit_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputTerminal> getInputs();

} // LogicCircuit
