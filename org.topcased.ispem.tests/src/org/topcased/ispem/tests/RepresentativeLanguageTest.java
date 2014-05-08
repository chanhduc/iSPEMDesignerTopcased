/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.RepresentativeLanguage;

import org.topcased.spem.tests.CategoryTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Representative Language</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentativeLanguageTest extends CategoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepresentativeLanguageTest.class);
	}

	/**
	 * Constructs a new Representative Language test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Representative Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RepresentativeLanguage getFixture() {
		return (RepresentativeLanguage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createRepresentativeLanguage());
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

} //RepresentativeLanguageTest
