/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.KindTest;

import org.topcased.spem.uma.UmaFactory;
import org.topcased.spem.uma.WorkProductKind;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Kind</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductKindTest extends KindTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductKindTest.class);
	}

	/**
	 * Constructs a new Work Product Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductKindTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductKind getFixture() {
		return (WorkProductKind)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createWorkProductKind());
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

} //WorkProductKindTest
