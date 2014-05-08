/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.textui.TestRunner;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.JoinNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JoinNodeTest.class);
	}

	/**
	 * Constructs a new Join Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Join Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JoinNode getFixture() {
		return (JoinNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ActivityFactory.eINSTANCE.createJoinNode());
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

} //JoinNodeTest
