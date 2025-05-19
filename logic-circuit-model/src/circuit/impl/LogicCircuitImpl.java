/**
 */
package circuit.impl;

import circuit.CircuitPackage;
import circuit.Connection;
import circuit.InputTerminal;
import circuit.LogicCircuit;
import circuit.LogicGate;
import circuit.OutputTerminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuit.impl.LogicCircuitImpl#getName <em>Name</em>}</li>
 *   <li>{@link circuit.impl.LogicCircuitImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link circuit.impl.LogicCircuitImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link circuit.impl.LogicCircuitImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link circuit.impl.LogicCircuitImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LogicCircuitImpl extends MinimalEObjectImpl.Container implements LogicCircuit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicGate> gates;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputTerminal> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputTerminal> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitPackage.Literals.LOGIC_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicGate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<LogicGate>(LogicGate.class, this, CircuitPackage.LOGIC_CIRCUIT__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputTerminal> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputTerminal>(OutputTerminal.class, this, CircuitPackage.LOGIC_CIRCUIT__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputTerminal> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputTerminal>(InputTerminal.class, this, CircuitPackage.LOGIC_CIRCUIT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitPackage.LOGIC_CIRCUIT__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case CircuitPackage.LOGIC_CIRCUIT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case CircuitPackage.LOGIC_CIRCUIT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuitPackage.LOGIC_CIRCUIT__NAME:
				return getName();
			case CircuitPackage.LOGIC_CIRCUIT__GATES:
				return getGates();
			case CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS:
				return getConnections();
			case CircuitPackage.LOGIC_CIRCUIT__OUTPUTS:
				return getOutputs();
			case CircuitPackage.LOGIC_CIRCUIT__INPUTS:
				return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuitPackage.LOGIC_CIRCUIT__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends LogicGate>)newValue);
				return;
			case CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case CircuitPackage.LOGIC_CIRCUIT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputTerminal>)newValue);
				return;
			case CircuitPackage.LOGIC_CIRCUIT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputTerminal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CircuitPackage.LOGIC_CIRCUIT__GATES:
				getGates().clear();
				return;
			case CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS:
				getConnections().clear();
				return;
			case CircuitPackage.LOGIC_CIRCUIT__OUTPUTS:
				getOutputs().clear();
				return;
			case CircuitPackage.LOGIC_CIRCUIT__INPUTS:
				getInputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CircuitPackage.LOGIC_CIRCUIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CircuitPackage.LOGIC_CIRCUIT__GATES:
				return gates != null && !gates.isEmpty();
			case CircuitPackage.LOGIC_CIRCUIT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case CircuitPackage.LOGIC_CIRCUIT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CircuitPackage.LOGIC_CIRCUIT__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LogicCircuitImpl
