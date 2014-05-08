/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>uma</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmaTests extends TestSuite {

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
		TestSuite suite = new UmaTests("uma Tests");
		suite.addTestSuite(ArtifactTest.class);
		suite.addTestSuite(CapabilityPatternTest.class);
		suite.addTestSuite(DeliverableTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(DeliveryProcessTest.class);
		suite.addTestSuite(IterationTest.class);
		suite.addTestSuite(OutcomeTest.class);
		suite.addTestSuite(PhaseTest.class);
		suite.addTestSuite(ProcessPlanningTemplateTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaTests(String name) {
		super(name);
	}

} //UmaTests
