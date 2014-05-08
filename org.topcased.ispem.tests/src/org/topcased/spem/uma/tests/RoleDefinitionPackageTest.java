/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.MethodContentPackageTest;

import org.topcased.spem.uma.RoleDefinitionPackage;
import org.topcased.spem.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Definition Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleDefinitionPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleDefinitionPackageTest.class);
	}

	/**
	 * Constructs a new Role Definition Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinitionPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Definition Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoleDefinitionPackage getFixture() {
		return (RoleDefinitionPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createRoleDefinitionPackage());
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

} //RoleDefinitionPackageTest
