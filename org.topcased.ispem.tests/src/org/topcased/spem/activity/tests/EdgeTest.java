/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.textui.TestRunner;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.Edge;

import org.topcased.spem.tests.BreakdownElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeTest extends BreakdownElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeTest.class);
	}

	/**
	 * Constructs a new Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Edge getFixture() {
		return (Edge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ActivityFactory.eINSTANCE.createEdge());
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

} //EdgeTest
