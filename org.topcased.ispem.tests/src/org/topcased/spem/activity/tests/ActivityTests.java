/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>activity</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ActivityTests("activity Tests");
		suite.addTestSuite(EdgeTest.class);
		suite.addTestSuite(StartNodeTest.class);
		suite.addTestSuite(EndNodeTest.class);
		suite.addTestSuite(ForkNodeTest.class);
		suite.addTestSuite(JoinNodeTest.class);
		suite.addTestSuite(DecisionNodeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTests(String name) {
		super(name);
	}

} //ActivityTests
