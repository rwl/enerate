package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_init implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_init() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_30_1 = new TagInfo("c:include", //$NON-NLS-1$
            30, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_1 = new TagInfo("c:if", //$NON-NLS-1$
            33, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_34_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            34, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_34_57 = new TagInfo("c:include", //$NON-NLS-1$
            34, 57,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_1 = new TagInfo("c:if", //$NON-NLS-1$
            43, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "(count($ePackage/EDataType) != 0) or (count($ePackage/EEnum) != 0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_14 = new TagInfo("c:get", //$NON-NLS-1$
            47, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_11 = new TagInfo("c:get", //$NON-NLS-1$
            48, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EDataType", //$NON-NLS-1$
                "eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_3 = new TagInfo("c:if", //$NON-NLS-1$
            59, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eDataType/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_51 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 51,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_59_106 = new TagInfo("c:include", //$NON-NLS-1$
            59, 106,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_64_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            64, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_1 = new TagInfo("c:if", //$NON-NLS-1$
            65, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_65_47 = new TagInfo("c:include", //$NON-NLS-1$
            65, 47,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_66_1 = new TagInfo("c:choose", //$NON-NLS-1$
            66, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_1 = new TagInfo("c:when", //$NON-NLS-1$
            67, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_1 = new TagInfo("c:get", //$NON-NLS-1$
            68, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_71_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            71, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_72_1 = new TagInfo("c:get", //$NON-NLS-1$
            72, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_61 = new TagInfo("c:get", //$NON-NLS-1$
            72, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals[1]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_82 = new TagInfo("c:get", //$NON-NLS-1$
            73, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

ArrayList<String> defined = new ArrayList<String>();
ArrayList<String> queue = new ArrayList<String>();
HashMap<String, String> instanceTypeNamePropertyMap = new HashMap<String, String>();

instanceTypeNamePropertyMap.put("boolean", "db.BooleanProperty()");
instanceTypeNamePropertyMap.put("java.lang.Boolean", "db.BooleanProperty()");
instanceTypeNamePropertyMap.put("char", "db.StringProperty()");
instanceTypeNamePropertyMap.put("java.lang.Character", "db.StringProperty()");
instanceTypeNamePropertyMap.put("java.util.Date", "db.DateTimeProperty()");
instanceTypeNamePropertyMap.put("double", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("java.lang.Double", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("float", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("java.lang.Float", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("int", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Integer", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Class", "db.ReferenceProperty()");
instanceTypeNamePropertyMap.put("java.lang.Object", "db.ReferenceProperty()");
instanceTypeNamePropertyMap.put("long", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Long", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.util.Map", "db.ListProperty()");
instanceTypeNamePropertyMap.put("short", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Short", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.String", "db.StringProperty()");

        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_30_1.setRuntimeParent(null);
        _jettag_c_include_30_1.setTagInfo(_td_c_include_30_1);
        _jettag_c_include_30_1.doStart(context, out);
        _jettag_c_include_30_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_33_1.setRuntimeParent(null);
        _jettag_c_if_33_1.setTagInfo(_td_c_if_33_1);
        _jettag_c_if_33_1.doStart(context, out);
        while (_jettag_c_if_33_1.okToProcessBody()) {
            out.write("\"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_34_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_34_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_34_5.setRuntimeParent(_jettag_c_if_33_1);
            _jettag_c_setVariable_34_5.setTagInfo(_td_c_setVariable_34_5);
            _jettag_c_setVariable_34_5.doStart(context, out);
            _jettag_c_setVariable_34_5.doEnd();
            RuntimeTagElement _jettag_c_include_34_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_34_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_34_57.setRuntimeParent(_jettag_c_if_33_1);
            _jettag_c_include_34_57.setTagInfo(_td_c_include_34_57);
            _jettag_c_include_34_57.doStart(context, out);
            _jettag_c_include_34_57.doEnd();
            out.write(NL);         
            out.write("\"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_33_1.handleBodyContent(out);
        }
        _jettag_c_if_33_1.doEnd();
        //
        //<c:iterate select="$ePackage/EClass" var="eClass">
        //from <c:setVariable select="$ePackage" var="eSuper"/><c:include template="templates/package_name.jet" passVariables="eSuper"/>.<c:get select="underscore($eClass/@name)"/> import <c:get select="$eClass/@name"/>
        //</c:iterate>
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_43_1.setRuntimeParent(null);
        _jettag_c_if_43_1.setTagInfo(_td_c_if_43_1);
        _jettag_c_if_43_1.doStart(context, out);
        while (_jettag_c_if_43_1.okToProcessBody()) {
            out.write("from google.appengine.ext import db");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c_if_43_1.handleBodyContent(out);
        }
        _jettag_c_if_43_1.doEnd();
        out.write("ns_prefix = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_14.setRuntimeParent(null);
        _jettag_c_get_47_14.setTagInfo(_td_c_get_47_14);
        _jettag_c_get_47_14.doStart(context, out);
        _jettag_c_get_47_14.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("ns_uri = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_11.setRuntimeParent(null);
        _jettag_c_get_48_11.setTagInfo(_td_c_get_48_11);
        _jettag_c_get_48_11.doStart(context, out);
        _jettag_c_get_48_11.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_50_1.setRuntimeParent(null);
        _jettag_c_iterate_50_1.setTagInfo(_td_c_iterate_50_1);
        _jettag_c_iterate_50_1.doStart(context, out);
        while (_jettag_c_iterate_50_1.okToProcessBody()) {
    
    EDataType dt = (EDataType)context.getVariable("eDataType");
    String tn;

    if ( instanceTypeNamePropertyMap.containsKey( dt.getInstanceTypeName() ) ) {
        tn = instanceTypeNamePropertyMap.get( dt.getInstanceTypeName() );
    } else {
        tn = "db.StringProperty";
    }
    
            RuntimeTagElement _jettag_c_if_59_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_59_3.setRuntimeParent(_jettag_c_iterate_50_1);
            _jettag_c_if_59_3.setTagInfo(_td_c_if_59_3);
            _jettag_c_if_59_3.doStart(context, out);
            while (_jettag_c_if_59_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_59_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_59_51.setRuntimeParent(_jettag_c_if_59_3);
                _jettag_c_setVariable_59_51.setTagInfo(_td_c_setVariable_59_51);
                _jettag_c_setVariable_59_51.doStart(context, out);
                _jettag_c_setVariable_59_51.doEnd();
                out.write("# ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_59_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_59_106); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_59_106.setRuntimeParent(_jettag_c_if_59_3);
                _jettag_c_include_59_106.setTagInfo(_td_c_include_59_106);
                _jettag_c_include_59_106.doStart(context, out);
                _jettag_c_include_59_106.doEnd();
                _jettag_c_if_59_3.handleBodyContent(out);
            }
            _jettag_c_if_59_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_get_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_1.setRuntimeParent(_jettag_c_iterate_50_1);
            _jettag_c_get_60_1.setTagInfo(_td_c_get_60_1);
            _jettag_c_get_60_1.doStart(context, out);
            _jettag_c_get_60_1.doEnd();
            out.write(" = ");  //$NON-NLS-1$        
            out.write( tn );
            //<c:get select="string($eDataType/@defaultValue)"/>)
            out.write(NL);         
            out.write(NL);         
            _jettag_c_iterate_50_1.handleBodyContent(out);
        }
        _jettag_c_iterate_50_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_63_1.setRuntimeParent(null);
        _jettag_c_iterate_63_1.setTagInfo(_td_c_iterate_63_1);
        _jettag_c_iterate_63_1.doStart(context, out);
        while (_jettag_c_iterate_63_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_64_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_64_1.setRuntimeParent(_jettag_c_iterate_63_1);
            _jettag_c_setVariable_64_1.setTagInfo(_td_c_setVariable_64_1);
            _jettag_c_setVariable_64_1.doStart(context, out);
            _jettag_c_setVariable_64_1.doEnd();
            RuntimeTagElement _jettag_c_if_65_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_65_1.setRuntimeParent(_jettag_c_iterate_63_1);
            _jettag_c_if_65_1.setTagInfo(_td_c_if_65_1);
            _jettag_c_if_65_1.doStart(context, out);
            while (_jettag_c_if_65_1.okToProcessBody()) {
                out.write("# ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_65_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_65_47); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_65_47.setRuntimeParent(_jettag_c_if_65_1);
                _jettag_c_include_65_47.setTagInfo(_td_c_include_65_47);
                _jettag_c_include_65_47.doStart(context, out);
                _jettag_c_include_65_47.doEnd();
                _jettag_c_if_65_1.handleBodyContent(out);
            }
            _jettag_c_if_65_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_66_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_66_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_66_1.setRuntimeParent(_jettag_c_iterate_63_1);
            _jettag_c_choose_66_1.setTagInfo(_td_c_choose_66_1);
            _jettag_c_choose_66_1.doStart(context, out);
            JET2Writer _jettag_c_choose_66_1_saved_out = out;
            while (_jettag_c_choose_66_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_67_1.setRuntimeParent(_jettag_c_choose_66_1);
                _jettag_c_when_67_1.setTagInfo(_td_c_when_67_1);
                _jettag_c_when_67_1.doStart(context, out);
                JET2Writer _jettag_c_when_67_1_saved_out = out;
                while (_jettag_c_when_67_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_68_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_68_1.setRuntimeParent(_jettag_c_when_67_1);
                    _jettag_c_get_68_1.setTagInfo(_td_c_get_68_1);
                    _jettag_c_get_68_1.doStart(context, out);
                    _jettag_c_get_68_1.doEnd();
                    out.write(" = db.StringProperty()");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_when_67_1.handleBodyContent(out);
                }
                out = _jettag_c_when_67_1_saved_out;
                _jettag_c_when_67_1.doEnd();
                RuntimeTagElement _jettag_c_otherwise_71_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_71_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_71_1.setRuntimeParent(_jettag_c_choose_66_1);
                _jettag_c_otherwise_71_1.setTagInfo(_td_c_otherwise_71_1);
                _jettag_c_otherwise_71_1.doStart(context, out);
                JET2Writer _jettag_c_otherwise_71_1_saved_out = out;
                while (_jettag_c_otherwise_71_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_72_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_1.setRuntimeParent(_jettag_c_otherwise_71_1);
                    _jettag_c_get_72_1.setTagInfo(_td_c_get_72_1);
                    _jettag_c_get_72_1.doStart(context, out);
                    _jettag_c_get_72_1.doEnd();
                    out.write(" = db.StringProperty(default=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_61.setRuntimeParent(_jettag_c_otherwise_71_1);
                    _jettag_c_get_72_61.setTagInfo(_td_c_get_72_61);
                    _jettag_c_get_72_61.doStart(context, out);
                    _jettag_c_get_72_61.doEnd();
                    out.write("\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("    choices=(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_73_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_73_14.setRuntimeParent(_jettag_c_otherwise_71_1);
                    _jettag_c_iterate_73_14.setTagInfo(_td_c_iterate_73_14);
                    _jettag_c_iterate_73_14.doStart(context, out);
                    while (_jettag_c_iterate_73_14.okToProcessBody()) {
                        out.write("\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_73_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_82); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_73_82.setRuntimeParent(_jettag_c_iterate_73_14);
                        _jettag_c_get_73_82.setTagInfo(_td_c_get_73_82);
                        _jettag_c_get_73_82.doStart(context, out);
                        _jettag_c_get_73_82.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        _jettag_c_iterate_73_14.handleBodyContent(out);
                    }
                    _jettag_c_iterate_73_14.doEnd();
                    out.write("))");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_otherwise_71_1.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_71_1_saved_out;
                _jettag_c_otherwise_71_1.doEnd();
                _jettag_c_choose_66_1.handleBodyContent(out);
            }
            out = _jettag_c_choose_66_1_saved_out;
            _jettag_c_choose_66_1.doEnd();
            _jettag_c_iterate_63_1.handleBodyContent(out);
        }
        _jettag_c_iterate_63_1.doEnd();
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
