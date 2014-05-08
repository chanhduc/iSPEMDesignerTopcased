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

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ispem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class IspemTests extends TestSuite {

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
		TestSuite suite = new IspemTests("ispem Tests");
		suite.addTestSuite(TaskDefinitionTest.class);
		suite.addTestSuite(ArtifactTest.class);
		suite.addTestSuite(ActivityTest.class);
		suite.addTestSuite(ArtifactTransformationTest.class);
		suite.addTestSuite(DomainTaskDefinitionTest.class);
		suite.addTestSuite(MethodTaskDefinitionTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(LanguageTaskDefinitionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemTests(String name) {
		super(name);
	}

} //IspemTests
