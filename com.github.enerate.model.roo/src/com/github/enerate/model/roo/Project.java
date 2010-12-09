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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.Project#getTopLevelPackage <em>Top Level Package</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.Project#getJava <em>Java</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.enerate.model.roo.RooPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Top Level Package</b></em>' attribute.
	 * The default value is <code>"com"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uppermost package name (this becomes the <groupId> in Maven and also the '~' value when using Roo's shell).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Package</em>' attribute.
	 * @see #setTopLevelPackage(String)
	 * @see com.github.enerate.model.roo.RooPackage#getProject_TopLevelPackage()
	 * @model default="com" required="true"
	 * @generated
	 */
	String getTopLevelPackage();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.Project#getTopLevelPackage <em>Top Level Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Level Package</em>' attribute.
	 * @see #getTopLevelPackage()
	 * @generated
	 */
	void setTopLevelPackage(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the project (last segment of package name used as default).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see com.github.enerate.model.roo.RooPackage#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Java</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.enerate.model.roo.javaVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forces a particular major version of Java to be used (will be auto-detected if unspecified; specify 5 or 6 or 7 only).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java</em>' attribute.
	 * @see com.github.enerate.model.roo.javaVersion
	 * @see #isSetJava()
	 * @see #unsetJava()
	 * @see #setJava(javaVersion)
	 * @see com.github.enerate.model.roo.RooPackage#getProject_Java()
	 * @model unsettable="true"
	 * @generated
	 */
	javaVersion getJava();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.Project#getJava <em>Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java</em>' attribute.
	 * @see com.github.enerate.model.roo.javaVersion
	 * @see #isSetJava()
	 * @see #unsetJava()
	 * @see #getJava()
	 * @generated
	 */
	void setJava(javaVersion value);

	/**
	 * Unsets the value of the '{@link com.github.enerate.model.roo.Project#getJava <em>Java</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJava()
	 * @see #getJava()
	 * @see #setJava(javaVersion)
	 * @generated
	 */
	void unsetJava();

	/**
	 * Returns whether the value of the '{@link com.github.enerate.model.roo.Project#getJava <em>Java</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Java</em>' attribute is set.
	 * @see #unsetJava()
	 * @see #getJava()
	 * @see #setJava(javaVersion)
	 * @generated
	 */
	boolean isSetJava();

} // Project
