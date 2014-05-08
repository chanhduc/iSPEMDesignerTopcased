/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.MethodContentPackageTest;

import org.topcased.spem.uma.UmaFactory;
import org.topcased.spem.uma.WorkProductKindPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Kind Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductKindPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductKindPackageTest.class);
	}

	/**
	 * Constructs a new Work Product Kind Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductKindPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Kind Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductKindPackage getFixture() {
		return (WorkProductKindPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductKindPackage());
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

} //WorkProductKindPackageTest
