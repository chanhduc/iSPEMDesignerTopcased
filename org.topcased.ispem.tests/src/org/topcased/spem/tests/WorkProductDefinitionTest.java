/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.SpemFactory;
import org.topcased.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductDefinitionTest extends MethodContentElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductDefinitionTest.class);
	}

	/**
	 * Constructs a new Work Product Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductDefinition getFixture() {
		return (WorkProductDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createWorkProductDefinition());
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

} //WorkProductDefinitionTest
