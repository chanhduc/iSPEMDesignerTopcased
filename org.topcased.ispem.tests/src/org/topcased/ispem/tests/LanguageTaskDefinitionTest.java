/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.LanguageTaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Language Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageTaskDefinitionTest extends TaskDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LanguageTaskDefinitionTest.class);
	}

	/**
	 * Constructs a new Language Task Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTaskDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Language Task Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LanguageTaskDefinition getFixture() {
		return (LanguageTaskDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createLanguageTaskDefinition());
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

} //LanguageTaskDefinitionTest
