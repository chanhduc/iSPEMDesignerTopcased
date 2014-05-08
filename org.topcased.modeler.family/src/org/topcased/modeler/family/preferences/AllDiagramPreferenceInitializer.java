/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.family.preferences;

import org.eclipse.core.runtime.Preferences;
import org.topcased.modeler.family.FamilyPlugin;
import org.topcased.modeler.family.editor.FamilyEditor;
import org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer;

/**
 * Initialize preferences to all Family diagrams.
 * @generated
 */
public class AllDiagramPreferenceInitializer extends
		AbstractTopcasedPreferenceInitializer {

	/**
	 * @see org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer#getPreferences()
	 * @generated
	 */
	@Override
	protected Preferences getPreferences() {
		return FamilyPlugin.getDefault().getPluginPreferences();
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer#getEditorId()
	 * @generated
	 */
	protected String getEditorId() {
		return FamilyEditor.EDITOR_ID;
	}
}