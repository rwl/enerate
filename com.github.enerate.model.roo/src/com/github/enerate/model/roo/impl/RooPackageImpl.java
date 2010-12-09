/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo.impl;

import com.github.enerate.model.roo.PersistenceSetup;
import com.github.enerate.model.roo.Project;
import com.github.enerate.model.roo.RooFactory;
import com.github.enerate.model.roo.RooModel;
import com.github.enerate.model.roo.RooPackage;
import com.github.enerate.model.roo.databaseType;
import com.github.enerate.model.roo.javaVersion;
import com.github.enerate.model.roo.providerType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RooPackageImpl extends EPackageImpl implements RooPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rooModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum javaVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.enerate.model.roo.RooPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RooPackageImpl() {
		super(eNS_URI, RooFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RooPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RooPackage init() {
		if (isInited) return (RooPackage)EPackage.Registry.INSTANCE.getEPackage(RooPackage.eNS_URI);

		// Obtain or create and register package
		RooPackageImpl theRooPackage = (RooPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RooPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RooPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRooPackage.createPackageContents();

		// Initialize created meta-data
		theRooPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRooPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RooPackage.eNS_URI, theRooPackage);
		return theRooPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRooModel() {
		return rooModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRooModel_Project() {
		return (EReference)rooModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRooModel_Persistence() {
		return (EReference)rooModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRooModel_Model() {
		return (EReference)rooModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_TopLevelPackage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ProjectName() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Java() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceSetup() {
		return persistenceSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_Provider() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_Database() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_ApplicationId() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_JndiDataSource() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_HostName() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_DatabaseName() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_UserName() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_Password() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceSetup_PersistenceUnit() {
		return (EAttribute)persistenceSetupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getjavaVersion() {
		return javaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getproviderType() {
		return providerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RooFactory getRooFactory() {
		return (RooFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rooModelEClass = createEClass(ROO_MODEL);
		createEReference(rooModelEClass, ROO_MODEL__PROJECT);
		createEReference(rooModelEClass, ROO_MODEL__PERSISTENCE);
		createEReference(rooModelEClass, ROO_MODEL__MODEL);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__TOP_LEVEL_PACKAGE);
		createEAttribute(projectEClass, PROJECT__PROJECT_NAME);
		createEAttribute(projectEClass, PROJECT__JAVA);

		persistenceSetupEClass = createEClass(PERSISTENCE_SETUP);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__PROVIDER);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__DATABASE);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__APPLICATION_ID);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__JNDI_DATA_SOURCE);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__HOST_NAME);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__DATABASE_NAME);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__USER_NAME);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__PASSWORD);
		createEAttribute(persistenceSetupEClass, PERSISTENCE_SETUP__PERSISTENCE_UNIT);

		// Create enums
		javaVersionEEnum = createEEnum(JAVA_VERSION);
		providerTypeEEnum = createEEnum(PROVIDER_TYPE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(rooModelEClass, RooModel.class, "RooModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRooModel_Project(), this.getProject(), null, "project", null, 0, 1, RooModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRooModel_Persistence(), this.getPersistenceSetup(), null, "persistence", null, 0, 1, RooModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRooModel_Model(), theEcorePackage.getEPackage(), null, "model", null, 0, 1, RooModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_TopLevelPackage(), ecorePackage.getEString(), "topLevelPackage", "com", 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Java(), this.getjavaVersion(), "java", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceSetupEClass, PersistenceSetup.class, "PersistenceSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceSetup_Provider(), this.getproviderType(), "provider", "HIBERNATE", 1, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_Database(), this.getdatabaseType(), "database", "HYPERSONIC_IN_MEMORY", 1, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_JndiDataSource(), ecorePackage.getEString(), "jndiDataSource", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_HostName(), ecorePackage.getEString(), "hostName", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_Password(), ecorePackage.getEString(), "password", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceSetup_PersistenceUnit(), ecorePackage.getEString(), "persistenceUnit", null, 0, 1, PersistenceSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(javaVersionEEnum, javaVersion.class, "javaVersion");
		addEEnumLiteral(javaVersionEEnum, javaVersion.JAVA5);
		addEEnumLiteral(javaVersionEEnum, javaVersion.JAVA6);
		addEEnumLiteral(javaVersionEEnum, javaVersion.JAVA7);

		initEEnum(providerTypeEEnum, providerType.class, "providerType");
		addEEnumLiteral(providerTypeEEnum, providerType.DATANUCLEUS);
		addEEnumLiteral(providerTypeEEnum, providerType.DATANUCLEUS_2);
		addEEnumLiteral(providerTypeEEnum, providerType.ECLIPSELINK);
		addEEnumLiteral(providerTypeEEnum, providerType.HIBERNATE);
		addEEnumLiteral(providerTypeEEnum, providerType.OPENJPA);

		initEEnum(databaseTypeEEnum, databaseType.class, "databaseType");
		addEEnumLiteral(databaseTypeEEnum, databaseType.DB2);
		addEEnumLiteral(databaseTypeEEnum, databaseType.DB2400);
		addEEnumLiteral(databaseTypeEEnum, databaseType.DERBY);
		addEEnumLiteral(databaseTypeEEnum, databaseType.GOOGLE_APP_ENGINE);
		addEEnumLiteral(databaseTypeEEnum, databaseType.H2_IN_MEMORY);
		addEEnumLiteral(databaseTypeEEnum, databaseType.HYPERSONIC_IN_MEMORY);
		addEEnumLiteral(databaseTypeEEnum, databaseType.HYPERSONIC_PERSISTENT);
		addEEnumLiteral(databaseTypeEEnum, databaseType.MSSQL);
		addEEnumLiteral(databaseTypeEEnum, databaseType.MYSQL);
		addEEnumLiteral(databaseTypeEEnum, databaseType.ORACLE);
		addEEnumLiteral(databaseTypeEEnum, databaseType.POSTGRES);
		addEEnumLiteral(databaseTypeEEnum, databaseType.SYBASE);
		addEEnumLiteral(databaseTypeEEnum, databaseType.VMFORCE);

		// Create resource
		createResource(eNS_URI);
	}

} //RooPackageImpl
