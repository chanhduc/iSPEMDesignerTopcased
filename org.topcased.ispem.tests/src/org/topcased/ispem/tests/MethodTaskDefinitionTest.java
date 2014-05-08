/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.MethodTaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodTaskDefinitionTest extends TaskDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodTaskDefinitionTest.class);
	}

	/**
	 * Constructs a new Method Task Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MethodTaskDefinition getFixture() {
		return (MethodTaskDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createMethodTaskDefinition());
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

} //MethodTaskDefinitionTest
