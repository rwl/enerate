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
 * A representation of the literals of the enumeration '<em><b>java Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.enerate.model.roo.RooPackage#getjavaVersion()
 * @model
 * @generated
 */
public enum javaVersion implements Enumerator {
	/**
	 * The '<em><b>Java5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA5_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA5(5, "Java5", "Java5"),

	/**
	 * The '<em><b>Java6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA6_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA6(6, "Java6", "Java6"),

	/**
	 * The '<em><b>Java7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA7_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA7(7, "Java7", "Java7");

	/**
	 * The '<em><b>Java5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA5
	 * @model name="Java5"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA5_VALUE = 5;

	/**
	 * The '<em><b>Java6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA6
	 * @model name="Java6"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA6_VALUE = 6;

	/**
	 * The '<em><b>Java7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA7
	 * @model name="Java7"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA7_VALUE = 7;

	/**
	 * An array of all the '<em><b>java Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final javaVersion[] VALUES_ARRAY =
		new javaVersion[] {
			JAVA5,
			JAVA6,
			JAVA7,
		};

	/**
	 * A public read-only list of all the '<em><b>java Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<javaVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>java Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static javaVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			javaVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>java Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static javaVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			javaVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>java Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static javaVersion get(int value) {
		switch (value) {
			case JAVA5_VALUE: return JAVA5;
			case JAVA6_VALUE: return JAVA6;
			case JAVA7_VALUE: return JAVA7;
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
	private javaVersion(int value, String name, String literal) {
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
	
} //javaVersion
