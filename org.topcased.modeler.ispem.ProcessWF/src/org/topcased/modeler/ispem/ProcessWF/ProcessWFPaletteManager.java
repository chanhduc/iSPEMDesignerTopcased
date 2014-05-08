/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWF;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.spem.SpemPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class ProcessWFPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer edgeDrawer;

	/**
	 * @generated
	 */
	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 *
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public ProcessWFPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createNodeDrawer();
		createEdgeDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(nodeDrawer);
		createNodeDrawer();

		getRoot().remove(edgeDrawer);
		createEdgeDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createNodeDrawer() {
		nodeDrawer = new PaletteDrawer("Node", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getActivity(), "default");
		entries.add(new ModelerCreationToolEntry("Create Activity",
				"Create Activity", factory, ProcessWFImageRegistry
						.getImageDescriptor("ACTIVITY"), ProcessWFImageRegistry
						.getImageDescriptor("ACTIVITY_LARGE")));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createEdgeDrawer() {
		edgeDrawer = new PaletteDrawer("Edge", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkSequence(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Edge", "Edge",
				factory, ProcessWFImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFImageRegistry.getImageDescriptor("WORKSEQUENCE_LARGE")));

		edgeDrawer.addAll(entries);
		getRoot().add(edgeDrawer);
	}

}
