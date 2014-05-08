/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWF.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of ProcessWF diagram
 * 
 * @generated
 */
public class ProcessWFDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultProcessWFPreference = new HashMap<String, String>();
		// Initialize the default value of the ACTIVITY_DEFAULT_BACKGROUND_COLOR property 
		defaultProcessWFPreference
				.put(ProcessWFDiagramPreferenceConstants.ACTIVITY_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ACTIVITY_DEFAULT_FOREGROUND_COLOR property
		defaultProcessWFPreference
				.put(ProcessWFDiagramPreferenceConstants.ACTIVITY_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ACTIVITY_DEFAULT_FONT property
		defaultProcessWFPreference.put(
				ProcessWFDiagramPreferenceConstants.ACTIVITY_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the WORKSEQUENCE_EDGE_DEFAULT_FONT property
		defaultProcessWFPreference
				.put(ProcessWFDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the WORKSEQUENCE_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultProcessWFPreference
				.put(ProcessWFDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,64,128");

		// Initialize the default value of the WORKSEQUENCE_EDGE_DEFAULT_ROUTER property
		defaultProcessWFPreference
				.put(ProcessWFDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		return defaultProcessWFPreference;
	}
}
