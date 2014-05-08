/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.tests;

import junit.textui.TestRunner;

import org.topcased.spem.tests.MethodContentPackageTest;

import org.topcased.spem.uma.QualificationPackage;
import org.topcased.spem.uma.UmaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qualification Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualificationPackageTest extends MethodContentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualificationPackageTest.class);
	}

	/**
	 * Constructs a new Qualification Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Qualification Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QualificationPackage getFixture() {
		return (QualificationPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UmaFactory.eINSTANCE.createQualificationPackage());
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

} //QualificationPackageTest
