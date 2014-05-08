/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.textui.TestRunner;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.StartNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartNodeTest.class);
	}

	/**
	 * Constructs a new Start Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StartNode getFixture() {
		return (StartNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ActivityFactory.eINSTANCE.createStartNode());
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

} //StartNodeTest
