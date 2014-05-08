/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.LanguageArtifactDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Language Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageArtifactDefinitionTest extends ArtifactDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LanguageArtifactDefinitionTest.class);
	}

	/**
	 * Constructs a new Language Artifact Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageArtifactDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Language Artifact Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LanguageArtifactDefinition getFixture() {
		return (LanguageArtifactDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createLanguageArtifactDefinition());
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

} //LanguageArtifactDefinitionTest
