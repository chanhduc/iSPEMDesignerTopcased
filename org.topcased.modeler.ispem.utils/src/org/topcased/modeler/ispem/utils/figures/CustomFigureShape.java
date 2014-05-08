
package org.topcased.modeler.ispem.utils.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
/**
 * @author dstadnik
 */
public class CustomFigureShape extends Figure {

	private String packImg = "PATPRO"; 
	public  String strPath = "/icons/CompositeRole.jpg";
	
	public CustomFigureShape() {
	//this.Initial();
	}
	

	protected static Image getImage(String path) {
		
		Image image = JFaceResources.getImageRegistry().get(path);
		if (image == null) {
		
			ImageDescriptor descriptor = getDescriptor(path); //$NON-NLS-1$
			if (descriptor == null) {
				descriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			JFaceResources.getImageRegistry().put(path, image = descriptor.createImage());
		}
		return image;
	}
	public static ImageDescriptor getDescriptor(String path)
	{
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.topcased.modeler.ispem.utils",  path);
	}
	public static  Image imgArtifactDefinition=getImage("icons/WorkProductDefinition.png");
	public static  ImageDescriptor imdeArtifactDefinition=getDescriptor("icons/WorkProductDefinition.png");
	public static  Image imgTaskDefinition=getImage("icons/TaskDefinition.png");
	public static  ImageDescriptor imdeTaskDefinition =getDescriptor("icons/TaskDefinition.png");
	}
