/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.Milestone;
import org.topcased.spem.SpemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MilestoneTest extends WorkBreakdownElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MilestoneTest.class);
	}

	/**
	 * Constructs a new Milestone test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilestoneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Milestone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Milestone getFixture() {
		return (Milestone)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createMilestone());
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

} //MilestoneTest
