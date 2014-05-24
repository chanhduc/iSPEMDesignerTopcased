package org.topcased.modeler.ispem.ProcessWFDiagram.figures;

import org.topcased.draw2d.figures.ImageWithLabelFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramImageRegistry;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramPlugin;

public class DecisionNodeFigure extends ImageWithLabelFigure

{
	public DecisionNodeFigure() {
		// TODO Auto-generated constructor stub
		super(ProcessWFDiagramImageRegistry.getImage("DECISONNODE_LARGE"));
	}
}