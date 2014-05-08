/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.IspemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainTaskDefinitionTest extends TaskDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainTaskDefinitionTest.class);
	}

	/**
	 * Constructs a new Domain Task Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTaskDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DomainTaskDefinition getFixture() {
		return (DomainTaskDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDomainTaskDefinition());
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

} //DomainTaskDefinitionTest
