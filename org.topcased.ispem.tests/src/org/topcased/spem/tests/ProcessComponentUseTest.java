/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.ProcessComponentUse;
import org.topcased.spem.SpemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Component Use</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessComponentUseTest extends MethodContentUseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessComponentUseTest.class);
	}

	/**
	 * Constructs a new Process Component Use test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentUseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Component Use test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessComponentUse getFixture() {
		return (ProcessComponentUse)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createProcessComponentUse());
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

} //ProcessComponentUseTest
