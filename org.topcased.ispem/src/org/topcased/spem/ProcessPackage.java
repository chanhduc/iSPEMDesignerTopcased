/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.ProcessPackage#getOwnedProcessMember <em>Owned Process Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getProcessPackage()
 * @model
 * @generated
 */
public interface ProcessPackage extends ProcessPackageableElement, MethodPluginPackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.ProcessPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Member</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getProcessPackage_OwnedProcessMember()
	 * @model type="org.topcased.spem.ProcessPackageableElement" containment="true"
	 * @generated
	 */
	EList getOwnedProcessMember();

} // ProcessPackage
