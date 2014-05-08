/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.ToolDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolDefinitionTest extends org.topcased.spem.tests.ToolDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToolDefinitionTest.class);
	}

	/**
	 * Constructs a new Tool Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tool Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ToolDefinition getFixture() {
		return (ToolDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createToolDefinition());
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

} //ToolDefinitionTest
