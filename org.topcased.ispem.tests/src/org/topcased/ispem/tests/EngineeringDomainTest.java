/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.IspemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Engineering Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringDomainTest extends OntologyLinkedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EngineeringDomainTest.class);
	}

	/**
	 * Constructs a new Engineering Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Engineering Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EngineeringDomain getFixture() {
		return (EngineeringDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createEngineeringDomain());
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

} //EngineeringDomainTest
