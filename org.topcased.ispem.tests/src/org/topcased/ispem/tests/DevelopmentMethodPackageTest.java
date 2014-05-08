/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DevelopmentMethodPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.uma.tests.CategoryPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Development Method Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentMethodPackageTest extends CategoryPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevelopmentMethodPackageTest.class);
	}

	/**
	 * Constructs a new Development Method Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Development Method Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DevelopmentMethodPackage getFixture() {
		return (DevelopmentMethodPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDevelopmentMethodPackage());
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

} //DevelopmentMethodPackageTest
