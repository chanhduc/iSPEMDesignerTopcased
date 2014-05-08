/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectOffset;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.family.util.FamilySwitch;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.evaluator.EvaluatorException;
import org.topcased.modeler.evaluator.extension.EvaluatorsManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import org.topcased.modeler.familyDia.MyfamilyPlugin;
import org.topcased.modeler.family.FamilyPlugin;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 *
 * @generated
 */
public class MyfamilyCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 *
	 * @param diagramConf the Diagram Graphical Configuration
	 * @generated
	 */
	public MyfamilyCreationUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicFamilySwitch extends FamilySwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicFamilySwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.family.util.FamilySwitch#caseperson(org.topcased.family.person)
		 * @generated
		 */
		public Object caseperson(org.topcased.family.person object) {
			try {
				if ("default".equals(presentation)
						&& EvaluatorsManager.getInstance().evaluate(object,
								"self.sex=false", "ocl")) {
					return createGraphElementman(object, presentation);
				}
			} catch (EvaluatorException ee) {
				MyfamilyPlugin.log(ee);
			}
			try {
				if ("default".equals(presentation)
						&& EvaluatorsManager.getInstance().evaluate(object,
								"self.sex=true", "ocl")) {
					return createGraphElementwoman(object, presentation);
				}
			} catch (EvaluatorException ee) {
				MyfamilyPlugin.log(ee);
			}
			return null;
		}

		/**
		 * @see org.topcased.family.util.FamilySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = null;

		if ("com.example.family".equals(obj.eClass().getEPackage().getNsURI())) {
			graphElt = new GraphicFamilySwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementman(
			org.topcased.family.person element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementwoman(
			org.topcased.family.person element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * Create the ModelObject with its initial children
	 * 
	 * @param obj the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj) {
		return obj;
	}

	/**
	 * Get the preference store associated with the current editor.
	 * 
	 * @return IPreferenceStore
	 * @generated
	 */
	private IPreferenceStore getPreferenceStore() {
		IEditorInput editorInput = MyfamilyPlugin.getActivePage()
				.getActiveEditor().getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			IProject project = ((IFileEditorInput) editorInput).getFile()
					.getProject();
			Preferences root = Platform.getPreferencesService().getRootNode();
			try {
				if (root.node(ProjectScope.SCOPE).node(project.getName())
						.nodeExists(MyfamilyPlugin.getId())) {
					return new ScopedPreferenceStore(new ProjectScope(project),
							MyfamilyPlugin.getId());
				}
			} catch (BackingStoreException e) {
				e.printStackTrace();
			}
		}
		return MyfamilyPlugin.getDefault().getPreferenceStore();
	}
}
