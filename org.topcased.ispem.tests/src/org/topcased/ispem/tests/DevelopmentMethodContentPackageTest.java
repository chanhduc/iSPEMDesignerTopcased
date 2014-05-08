/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DevelopmentMethodContentPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodContentPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Development Method Content Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentMethodContentPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevelopmentMethodContentPackageTest.class);
	}

	/**
	 * Constructs a new Development Method Content Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodContentPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Development Method Content Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DevelopmentMethodContentPackage getFixture() {
		return (DevelopmentMethodContentPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDevelopmentMethodContentPackage());
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

} //DevelopmentMethodContentPackageTest
