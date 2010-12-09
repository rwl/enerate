package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_module implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_module() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_29_1 = new TagInfo("c:include", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_1 = new TagInfo("c:if", //$NON-NLS-1$
            32, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_33_57 = new TagInfo("c:include", //$NON-NLS-1$
            33, 57,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_40_1 = new TagInfo("c:include", //$NON-NLS-1$
            40, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/import.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EDataType", //$NON-NLS-1$
                "eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_3 = new TagInfo("c:get", //$NON-NLS-1$
            53, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_50 = new TagInfo("c:get", //$NON-NLS-1$
            53, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "string($eDataType/@defaultValue)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_100 = new TagInfo("c:if", //$NON-NLS-1$
            53, 100,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eDataType/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_148 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 148,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_201 = new TagInfo("c:if", //$NON-NLS-1$
            53, 201,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/@defaultValue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_53_254 = new TagInfo("c:include", //$NON-NLS-1$
            53, 254,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_56_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            56, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_1 = new TagInfo("c:if", //$NON-NLS-1$
            58, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_58_47 = new TagInfo("c:include", //$NON-NLS-1$
            58, 47,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_59_1 = new TagInfo("c:choose", //$NON-NLS-1$
            59, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_60_1 = new TagInfo("c:when", //$NON-NLS-1$
            60, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_1 = new TagInfo("c:get", //$NON-NLS-1$
            61, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_63_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            63, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_64_1 = new TagInfo("c:get", //$NON-NLS-1$
            64, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_64_39 = new TagInfo("c:iterate", //$NON-NLS-1$
            64, 39,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
                "eLiteralIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_102 = new TagInfo("c:get", //$NON-NLS-1$
            64, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals[$eLiteralIdx]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_64_160 = new TagInfo("c:if", //$NON-NLS-1$
            64, 160,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteralIdx != count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_64_234 = new TagInfo("c:if", //$NON-NLS-1$
            64, 234,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_64_286 = new TagInfo("c:include", //$NON-NLS-1$
            64, 286,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_70_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            70, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_73_3 = new TagInfo("c:choose", //$NON-NLS-1$
            73, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eSuperTypes/ePackage[@name = $ePackage/@name] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_74_5 = new TagInfo("c:when", //$NON-NLS-1$
            74, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_76_1 = new TagInfo("c:include", //$NON-NLS-1$
            76, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/class.jet", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_79_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            79, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_86_1 = new TagInfo("c:include", //$NON-NLS-1$
            86, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/hierarchy.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

ArrayList<String> defined = new ArrayList<String>();
ArrayList<String> queue = new ArrayList<String>();
HashMap<String, String> instanceTypeNameTraitMap = new HashMap<String, String>();
instanceTypeNameTraitMap.put("boolean", "Bool");
instanceTypeNameTraitMap.put("java.lang.Boolean", "Bool");
instanceTypeNameTraitMap.put("char", "Str");
instanceTypeNameTraitMap.put("java.lang.Character", "Str");
instanceTypeNameTraitMap.put("java.util.Date", "Date");
instanceTypeNameTraitMap.put("double", "Float");
instanceTypeNameTraitMap.put("java.lang.Double", "Float");
instanceTypeNameTraitMap.put("float", "Float");
instanceTypeNameTraitMap.put("java.lang.Float", "Float");
instanceTypeNameTraitMap.put("int", "Int");
instanceTypeNameTraitMap.put("java.lang.Integer", "Int");
instanceTypeNameTraitMap.put("java.lang.Class", "Class");
instanceTypeNameTraitMap.put("java.lang.Object", "Python");
instanceTypeNameTraitMap.put("long", "Long");
instanceTypeNameTraitMap.put("java.lang.Long", "Long");
instanceTypeNameTraitMap.put("java.util.Map", "Dict");
instanceTypeNameTraitMap.put("short", "Int");
instanceTypeNameTraitMap.put("java.lang.Short", "Int");
instanceTypeNameTraitMap.put("java.lang.String", "Str");

        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_29_1.setRuntimeParent(null);
        _jettag_c_include_29_1.setTagInfo(_td_c_include_29_1);
        _jettag_c_include_29_1.doStart(context, out);
        _jettag_c_include_29_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_32_1.setRuntimeParent(null);
        _jettag_c_if_32_1.setTagInfo(_td_c_if_32_1);
        _jettag_c_if_32_1.doStart(context, out);
        while (_jettag_c_if_32_1.okToProcessBody()) {
            out.write("\"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_33_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_33_5.setRuntimeParent(_jettag_c_if_32_1);
            _jettag_c_setVariable_33_5.setTagInfo(_td_c_setVariable_33_5);
            _jettag_c_setVariable_33_5.doStart(context, out);
            _jettag_c_setVariable_33_5.doEnd();
            RuntimeTagElement _jettag_c_include_33_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_33_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_33_57.setRuntimeParent(_jettag_c_if_32_1);
            _jettag_c_include_33_57.setTagInfo(_td_c_include_33_57);
            _jettag_c_include_33_57.doStart(context, out);
            _jettag_c_include_33_57.doEnd();
            out.write(NL);         
            out.write("\"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_32_1.handleBodyContent(out);
        }
        _jettag_c_if_32_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Imports:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_40_1.setRuntimeParent(null);
        _jettag_c_include_40_1.setTagInfo(_td_c_include_40_1);
        _jettag_c_include_40_1.doStart(context, out);
        _jettag_c_include_40_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Trait definitions:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_44_1.setRuntimeParent(null);
        _jettag_c_iterate_44_1.setTagInfo(_td_c_iterate_44_1);
        _jettag_c_iterate_44_1.doStart(context, out);
        while (_jettag_c_iterate_44_1.okToProcessBody()) {
    
    EDataType dt = (EDataType)context.getVariable("eDataType");
    String tn;

    if ( instanceTypeNameTraitMap.containsKey( dt.getInstanceTypeName() ) ) {
        tn = instanceTypeNameTraitMap.get( dt.getInstanceTypeName() );
    } else {
        tn = "Str";
    }
    
            RuntimeTagElement _jettag_c_get_53_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_3.setRuntimeParent(_jettag_c_iterate_44_1);
            _jettag_c_get_53_3.setTagInfo(_td_c_get_53_3);
            _jettag_c_get_53_3.doStart(context, out);
            _jettag_c_get_53_3.doEnd();
            out.write(" = ");  //$NON-NLS-1$        
            out.write( tn );
            out.write("(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_50.setRuntimeParent(_jettag_c_iterate_44_1);
            _jettag_c_get_53_50.setTagInfo(_td_c_get_53_50);
            _jettag_c_get_53_50.doStart(context, out);
            _jettag_c_get_53_50.doEnd();
            RuntimeTagElement _jettag_c_if_53_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_100); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_53_100.setRuntimeParent(_jettag_c_iterate_44_1);
            _jettag_c_if_53_100.setTagInfo(_td_c_if_53_100);
            _jettag_c_if_53_100.doStart(context, out);
            while (_jettag_c_if_53_100.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_53_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_53_148.setRuntimeParent(_jettag_c_if_53_100);
                _jettag_c_setVariable_53_148.setTagInfo(_td_c_setVariable_53_148);
                _jettag_c_setVariable_53_148.doStart(context, out);
                _jettag_c_setVariable_53_148.doEnd();
                RuntimeTagElement _jettag_c_if_53_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_201); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_53_201.setRuntimeParent(_jettag_c_if_53_100);
                _jettag_c_if_53_201.setTagInfo(_td_c_if_53_201);
                _jettag_c_if_53_201.doStart(context, out);
                while (_jettag_c_if_53_201.okToProcessBody()) {
                    out.write(", ");  //$NON-NLS-1$        
                    _jettag_c_if_53_201.handleBodyContent(out);
                }
                _jettag_c_if_53_201.doEnd();
                out.write("desc=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_53_254 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_53_254); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_53_254.setRuntimeParent(_jettag_c_if_53_100);
                _jettag_c_include_53_254.setTagInfo(_td_c_include_53_254);
                _jettag_c_include_53_254.doStart(context, out);
                _jettag_c_include_53_254.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                _jettag_c_if_53_100.handleBodyContent(out);
            }
            _jettag_c_if_53_100.doEnd();
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_44_1.handleBodyContent(out);
        }
        _jettag_c_iterate_44_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_56_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_56_1.setRuntimeParent(null);
        _jettag_c_iterate_56_1.setTagInfo(_td_c_iterate_56_1);
        _jettag_c_iterate_56_1.doStart(context, out);
        while (_jettag_c_iterate_56_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_57_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_57_1.setRuntimeParent(_jettag_c_iterate_56_1);
            _jettag_c_setVariable_57_1.setTagInfo(_td_c_setVariable_57_1);
            _jettag_c_setVariable_57_1.doStart(context, out);
            _jettag_c_setVariable_57_1.doEnd();
            RuntimeTagElement _jettag_c_if_58_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_1.setRuntimeParent(_jettag_c_iterate_56_1);
            _jettag_c_if_58_1.setTagInfo(_td_c_if_58_1);
            _jettag_c_if_58_1.doStart(context, out);
            while (_jettag_c_if_58_1.okToProcessBody()) {
                out.write("# ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_58_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_58_47); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_58_47.setRuntimeParent(_jettag_c_if_58_1);
                _jettag_c_include_58_47.setTagInfo(_td_c_include_58_47);
                _jettag_c_include_58_47.doStart(context, out);
                _jettag_c_include_58_47.doEnd();
                _jettag_c_if_58_1.handleBodyContent(out);
            }
            _jettag_c_if_58_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_59_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_59_1.setRuntimeParent(_jettag_c_iterate_56_1);
            _jettag_c_choose_59_1.setTagInfo(_td_c_choose_59_1);
            _jettag_c_choose_59_1.doStart(context, out);
            JET2Writer _jettag_c_choose_59_1_saved_out = out;
            while (_jettag_c_choose_59_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_60_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_60_1.setRuntimeParent(_jettag_c_choose_59_1);
                _jettag_c_when_60_1.setTagInfo(_td_c_when_60_1);
                _jettag_c_when_60_1.doStart(context, out);
                JET2Writer _jettag_c_when_60_1_saved_out = out;
                while (_jettag_c_when_60_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_61_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_61_1.setRuntimeParent(_jettag_c_when_60_1);
                    _jettag_c_get_61_1.setTagInfo(_td_c_get_61_1);
                    _jettag_c_get_61_1.doStart(context, out);
                    _jettag_c_get_61_1.doEnd();
                    out.write(" = Str");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_60_1.handleBodyContent(out);
                }
                out = _jettag_c_when_60_1_saved_out;
                _jettag_c_when_60_1.doEnd();
                RuntimeTagElement _jettag_c_otherwise_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_63_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_63_1.setRuntimeParent(_jettag_c_choose_59_1);
                _jettag_c_otherwise_63_1.setTagInfo(_td_c_otherwise_63_1);
                _jettag_c_otherwise_63_1.doStart(context, out);
                JET2Writer _jettag_c_otherwise_63_1_saved_out = out;
                while (_jettag_c_otherwise_63_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_64_1.setRuntimeParent(_jettag_c_otherwise_63_1);
                    _jettag_c_get_64_1.setTagInfo(_td_c_get_64_1);
                    _jettag_c_get_64_1.doStart(context, out);
                    _jettag_c_get_64_1.doEnd();
                    out.write(" = Enum(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_64_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_39); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_64_39.setRuntimeParent(_jettag_c_otherwise_63_1);
                    _jettag_c_iterate_64_39.setTagInfo(_td_c_iterate_64_39);
                    _jettag_c_iterate_64_39.doStart(context, out);
                    while (_jettag_c_iterate_64_39.okToProcessBody()) {
                        out.write("\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_102); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_102.setRuntimeParent(_jettag_c_iterate_64_39);
                        _jettag_c_get_64_102.setTagInfo(_td_c_get_64_102);
                        _jettag_c_get_64_102.doStart(context, out);
                        _jettag_c_get_64_102.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_64_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_64_160); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_64_160.setRuntimeParent(_jettag_c_iterate_64_39);
                        _jettag_c_if_64_160.setTagInfo(_td_c_if_64_160);
                        _jettag_c_if_64_160.doStart(context, out);
                        while (_jettag_c_if_64_160.okToProcessBody()) {
                            out.write(", ");  //$NON-NLS-1$        
                            _jettag_c_if_64_160.handleBodyContent(out);
                        }
                        _jettag_c_if_64_160.doEnd();
                        _jettag_c_iterate_64_39.handleBodyContent(out);
                    }
                    _jettag_c_iterate_64_39.doEnd();
                    RuntimeTagElement _jettag_c_if_64_234 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_64_234); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_64_234.setRuntimeParent(_jettag_c_otherwise_63_1);
                    _jettag_c_if_64_234.setTagInfo(_td_c_if_64_234);
                    _jettag_c_if_64_234.doStart(context, out);
                    while (_jettag_c_if_64_234.okToProcessBody()) {
                        out.write(", desc=\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_include_64_286 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_64_286); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_include_64_286.setRuntimeParent(_jettag_c_if_64_234);
                        _jettag_c_include_64_286.setTagInfo(_td_c_include_64_286);
                        _jettag_c_include_64_286.doStart(context, out);
                        _jettag_c_include_64_286.doEnd();
                        out.write("\"");  //$NON-NLS-1$        
                        _jettag_c_if_64_234.handleBodyContent(out);
                    }
                    _jettag_c_if_64_234.doEnd();
                    out.write(")");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_63_1.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_63_1_saved_out;
                _jettag_c_otherwise_63_1.doEnd();
                _jettag_c_choose_59_1.handleBodyContent(out);
            }
            out = _jettag_c_choose_59_1_saved_out;
            _jettag_c_choose_59_1.doEnd();
            _jettag_c_iterate_56_1.handleBodyContent(out);
        }
        _jettag_c_iterate_56_1.doEnd();
        out.write(NL);         
        // Call the class template for any EClass objects. 
        RuntimeTagElement _jettag_c_iterate_70_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_70_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_70_1.setRuntimeParent(null);
        _jettag_c_iterate_70_1.setTagInfo(_td_c_iterate_70_1);
        _jettag_c_iterate_70_1.doStart(context, out);
        while (_jettag_c_iterate_70_1.okToProcessBody()) {
     EClass ec = (EClass)context.getVariable("eClass"); 
            // Classes with no super type or classes with super types defined in other classes may be defined in any order. 
            RuntimeTagElement _jettag_c_choose_73_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_73_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_73_3.setRuntimeParent(_jettag_c_iterate_70_1);
            _jettag_c_choose_73_3.setTagInfo(_td_c_choose_73_3);
            _jettag_c_choose_73_3.doStart(context, out);
            JET2Writer _jettag_c_choose_73_3_saved_out = out;
            while (_jettag_c_choose_73_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_74_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_74_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_74_5.setRuntimeParent(_jettag_c_choose_73_3);
                _jettag_c_when_74_5.setTagInfo(_td_c_when_74_5);
                _jettag_c_when_74_5.doStart(context, out);
                JET2Writer _jettag_c_when_74_5_saved_out = out;
                while (_jettag_c_when_74_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             defined.add( ec.getName() ); 
                    RuntimeTagElement _jettag_c_include_76_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_76_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_76_1.setRuntimeParent(_jettag_c_when_74_5);
                    _jettag_c_include_76_1.setTagInfo(_td_c_include_76_1);
                    _jettag_c_include_76_1.doStart(context, out);
                    _jettag_c_include_76_1.doEnd();
                    out.write(NL);         
                    _jettag_c_when_74_5.handleBodyContent(out);
                }
                out = _jettag_c_when_74_5_saved_out;
                _jettag_c_when_74_5.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_79_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_79_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_79_5.setRuntimeParent(_jettag_c_choose_73_3);
                _jettag_c_otherwise_79_5.setTagInfo(_td_c_otherwise_79_5);
                _jettag_c_otherwise_79_5.doStart(context, out);
                JET2Writer _jettag_c_otherwise_79_5_saved_out = out;
                while (_jettag_c_otherwise_79_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             queue.add( ec.getName() ); 
                    _jettag_c_otherwise_79_5.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_79_5_saved_out;
                _jettag_c_otherwise_79_5.doEnd();
                out.write(NL);         
                _jettag_c_choose_73_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_73_3_saved_out;
            _jettag_c_choose_73_3.doEnd();
            _jettag_c_iterate_70_1.handleBodyContent(out);
        }
        _jettag_c_iterate_70_1.doEnd();

context.setVariable( "classQueue", XPathUtil.asNodeSet(queue) );
context.setVariable( "definedClasses", XPathUtil.asNodeSet(defined) );

        RuntimeTagElement _jettag_c_include_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_86_1.setRuntimeParent(null);
        _jettag_c_include_86_1.setTagInfo(_td_c_include_86_1);
        _jettag_c_include_86_1.doStart(context, out);
        _jettag_c_include_86_1.doEnd();
        out.write(NL);         
        //
        //<%
        //Iterator<String> i = queue.iterator();
        //while ( i.hasNext() )
        //{
        //  context.setVariable("eClassName", i.next());
        //
        //      %>
        //<c:setVariable var="eClass" select="$ePackage/EClass[@name = $eClassName]"/>
        //<c:include template="templates/class.jet" passVariables="eClass"/>
        //
        //<%
        //}
        //%>
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
