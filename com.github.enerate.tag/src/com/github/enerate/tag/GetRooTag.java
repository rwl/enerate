package com.github.enerate.tag;

import java.util.Collections;
import java.util.Set;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

/**
 * Implement the Enerate tag 'getRoo'.
 *
 */
public class GetRooTag extends AbstractEmptyTag {

	/**
	 * Represents an unmodifiable set of lowercase reserved words in Java.
	 */
	public static final Set<String> RESERVED_JAVA_KEYWORDS = Collections
			.unmodifiableSet(StringUtils
					.commaDelimitedListToSet("abstract,assert,boolean,break,byte,case,catch,char,class,const,continue,default,do,double,else,enum,extends,false,final,finally,float,for,goto,if,implements,import,instanceof,int,interface,long,native,new,null,package,private,protected,public,return,short,static,strictfp,super,switch,synchronized,this,throw,throws,transient,true,try,void,volatile,while"));

	/**
	 * Represents an unmodifiable set of lowercase reserved words.
	 */
	public static final Set<String> RESERVED_SQL_KEYWORDS = Collections
			.unmodifiableSet(StringUtils
					.commaDelimitedListToSet("ABSOLUTE,ACTION,ADD,AFTER,ALL,ALLOCATE,ALTER,AND,ANY,ARE,ARRAY,AS,ASC,ASENSITIVE,ASSERTION,ASYMMETRIC,AT,ATOMIC,AUTHORIZATION,AVG,BEFORE,BEGIN,BETWEEN,BIGINT,BINARY,BIT,BIT_LENGTH,BLOB,BOOLEAN,BOTH,BREADTH,BY,CALL,CALLED,CASCADE,CASCADED,CASE,CAST,CATALOG,CHAR,CHARACTER,CHARACTER_LENGTH,CHAR_LENGTH,CHECK,CLOB,CLOSE,COALESCE,COLLATE,COLLATION,COLUMN,COMMIT,CONDITION,CONNECT,CONNECTION,CONSTRAINT,CONSTRAINTS,CONSTRUCTOR,CONTAINS,CONTINUE,CONVERT,CORRESPONDING,COUNT,CREATE,CROSS,CUBE,CURRENT,CURRENT_DATE,CURRENT_DEFAULT_TRANSFORM_GROUP,CURRENT_PATH,CURRENT_ROLE,CURRENT_TIME,CURRENT_TIMESTAMP,CURRENT_TRANSFORM_GROUP_FOR_TYPE,CURRENT_USER,CURSOR,CYCLE,DATA,DATE,DAY,DEALLOCATE,DEC,DECIMAL,DECLARE,DEFAULT,DEFERRABLE,DEFERRED,DELETE,DEPTH,DEREF,DESC,DESCRIBE,DESCRIPTOR,DETERMINISTIC,DIAGNOSTICS,DISCONNECT,DISTINCT,DO,DOMAIN,DOUBLE,DROP,DYNAMIC,EACH,ELEMENT,ELSE,ELSEIF,END,EQUALS,ESCAPE,EXCEPT,EXCEPTION,EXEC,EXECUTE,EXISTS,EXIT,EXTERNAL,EXTRACT,FALSE,FETCH,FILTER,FIRST,FLOAT,FOR,FOREIGN,FOUND,FREE,FROM,FULL,FUNCTION,GENERAL,GET,GLOBAL,GO,GOTO,GRANT,GROUP,GROUPING,HANDLER,HAVING,HOLD,HOUR,IDENTITY,IF,IMMEDIATE,IN,INDEX,INDICATOR,INITIALLY,INNER,INOUT,INPUT,INSENSITIVE,INSERT,INT,INTEGER,INTERSECT,INTERVAL,INTO,IS,ISOLATION,ITERATE,JOIN,KEY,LANGUAGE,LARGE,LAST,LATERAL,LEADING,LEAVE,LEFT,LEVEL,LIKE,LOCAL,LOCALTIME,LOCALTIMESTAMP,LOCATOR,LOOP,LOWER,MAP,MATCH,MAX,MEMBER,MERGE,METHOD,MIN,MINUTE,MODIFIES,MODULE,MONTH,MULTISET,NAMES,NATIONAL,NATURAL,NCHAR,NCLOB,NEW,NEXT,NO,NONE,NOT,NULL,NULLIF,NUMBER,NUMERIC,OBJECT,OCTET_LENGTH,OF,OLD,ON,ONLY,OPEN,OPTION,OR,ORDER,ORDINALITY,OUT,OUTER,OUTPUT,OVER,OVERLAPS,PAD,PARAMETER,PARTIAL,PARTITION,PATH,POSITION,PRECISION,PREPARE,PRESERVE,PRIMARY,PRIOR,PRIVILEGES,PROCEDURE,PUBLIC,RANGE,READ,READS,REAL,RECURSIVE,REF,REFERENCES,REFERENCING,RELATIVE,RELEASE,REPEAT,RESIGNAL,RESTRICT,RESULT,RETURN,RETURNS,REVOKE,RIGHT,ROLE,ROLLBACK,ROLLUP,ROUTINE,ROW,ROWS,SAVEPOINT,SCHEMA,SCOPE,SCROLL,SEARCH,SECOND,SECTION,SELECT,SENSITIVE,SESSION,SESSION_USER,SET,SETS,SIGNAL,SIMILAR,SIZE,SMALLINT,SOME,SPACE,SPECIFIC,SPECIFICTYPE,SQL,SQLCODE,SQLERROR,SQLEXCEPTION,SQLSTATE,SQLWARNING,START,STATE,STATIC,SUBMULTISET,SUBSTRING,SUM,SYMMETRIC,SYSTEM,SYSTEM_USER,TABLE,TABLESAMPLE,TEMPORARY,THEN,TIME,TIMESTAMP,TIMEZONE_HOUR,TIMEZONE_MINUTE,TO,TRAILING,TRANSACTION,TRANSLATE,TRANSLATION,TREAT,TRIGGER,TRIM,TRUE,UNDER,UNDO,UNION,UNIQUE,UNKNOWN,UNNEST,UNTIL,UPDATE,UPPER,USAGE,USER,USING,VALUE,VALUES,VARCHAR,VARYING,VIEW,WHEN,WHENEVER,WHERE,WHILE,WINDOW,WITH,WITHIN,WITHOUT,WORK,WRITE,YEAR,ZONE"
							.toLowerCase()));

