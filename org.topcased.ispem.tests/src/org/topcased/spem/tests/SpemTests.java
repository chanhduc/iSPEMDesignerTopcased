/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>spem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpemTests extends TestSuite {

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
		TestSuite suite = new SpemTests("spem Tests");
		suite.addTestSuite(WorkSequenceTest.class);
		suite.addTestSuite(ActivityTest.class);
		suite.addTestSuite(ProcessPerformerTest.class);
		suite.addTestSuite(RoleUseTest.class);
		suite.addTestSuite(ProcessResponsibilityAssignmentTest.class);
		suite.addTestSuite(WorkProductUseTest.class);
		suite.addTestSuite(WorkProductUseRelationshipTest.class);
		suite.addTestSuite(ProcessParameterTest.class);
		suite.addTestSuite(MilestoneTest.class);
		suite.addTestSuite(TaskDefinitionTest.class);
		suite.addTestSuite(StepTest.class);
		suite.addTestSuite(PlanningDataTest.class);
		suite.addTestSuite(TaskUseTest.class);
		suite.addTestSuite(CompositeRoleTest.class);
		suite.addTestSuite(TeamProfileTest.class);
		suite.addTestSuite(ProcessComponentUseTest.class);
		suite.addTestSuite(MethodConfigurationTest.class);
		suite.addTestSuite(WorkProductPortTest.class);
		suite.addTestSuite(WorkProductPortConnectorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemTests(String name) {
		super(name);
	}

} //SpemTests
