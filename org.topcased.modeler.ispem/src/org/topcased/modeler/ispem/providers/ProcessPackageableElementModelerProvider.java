/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.topcased.modeler.providers.ILabelFeatureProvider;
import org.topcased.spem.SpemPackage;

/**
 * This is the item provider adpater for a {@link org.topcased.spem.ProcessPackageableElement} object.
 *
 * @generated
 */
public class ProcessPackageableElementModelerProvider extends
		ItemProviderAdapter implements ILabelFeatureProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 *
	 * @param adapterFactory the adapter factory
	 * @generated
	 */
	public ProcessPackageableElementModelerProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.topcased.modeler.providers.ILabelFeatureProvider#getLabelFeature(java.lang.Object)
	 * @generated
	 */
	public EAttribute getLabelFeature(Object object) {
		return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
	}
}