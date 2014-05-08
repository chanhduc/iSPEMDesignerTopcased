/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.topcased.family.util.FamilySwitch;
import org.topcased.modeler.familyDia.edit.*;
import org.topcased.modeler.familyDia.MyfamilySimpleObjectConstants;

import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.edit.EListEditPart;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.editor.ModelerEditPartFactory;
import org.topcased.modeler.evaluator.EvaluatorException;
import org.topcased.modeler.evaluator.extension.EvaluatorsManager;
import org.topcased.modeler.familyDia.edit.MarryWithEditPart;
import org.topcased.modeler.familyDia.edit.MyfamilyDiagramEditPart;
import org.topcased.modeler.familyDia.edit.manEditPart;
import org.topcased.modeler.familyDia.edit.womanEditPart;
import org.topcased.modeler.utils.Utils;

/**
 * Part Factory : associates a model object to its controller. <br>
 *
 * @generated
 */
public class MyfamilyEditPartFactory extends ModelerEditPartFactory {
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new MyfamilyDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				if ("com.example.family".equals(element.eClass().getEPackage()
						.getNsURI())) {
					return (EditPart) new NodeFamilySwitch(node)
							.doSwitch(element);
				}
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
			}
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				if ("com.example.family".equals(element.eClass().getEPackage()
						.getNsURI())) {
					return (EditPart) new EdgeFamilySwitch(edge)
							.doSwitch(element);
				}
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
				if (MyfamilySimpleObjectConstants.SIMPLE_OBJECT_MARRYWITH
						.equals(((SimpleSemanticModelElement) edge
								.getSemanticModel()).getTypeInfo())) {
					return new MarryWithEditPart(edge);
				}
			}
		}
		return super.createEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private class NodeFamilySwitch extends FamilySwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeFamilySwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.topcased.family.util.FamilySwitch#caseperson(org.topcased.family.person)
		 * @generated
		 */
		public Object caseperson(org.topcased.family.person object) {
			try {
				if (EvaluatorsManager.getInstance().evaluate(object,
						"self.sex=true", "ocl")) {
					return new womanEditPart(node);
				}
			} catch (EvaluatorException ee) {
				MyfamilyPlugin.log(ee);
			}
			try {
				if (EvaluatorsManager.getInstance().evaluate(object,
						"self.sex=false", "ocl")) {
					return new manEditPart(node);
				}
			} catch (EvaluatorException ee) {
				MyfamilyPlugin.log(ee);
			}
			return new EMFGraphNodeEditPart(node);
		}

		/**
		 * @see org.topcased.family.util.FamilySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeFamilySwitch extends FamilySwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeFamilySwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.topcased.family.util.FamilySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}