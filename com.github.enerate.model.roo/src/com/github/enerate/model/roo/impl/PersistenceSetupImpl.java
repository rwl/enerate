/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo.impl;

import com.github.enerate.model.roo.PersistenceSetup;
import com.github.enerate.model.roo.RooPackage;
import com.github.enerate.model.roo.databaseType;
import com.github.enerate.model.roo.providerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getJndiDataSource <em>Jndi Data Source</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.PersistenceSetupImpl#getPersistenceUnit <em>Persistence Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceSetupImpl extends EObjectImpl implements PersistenceSetup {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final providerType PROVIDER_EDEFAULT = providerType.HIBERNATE;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected providerType provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final databaseType DATABASE_EDEFAULT = databaseType.HYPERSONIC_IN_MEMORY;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected databaseType database = DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected String applicationId = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiDataSource() <em>Jndi Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiDataSource() <em>Jndi Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiDataSource()
	 * @generated
	 * @ordered
	 */
	protected String jndiDataSource = JNDI_DATA_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected String hostName = HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected String persistenceUnit = PERSISTENCE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RooPackage.Literals.PERSISTENCE_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public providerType getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(providerType newProvider) {
		providerType oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public databaseType getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(databaseType newDatabase) {
		databaseType oldDatabase = database;
		database = newDatabase == null ? DATABASE_EDEFAULT : newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationId(String newApplicationId) {
		String oldApplicationId = applicationId;
		applicationId = newApplicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__APPLICATION_ID, oldApplicationId, applicationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiDataSource() {
		return jndiDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiDataSource(String newJndiDataSource) {
		String oldJndiDataSource = jndiDataSource;
		jndiDataSource = newJndiDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__JNDI_DATA_SOURCE, oldJndiDataSource, jndiDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostName(String newHostName) {
		String oldHostName = hostName;
		hostName = newHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__HOST_NAME, oldHostName, hostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceUnit() {
		return persistenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnit(String newPersistenceUnit) {
		String oldPersistenceUnit = persistenceUnit;
		persistenceUnit = newPersistenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PERSISTENCE_SETUP__PERSISTENCE_UNIT, oldPersistenceUnit, persistenceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RooPackage.PERSISTENCE_SETUP__PROVIDER:
				return getProvider();
			case RooPackage.PERSISTENCE_SETUP__DATABASE:
				return getDatabase();
			case RooPackage.PERSISTENCE_SETUP__APPLICATION_ID:
				return getApplicationId();
			case RooPackage.PERSISTENCE_SETUP__JNDI_DATA_SOURCE:
				return getJndiDataSource();
			case RooPackage.PERSISTENCE_SETUP__HOST_NAME:
				return getHostName();
			case RooPackage.PERSISTENCE_SETUP__DATABASE_NAME:
				return getDatabaseName();
			case RooPackage.PERSISTENCE_SETUP__USER_NAME:
				return getUserName();
			case RooPackage.PERSISTENCE_SETUP__PASSWORD:
				return getPassword();
			case RooPackage.PERSISTENCE_SETUP__PERSISTENCE_UNIT:
				return getPersistenceUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RooPackage.PERSISTENCE_SETUP__PROVIDER:
				setProvider((providerType)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__DATABASE:
				setDatabase((databaseType)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__APPLICATION_ID:
				setApplicationId((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__JNDI_DATA_SOURCE:
				setJndiDataSource((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__HOST_NAME:
				setHostName((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__USER_NAME:
				setUserName((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__PASSWORD:
				setPassword((String)newValue);
				return;
			case RooPackage.PERSISTENCE_SETUP__PERSISTENCE_UNIT:
				setPersistenceUnit((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RooPackage.PERSISTENCE_SETUP__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__DATABASE:
				setDatabase(DATABASE_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__APPLICATION_ID:
				setApplicationId(APPLICATION_ID_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__JNDI_DATA_SOURCE:
				setJndiDataSource(JNDI_DATA_SOURCE_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__HOST_NAME:
				setHostName(HOST_NAME_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case RooPackage.PERSISTENCE_SETUP__PERSISTENCE_UNIT:
				setPersistenceUnit(PERSISTENCE_UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RooPackage.PERSISTENCE_SETUP__PROVIDER:
				return provider != PROVIDER_EDEFAULT;
			case RooPackage.PERSISTENCE_SETUP__DATABASE:
				return database != DATABASE_EDEFAULT;
			case RooPackage.PERSISTENCE_SETUP__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case RooPackage.PERSISTENCE_SETUP__JNDI_DATA_SOURCE:
				return JNDI_DATA_SOURCE_EDEFAULT == null ? jndiDataSource != null : !JNDI_DATA_SOURCE_EDEFAULT.equals(jndiDataSource);
			case RooPackage.PERSISTENCE_SETUP__HOST_NAME:
				return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals(hostName);
			case RooPackage.PERSISTENCE_SETUP__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case RooPackage.PERSISTENCE_SETUP__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case RooPackage.PERSISTENCE_SETUP__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case RooPackage.PERSISTENCE_SETUP__PERSISTENCE_UNIT:
				return PERSISTENCE_UNIT_EDEFAULT == null ? persistenceUnit != null : !PERSISTENCE_UNIT_EDEFAULT.equals(persistenceUnit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (provider: ");
		result.append(provider);
		result.append(", database: ");
		result.append(database);
		result.append(", applicationId: ");
		result.append(applicationId);
		result.append(", jndiDataSource: ");
		result.append(jndiDataSource);
		result.append(", hostName: ");
		result.append(hostName);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", persistenceUnit: ");
		result.append(persistenceUnit);
		result.append(')');
		return result.toString();
	}

} //PersistenceSetupImpl
