/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF;

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
public class ActivityWFPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer processparameterDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer processperformerDrawer;

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
	public ActivityWFPaletteManager(ICreationUtils utils) {
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
		createProcessParameterDrawer();
		createProcessPerformerDrawer();
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

		getRoot().remove(processparameterDrawer);
		createProcessParameterDrawer();

		getRoot().remove(processperformerDrawer);
		createProcessPerformerDrawer();
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
				SpemPackage.eINSTANCE.getTaskUse(), "default");
		entries.add(new ModelerCreationToolEntry("Create Task Use",
				"Create Task Use", factory, ActivityWFImageRegistry
						.getImageDescriptor("TASKUSE"), ActivityWFImageRegistry
						.getImageDescriptor("TASKUSE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getRoleUse(), "default");
		entries.add(new ModelerCreationToolEntry("Create Role Use",
				"Create Role Use", factory, ActivityWFImageRegistry
						.getImageDescriptor("ROLEUSE"), ActivityWFImageRegistry
						.getImageDescriptor("ROLEUSE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getArtifact(), "default");
		entries.add(new ModelerCreationToolEntry("Create Artifact",
				"Create Artifact", factory, ActivityWFImageRegistry
						.getImageDescriptor("ARTIFACT"),
				ActivityWFImageRegistry.getImageDescriptor("ARTIFACT_LARGE")));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createProcessParameterDrawer() {
		processparameterDrawer = new PaletteDrawer("ProcessParameter", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Artifact In",
				"Artifact In", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETER"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETER_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Artifact Out",
				"Artifact Out", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETER"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETER_LARGE")));

		processparameterDrawer.addAll(entries);
		getRoot().add(processparameterDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createProcessPerformerDrawer() {
		processperformerDrawer = new PaletteDrawer("ProcessPerformer", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessPerformer(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Realize Task",
				"Realize Task", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPERFORMER"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPERFORMER_LARGE")));

		processperformerDrawer.addAll(entries);
		getRoot().add(processperformerDrawer);
	}

}
