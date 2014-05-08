/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.OntologyLinkedElement;

import org.topcased.spem.tests.DescribableElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ontology Linked Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyLinkedElementTest extends DescribableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OntologyLinkedElementTest.class);
	}

	/**
	 * Constructs a new Ontology Linked Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyLinkedElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ontology Linked Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OntologyLinkedElement getFixture() {
		return (OntologyLinkedElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createOntologyLinkedElement());
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

} //OntologyLinkedElementTest
