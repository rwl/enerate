/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.enerate.model.roo.RooFactory
 * @model kind="package"
 * @generated
 */
public interface RooPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.springsource.org/roo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RooPackage eINSTANCE = com.github.enerate.model.roo.impl.RooPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.impl.RooModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.impl.RooModelImpl
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getRooModel()
	 * @generated
	 */
	int ROO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_MODEL__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_MODEL__PERSISTENCE = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_MODEL__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.impl.ProjectImpl
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Top Level Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOP_LEVEL_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Java</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__JAVA = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl <em>Persistence Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.impl.PersistenceSetupImpl
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getPersistenceSetup()
	 * @generated
	 */
	int PERSISTENCE_SETUP = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__APPLICATION_ID = 2;

	/**
	 * The feature id for the '<em><b>Jndi Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__JNDI_DATA_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__HOST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__DATABASE_NAME = 5;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__USER_NAME = 6;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__PASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP__PERSISTENCE_UNIT = 8;

	/**
	 * The number of structural features of the '<em>Persistence Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SETUP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.javaVersion <em>java Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.javaVersion
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getjavaVersion()
	 * @generated
	 */
	int JAVA_VERSION = 3;

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.providerType <em>provider Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.providerType
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getproviderType()
	 * @generated
	 */
	int PROVIDER_TYPE = 4;

	/**
	 * The meta object id for the '{@link com.github.enerate.model.roo.databaseType <em>database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.enerate.model.roo.databaseType
	 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getdatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link com.github.enerate.model.roo.RooModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.github.enerate.model.roo.RooModel
	 * @generated
	 */
	EClass getRooModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.enerate.model.roo.RooModel#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see com.github.enerate.model.roo.RooModel#getProject()
	 * @see #getRooModel()
	 * @generated
	 */
	EReference getRooModel_Project();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.enerate.model.roo.RooModel#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see com.github.enerate.model.roo.RooModel#getPersistence()
	 * @see #getRooModel()
	 * @generated
	 */
	EReference getRooModel_Persistence();

	/**
	 * Returns the meta object for the reference '{@link com.github.enerate.model.roo.RooModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.github.enerate.model.roo.RooModel#getModel()
	 * @see #getRooModel()
	 * @generated
	 */
	EReference getRooModel_Model();

	/**
	 * Returns the meta object for class '{@link com.github.enerate.model.roo.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.enerate.model.roo.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.Project#getTopLevelPackage <em>Top Level Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Level Package</em>'.
	 * @see com.github.enerate.model.roo.Project#getTopLevelPackage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_TopLevelPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see com.github.enerate.model.roo.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.Project#getJava <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java</em>'.
	 * @see com.github.enerate.model.roo.Project#getJava()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Java();

	/**
	 * Returns the meta object for class '{@link com.github.enerate.model.roo.PersistenceSetup <em>Persistence Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Setup</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup
	 * @generated
	 */
	EClass getPersistenceSetup();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getProvider()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_Provider();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getDatabase()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_Database();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getApplicationId()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getJndiDataSource <em>Jndi Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Data Source</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getJndiDataSource()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_JndiDataSource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getHostName()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_HostName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getDatabaseName()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getUserName()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_UserName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getPassword()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.github.enerate.model.roo.PersistenceSetup#getPersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit</em>'.
	 * @see com.github.enerate.model.roo.PersistenceSetup#getPersistenceUnit()
	 * @see #getPersistenceSetup()
	 * @generated
	 */
	EAttribute getPersistenceSetup_PersistenceUnit();

	/**
	 * Returns the meta object for enum '{@link com.github.enerate.model.roo.javaVersion <em>java Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>java Version</em>'.
	 * @see com.github.enerate.model.roo.javaVersion
	 * @generated
	 */
	EEnum getjavaVersion();

	/**
	 * Returns the meta object for enum '{@link com.github.enerate.model.roo.providerType <em>provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>provider Type</em>'.
	 * @see com.github.enerate.model.roo.providerType
	 * @generated
	 */
	EEnum getproviderType();

	/**
	 * Returns the meta object for enum '{@link com.github.enerate.model.roo.databaseType <em>database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>database Type</em>'.
	 * @see com.github.enerate.model.roo.databaseType
	 * @generated
	 */
	EEnum getdatabaseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RooFactory getRooFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.impl.RooModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.impl.RooModelImpl
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getRooModel()
		 * @generated
		 */
		EClass ROO_MODEL = eINSTANCE.getRooModel();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROO_MODEL__PROJECT = eINSTANCE.getRooModel_Project();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROO_MODEL__PERSISTENCE = eINSTANCE.getRooModel_Persistence();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROO_MODEL__MODEL = eINSTANCE.getRooModel_Model();

		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.impl.ProjectImpl
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Top Level Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOP_LEVEL_PACKAGE = eINSTANCE.getProject_TopLevelPackage();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Java</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__JAVA = eINSTANCE.getProject_Java();

		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl <em>Persistence Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.impl.PersistenceSetupImpl
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getPersistenceSetup()
		 * @generated
		 */
		EClass PERSISTENCE_SETUP = eINSTANCE.getPersistenceSetup();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__PROVIDER = eINSTANCE.getPersistenceSetup_Provider();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__DATABASE = eINSTANCE.getPersistenceSetup_Database();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__APPLICATION_ID = eINSTANCE.getPersistenceSetup_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Jndi Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__JNDI_DATA_SOURCE = eINSTANCE.getPersistenceSetup_JndiDataSource();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__HOST_NAME = eINSTANCE.getPersistenceSetup_HostName();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__DATABASE_NAME = eINSTANCE.getPersistenceSetup_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__USER_NAME = eINSTANCE.getPersistenceSetup_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__PASSWORD = eINSTANCE.getPersistenceSetup_Password();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SETUP__PERSISTENCE_UNIT = eINSTANCE.getPersistenceSetup_PersistenceUnit();

		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.javaVersion <em>java Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.javaVersion
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getjavaVersion()
		 * @generated
		 */
		EEnum JAVA_VERSION = eINSTANCE.getjavaVersion();

		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.providerType <em>provider Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.providerType
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getproviderType()
		 * @generated
		 */
		EEnum PROVIDER_TYPE = eINSTANCE.getproviderType();

		/**
		 * The meta object literal for the '{@link com.github.enerate.model.roo.databaseType <em>database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.enerate.model.roo.databaseType
		 * @see com.github.enerate.model.roo.impl.RooPackageImpl#getdatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getdatabaseType();

	}

} //RooPackage
