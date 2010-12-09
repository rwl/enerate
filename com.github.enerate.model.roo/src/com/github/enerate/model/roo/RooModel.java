/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.enerate.model.roo.RooModel#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.RooModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link com.github.enerate.model.roo.RooModel#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.enerate.model.roo.RooPackage#getRooModel()
 * @model
 * @generated
 */
public interface RooModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(Project)
	 * @see com.github.enerate.model.roo.RooPackage#getRooModel_Project()
	 * @model containment="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.RooModel#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(PersistenceSetup)
	 * @see com.github.enerate.model.roo.RooPackage#getRooModel_Persistence()
	 * @model containment="true"
	 * @generated
	 */
	PersistenceSetup getPersistence();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.RooModel#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(PersistenceSetup value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EPackage)
	 * @see com.github.enerate.model.roo.RooPackage#getRooModel_Model()
	 * @model
	 * @generated
	 */
	EPackage getModel();

	/**
	 * Sets the value of the '{@link com.github.enerate.model.roo.RooModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EPackage value);

} // RooModel
