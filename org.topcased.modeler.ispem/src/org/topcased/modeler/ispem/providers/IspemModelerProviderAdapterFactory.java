/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.topcased.ispem.util.IspemAdapterFactory;
import org.topcased.modeler.providers.ILabelFeatureProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances.
 * 
 * @generated
 */
public class IspemModelerProviderAdapterFactory extends IspemAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * 
	 * @generated
	 */
	private ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * 
	 * @generated
	 */
	private IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * 
	 * @generated
	 */
	private Collection supportedTypes = new ArrayList();

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.EngineeringDomain} instances.
	 * 
	 * @generated
	 */
	private EngineeringDomainModelerProvider engineeringdomainModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.ToolDefinition} instances.
	 * 
	 * @generated
	 */
	private ToolDefinitionModelerProvider tooldefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.Viewpoint} instances.
	 * 
	 * @generated
	 */
	private ViewpointModelerProvider viewpointModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.TaskDefinition} instances.
	 * 
	 * @generated
	 */
	private TaskDefinitionModelerProvider taskdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.WorkProductDefinition} instances.
	 * 
	 * @generated
	 */
	private WorkProductDefinitionModelerProvider workproductdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.ISPEM} instances.
	 * 
	 * @generated
	 */
	private ISPEMModelerProvider ispemModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DevelopmentMethod} instances.
	 * 
	 * @generated
	 */
	private DevelopmentMethodModelerProvider developmentmethodModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.EngineeringDomainPackage} instances.
	 * 
	 * @generated
	 */
	private EngineeringDomainPackageModelerProvider engineeringdomainpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DevelopmentMethodPackage} instances.
	 * 
	 * @generated
	 */
	private DevelopmentMethodPackageModelerProvider developmentmethodpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.OntologyLinkedElement} instances.
	 * 
	 * @generated
	 */
	private OntologyLinkedElementModelerProvider ontologylinkedelementModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.ArtifactDefinitionPackage} instances.
	 * 
	 * @generated
	 */
	private ArtifactDefinitionPackageModelerProvider artifactdefinitionpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.Artifact} instances.
	 * 
	 * @generated
	 */
	private ArtifactModelerProvider artifactModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.Activity} instances.
	 * 
	 * @generated
	 */
	private ActivityModelerProvider activityModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.ArtifactTransformation} instances.
	 * 
	 * @generated
	 */
	private ArtifactTransformationModelerProvider artifacttransformationModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DomainTaskDefinition} instances.
	 * 
	 * @generated
	 */
	private DomainTaskDefinitionModelerProvider domaintaskdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.MethodTaskDefinition} instances.
	 * 
	 * @generated
	 */
	private MethodTaskDefinitionModelerProvider methodtaskdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DomainArtifactDefinition} instances.
	 * 
	 * @generated
	 */
	private DomainArtifactDefinitionModelerProvider domainartifactdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.MethodArtifactDefinition} instances.
	 * 
	 * @generated
	 */
	private MethodArtifactDefinitionModelerProvider methodartifactdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DomainContentPackage} instances.
	 * 
	 * @generated
	 */
	private DomainContentPackageModelerProvider domaincontentpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DevelopmentMethodContentPackage} instances.
	 * 
	 * @generated
	 */
	private DevelopmentMethodContentPackageModelerProvider developmentmethodcontentpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.Process} instances.
	 * 
	 * @generated
	 */
	private ProcessModelerProvider processModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.LanguageArtifactDefinition} instances.
	 * 
	 * @generated
	 */
	private LanguageArtifactDefinitionModelerProvider languageartifactdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.LanguageTaskDefinition} instances.
	 * 
	 * @generated
	 */
	private LanguageTaskDefinitionModelerProvider languagetaskdefinitionModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage} instances.
	 * 
	 * @generated
	 */
	private DevelopmentMethodWithLanguageContentPackageModelerProvider developmentmethodwithlanguagecontentpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.RepresentativeLanguage} instances.
	 * 
	 * @generated
	 */
	private RepresentativeLanguageModelerProvider representativelanguageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.RepresentLanguagePackage} instances.
	 * 
	 * @generated
	 */
	private RepresentLanguagePackageModelerProvider representlanguagepackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.MetaModelPackage} instances.
	 * 
	 * @generated
	 */
	private MetaModelPackageModelerProvider metamodelpackageModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.MetaModel} instances.
	 * 
	 * @generated
	 */
	private MetaModelModelerProvider metamodelModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.EClassesRelation} instances.
	 * 
	 * @generated
	 */
	private EClassesRelationModelerProvider eclassesrelationModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.EReferencesRelation} instances.
	 * 
	 * @generated
	 */
	private EReferencesRelationModelerProvider ereferencesrelationModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.ispem.ArtifactDefinition} instances.
	 * 
	 * @generated
	 */
	private ArtifactDefinitionModelerProvider artifactdefinitionModelerProvider;

	/**
	 * This constructs an instance.
	 * 
	 * @generated
	 */
	public IspemModelerProviderAdapterFactory() {
		supportedTypes.add(ILabelFeatureProvider.class);
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 *
	 * @return the root AdapterFactory
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 *
	 * @param parentAdapterFactory the new parent adapter factory
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * @param type the type to test
	 * @return true if supported
	 * 
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 *
	 * @param notifier the notifier
	 * @param type the object to adapt
	 * @return the Adapter the created adatper
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * @param object the object to adapt
	 * @param type the type to adapt
	 * @return the adapted Object
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class)
					|| (((Class) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 *
	 * @param notifyChangedListener the listener to add
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 *
	 * @param notifyChangedListener the listener to remove
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 *
	 * @param notification the notification to fire
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.EngineeringDomain}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEngineeringDomainAdapter() {
		if (engineeringdomainModelerProvider == null) {
			engineeringdomainModelerProvider = new EngineeringDomainModelerProvider(
					this);
		}

		return engineeringdomainModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.ToolDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createToolDefinitionAdapter() {
		if (tooldefinitionModelerProvider == null) {
			tooldefinitionModelerProvider = new ToolDefinitionModelerProvider(
					this);
		}

		return tooldefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.Viewpoint}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createViewpointAdapter() {
		if (viewpointModelerProvider == null) {
			viewpointModelerProvider = new ViewpointModelerProvider(this);
		}

		return viewpointModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.TaskDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createTaskDefinitionAdapter() {
		if (taskdefinitionModelerProvider == null) {
			taskdefinitionModelerProvider = new TaskDefinitionModelerProvider(
					this);
		}

		return taskdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.WorkProductDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		if (workproductdefinitionModelerProvider == null) {
			workproductdefinitionModelerProvider = new WorkProductDefinitionModelerProvider(
					this);
		}

		return workproductdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.ISPEM}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createISPEMAdapter() {
		if (ispemModelerProvider == null) {
			ispemModelerProvider = new ISPEMModelerProvider(this);
		}

		return ispemModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DevelopmentMethod}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDevelopmentMethodAdapter() {
		if (developmentmethodModelerProvider == null) {
			developmentmethodModelerProvider = new DevelopmentMethodModelerProvider(
					this);
		}

		return developmentmethodModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.EngineeringDomainPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEngineeringDomainPackageAdapter() {
		if (engineeringdomainpackageModelerProvider == null) {
			engineeringdomainpackageModelerProvider = new EngineeringDomainPackageModelerProvider(
					this);
		}

		return engineeringdomainpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DevelopmentMethodPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDevelopmentMethodPackageAdapter() {
		if (developmentmethodpackageModelerProvider == null) {
			developmentmethodpackageModelerProvider = new DevelopmentMethodPackageModelerProvider(
					this);
		}

		return developmentmethodpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.OntologyLinkedElement}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createOntologyLinkedElementAdapter() {
		if (ontologylinkedelementModelerProvider == null) {
			ontologylinkedelementModelerProvider = new OntologyLinkedElementModelerProvider(
					this);
		}

		return ontologylinkedelementModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.ArtifactDefinitionPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createArtifactDefinitionPackageAdapter() {
		if (artifactdefinitionpackageModelerProvider == null) {
			artifactdefinitionpackageModelerProvider = new ArtifactDefinitionPackageModelerProvider(
					this);
		}

		return artifactdefinitionpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.Artifact}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		if (artifactModelerProvider == null) {
			artifactModelerProvider = new ArtifactModelerProvider(this);
		}

		return artifactModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.Activity}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		if (activityModelerProvider == null) {
			activityModelerProvider = new ActivityModelerProvider(this);
		}

		return activityModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.ArtifactTransformation}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createArtifactTransformationAdapter() {
		if (artifacttransformationModelerProvider == null) {
			artifacttransformationModelerProvider = new ArtifactTransformationModelerProvider(
					this);
		}

		return artifacttransformationModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DomainTaskDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDomainTaskDefinitionAdapter() {
		if (domaintaskdefinitionModelerProvider == null) {
			domaintaskdefinitionModelerProvider = new DomainTaskDefinitionModelerProvider(
					this);
		}

		return domaintaskdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.MethodTaskDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createMethodTaskDefinitionAdapter() {
		if (methodtaskdefinitionModelerProvider == null) {
			methodtaskdefinitionModelerProvider = new MethodTaskDefinitionModelerProvider(
					this);
		}

		return methodtaskdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DomainArtifactDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDomainArtifactDefinitionAdapter() {
		if (domainartifactdefinitionModelerProvider == null) {
			domainartifactdefinitionModelerProvider = new DomainArtifactDefinitionModelerProvider(
					this);
		}

		return domainartifactdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.MethodArtifactDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createMethodArtifactDefinitionAdapter() {
		if (methodartifactdefinitionModelerProvider == null) {
			methodartifactdefinitionModelerProvider = new MethodArtifactDefinitionModelerProvider(
					this);
		}

		return methodartifactdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DomainContentPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDomainContentPackageAdapter() {
		if (domaincontentpackageModelerProvider == null) {
			domaincontentpackageModelerProvider = new DomainContentPackageModelerProvider(
					this);
		}

		return domaincontentpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DevelopmentMethodContentPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDevelopmentMethodContentPackageAdapter() {
		if (developmentmethodcontentpackageModelerProvider == null) {
			developmentmethodcontentpackageModelerProvider = new DevelopmentMethodContentPackageModelerProvider(
					this);
		}

		return developmentmethodcontentpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.Process}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		if (processModelerProvider == null) {
			processModelerProvider = new ProcessModelerProvider(this);
		}

		return processModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.LanguageArtifactDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createLanguageArtifactDefinitionAdapter() {
		if (languageartifactdefinitionModelerProvider == null) {
			languageartifactdefinitionModelerProvider = new LanguageArtifactDefinitionModelerProvider(
					this);
		}

		return languageartifactdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.LanguageTaskDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createLanguageTaskDefinitionAdapter() {
		if (languagetaskdefinitionModelerProvider == null) {
			languagetaskdefinitionModelerProvider = new LanguageTaskDefinitionModelerProvider(
					this);
		}

		return languagetaskdefinitionModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDevelopmentMethodWithLanguageContentPackageAdapter() {
		if (developmentmethodwithlanguagecontentpackageModelerProvider == null) {
			developmentmethodwithlanguagecontentpackageModelerProvider = new DevelopmentMethodWithLanguageContentPackageModelerProvider(
					this);
		}

		return developmentmethodwithlanguagecontentpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.RepresentativeLanguage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createRepresentativeLanguageAdapter() {
		if (representativelanguageModelerProvider == null) {
			representativelanguageModelerProvider = new RepresentativeLanguageModelerProvider(
					this);
		}

		return representativelanguageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.RepresentLanguagePackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createRepresentLanguagePackageAdapter() {
		if (representlanguagepackageModelerProvider == null) {
			representlanguagepackageModelerProvider = new RepresentLanguagePackageModelerProvider(
					this);
		}

		return representlanguagepackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.MetaModelPackage}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createMetaModelPackageAdapter() {
		if (metamodelpackageModelerProvider == null) {
			metamodelpackageModelerProvider = new MetaModelPackageModelerProvider(
					this);
		}

		return metamodelpackageModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.MetaModel}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		if (metamodelModelerProvider == null) {
			metamodelModelerProvider = new MetaModelModelerProvider(this);
		}

		return metamodelModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.EClassesRelation}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEClassesRelationAdapter() {
		if (eclassesrelationModelerProvider == null) {
			eclassesrelationModelerProvider = new EClassesRelationModelerProvider(
					this);
		}

		return eclassesrelationModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.EReferencesRelation}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEReferencesRelationAdapter() {
		if (ereferencesrelationModelerProvider == null) {
			ereferencesrelationModelerProvider = new EReferencesRelationModelerProvider(
					this);
		}

		return ereferencesrelationModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.ispem.ArtifactDefinition}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createArtifactDefinitionAdapter() {
		if (artifactdefinitionModelerProvider == null) {
			artifactdefinitionModelerProvider = new ArtifactDefinitionModelerProvider(
					this);
		}

		return artifactdefinitionModelerProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * 
	 * @generated
	 */
	public void dispose() {
		if (engineeringdomainModelerProvider != null) {
			engineeringdomainModelerProvider.dispose();
		}
		if (tooldefinitionModelerProvider != null) {
			tooldefinitionModelerProvider.dispose();
		}
		if (viewpointModelerProvider != null) {
			viewpointModelerProvider.dispose();
		}
		if (taskdefinitionModelerProvider != null) {
			taskdefinitionModelerProvider.dispose();
		}
		if (workproductdefinitionModelerProvider != null) {
			workproductdefinitionModelerProvider.dispose();
		}
		if (ispemModelerProvider != null) {
			ispemModelerProvider.dispose();
		}
		if (developmentmethodModelerProvider != null) {
			developmentmethodModelerProvider.dispose();
		}
		if (engineeringdomainpackageModelerProvider != null) {
			engineeringdomainpackageModelerProvider.dispose();
		}
		if (developmentmethodpackageModelerProvider != null) {
			developmentmethodpackageModelerProvider.dispose();
		}
		if (ontologylinkedelementModelerProvider != null) {
			ontologylinkedelementModelerProvider.dispose();
		}
		if (artifactdefinitionpackageModelerProvider != null) {
			artifactdefinitionpackageModelerProvider.dispose();
		}
		if (artifactModelerProvider != null) {
			artifactModelerProvider.dispose();
		}
		if (activityModelerProvider != null) {
			activityModelerProvider.dispose();
		}
		if (artifacttransformationModelerProvider != null) {
			artifacttransformationModelerProvider.dispose();
		}
		if (domaintaskdefinitionModelerProvider != null) {
			domaintaskdefinitionModelerProvider.dispose();
		}
		if (methodtaskdefinitionModelerProvider != null) {
			methodtaskdefinitionModelerProvider.dispose();
		}
		if (domainartifactdefinitionModelerProvider != null) {
			domainartifactdefinitionModelerProvider.dispose();
		}
		if (methodartifactdefinitionModelerProvider != null) {
			methodartifactdefinitionModelerProvider.dispose();
		}
		if (domaincontentpackageModelerProvider != null) {
			domaincontentpackageModelerProvider.dispose();
		}
		if (developmentmethodcontentpackageModelerProvider != null) {
			developmentmethodcontentpackageModelerProvider.dispose();
		}
		if (processModelerProvider != null) {
			processModelerProvider.dispose();
		}
		if (languageartifactdefinitionModelerProvider != null) {
			languageartifactdefinitionModelerProvider.dispose();
		}
		if (languagetaskdefinitionModelerProvider != null) {
			languagetaskdefinitionModelerProvider.dispose();
		}
		if (developmentmethodwithlanguagecontentpackageModelerProvider != null) {
			developmentmethodwithlanguagecontentpackageModelerProvider
					.dispose();
		}
		if (representativelanguageModelerProvider != null) {
			representativelanguageModelerProvider.dispose();
		}
		if (representlanguagepackageModelerProvider != null) {
			representlanguagepackageModelerProvider.dispose();
		}
		if (metamodelpackageModelerProvider != null) {
			metamodelpackageModelerProvider.dispose();
		}
		if (metamodelModelerProvider != null) {
			metamodelModelerProvider.dispose();
		}
		if (eclassesrelationModelerProvider != null) {
			eclassesrelationModelerProvider.dispose();
		}
		if (ereferencesrelationModelerProvider != null) {
			ereferencesrelationModelerProvider.dispose();
		}
		if (artifactdefinitionModelerProvider != null) {
			artifactdefinitionModelerProvider.dispose();
		}
	}

}
