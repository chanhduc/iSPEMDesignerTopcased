/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.ArtifactDefinition;
import org.topcased.ispem.IspemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactDefinitionTest extends WorkProductDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactDefinitionTest.class);
	}

	/**
	 * Constructs a new Artifact Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArtifactDefinition getFixture() {
		return (ArtifactDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createArtifactDefinition());
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

} //ArtifactDefinitionTest
