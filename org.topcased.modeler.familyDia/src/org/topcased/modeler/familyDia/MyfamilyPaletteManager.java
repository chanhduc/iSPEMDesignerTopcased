/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.familyDia;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.family.FamilyPackage;
import org.topcased.modeler.familyDia.MyfamilyImageRegistry;
import org.topcased.modeler.familyDia.MyfamilySimpleObjectConstants;

import org.topcased.family.person;
import org.topcased.family.impl.FamilyPackageImpl;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

import sun.misc.Perf.GetPerfAction;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class MyfamilyPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer cata1Drawer;

	/**
	 * @generated
	 */
	private PaletteDrawer cata2Drawer;

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
	public MyfamilyPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createcata1Drawer();
		createcata2Drawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(cata1Drawer);
		createcata1Drawer();

		getRoot().remove(cata2Drawer);
		createcata2Drawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createcata1Drawer() {
		cata1Drawer = new PaletteDrawer("cata1", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				FamilyPackage.eINSTANCE.getperson(), "default");
		entries.add(new ModelerCreationToolEntry("Create man", "Create man",
				factory, MyfamilyImageRegistry.getImageDescriptor("MAN"),
				MyfamilyImageRegistry.getImageDescriptor("MAN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				FamilyPackage.eINSTANCE.getperson(), "default");
		entries.add(new ModelerCreationToolEntry("Create Woman",
				"Create Woman", factory, MyfamilyImageRegistry
						.getImageDescriptor("WOMAN"), MyfamilyImageRegistry
						.getImageDescriptor("WOMAN_LARGE")));

		cata1Drawer.addAll(entries);
		getRoot().add(cata1Drawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createcata2Drawer() {
		cata2Drawer = new PaletteDrawer("cata2", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				MyfamilySimpleObjectConstants.SIMPLE_OBJECT_MARRYWITH,
				"default", false);
		entries.add(new ModelerConnectionCreationToolEntry("Marry", "Marry",
				factory, MyfamilyImageRegistry.getImageDescriptor("MARRYWITH"),
				MyfamilyImageRegistry.getImageDescriptor("MARRYWITH_LARGE")));

		cata2Drawer.addAll(entries);
		getRoot().add(cata2Drawer);
	}

}
