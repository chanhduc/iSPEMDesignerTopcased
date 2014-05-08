/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.ispem.activityWF.figures.ProcessParameterFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative to the EReference connection.
 *
 * @generated
 */
public class ProcessParameterEdgeObjectUVEditPolicy extends
		EdgeObjectUVEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	protected boolean isEnd(IEdgeObjectFigure figure) {
		ProcessParameterFigure processparameterFigure = (ProcessParameterFigure) getHostFigure();

		if (figure == processparameterFigure.getDirectionEdgeObjectFigure()) {
			return true;
		}

		return true;
	}

}
