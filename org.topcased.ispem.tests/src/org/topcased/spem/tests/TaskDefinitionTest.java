/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.SpemFactory;
import org.topcased.spem.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefinitionTest extends WorkDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskDefinitionTest.class);
	}

	/**
	 * Constructs a new Task Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskDefinition getFixture() {
		return (TaskDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createTaskDefinition());
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

} //TaskDefinitionTest
