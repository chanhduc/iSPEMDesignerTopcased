/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.RepresentLanguagePackage;

import org.topcased.spem.uma.tests.CategoryPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Represent Language Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentLanguagePackageTest extends CategoryPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepresentLanguagePackageTest.class);
	}

	/**
	 * Constructs a new Represent Language Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentLanguagePackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Represent Language Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RepresentLanguagePackage getFixture() {
		return (RepresentLanguagePackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createRepresentLanguagePackage());
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

} //RepresentLanguagePackageTest
