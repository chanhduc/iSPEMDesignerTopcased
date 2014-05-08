/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.tests.BreakdownElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactTransformationTest extends BreakdownElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactTransformationTest.class);
	}

	/**
	 * Constructs a new Artifact Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTransformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArtifactTransformation getFixture() {
		return (ArtifactTransformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createArtifactTransformation());
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

} //ArtifactTransformationTest
