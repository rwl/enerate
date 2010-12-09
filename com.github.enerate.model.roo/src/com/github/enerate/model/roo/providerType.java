/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.enerate.model.roo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>provider Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.enerate.model.roo.RooPackage#getproviderType()
 * @model
 * @generated
 */
public enum providerType implements Enumerator {
	/**
	 * The '<em><b>DATANUCLEUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATANUCLEUS_VALUE
	 * @generated
	 * @ordered
	 */
	DATANUCLEUS(0, "DATANUCLEUS", "DATANUCLEUS"),

	/**
	 * The '<em><b>DATANUCLEUS 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATANUCLEUS_2_VALUE
	 * @generated
	 * @ordered
	 */
	DATANUCLEUS_2(1, "DATANUCLEUS_2", "DATANUCLEUS_2"),

	/**
	 * The '<em><b>ECLIPSELINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLIPSELINK_VALUE
	 * @generated
	 * @ordered
	 */
	ECLIPSELINK(2, "ECLIPSELINK", "ECLIPSELINK"),

	/**
	 * The '<em><b>HIBERNATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIBERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	HIBERNATE(3, "HIBERNATE", "HIBERNATE"),

	/**
	 * The '<em><b>OPENJPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENJPA_VALUE
	 * @generated
	 * @ordered
	 */
	OPENJPA(4, "OPENJPA", "OPENJPA");

	/**
	 * The '<em><b>DATANUCLEUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATANUCLEUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATANUCLEUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATANUCLEUS_VALUE = 0;

	/**
	 * The '<em><b>DATANUCLEUS 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATANUCLEUS 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATANUCLEUS_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATANUCLEUS_2_VALUE = 1;

	/**
	 * The '<em><b>ECLIPSELINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECLIPSELINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECLIPSELINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECLIPSELINK_VALUE = 2;

	/**
	 * The '<em><b>HIBERNATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIBERNATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIBERNATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIBERNATE_VALUE = 3;

	/**
	 * The '<em><b>OPENJPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENJPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENJPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENJPA_VALUE = 4;

	/**
	 * An array of all the '<em><b>provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final providerType[] VALUES_ARRAY =
		new providerType[] {
			DATANUCLEUS,
			DATANUCLEUS_2,
			ECLIPSELINK,
			HIBERNATE,
			OPENJPA,
		};

	/**
	 * A public read-only list of all the '<em><b>provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<providerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>provider Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static providerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			providerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>provider Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static providerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			providerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>provider Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static providerType get(int value) {
		switch (value) {
			case DATANUCLEUS_VALUE: return DATANUCLEUS;
			case DATANUCLEUS_2_VALUE: return DATANUCLEUS_2;
			case ECLIPSELINK_VALUE: return ECLIPSELINK;
			case HIBERNATE_VALUE: return HIBERNATE;
			case OPENJPA_VALUE: return OPENJPA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private providerType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //providerType