	/**
     *
     */
	public GetRooTag() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jet.taglib.EmptyTag#doAction(org.eclipse.jet.taglib.TagInfo,
	 * org.eclipse.jet.JET2Context, org.eclipse.jet.JET2Writer)
	 */
	public void doAction(TagInfo tc, JET2Context context, JET2Writer out) throws JET2TagException {

		String selectXPath = getAttribute("select"); //$NON-NLS-1$
		String defaultValue = getAttribute("default"); //$NON-NLS-1$
		String _ignoreCase = getAttribute("ignoreCase"); //$NON-NLS-1$
		String _avoid = getAttribute("avoid"); //$NON-NLS-1$

		XPathContextExtender xpathContext = XPathContextExtender.getInstance(context);
		String input = xpathContext.resolveAsString(xpathContext.currentXPathContextObject(), selectXPath);

		if (input == null && defaultValue != null)
			input = defaultValue;

		if (input == null)
			throw new JET2TagException("XPath expression returned no result");

		boolean ignoreCase = true;
		if ("false".equalsIgnoreCase(_ignoreCase)) {ignoreCase = false;} //$NON-NLS-1$
		if ("no".equalsIgnoreCase(_ignoreCase)) {ignoreCase = false;} //$NON-NLS-1$

		Set<String> avoid = StringUtils.commaDelimitedListToSet(_avoid);

		String s, result = input;

		if (avoid.contains("test")) //$NON-NLS-1$
			if ( input.endsWith("Test") || input.endsWith("TestCase") ) {
				context.logInfo("The name '" + input + "' conflicts with test execution defaults"); //$NON-NLS-1$
				result = result + "_"; //$NON-NLS-1$
			}

		s = ignoreCase ? result.toLowerCase() : result;

		if (avoid.contains("java")) //$NON-NLS-1$
			if ( GetRooTag.RESERVED_JAVA_KEYWORDS.contains(s) ) {
				context.logInfo("Reserved Java keyword '" + input + "' is not permitted"); //$NON-NLS-1$
				result = result + "_"; //$NON-NLS-1$
			}

		s = ignoreCase ? result.toLowerCase() : result;

		if (avoid.contains("sql")) //$NON-NLS-1$
			if ( GetRooTag.RESERVED_SQL_KEYWORDS.contains(s) ) {
				context.logInfo("Reserved SQL keyword '" + input + "' is not permitted"); //$NON-NLS-1$
				result = result + "_"; //$NON-NLS-1$
			}

		out.write(result);
	}

}
