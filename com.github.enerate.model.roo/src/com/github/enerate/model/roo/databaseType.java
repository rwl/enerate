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
 * A representation of the literals of the enumeration '<em><b>database Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.enerate.model.roo.RooPackage#getdatabaseType()
 * @model
 * @generated
 */
public enum databaseType implements Enumerator {
	/**
	 * The '<em><b>DB2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2_VALUE
	 * @generated
	 * @ordered
	 */
	DB2(0, "DB2", "DB2"),

	/**
	 * The '<em><b>DB2400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2400_VALUE
	 * @generated
	 * @ordered
	 */
	DB2400(1, "DB2400", "DB2400"),

	/**
	 * The '<em><b>DERBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERBY_VALUE
	 * @generated
	 * @ordered
	 */
	DERBY(2, "DERBY", "DERBY"),

	/**
	 * The '<em><b>GOOGLE APP ENGINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_APP_ENGINE(3, "GOOGLE_APP_ENGINE", "GOOGLE_APP_ENGINE"),

	/**
	 * The '<em><b>H2 IN MEMORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	H2_IN_MEMORY(4, "H2_IN_MEMORY", "H2_IN_MEMORY"),

	/**
	 * The '<em><b>HYPERSONIC IN MEMORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERSONIC_IN_MEMORY(5, "HYPERSONIC_IN_MEMORY", "HYPERSONIC_IN_MEMORY"),

	/**
	 * The '<em><b>HYPERSONIC PERSISTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_PERSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERSONIC_PERSISTENT(6, "HYPERSONIC_PERSISTENT", "HYPERSONIC_PERSISTENT"),

	/**
	 * The '<em><b>MSSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSSQL_VALUE
	 * @generated
	 * @ordered
	 */
	MSSQL(7, "MSSQL", "MSSQL"),

	/**
	 * The '<em><b>MYSQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYSQL_VALUE
	 * @generated
	 * @ordered
	 */
	MYSQL(8, "MYSQL", "MYSQL"),

	/**
	 * The '<em><b>ORACLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(9, "ORACLE", "ORACLE"),

	/**
	 * The '<em><b>POSTGRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRES_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRES(10, "POSTGRES", "POSTGRES"),

	/**
	 * The '<em><b>SYBASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYBASE_VALUE
	 * @generated
	 * @ordered
	 */
	SYBASE(11, "SYBASE", "SYBASE"),

	/**
	 * The '<em><b>VMFORCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMFORCE_VALUE
	 * @generated
	 * @ordered
	 */
	VMFORCE(12, "VMFORCE", "VMFORCE");

	/**
	 * The '<em><b>DB2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DB2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB2_VALUE = 0;

	/**
	 * The '<em><b>DB2400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DB2400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB2400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB2400_VALUE = 1;

	/**
	 * The '<em><b>DERBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERBY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DERBY_VALUE = 2;

	/**
	 * The '<em><b>GOOGLE APP ENGINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOOGLE APP ENGINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_APP_ENGINE_VALUE = 3;

	/**
	 * The '<em><b>H2 IN MEMORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H2 IN MEMORY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H2_IN_MEMORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H2_IN_MEMORY_VALUE = 4;

	/**
	 * The '<em><b>HYPERSONIC IN MEMORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYPERSONIC IN MEMORY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_IN_MEMORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYPERSONIC_IN_MEMORY_VALUE = 5;

	/**
	 * The '<em><b>HYPERSONIC PERSISTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYPERSONIC PERSISTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_PERSISTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYPERSONIC_PERSISTENT_VALUE = 6;

	/**
	 * The '<em><b>MSSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSSQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSSQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSSQL_VALUE = 7;

	/**
	 * The '<em><b>MYSQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MYSQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYSQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MYSQL_VALUE = 8;

	/**
	 * The '<em><b>ORACLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORACLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 9;

	/**
	 * The '<em><b>POSTGRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSTGRES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTGRES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRES_VALUE = 10;

	/**
	 * The '<em><b>SYBASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYBASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYBASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYBASE_VALUE = 11;

	/**
	 * The '<em><b>VMFORCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VMFORCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMFORCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VMFORCE_VALUE = 12;

	/**
	 * An array of all the '<em><b>database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final databaseType[] VALUES_ARRAY =
		new databaseType[] {
			DB2,
			DB2400,
			DERBY,
			GOOGLE_APP_ENGINE,
			H2_IN_MEMORY,
			HYPERSONIC_IN_MEMORY,
			HYPERSONIC_PERSISTENT,
			MSSQL,
			MYSQL,
			ORACLE,
			POSTGRES,
			SYBASE,
			VMFORCE,
		};

	/**
	 * A public read-only list of all the '<em><b>database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<databaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static databaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			databaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static databaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			databaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static databaseType get(int value) {
		switch (value) {
			case DB2_VALUE: return DB2;
			case DB2400_VALUE: return DB2400;
			case DERBY_VALUE: return DERBY;
			case GOOGLE_APP_ENGINE_VALUE: return GOOGLE_APP_ENGINE;
			case H2_IN_MEMORY_VALUE: return H2_IN_MEMORY;
			case HYPERSONIC_IN_MEMORY_VALUE: return HYPERSONIC_IN_MEMORY;
			case HYPERSONIC_PERSISTENT_VALUE: return HYPERSONIC_PERSISTENT;
			case MSSQL_VALUE: return MSSQL;
			case MYSQL_VALUE: return MYSQL;
			case ORACLE_VALUE: return ORACLE;
			case POSTGRES_VALUE: return POSTGRES;
			case SYBASE_VALUE: return SYBASE;
			case VMFORCE_VALUE: return VMFORCE;
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
	private databaseType(int value, String name, String literal) {
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
	
} //databaseType
