package org.topcased.modeler.ispem.ProcessWFDiagram.figures;

import org.topcased.draw2d.figures.ImageWithLabelFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramImageRegistry;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramPlugin;

public class ActivityFigure extends ImageWithLabelFigure

{
	public ActivityFigure() {
		// TODO Auto-generated constructor stub
		super(ProcessWFDiagramImageRegistry.getImage("ACTIVITY_LARGE"));
	}
}