/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodContentPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Content Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainContentPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainContentPackageTest.class);
	}

	/**
	 * Constructs a new Domain Content Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainContentPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Content Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DomainContentPackage getFixture() {
		return (DomainContentPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDomainContentPackage());
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

} //DomainContentPackageTest
