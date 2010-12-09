/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getJndiDataSource <em>Jndi Data Source</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getHostName <em>Host Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getPassword <em>Password</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.PersistenceSetup#getPersistenceUnit <em>Persistence Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup()
 * @model
 * @generated
 */
public interface PersistenceSetup extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>"HIBERNATE"</code>.
	 * The literals are from the enumeration {@link com.github.enerate.model.roo.providerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The persistence provider to support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see com.github.enerate.model.roo.providerType
	 * @see #setProvider(providerType)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_Provider()
	 * @model default="HIBERNATE" required="true"
	 * @generated
	 */
	providerType getProvider();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see com.github.enerate.model.roo.providerType
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(providerType value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * The default value is <code>"HYPERSONIC_IN_MEMORY"</code>.
	 * The literals are from the enumeration {@link com.github.enerate.model.roo.databaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The database to support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see com.github.enerate.model.roo.databaseType
	 * @see #setDatabase(databaseType)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_Database()
	 * @model default="HYPERSONIC_IN_MEMORY" required="true"
	 * @generated
	 */
	databaseType getDatabase();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see com.github.enerate.model.roo.databaseType
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(databaseType value);

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Google App Engine application identifier to use; default if option not present: 'the project's name'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_ApplicationId()
	 * @model
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The JNDI datasource to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Data Source</em>' attribute.
	 * @see #setJndiDataSource(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_JndiDataSource()
	 * @model
	 * @generated
	 */
	String getJndiDataSource();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getJndiDataSource <em>Jndi Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Data Source</em>' attribute.
	 * @see #getJndiDataSource()
	 * @generated
	 */
	void setJndiDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The host name to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getHostName <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The database name to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_DatabaseName()
	 * @model
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The username to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The password to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The persistence unit name to be used in the persistence.xml file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' attribute.
	 * @see #setPersistenceUnit(String)
	 * @see com.github.enerate.model.roo.RooPackage#getPersistenceSetup_PersistenceUnit()
	 * @model
	 * @generated
	 */
	String getPersistenceUnit();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.PersistenceSetup#getPersistenceUnit <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit</em>' attribute.
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	void setPersistenceUnit(String value);

} // PersistenceSetup
