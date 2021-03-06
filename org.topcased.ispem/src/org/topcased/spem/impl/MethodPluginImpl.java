/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.ProcessPackage;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.MethodPluginImpl#getOwnedMethodContentPackage <em>Owned Method Content Package</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodPluginImpl#getOwnedProcessPackage <em>Owned Process Package</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodPluginImpl#getBasePlugin <em>Base Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodPluginImpl extends MethodLibraryPackageableElementImpl implements MethodPlugin {
	/**
	 * The cached value of the '{@link #getOwnedMethodContentPackage() <em>Owned Method Content Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMethodContentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList ownedMethodContentPackage;

	/**
	 * The cached value of the '{@link #getOwnedProcessPackage() <em>Owned Process Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessPackage()
	 * @generated
	 * @ordered
	 */
	protected EList ownedProcessPackage;

	/**
	 * The cached value of the '{@link #getBasePlugin() <em>Base Plugin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePlugin()
	 * @generated
	 * @ordered
	 */
	protected EList basePlugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMethodContentPackage() {
		if (ownedMethodContentPackage == null) {
			ownedMethodContentPackage = new EObjectContainmentEList(MethodContentPackage.class, this, SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE);
		}
		return ownedMethodContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedProcessPackage() {
		if (ownedProcessPackage == null) {
			ownedProcessPackage = new EObjectContainmentEList(ProcessPackage.class, this, SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE);
		}
		return ownedProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBasePlugin() {
		if (basePlugin == null) {
			basePlugin = new EObjectResolvingEList(MethodPlugin.class, this, SpemPackage.METHOD_PLUGIN__BASE_PLUGIN);
		}
		return basePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return ((InternalEList)getOwnedMethodContentPackage()).basicRemove(otherEnd, msgs);
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return ((InternalEList)getOwnedProcessPackage()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return getOwnedMethodContentPackage();
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return getOwnedProcessPackage();
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				return getBasePlugin();
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
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				getOwnedMethodContentPackage().clear();
				getOwnedMethodContentPackage().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				getOwnedProcessPackage().clear();
				getOwnedProcessPackage().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				getBasePlugin().clear();
				getBasePlugin().addAll((Collection)newValue);
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
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				getOwnedMethodContentPackage().clear();
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				getOwnedProcessPackage().clear();
				return;
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				getBasePlugin().clear();
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
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return ownedMethodContentPackage != null && !ownedMethodContentPackage.isEmpty();
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return ownedProcessPackage != null && !ownedProcessPackage.isEmpty();
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				return basePlugin != null && !basePlugin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodPluginImpl
