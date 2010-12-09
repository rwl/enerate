/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo.impl;

import com.github.enerate.model.roo.Project;
import com.github.enerate.model.roo.RooPackage;
import com.github.enerate.model.roo.javaVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.impl.ProjectImpl#getTopLevelPackage <em>Top Level Package</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.impl.ProjectImpl#getJava <em>Java</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The default value of the '{@link #getTopLevelPackage() <em>Top Level Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_LEVEL_PACKAGE_EDEFAULT = "com";

	/**
	 * The cached value of the '{@link #getTopLevelPackage() <em>Top Level Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected String topLevelPackage = TOP_LEVEL_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJava() <em>Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava()
	 * @generated
	 * @ordered
	 */
	protected static final javaVersion JAVA_EDEFAULT = javaVersion.JAVA5;

	/**
	 * The cached value of the '{@link #getJava() <em>Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava()
	 * @generated
	 * @ordered
	 */
	protected javaVersion java = JAVA_EDEFAULT;

	/**
	 * This is true if the Java attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean javaESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RooPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopLevelPackage() {
		return topLevelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLevelPackage(String newTopLevelPackage) {
		String oldTopLevelPackage = topLevelPackage;
		topLevelPackage = newTopLevelPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PROJECT__TOP_LEVEL_PACKAGE, oldTopLevelPackage, topLevelPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javaVersion getJava() {
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJava(javaVersion newJava) {
		javaVersion oldJava = java;
		java = newJava == null ? JAVA_EDEFAULT : newJava;
		boolean oldJavaESet = javaESet;
		javaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RooPackage.PROJECT__JAVA, oldJava, java, !oldJavaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJava() {
		javaVersion oldJava = java;
		boolean oldJavaESet = javaESet;
		java = JAVA_EDEFAULT;
		javaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RooPackage.PROJECT__JAVA, oldJava, JAVA_EDEFAULT, oldJavaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJava() {
		return javaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RooPackage.PROJECT__TOP_LEVEL_PACKAGE:
				return getTopLevelPackage();
			case RooPackage.PROJECT__PROJECT_NAME:
				return getProjectName();
			case RooPackage.PROJECT__JAVA:
				return getJava();
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
			case RooPackage.PROJECT__TOP_LEVEL_PACKAGE:
				setTopLevelPackage((String)newValue);
				return;
			case RooPackage.PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case RooPackage.PROJECT__JAVA:
				setJava((javaVersion)newValue);
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
			case RooPackage.PROJECT__TOP_LEVEL_PACKAGE:
				setTopLevelPackage(TOP_LEVEL_PACKAGE_EDEFAULT);
				return;
			case RooPackage.PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case RooPackage.PROJECT__JAVA:
				unsetJava();
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
			case RooPackage.PROJECT__TOP_LEVEL_PACKAGE:
				return TOP_LEVEL_PACKAGE_EDEFAULT == null ? topLevelPackage != null : !TOP_LEVEL_PACKAGE_EDEFAULT.equals(topLevelPackage);
			case RooPackage.PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case RooPackage.PROJECT__JAVA:
				return isSetJava();
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
		result.append(" (topLevelPackage: ");
		result.append(topLevelPackage);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", java: ");
		if (javaESet) result.append(java); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
