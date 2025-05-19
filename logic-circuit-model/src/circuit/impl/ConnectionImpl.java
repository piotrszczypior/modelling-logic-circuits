/**
 */
package circuit.impl;

import circuit.CircuitPackage;
import circuit.Connection;
import circuit.InputTerminal;
import circuit.LogicGate;
import circuit.OutputTerminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuit.impl.ConnectionImpl#getSourceGate <em>Source Gate</em>}</li>
 *   <li>{@link circuit.impl.ConnectionImpl#getTargetGate <em>Target Gate</em>}</li>
 *   <li>{@link circuit.impl.ConnectionImpl#getSourceTerminal <em>Source Terminal</em>}</li>
 *   <li>{@link circuit.impl.ConnectionImpl#getTargetTerminal <em>Target Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends LogicElementImpl implements Connection {
	/**
	 * The cached value of the '{@link #getSourceGate() <em>Source Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceGate()
	 * @generated
	 * @ordered
	 */
	protected LogicGate sourceGate;

	/**
	 * The cached value of the '{@link #getTargetGate() <em>Target Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGate()
	 * @generated
	 * @ordered
	 */
	protected LogicGate targetGate;

	/**
	 * The cached value of the '{@link #getSourceTerminal() <em>Source Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTerminal()
	 * @generated
	 * @ordered
	 */
	protected InputTerminal sourceTerminal;

	/**
	 * The cached value of the '{@link #getTargetTerminal() <em>Target Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTerminal()
	 * @generated
	 * @ordered
	 */
	protected OutputTerminal targetTerminal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicGate getSourceGate() {
		if (sourceGate != null && sourceGate.eIsProxy()) {
			InternalEObject oldSourceGate = (InternalEObject)sourceGate;
			sourceGate = (LogicGate)eResolveProxy(oldSourceGate);
			if (sourceGate != oldSourceGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.CONNECTION__SOURCE_GATE, oldSourceGate, sourceGate));
			}
		}
		return sourceGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicGate basicGetSourceGate() {
		return sourceGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceGate(LogicGate newSourceGate, NotificationChain msgs) {
		LogicGate oldSourceGate = sourceGate;
		sourceGate = newSourceGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__SOURCE_GATE, oldSourceGate, newSourceGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceGate(LogicGate newSourceGate) {
		if (newSourceGate != sourceGate) {
			NotificationChain msgs = null;
			if (sourceGate != null)
				msgs = ((InternalEObject)sourceGate).eInverseRemove(this, CircuitPackage.LOGIC_GATE__OUTPUT, LogicGate.class, msgs);
			if (newSourceGate != null)
				msgs = ((InternalEObject)newSourceGate).eInverseAdd(this, CircuitPackage.LOGIC_GATE__OUTPUT, LogicGate.class, msgs);
			msgs = basicSetSourceGate(newSourceGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__SOURCE_GATE, newSourceGate, newSourceGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicGate getTargetGate() {
		if (targetGate != null && targetGate.eIsProxy()) {
			InternalEObject oldTargetGate = (InternalEObject)targetGate;
			targetGate = (LogicGate)eResolveProxy(oldTargetGate);
			if (targetGate != oldTargetGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.CONNECTION__TARGET_GATE, oldTargetGate, targetGate));
			}
		}
		return targetGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicGate basicGetTargetGate() {
		return targetGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetGate(LogicGate newTargetGate, NotificationChain msgs) {
		LogicGate oldTargetGate = targetGate;
		targetGate = newTargetGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__TARGET_GATE, oldTargetGate, newTargetGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetGate(LogicGate newTargetGate) {
		if (newTargetGate != targetGate) {
			NotificationChain msgs = null;
			if (targetGate != null)
				msgs = ((InternalEObject)targetGate).eInverseRemove(this, CircuitPackage.LOGIC_GATE__INPUTS, LogicGate.class, msgs);
			if (newTargetGate != null)
				msgs = ((InternalEObject)newTargetGate).eInverseAdd(this, CircuitPackage.LOGIC_GATE__INPUTS, LogicGate.class, msgs);
			msgs = basicSetTargetGate(newTargetGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__TARGET_GATE, newTargetGate, newTargetGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTerminal getSourceTerminal() {
		if (sourceTerminal != null && sourceTerminal.eIsProxy()) {
			InternalEObject oldSourceTerminal = (InternalEObject)sourceTerminal;
			sourceTerminal = (InputTerminal)eResolveProxy(oldSourceTerminal);
			if (sourceTerminal != oldSourceTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.CONNECTION__SOURCE_TERMINAL, oldSourceTerminal, sourceTerminal));
			}
		}
		return sourceTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTerminal basicGetSourceTerminal() {
		return sourceTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceTerminal(InputTerminal newSourceTerminal, NotificationChain msgs) {
		InputTerminal oldSourceTerminal = sourceTerminal;
		sourceTerminal = newSourceTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__SOURCE_TERMINAL, oldSourceTerminal, newSourceTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceTerminal(InputTerminal newSourceTerminal) {
		if (newSourceTerminal != sourceTerminal) {
			NotificationChain msgs = null;
			if (sourceTerminal != null)
				msgs = ((InternalEObject)sourceTerminal).eInverseRemove(this, CircuitPackage.INPUT_TERMINAL__INPUT, InputTerminal.class, msgs);
			if (newSourceTerminal != null)
				msgs = ((InternalEObject)newSourceTerminal).eInverseAdd(this, CircuitPackage.INPUT_TERMINAL__INPUT, InputTerminal.class, msgs);
			msgs = basicSetSourceTerminal(newSourceTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__SOURCE_TERMINAL, newSourceTerminal, newSourceTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputTerminal getTargetTerminal() {
		if (targetTerminal != null && targetTerminal.eIsProxy()) {
			InternalEObject oldTargetTerminal = (InternalEObject)targetTerminal;
			targetTerminal = (OutputTerminal)eResolveProxy(oldTargetTerminal);
			if (targetTerminal != oldTargetTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.CONNECTION__TARGET_TERMINAL, oldTargetTerminal, targetTerminal));
			}
		}
		return targetTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTerminal basicGetTargetTerminal() {
		return targetTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetTerminal(OutputTerminal newTargetTerminal, NotificationChain msgs) {
		OutputTerminal oldTargetTerminal = targetTerminal;
		targetTerminal = newTargetTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__TARGET_TERMINAL, oldTargetTerminal, newTargetTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetTerminal(OutputTerminal newTargetTerminal) {
		if (newTargetTerminal != targetTerminal) {
			NotificationChain msgs = null;
			if (targetTerminal != null)
				msgs = ((InternalEObject)targetTerminal).eInverseRemove(this, CircuitPackage.OUTPUT_TERMINAL__OUTPUT, OutputTerminal.class, msgs);
			if (newTargetTerminal != null)
				msgs = ((InternalEObject)newTargetTerminal).eInverseAdd(this, CircuitPackage.OUTPUT_TERMINAL__OUTPUT, OutputTerminal.class, msgs);
			msgs = basicSetTargetTerminal(newTargetTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.CONNECTION__TARGET_TERMINAL, newTargetTerminal, newTargetTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				if (sourceGate != null)
					msgs = ((InternalEObject)sourceGate).eInverseRemove(this, CircuitPackage.LOGIC_GATE__OUTPUT, LogicGate.class, msgs);
				return basicSetSourceGate((LogicGate)otherEnd, msgs);
			case CircuitPackage.CONNECTION__TARGET_GATE:
				if (targetGate != null)
					msgs = ((InternalEObject)targetGate).eInverseRemove(this, CircuitPackage.LOGIC_GATE__INPUTS, LogicGate.class, msgs);
				return basicSetTargetGate((LogicGate)otherEnd, msgs);
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				if (sourceTerminal != null)
					msgs = ((InternalEObject)sourceTerminal).eInverseRemove(this, CircuitPackage.INPUT_TERMINAL__INPUT, InputTerminal.class, msgs);
				return basicSetSourceTerminal((InputTerminal)otherEnd, msgs);
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				if (targetTerminal != null)
					msgs = ((InternalEObject)targetTerminal).eInverseRemove(this, CircuitPackage.OUTPUT_TERMINAL__OUTPUT, OutputTerminal.class, msgs);
				return basicSetTargetTerminal((OutputTerminal)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				return basicSetSourceGate(null, msgs);
			case CircuitPackage.CONNECTION__TARGET_GATE:
				return basicSetTargetGate(null, msgs);
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				return basicSetSourceTerminal(null, msgs);
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				return basicSetTargetTerminal(null, msgs);
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
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				if (resolve) return getSourceGate();
				return basicGetSourceGate();
			case CircuitPackage.CONNECTION__TARGET_GATE:
				if (resolve) return getTargetGate();
				return basicGetTargetGate();
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				if (resolve) return getSourceTerminal();
				return basicGetSourceTerminal();
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				if (resolve) return getTargetTerminal();
				return basicGetTargetTerminal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				setSourceGate((LogicGate)newValue);
				return;
			case CircuitPackage.CONNECTION__TARGET_GATE:
				setTargetGate((LogicGate)newValue);
				return;
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				setSourceTerminal((InputTerminal)newValue);
				return;
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				setTargetTerminal((OutputTerminal)newValue);
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
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				setSourceGate((LogicGate)null);
				return;
			case CircuitPackage.CONNECTION__TARGET_GATE:
				setTargetGate((LogicGate)null);
				return;
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				setSourceTerminal((InputTerminal)null);
				return;
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				setTargetTerminal((OutputTerminal)null);
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
			case CircuitPackage.CONNECTION__SOURCE_GATE:
				return sourceGate != null;
			case CircuitPackage.CONNECTION__TARGET_GATE:
				return targetGate != null;
			case CircuitPackage.CONNECTION__SOURCE_TERMINAL:
				return sourceTerminal != null;
			case CircuitPackage.CONNECTION__TARGET_TERMINAL:
				return targetTerminal != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
