/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.ISPEM;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodLibraryTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ISPEM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISPEMTest extends MethodLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISPEMTest.class);
	}

	/**
	 * Constructs a new ISPEM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISPEMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ISPEM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ISPEM getFixture() {
		return (ISPEM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createISPEM());
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

} //ISPEMTest
