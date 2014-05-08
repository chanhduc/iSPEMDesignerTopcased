/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.GuidanceTest;

import org.topcased.spem.uma.Roadmap;
import org.topcased.spem.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roadmap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoadmapTest extends GuidanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoadmapTest.class);
	}

	/**
	 * Constructs a new Roadmap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadmapTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Roadmap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Roadmap getFixture() {
		return (Roadmap)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createRoadmap());
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

} //RoadmapTest
