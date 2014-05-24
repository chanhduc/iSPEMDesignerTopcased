/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram;

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
import org.topcased.spem.activity.ActivityPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class ProcessWFDiagramPaletteManager extends ModelerPaletteManager {
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
	private PaletteDrawer processparameterDrawer;

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
	public ProcessWFDiagramPaletteManager(ICreationUtils utils) {
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
		createProcessParameterDrawer();
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

		getRoot().remove(processparameterDrawer);
		createProcessParameterDrawer();
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
				"Create Activity", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ACTIVITY"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ACTIVITY_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getArtifact(), "default");
		entries.add(new ModelerCreationToolEntry("Create Artifact",
				"Create Artifact", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ARTIFACT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ARTIFACT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getStartNode(), "default");
		entries.add(new ModelerCreationToolEntry("Start Node", "Start Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("STARTNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("STARTNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getEndNode(), "default");
		entries.add(new ModelerCreationToolEntry("End Node", "End Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ENDNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ENDNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getForkNode(), "default");
		entries.add(new ModelerCreationToolEntry("Fork Node", "Fork Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("FORKNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("FORKNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getJoinNode(), "default");
		entries.add(new ModelerCreationToolEntry("Join Node", "Join Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("JOINNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("JOINNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getDecisionNode(), "default");
		entries.add(new ModelerCreationToolEntry("Decision Node",
				"Decision Node", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("DECISIONNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("DECISIONNODE_LARGE")));

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
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE_LARGE")));

		edgeDrawer.addAll(entries);
		getRoot().add(edgeDrawer);
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
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactIn");
		entries.add(new ModelerConnectionCreationToolEntry("In", "In", factory,
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactOut");
		entries.add(new ModelerConnectionCreationToolEntry("Out", "Out",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactInOut");
		entries.add(new ModelerConnectionCreationToolEntry("InOut", "InOut",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT_LARGE")));

		processparameterDrawer.addAll(entries);
		getRoot().add(processparameterDrawer);
	}

}
