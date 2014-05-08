/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.ArtifactDefinitionPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.uma.tests.WorkProductDefinitionPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Definition Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactDefinitionPackageTest extends WorkProductDefinitionPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactDefinitionPackageTest.class);
	}

	/**
	 * Constructs a new Artifact Definition Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinitionPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Definition Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArtifactDefinitionPackage getFixture() {
		return (ArtifactDefinitionPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createArtifactDefinitionPackage());
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

} //ArtifactDefinitionPackageTest
