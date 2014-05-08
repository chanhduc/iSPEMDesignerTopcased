/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.textui.TestRunner;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.DecisionNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecisionNodeTest.class);
	}

	/**
	 * Constructs a new Decision Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decision Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DecisionNode getFixture() {
		return (DecisionNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ActivityFactory.eINSTANCE.createDecisionNode());
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

} //DecisionNodeTest
