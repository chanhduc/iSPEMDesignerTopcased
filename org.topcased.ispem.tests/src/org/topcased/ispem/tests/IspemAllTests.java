/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.topcased.spem.activity.tests.ActivityTests;
import org.topcased.spem.tests.SpemTests;

import org.topcased.spem.uma.tests.UmaTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Ispem</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class IspemAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new IspemAllTests("Ispem Tests");
		suite.addTest(IspemTests.suite());
		suite.addTest(SpemTests.suite());
		suite.addTest(UmaTests.suite());
		suite.addTest(ActivityTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemAllTests(String name) {
		super(name);
	}

} //IspemAllTests
