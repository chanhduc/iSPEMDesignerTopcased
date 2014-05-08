/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.tests;

import junit.textui.TestRunner;

import org.topcased.spem.Metric;
import org.topcased.spem.SpemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricTest extends DescribableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetricTest.class);
	}

	/**
	 * Constructs a new Metric test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Metric test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Metric getFixture() {
		return (Metric)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(SpemFactory.eINSTANCE.createMetric());
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

} //MetricTest
