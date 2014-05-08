/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.EngineeringDomainPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodContentPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Engineering Domain Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringDomainPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EngineeringDomainPackageTest.class);
	}

	/**
	 * Constructs a new Engineering Domain Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomainPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Engineering Domain Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EngineeringDomainPackage getFixture() {
		return (EngineeringDomainPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createEngineeringDomainPackage());
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

} //EngineeringDomainPackageTest
