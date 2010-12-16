package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enums implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_enums() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_2_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_35 = new TagInfo("c:get", //$NON-NLS-1$
            12, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_14_22 = new TagInfo("c:choose", //$NON-NLS-1$
            14, 22,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_15_1 = new TagInfo("c:when", //$NON-NLS-1$
            15, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'unknown'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_16_1 = new TagInfo("c:when", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'primary'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_17_1 = new TagInfo("c:when", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'º'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_18_1 = new TagInfo("c:when", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'open'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_19_1 = new TagInfo("c:when", //$NON-NLS-1$
            19, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'close'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_20_1 = new TagInfo("c:when", //$NON-NLS-1$
            20, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'none'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_21_1 = new TagInfo("c:when", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal = 'min'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_22_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            22, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_replaceStrings_22_14 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            22, 14,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                " ,/,-", //$NON-NLS-1$
                "_,_per_,_minus_", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_71 = new TagInfo("c:get", //$NON-NLS-1$
            22, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Enumerations */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            // abstract,assert,boolean,break,byte,case,catch,char,class,const,continue,default,do,double,else,enum,extends,false,final,finally,float,for,goto,if,implements,import,instanceof,int,interface,long,native,new,null,package,private,protected,public,return,short,static,strictfp,super,switch,synchronized,this,throw,throws,transient,true,try,void,volatile,while 
            // ABSOLUTE,ACTION,ADD,AFTER,ALL,ALLOCATE,ALTER,AND,ANY,ARE,ARRAY,AS,ASC,ASENSITIVE,ASSERTION,ASYMMETRIC,AT,ATOMIC,AUTHORIZATION,AVG,BEFORE,BEGIN,BETWEEN,BIGINT,BINARY,BIT,BIT_LENGTH,BLOB,BOOLEAN,BOTH,BREADTH,BY,CALL,CALLED,CASCADE,CASCADED,CASE,CAST,CATALOG,CHAR,CHARACTER,CHARACTER_LENGTH,CHAR_LENGTH,CHECK,CLOB,CLOSE,COALESCE,COLLATE,COLLATION,COLUMN,COMMIT,
            //CONDITION,CONNECT,CONNECTION,CONSTRAINT,CONSTRAINTS,CONSTRUCTOR,CONTAINS,CONTINUE,CONVERT,CORRESPONDING,COUNT,CREATE,CROSS,CUBE,CURRENT,CURRENT_DATE,CURRENT_DEFAULT_TRANSFORM_GROUP,CURRENT_PATH,CURRENT_ROLE,CURRENT_TIME,CURRENT_TIMESTAMP,CURRENT_TRANSFORM_GROUP_FOR_TYPE,CURRENT_USER,CURSOR,CYCLE,DATA,DATE,DAY,DEALLOCATE,DEC,DECIMAL,DECLARE,DEFAULT,DEFERRABLE,
            //DEFERRED,DELETE,DEPTH,DEREF,DESC,DESCRIBE,DESCRIPTOR,DETERMINISTIC,DIAGNOSTICS,DISCONNECT,DISTINCT,DO,DOMAIN,DOUBLE,DROP,DYNAMIC,EACH,ELEMENT,ELSE,ELSEIF,END,EQUALS,ESCAPE,EXCEPT,EXCEPTION,EXEC,EXECUTE,EXISTS,EXIT,EXTERNAL,EXTRACT,FALSE,FETCH,FILTER,FIRST,FLOAT,FOR,FOREIGN,FOUND,FREE,FROM,FULL,FUNCTION,GENERAL,GET,GLOBAL,GO,GOTO,GRANT,GROUP,GROUPING,HANDLER,
            //HAVING,HOLD,HOUR,IDENTITY,IF,IMMEDIATE,IN,INDEX,INDICATOR,INITIALLY,INNER,INOUT,INPUT,INSENSITIVE,INSERT,INT,INTEGER,INTERSECT,INTERVAL,INTO,IS,ISOLATION,ITERATE,JOIN,KEY,LANGUAGE,LARGE,LAST,LATERAL,LEADING,LEAVE,LEFT,LEVEL,LIKE,LOCAL,LOCALTIME,LOCALTIMESTAMP,LOCATOR,LOOP,LOWER,MAP,MATCH,MAX,MEMBER,MERGE,METHOD,MIN,MINUTE,MODIFIES,MODULE,MONTH,MULTISET,NAMES,
            //NATIONAL,NATURAL,NCHAR,NCLOB,NEW,NEXT,NO,NONE,NOT,NULL,NULLIF,NUMBER,NUMERIC,OBJECT,OCTET_LENGTH,OF,OLD,ON,ONLY,OPEN,OPTION,OR,ORDER,ORDINALITY,OUT,OUTER,OUTPUT,OVER,OVERLAPS,PAD,PARAMETER,PARTIAL,PARTITION,PATH,POSITION,PRECISION,PREPARE,PRESERVE,PRIMARY,PRIOR,PRIVILEGES,PROCEDURE,PUBLIC,RANGE,READ,READS,REAL,RECURSIVE,REF,REFERENCES,REFERENCING,RELATIVE,
            //RELEASE,REPEAT,RESIGNAL,RESTRICT,RESULT,RETURN,RETURNS,REVOKE,RIGHT,ROLE,ROLLBACK,ROLLUP,ROUTINE,ROW,ROWS,SAVEPOINT,SCHEMA,SCOPE,SCROLL,SEARCH,SECOND,SECTION,SELECT,SENSITIVE,SESSION,SESSION_USER,SET,SETS,SIGNAL,SIMILAR,SIZE,SMALLINT,SOME,SPACE,SPECIFIC,SPECIFICTYPE,SQL,SQLCODE,SQLERROR,SQLEXCEPTION,SQLSTATE,SQLWARNING,START,STATE,STATIC,SUBMULTISET,SUBSTRING,
            //SUM,SYMMETRIC,SYSTEM,SYSTEM_USER,TABLE,TABLESAMPLE,TEMPORARY,THEN,TIME,TIMESTAMP,TIMEZONE_HOUR,TIMEZONE_MINUTE,TO,TRAILING,TRANSACTION,TRANSLATE,TRANSLATION,TREAT,TRIGGER,TRIM,TRUE,UNDER,UNDO,UNION,UNIQUE,UNKNOWN,UNNEST,UNTIL,UPDATE,UPPER,USAGE,USER,USING,VALUE,VALUES,VARCHAR,VARYING,VIEW,WHEN,WHENEVER,WHERE,WHILE,WINDOW,WITH,WITHIN,WITHOUT,WORK,WRITE,YEAR,ZONE 
            out.write(NL);         
            out.write("enum type --class ~.client.shared.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_35.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_get_12_35.setTagInfo(_td_c_get_12_35);
            _jettag_c_get_12_35.doStart(context, out);
            _jettag_c_get_12_35.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_13_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
            _jettag_c_iterate_13_1.doStart(context, out);
            while (_jettag_c_iterate_13_1.okToProcessBody()) {
                out.write("enum constant --name ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_choose_14_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_14_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_14_22.setRuntimeParent(_jettag_c_iterate_13_1);
                _jettag_c_choose_14_22.setTagInfo(_td_c_choose_14_22);
                _jettag_c_choose_14_22.doStart(context, out);
                JET2Writer _jettag_c_choose_14_22_saved_out = out;
                while (_jettag_c_choose_14_22.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_15_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_15_1.setTagInfo(_td_c_when_15_1);
                    _jettag_c_when_15_1.doStart(context, out);
                    JET2Writer _jettag_c_when_15_1_saved_out = out;
                    while (_jettag_c_when_15_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("unknown_");  //$NON-NLS-1$        
                        _jettag_c_when_15_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_15_1_saved_out;
                    _jettag_c_when_15_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_16_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_16_1.setTagInfo(_td_c_when_16_1);
                    _jettag_c_when_16_1.doStart(context, out);
                    JET2Writer _jettag_c_when_16_1_saved_out = out;
                    while (_jettag_c_when_16_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("primary_");  //$NON-NLS-1$        
                        _jettag_c_when_16_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_16_1_saved_out;
                    _jettag_c_when_16_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_17_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_17_1.setTagInfo(_td_c_when_17_1);
                    _jettag_c_when_17_1.doStart(context, out);
                    JET2Writer _jettag_c_when_17_1_saved_out = out;
                    while (_jettag_c_when_17_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("deg_");  //$NON-NLS-1$        
                        _jettag_c_when_17_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_17_1_saved_out;
                    _jettag_c_when_17_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_18_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_18_1.setTagInfo(_td_c_when_18_1);
                    _jettag_c_when_18_1.doStart(context, out);
                    JET2Writer _jettag_c_when_18_1_saved_out = out;
                    while (_jettag_c_when_18_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("open_");  //$NON-NLS-1$        
                        _jettag_c_when_18_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_18_1_saved_out;
                    _jettag_c_when_18_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_19_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_19_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_19_1.setTagInfo(_td_c_when_19_1);
                    _jettag_c_when_19_1.doStart(context, out);
                    JET2Writer _jettag_c_when_19_1_saved_out = out;
                    while (_jettag_c_when_19_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("close_");  //$NON-NLS-1$        
                        _jettag_c_when_19_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_19_1_saved_out;
                    _jettag_c_when_19_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_20_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_20_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_20_1.setTagInfo(_td_c_when_20_1);
                    _jettag_c_when_20_1.doStart(context, out);
                    JET2Writer _jettag_c_when_20_1_saved_out = out;
                    while (_jettag_c_when_20_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("none_");  //$NON-NLS-1$        
                        _jettag_c_when_20_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_20_1_saved_out;
                    _jettag_c_when_20_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_21_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_21_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_when_21_1.setTagInfo(_td_c_when_21_1);
                    _jettag_c_when_21_1.doStart(context, out);
                    JET2Writer _jettag_c_when_21_1_saved_out = out;
                    while (_jettag_c_when_21_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("min_");  //$NON-NLS-1$        
                        _jettag_c_when_21_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_21_1_saved_out;
                    _jettag_c_when_21_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_otherwise_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_22_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_22_1.setRuntimeParent(_jettag_c_choose_14_22);
                    _jettag_c_otherwise_22_1.setTagInfo(_td_c_otherwise_22_1);
                    _jettag_c_otherwise_22_1.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_22_1_saved_out = out;
                    while (_jettag_c_otherwise_22_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_replaceStrings_22_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_22_14); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_replaceStrings_22_14.setRuntimeParent(_jettag_c_otherwise_22_1);
                        _jettag_c_replaceStrings_22_14.setTagInfo(_td_c_replaceStrings_22_14);
                        _jettag_c_replaceStrings_22_14.doStart(context, out);
                        JET2Writer _jettag_c_replaceStrings_22_14_saved_out = out;
                        while (_jettag_c_replaceStrings_22_14.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_get_22_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_71); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_22_71.setRuntimeParent(_jettag_c_replaceStrings_22_14);
                            _jettag_c_get_22_71.setTagInfo(_td_c_get_22_71);
                            _jettag_c_get_22_71.doStart(context, out);
                            _jettag_c_get_22_71.doEnd();
                            _jettag_c_replaceStrings_22_14.handleBodyContent(out);
                        }
                        out = _jettag_c_replaceStrings_22_14_saved_out;
                        _jettag_c_replaceStrings_22_14.doEnd();
                        _jettag_c_otherwise_22_1.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_22_1_saved_out;
                    _jettag_c_otherwise_22_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_14_22.handleBodyContent(out);
                }
                out = _jettag_c_choose_14_22_saved_out;
                _jettag_c_choose_14_22.doEnd();
                _jettag_c_iterate_13_1.handleBodyContent(out);
            }
            _jettag_c_iterate_13_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
    }
}
