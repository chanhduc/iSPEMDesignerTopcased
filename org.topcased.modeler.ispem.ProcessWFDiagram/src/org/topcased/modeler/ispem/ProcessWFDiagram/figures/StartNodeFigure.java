package org.topcased.modeler.ispem.ProcessWFDiagram.figures;

import org.topcased.draw2d.figures.ImageWithLabelFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramImageRegistry;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramPlugin;

public class StartNodeFigure extends ImageWithLabelFigure

{
	public StartNodeFigure() {
		// TODO Auto-generated constructor stub
		super(ProcessWFDiagramImageRegistry.getImage("STARTNODE_LARGE"));
	}
}