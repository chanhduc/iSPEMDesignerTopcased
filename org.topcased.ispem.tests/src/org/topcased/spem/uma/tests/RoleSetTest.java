/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.MethodContentElementTest;

import org.topcased.spem.uma.RoleSet;
import org.topcased.spem.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleSetTest extends MethodContentElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleSetTest.class);
	}

	/**
	 * Constructs a new Role Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoleSet getFixture() {
		return (RoleSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createRoleSet());
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

} //RoleSetTest
