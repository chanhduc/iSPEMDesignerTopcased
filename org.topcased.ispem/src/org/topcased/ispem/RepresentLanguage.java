/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.topcased.spem.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Represent Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.RepresentLanguage#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getRepresentLanguage()
 * @model
 * @generated
 */
public interface RepresentLanguage extends Category, OntologyLinkedElement {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(MetaModel)
	 * @see org.topcased.ispem.IspemPackage#getRepresentLanguage_Metamodel()
	 * @model
	 * @generated
	 */
	MetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.RepresentLanguage#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetaModel value);

} // RepresentLanguage
