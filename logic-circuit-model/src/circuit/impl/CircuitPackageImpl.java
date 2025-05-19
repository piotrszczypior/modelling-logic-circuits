/**
 */
package circuit.impl;

import circuit.CircuitFactory;
import circuit.CircuitPackage;
import circuit.Connection;
import circuit.GateType;
import circuit.InputTerminal;
import circuit.LogicCircuit;
import circuit.LogicElement;
import circuit.LogicGate;
import circuit.OutputTerminal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitPackageImpl extends EPackageImpl implements CircuitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gateTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see circuit.CircuitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircuitPackageImpl() {
		super(eNS_URI, CircuitFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CircuitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircuitPackage init() {
		if (isInited) return (CircuitPackage)EPackage.Registry.INSTANCE.getEPackage(CircuitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCircuitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CircuitPackageImpl theCircuitPackage = registeredCircuitPackage instanceof CircuitPackageImpl ? (CircuitPackageImpl)registeredCircuitPackage : new CircuitPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCircuitPackage.createPackageContents();

		// Initialize created meta-data
		theCircuitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircuitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircuitPackage.eNS_URI, theCircuitPackage);
		return theCircuitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicCircuit() {
		return logicCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicCircuit_Name() {
		return (EAttribute)logicCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicCircuit_Gates() {
		return (EReference)logicCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicCircuit_Connections() {
		return (EReference)logicCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicCircuit_Outputs() {
		return (EReference)logicCircuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicCircuit_Inputs() {
		return (EReference)logicCircuitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicElement() {
		return logicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicElement_Name() {
		return (EAttribute)logicElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicElement_Id() {
		return (EAttribute)logicElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicGate() {
		return logicGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicGate_Type() {
		return (EAttribute)logicGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicGate_Inputs() {
		return (EReference)logicGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicGate_Output() {
		return (EReference)logicGateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_SourceGate() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TargetGate() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_SourceTerminal() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_TargetTerminal() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputTerminal() {
		return outputTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputTerminal_Output() {
		return (EReference)outputTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputTerminal() {
		return inputTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputTerminal_Input() {
		return (EReference)inputTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGateType() {
		return gateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitFactory getCircuitFactory() {
		return (CircuitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logicCircuitEClass = createEClass(LOGIC_CIRCUIT);
		createEAttribute(logicCircuitEClass, LOGIC_CIRCUIT__NAME);
		createEReference(logicCircuitEClass, LOGIC_CIRCUIT__GATES);
		createEReference(logicCircuitEClass, LOGIC_CIRCUIT__CONNECTIONS);
		createEReference(logicCircuitEClass, LOGIC_CIRCUIT__OUTPUTS);
		createEReference(logicCircuitEClass, LOGIC_CIRCUIT__INPUTS);

		logicElementEClass = createEClass(LOGIC_ELEMENT);
		createEAttribute(logicElementEClass, LOGIC_ELEMENT__NAME);
		createEAttribute(logicElementEClass, LOGIC_ELEMENT__ID);

		logicGateEClass = createEClass(LOGIC_GATE);
		createEAttribute(logicGateEClass, LOGIC_GATE__TYPE);
		createEReference(logicGateEClass, LOGIC_GATE__INPUTS);
		createEReference(logicGateEClass, LOGIC_GATE__OUTPUT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SOURCE_GATE);
		createEReference(connectionEClass, CONNECTION__TARGET_GATE);
		createEReference(connectionEClass, CONNECTION__SOURCE_TERMINAL);
		createEReference(connectionEClass, CONNECTION__TARGET_TERMINAL);

		outputTerminalEClass = createEClass(OUTPUT_TERMINAL);
		createEReference(outputTerminalEClass, OUTPUT_TERMINAL__OUTPUT);

		inputTerminalEClass = createEClass(INPUT_TERMINAL);
		createEReference(inputTerminalEClass, INPUT_TERMINAL__INPUT);

		// Create enums
		gateTypeEEnum = createEEnum(GATE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logicGateEClass.getESuperTypes().add(this.getLogicElement());
		connectionEClass.getESuperTypes().add(this.getLogicElement());
		outputTerminalEClass.getESuperTypes().add(this.getLogicElement());
		inputTerminalEClass.getESuperTypes().add(this.getLogicElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(logicCircuitEClass, LogicCircuit.class, "LogicCircuit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicCircuit_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogicCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCircuit_Gates(), this.getLogicGate(), null, "gates", null, 0, -1, LogicCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCircuit_Connections(), this.getConnection(), null, "connections", null, 1, -1, LogicCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCircuit_Outputs(), this.getOutputTerminal(), null, "outputs", null, 1, -1, LogicCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCircuit_Inputs(), this.getInputTerminal(), null, "inputs", null, 1, -1, LogicCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicElementEClass, LogicElement.class, "LogicElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicGateEClass, LogicGate.class, "LogicGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicGate_Type(), this.getGateType(), "type", null, 1, 1, LogicGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicGate_Inputs(), this.getConnection(), this.getConnection_TargetGate(), "inputs", null, 1, -1, LogicGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicGate_Output(), this.getConnection(), this.getConnection_SourceGate(), "output", null, 1, 1, LogicGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_SourceGate(), this.getLogicGate(), this.getLogicGate_Output(), "sourceGate", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TargetGate(), this.getLogicGate(), this.getLogicGate_Inputs(), "targetGate", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_SourceTerminal(), this.getInputTerminal(), this.getInputTerminal_Input(), "sourceTerminal", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_TargetTerminal(), this.getOutputTerminal(), this.getOutputTerminal_Output(), "targetTerminal", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTerminalEClass, OutputTerminal.class, "OutputTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputTerminal_Output(), this.getConnection(), this.getConnection_TargetTerminal(), "output", null, 1, 1, OutputTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTerminalEClass, InputTerminal.class, "InputTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputTerminal_Input(), this.getConnection(), this.getConnection_SourceTerminal(), "input", null, 1, 1, InputTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gateTypeEEnum, GateType.class, "GateType");
		addEEnumLiteral(gateTypeEEnum, GateType.AND);
		addEEnumLiteral(gateTypeEEnum, GateType.OR);
		addEEnumLiteral(gateTypeEEnum, GateType.NOT);
		addEEnumLiteral(gateTypeEEnum, GateType.NAND);
		addEEnumLiteral(gateTypeEEnum, GateType.NOR);
		addEEnumLiteral(gateTypeEEnum, GateType.XOR);
		addEEnumLiteral(gateTypeEEnum, GateType.NXOR);

		// Create resource
		createResource(eNS_URI);
	}

} //CircuitPackageImpl
