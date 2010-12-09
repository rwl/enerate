/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo.impl;

import com.github.enerate.model.roo.PersistenceSetup;
import com.github.enerate.model.roo.Project;
import com.github.enerate.model.roo.RooModel;
import com.github.enerate.model.roo.RooPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.impl.RooModelImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.RooModelImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.RooModelImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RooModelImpl extends EObjectImpl implements RooModel {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected PersistenceSetup persistence;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EPackage model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RooModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RooPackage.Literals.ROO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RooPackage.ROO_MODEL__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RooPackage.ROO_MODEL__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RooPackage.ROO_MODEL__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.ROO_MODEL__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceSetup getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistence(PersistenceSetup newPersistence, NotificationChain msgs) {
		PersistenceSetup oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RooPackage.ROO_MODEL__PERSISTENCE, oldPersistence, newPersistence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(PersistenceSetup newPersistence) {
		if (newPersistence != persistence) {
			NotificationChain msgs = null;
			if (persistence != null)
				msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RooPackage.ROO_MODEL__PERSISTENCE, null, msgs);
			if (newPersistence != null)
				msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RooPackage.ROO_MODEL__PERSISTENCE, null, msgs);
			msgs = basicSetPersistence(newPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.ROO_MODEL__PERSISTENCE, newPersistence, newPersistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (EPackage)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RooPackage.ROO_MODEL__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(EPackage newModel) {
		EPackage oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.ROO_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RooPackage.ROO_MODEL__PROJECT:
				return basicSetProject(null, msgs);
			case RooPackage.ROO_MODEL__PERSISTENCE:
				return basicSetPersistence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RooPackage.ROO_MODEL__PROJECT:
				return getProject();
			case RooPackage.ROO_MODEL__PERSISTENCE:
				return getPersistence();
			case RooPackage.ROO_MODEL__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case RooPackage.ROO_MODEL__PROJECT:
				setProject((Project)newValue);
				return;
			case RooPackage.ROO_MODEL__PERSISTENCE:
				setPersistence((PersistenceSetup)newValue);
				return;
			case RooPackage.ROO_MODEL__MODEL:
				setModel((EPackage)newValue);
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
			case RooPackage.ROO_MODEL__PROJECT:
				setProject((Project)null);
				return;
			case RooPackage.ROO_MODEL__PERSISTENCE:
				setPersistence((PersistenceSetup)null);
				return;
			case RooPackage.ROO_MODEL__MODEL:
				setModel((EPackage)null);
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
			case RooPackage.ROO_MODEL__PROJECT:
				return project != null;
			case RooPackage.ROO_MODEL__PERSISTENCE:
				return persistence != null;
			case RooPackage.ROO_MODEL__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //RooModelImpl
