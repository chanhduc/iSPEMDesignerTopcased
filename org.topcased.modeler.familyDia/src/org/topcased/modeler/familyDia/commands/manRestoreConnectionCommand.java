/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.family.person;
import org.topcased.family.*;

import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.familyDia.MyfamilySimpleObjectConstants;
import org.topcased.modeler.utils.Utils;

/**
 * person restore connection command
 *
 * @generated
 */
public class manRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public manRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof person) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);
				if (eObjectTgt instanceof person) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createMarryWithFrompersonToperson(graphElementSrc,
								graphElementTgt);
					}
				}

			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated
	 */
	private void createMarryWithFrompersonToperson(GraphElement srcElt,
			GraphElement targetElt) {
		person sourceObject = (person) Utils.getElement(srcElt);
		person targetObject = (person) Utils.getElement(targetElt);

		if (targetObject.equals(sourceObject.getMarryWith())) {
			// check if the relation does not exists yet
			if (getExistingEdges(srcElt, targetElt,
					MyfamilySimpleObjectConstants.SIMPLE_OBJECT_MARRYWITH)
					.size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(MyfamilySimpleObjectConstants.SIMPLE_OBJECT_MARRYWITH);
				MarryWithEdgeCreationCommand cmd = new MarryWithEdgeCreationCommand(
						null, edge, srcElt, false);
				cmd.setTarget(targetElt);
				add(cmd);
			}
		}
	}

}