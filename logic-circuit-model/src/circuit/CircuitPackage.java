/**
 */
package circuit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see circuit.CircuitFactory
 * @model kind="package"
 * @generated
 */
public interface CircuitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/circuit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitPackage eINSTANCE = circuit.impl.CircuitPackageImpl.init();

	/**
	 * The meta object id for the '{@link circuit.impl.LogicCircuitImpl <em>Logic Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.LogicCircuitImpl
	 * @see circuit.impl.CircuitPackageImpl#getLogicCircuit()
	 * @generated
	 */
	int LOGIC_CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT__GATES = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT__CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT__INPUTS = 4;

	/**
	 * The number of structural features of the '<em>Logic Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Logic Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_CIRCUIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circuit.impl.LogicElementImpl <em>Logic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.LogicElementImpl
	 * @see circuit.impl.CircuitPackageImpl#getLogicElement()
	 * @generated
	 */
	int LOGIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Logic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Logic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circuit.impl.LogicGateImpl <em>Logic Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.LogicGateImpl
	 * @see circuit.impl.CircuitPackageImpl#getLogicGate()
	 * @generated
	 */
	int LOGIC_GATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__NAME = LOGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__ID = LOGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__TYPE = LOGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__INPUTS = LOGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE__OUTPUT = LOGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logic Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE_FEATURE_COUNT = LOGIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Logic Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_GATE_OPERATION_COUNT = LOGIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuit.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.ConnectionImpl
	 * @see circuit.impl.CircuitPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = LOGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = LOGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_GATE = LOGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_GATE = LOGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_TERMINAL = LOGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_TERMINAL = LOGIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = LOGIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = LOGIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuit.impl.OutputTerminalImpl <em>Output Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.OutputTerminalImpl
	 * @see circuit.impl.CircuitPackageImpl#getOutputTerminal()
	 * @generated
	 */
	int OUTPUT_TERMINAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TERMINAL__NAME = LOGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TERMINAL__ID = LOGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TERMINAL__OUTPUT = LOGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TERMINAL_FEATURE_COUNT = LOGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TERMINAL_OPERATION_COUNT = LOGIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuit.impl.InputTerminalImpl <em>Input Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.impl.InputTerminalImpl
	 * @see circuit.impl.CircuitPackageImpl#getInputTerminal()
	 * @generated
	 */
	int INPUT_TERMINAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TERMINAL__NAME = LOGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TERMINAL__ID = LOGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TERMINAL__INPUT = LOGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TERMINAL_FEATURE_COUNT = LOGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TERMINAL_OPERATION_COUNT = LOGIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuit.GateType <em>Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuit.GateType
	 * @see circuit.impl.CircuitPackageImpl#getGateType()
	 * @generated
	 */
	int GATE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link circuit.LogicCircuit <em>Logic Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Circuit</em>'.
	 * @see circuit.LogicCircuit
	 * @generated
	 */
	EClass getLogicCircuit();

	/**
	 * Returns the meta object for the attribute '{@link circuit.LogicCircuit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circuit.LogicCircuit#getName()
	 * @see #getLogicCircuit()
	 * @generated
	 */
	EAttribute getLogicCircuit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link circuit.LogicCircuit#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see circuit.LogicCircuit#getGates()
	 * @see #getLogicCircuit()
	 * @generated
	 */
	EReference getLogicCircuit_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link circuit.LogicCircuit#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see circuit.LogicCircuit#getConnections()
	 * @see #getLogicCircuit()
	 * @generated
	 */
	EReference getLogicCircuit_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link circuit.LogicCircuit#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see circuit.LogicCircuit#getOutputs()
	 * @see #getLogicCircuit()
	 * @generated
	 */
	EReference getLogicCircuit_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link circuit.LogicCircuit#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see circuit.LogicCircuit#getInputs()
	 * @see #getLogicCircuit()
	 * @generated
	 */
	EReference getLogicCircuit_Inputs();

	/**
	 * Returns the meta object for class '{@link circuit.LogicElement <em>Logic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Element</em>'.
	 * @see circuit.LogicElement
	 * @generated
	 */
	EClass getLogicElement();

	/**
	 * Returns the meta object for the attribute '{@link circuit.LogicElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circuit.LogicElement#getName()
	 * @see #getLogicElement()
	 * @generated
	 */
	EAttribute getLogicElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link circuit.LogicElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see circuit.LogicElement#getId()
	 * @see #getLogicElement()
	 * @generated
	 */
	EAttribute getLogicElement_Id();

	/**
	 * Returns the meta object for class '{@link circuit.LogicGate <em>Logic Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Gate</em>'.
	 * @see circuit.LogicGate
	 * @generated
	 */
	EClass getLogicGate();

	/**
	 * Returns the meta object for the attribute '{@link circuit.LogicGate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see circuit.LogicGate#getType()
	 * @see #getLogicGate()
	 * @generated
	 */
	EAttribute getLogicGate_Type();

	/**
	 * Returns the meta object for the reference list '{@link circuit.LogicGate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see circuit.LogicGate#getInputs()
	 * @see #getLogicGate()
	 * @generated
	 */
	EReference getLogicGate_Inputs();

	/**
	 * Returns the meta object for the reference '{@link circuit.LogicGate#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see circuit.LogicGate#getOutput()
	 * @see #getLogicGate()
	 * @generated
	 */
	EReference getLogicGate_Output();

	/**
	 * Returns the meta object for class '{@link circuit.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see circuit.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link circuit.Connection#getSourceGate <em>Source Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Gate</em>'.
	 * @see circuit.Connection#getSourceGate()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_SourceGate();

	/**
	 * Returns the meta object for the reference '{@link circuit.Connection#getTargetGate <em>Target Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Gate</em>'.
	 * @see circuit.Connection#getTargetGate()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TargetGate();

	/**
	 * Returns the meta object for the reference '{@link circuit.Connection#getSourceTerminal <em>Source Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Terminal</em>'.
	 * @see circuit.Connection#getSourceTerminal()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_SourceTerminal();

	/**
	 * Returns the meta object for the reference '{@link circuit.Connection#getTargetTerminal <em>Target Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Terminal</em>'.
	 * @see circuit.Connection#getTargetTerminal()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TargetTerminal();

	/**
	 * Returns the meta object for class '{@link circuit.OutputTerminal <em>Output Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Terminal</em>'.
	 * @see circuit.OutputTerminal
	 * @generated
	 */
	EClass getOutputTerminal();

	/**
	 * Returns the meta object for the reference '{@link circuit.OutputTerminal#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see circuit.OutputTerminal#getOutput()
	 * @see #getOutputTerminal()
	 * @generated
	 */
	EReference getOutputTerminal_Output();

	/**
	 * Returns the meta object for class '{@link circuit.InputTerminal <em>Input Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Terminal</em>'.
	 * @see circuit.InputTerminal
	 * @generated
	 */
	EClass getInputTerminal();

	/**
	 * Returns the meta object for the reference '{@link circuit.InputTerminal#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see circuit.InputTerminal#getInput()
	 * @see #getInputTerminal()
	 * @generated
	 */
	EReference getInputTerminal_Input();

	/**
	 * Returns the meta object for enum '{@link circuit.GateType <em>Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Type</em>'.
	 * @see circuit.GateType
	 * @generated
	 */
	EEnum getGateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuitFactory getCircuitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link circuit.impl.LogicCircuitImpl <em>Logic Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.LogicCircuitImpl
		 * @see circuit.impl.CircuitPackageImpl#getLogicCircuit()
		 * @generated
		 */
		EClass LOGIC_CIRCUIT = eINSTANCE.getLogicCircuit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_CIRCUIT__NAME = eINSTANCE.getLogicCircuit_Name();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_CIRCUIT__GATES = eINSTANCE.getLogicCircuit_Gates();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_CIRCUIT__CONNECTIONS = eINSTANCE.getLogicCircuit_Connections();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_CIRCUIT__OUTPUTS = eINSTANCE.getLogicCircuit_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_CIRCUIT__INPUTS = eINSTANCE.getLogicCircuit_Inputs();

		/**
		 * The meta object literal for the '{@link circuit.impl.LogicElementImpl <em>Logic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.LogicElementImpl
		 * @see circuit.impl.CircuitPackageImpl#getLogicElement()
		 * @generated
		 */
		EClass LOGIC_ELEMENT = eINSTANCE.getLogicElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_ELEMENT__NAME = eINSTANCE.getLogicElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_ELEMENT__ID = eINSTANCE.getLogicElement_Id();

		/**
		 * The meta object literal for the '{@link circuit.impl.LogicGateImpl <em>Logic Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.LogicGateImpl
		 * @see circuit.impl.CircuitPackageImpl#getLogicGate()
		 * @generated
		 */
		EClass LOGIC_GATE = eINSTANCE.getLogicGate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_GATE__TYPE = eINSTANCE.getLogicGate_Type();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_GATE__INPUTS = eINSTANCE.getLogicGate_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_GATE__OUTPUT = eINSTANCE.getLogicGate_Output();

		/**
		 * The meta object literal for the '{@link circuit.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.ConnectionImpl
		 * @see circuit.impl.CircuitPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE_GATE = eINSTANCE.getConnection_SourceGate();

		/**
		 * The meta object literal for the '<em><b>Target Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET_GATE = eINSTANCE.getConnection_TargetGate();

		/**
		 * The meta object literal for the '<em><b>Source Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE_TERMINAL = eINSTANCE.getConnection_SourceTerminal();

		/**
		 * The meta object literal for the '<em><b>Target Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET_TERMINAL = eINSTANCE.getConnection_TargetTerminal();

		/**
		 * The meta object literal for the '{@link circuit.impl.OutputTerminalImpl <em>Output Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.OutputTerminalImpl
		 * @see circuit.impl.CircuitPackageImpl#getOutputTerminal()
		 * @generated
		 */
		EClass OUTPUT_TERMINAL = eINSTANCE.getOutputTerminal();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_TERMINAL__OUTPUT = eINSTANCE.getOutputTerminal_Output();

		/**
		 * The meta object literal for the '{@link circuit.impl.InputTerminalImpl <em>Input Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.impl.InputTerminalImpl
		 * @see circuit.impl.CircuitPackageImpl#getInputTerminal()
		 * @generated
		 */
		EClass INPUT_TERMINAL = eINSTANCE.getInputTerminal();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_TERMINAL__INPUT = eINSTANCE.getInputTerminal_Input();

		/**
		 * The meta object literal for the '{@link circuit.GateType <em>Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuit.GateType
		 * @see circuit.impl.CircuitPackageImpl#getGateType()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getGateType();

	}

} //CircuitPackage
