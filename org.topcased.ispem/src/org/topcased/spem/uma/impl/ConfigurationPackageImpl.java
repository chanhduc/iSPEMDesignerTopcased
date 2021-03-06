/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.MethodConfiguration;

import org.topcased.spem.impl.MethodContentPackageImpl;

import org.topcased.spem.uma.ConfigurationPackage;
import org.topcased.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.impl.ConfigurationPackageImpl#getOwnedConfiguration <em>Owned Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPackageImpl extends MethodContentPackageImpl implements ConfigurationPackage {
	/**
	 * The cached value of the '{@link #getOwnedConfiguration() <em>Owned Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList ownedConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UmaPackage.Literals.CONFIGURATION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedConfiguration() {
		if (ownedConfiguration == null) {
			ownedConfiguration = new EObjectContainmentEList(MethodConfiguration.class, this, UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION);
		}
		return ownedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION:
				return ((InternalEList)getOwnedConfiguration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION:
				return getOwnedConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION:
				getOwnedConfiguration().clear();
				getOwnedConfiguration().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION:
				getOwnedConfiguration().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.CONFIGURATION_PACKAGE__OWNED_CONFIGURATION:
				return ownedConfiguration != null && !ownedConfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationPackageImpl
