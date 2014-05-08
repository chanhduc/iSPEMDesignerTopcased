/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.IspemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Development Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentMethodTest extends OntologyLinkedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevelopmentMethodTest.class);
	}

	/**
	 * Constructs a new Development Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Development Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DevelopmentMethod getFixture() {
		return (DevelopmentMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDevelopmentMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DevelopmentMethodTest
