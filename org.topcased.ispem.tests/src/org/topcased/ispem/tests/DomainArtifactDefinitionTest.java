/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.DomainArtifactDefinition;
import org.topcased.ispem.IspemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domain Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainArtifactDefinitionTest extends ArtifactDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainArtifactDefinitionTest.class);
	}

	/**
	 * Constructs a new Domain Artifact Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifactDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Domain Artifact Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DomainArtifactDefinition getFixture() {
		return (DomainArtifactDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createDomainArtifactDefinition());
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

} //DomainArtifactDefinitionTest
