/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.textui.TestRunner;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.ForkNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForkNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForkNodeTest.class);
	}

	/**
	 * Constructs a new Fork Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fork Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ForkNode getFixture() {
		return (ForkNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ActivityFactory.eINSTANCE.createForkNode());
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

} //ForkNodeTest
