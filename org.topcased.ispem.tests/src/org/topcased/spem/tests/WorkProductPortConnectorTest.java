/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.SpemFactory;
import org.topcased.spem.WorkProductPortConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductPortConnectorTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductPortConnectorTest.class);
	}

	/**
	 * Constructs a new Work Product Port Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductPortConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Port Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductPortConnector getFixture() {
		return (WorkProductPortConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createWorkProductPortConnector());
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

} //WorkProductPortConnectorTest
