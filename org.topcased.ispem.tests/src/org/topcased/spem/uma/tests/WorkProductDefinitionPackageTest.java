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
import org.topcased.spem.uma.WorkProductDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Definition Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductDefinitionPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductDefinitionPackageTest.class);
	}

	/**
	 * Constructs a new Work Product Definition Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinitionPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Definition Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductDefinitionPackage getFixture() {
		return (WorkProductDefinitionPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductDefinitionPackage());
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

} //WorkProductDefinitionPackageTest
