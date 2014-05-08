/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia.preferences;

import org.topcased.modeler.family.FamilyPlugin;
import org.topcased.modeler.preferences.AbstractNodePreferencePage;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This class represents a preference page that is contributed to the Preferences or Property dialog. This page is used to modify
 * preferences only. They are stored in the preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 *
 * @generated
 */
public class manPreferencePage extends AbstractNodePreferencePage {
	/**
	 * @see org.topcased.modeler.preferences.AbstractNodePreferencePage#getNodeBackgroundColor()
	 * @generated
	 */
	protected String getNodeBackgroundColor() {
		return MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_BACKGROUND_COLOR;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractNodePreferencePage#getNodeFont()
	 * @generated
	 */
	protected String getNodeFont() {
		return MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_FONT;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractNodePreferencePage#getNodeForegroundColor()
	 * @generated
	 */
	protected String getNodeForegroundColor() {
		return MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_FOREGROUND_COLOR;
	}

	/**
	 * @see org.topcased.facilities.preferences.AbstractTopcasedPreferencePage#getBundleId()
	 * @generated
	 */
	protected String getBundleId() {
		return FamilyPlugin.getId();
	}

}
