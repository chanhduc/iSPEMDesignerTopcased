/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.EReferencesRelation;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodContentElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EReferences Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EReferencesRelationTest extends MethodContentElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EReferencesRelationTest.class);
	}

	/**
	 * Constructs a new EReferences Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReferencesRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EReferences Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EReferencesRelation getFixture() {
		return (EReferencesRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createEReferencesRelation());
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

} //EReferencesRelationTest
