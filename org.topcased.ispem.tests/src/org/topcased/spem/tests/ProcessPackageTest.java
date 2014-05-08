/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.ProcessPackage;
import org.topcased.spem.SpemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageTest extends ProcessPackageableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessPackageTest.class);
	}

	/**
	 * Constructs a new Process Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessPackage getFixture() {
		return (ProcessPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createProcessPackage());
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

} //ProcessPackageTest
