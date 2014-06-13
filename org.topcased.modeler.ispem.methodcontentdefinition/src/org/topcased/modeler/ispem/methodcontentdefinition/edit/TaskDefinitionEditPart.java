/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.MethodContentDefinitionEditPolicyConstants;
import org.topcased.modeler.ispem.methodcontentdefinition.commands.TaskDefinitionRestoreConnectionCommand;
import org.topcased.modeler.ispem.methodcontentdefinition.figures.TaskDefinitionFigure;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.Default_TaskDefinitionParameterInEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.Default_TaskDefinitionParameterInOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.Default_TaskDefinitionParameterOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.Default_TaskDefinitionPerformerEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.ToolUseEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.preferences.MethodContentDefinitionDiagramPreferenceConstants;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The TaskDefinition object controller
 *
 * @generated
 */
public class TaskDefinitionEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public TaskDefinitionEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.DEFAULT_TASKDEFINITIONPARAMETERIN_EDITPOLICY,
				new Default_TaskDefinitionParameterInEdgeCreationEditPolicy());

		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.DEFAULT_TASKDEFINITIONPARAMETEROUT_EDITPOLICY,
				new Default_TaskDefinitionParameterOutEdgeCreationEditPolicy());
		
		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.DEFAULT_TASKDEFINITIONPARAMETERINOUT_EDITPOLICY,
				new Default_TaskDefinitionParameterInOutEdgeCreationEditPolicy());
		
		
		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.DEFAULT_TASKDEFINITIONPERFORMER_EDITPOLICY,
				new Default_TaskDefinitionPerformerEdgeCreationEditPolicy());

		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.TOOLUSE_EDITPOLICY,
				new ToolUseEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new TaskDefinitionRestoreConnectionCommand(
								getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new TaskDefinitionFigure();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultBackgroundColor() {
		String backgroundColor = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_BACKGROUND_COLOR);
		if (backgroundColor.length() != 0) {
			return Utils.getColor(backgroundColor);
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultForegroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String foregroundColor = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_FOREGROUND_COLOR);
		if (foregroundColor.length() != 0) {
			return Utils.getColor(foregroundColor);
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultFont()
	 * @generated
	 */
	protected Font getPreferenceDefaultFont() {
		String preferenceFont = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;

	}

}