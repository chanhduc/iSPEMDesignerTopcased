/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of Myfamily diagram
 * 
 * @generated
 */
public class MyfamilyDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultMyfamilyPreference = new HashMap<String, String>();
		// Initialize the default value of the WOMAN_DEFAULT_BACKGROUND_COLOR property 
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.WOMAN_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the WOMAN_DEFAULT_FOREGROUND_COLOR property
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.WOMAN_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the WOMAN_DEFAULT_FONT property
		defaultMyfamilyPreference.put(
				MyfamilyDiagramPreferenceConstants.WOMAN_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the MAN_DEFAULT_BACKGROUND_COLOR property 
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the MAN_DEFAULT_FOREGROUND_COLOR property
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the MAN_DEFAULT_FONT property
		defaultMyfamilyPreference.put(
				MyfamilyDiagramPreferenceConstants.MAN_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the MARRYWITH_EDGE_DEFAULT_FONT property
		defaultMyfamilyPreference.put(
				MyfamilyDiagramPreferenceConstants.MARRYWITH_EDGE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the MARRYWITH_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.MARRYWITH_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the MARRYWITH_EDGE_DEFAULT_ROUTER property
		defaultMyfamilyPreference
				.put(MyfamilyDiagramPreferenceConstants.MARRYWITH_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		return defaultMyfamilyPreference;
	}
}
