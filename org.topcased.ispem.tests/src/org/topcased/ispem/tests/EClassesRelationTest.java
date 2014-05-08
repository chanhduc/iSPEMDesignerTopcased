/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.EClassesRelation;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.MethodContentElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EClasses Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassesRelationTest extends MethodContentElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EClassesRelationTest.class);
	}

	/**
	 * Constructs a new EClasses Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassesRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EClasses Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClassesRelation getFixture() {
		return (EClassesRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createEClassesRelation());
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

} //EClassesRelationTest
