/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.textui.TestRunner;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.MetaModel;

import org.topcased.spem.tests.MethodContentElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelTest extends MethodContentElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetaModelTest.class);
	}

	/**
	 * Constructs a new Meta Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Meta Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MetaModel getFixture() {
		return (MetaModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(IspemFactory.eINSTANCE.createMetaModel());
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

} //MetaModelTest
