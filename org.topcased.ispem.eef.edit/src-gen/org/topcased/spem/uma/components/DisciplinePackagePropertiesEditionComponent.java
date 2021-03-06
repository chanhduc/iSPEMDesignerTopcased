/**
 * Generated with Acceleo
 */
package org.topcased.spem.uma.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.DisciplinePackage;

import org.topcased.spem.uma.parts.DisciplinePackagePropertiesEditionPart;
import org.topcased.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DisciplinePackagePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedMethodContentMember ReferencesTable
	 */
	protected ReferencesTableSettings ownedMethodContentMemberSettings;
	
	/**
	 * Settings for reusedPackage ReferencesTable
	 */
	private ReferencesTableSettings reusedPackageSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DisciplinePackagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject disciplinePackage, String editing_mode) {
		super(editingContext, disciplinePackage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.DisciplinePackage.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final DisciplinePackage disciplinePackage = (DisciplinePackage)elt;
			final DisciplinePackagePropertiesEditionPart basePart = (DisciplinePackagePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(UmaViewsRepository.DisciplinePackage.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, disciplinePackage.getName()));
			
			if (isAccessible(UmaViewsRepository.DisciplinePackage.Properties.ownedMethodContentMember)) {
				ownedMethodContentMemberSettings = new ReferencesTableSettings(disciplinePackage, SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember());
				basePart.initOwnedMethodContentMember(ownedMethodContentMemberSettings);
			}
			if (isAccessible(UmaViewsRepository.DisciplinePackage.Properties.reusedPackage)) {
				reusedPackageSettings = new ReferencesTableSettings(disciplinePackage, SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage());
				basePart.initReusedPackage(reusedPackageSettings);
			}
			// init filters
			
			if (isAccessible(UmaViewsRepository.DisciplinePackage.Properties.ownedMethodContentMember)) {
				basePart.addFilterToOwnedMethodContentMember(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodContentPackageableElement); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedMethodContentMember
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DisciplinePackage.Properties.reusedPackage)) {
				basePart.addFilterToReusedPackage(new EObjectFilter(SpemPackage.Literals.METHOD_CONTENT_PACKAGE));
				// Start of user code for additional businessfilters for reusedPackage
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == UmaViewsRepository.DisciplinePackage.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.DisciplinePackage.Properties.ownedMethodContentMember) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember();
		}
		if (editorKey == UmaViewsRepository.DisciplinePackage.Properties.reusedPackage) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DisciplinePackage disciplinePackage = (DisciplinePackage)semanticObject;
		if (UmaViewsRepository.DisciplinePackage.Properties.name == event.getAffectedEditor()) {
			disciplinePackage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DisciplinePackage.Properties.ownedMethodContentMember == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedMethodContentMemberSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownedMethodContentMemberSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedMethodContentMemberSettings.move(event.getNewIndex(), (MethodContentPackageableElement) event.getNewValue());
			}
		}
		if (UmaViewsRepository.DisciplinePackage.Properties.reusedPackage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodContentPackage) {
					reusedPackageSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				reusedPackageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				reusedPackageSettings.move(event.getNewIndex(), (MethodContentPackage) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			DisciplinePackagePropertiesEditionPart basePart = (DisciplinePackagePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DisciplinePackage.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember().equals(msg.getFeature()) && isAccessible(UmaViewsRepository.DisciplinePackage.Properties.ownedMethodContentMember))
				basePart.updateOwnedMethodContentMember();
			if (SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DisciplinePackage.Properties.reusedPackage))
				basePart.updateReusedPackage();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name(),
			SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember(),
			SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (UmaViewsRepository.DisciplinePackage.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
