package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import java.util.*;
import org.eclipse.emf.ecore.*;

public class _jet_field implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_field() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_1 = new TagInfo("c:if", //$NON-NLS-1$
            42, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_7 = new TagInfo("c:get", //$NON-NLS-1$
            43, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_48 = new TagInfo("c:get", //$NON-NLS-1$
            43, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_44_1 = new TagInfo("c:if", //$NON-NLS-1$
            44, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@transient = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_1 = new TagInfo("c:if", //$NON-NLS-1$
            45, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_55 = new TagInfo("c:get", //$NON-NLS-1$
            45, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_46_1 = new TagInfo("c:if", //$NON-NLS-1$
            46, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eAttribute/@lowerBound = 1) and ($eAttribute/@upperBound = 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_1 = new TagInfo("c:if", //$NON-NLS-1$
            47, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eAttribute/@lowerBound = 0) and ($eAttribute/@upperBound = 0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_1 = new TagInfo("c:if", //$NON-NLS-1$
            49, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($fieldType = 'number') or ($fieldType = 'date') or ($fieldType = 'other')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_96 = new TagInfo("c:get", //$NON-NLS-1$
            49, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_1 = new TagInfo("c:if", //$NON-NLS-1$
            50, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($fieldType = 'boolean') and ($instanceTypeName = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_1 = new TagInfo("c:if", //$NON-NLS-1$
            52, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType = 'number'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_1 = new TagInfo("c:if", //$NON-NLS-1$
            53, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($instanceTypeName = 'float') or ($instanceTypeName = 'double') or ($instanceTypeName = 'int') or ($instanceTypeName = 'short') or ($instanceTypeName = 'long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_54_1 = new TagInfo("c:if", //$NON-NLS-1$
            54, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@iD = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_58_1 = new TagInfo("c:include", //$NON-NLS-1$
            58, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_1.setRuntimeParent(null);
        _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
        _jettag_c_setVariable_3_1.doStart(context, out);
        _jettag_c_setVariable_3_1.doEnd();

HashMap<String, String> typeMap = new HashMap<String, String>();

typeMap.put("boolean", "boolean");
typeMap.put("java.lang.Boolean", "boolean");

typeMap.put("java.lang.String", "string");
typeMap.put("char", "string");
typeMap.put("java.lang.Character", "string");

typeMap.put("float", "number");
typeMap.put("java.lang.Float", "number");
typeMap.put("double", "number");
typeMap.put("java.lang.Double", "number");
typeMap.put("int", "number");
typeMap.put("java.lang.Integer", "number");
typeMap.put("short", "number");
typeMap.put("java.lang.Short", "number");
typeMap.put("long", "number");
typeMap.put("java.lang.Long", "number");

typeMap.put("java.util.Date", "date");

typeMap.put("java.lang.Class", "other");
typeMap.put("java.lang.Object", "other");
typeMap.put("java.util.Map", "other");

String itn = (String) context.getVariable("instanceTypeName");
String val = "other";
if (typeMap.containsKey(itn))
    val = typeMap.get(itn);

EAttribute attr = (EAttribute) context.getVariable("eAttribute");
if (attr.getEAttributeType().eClass().getName() == "EEnum")
	val = "enum";

context.setVariable("fieldType", val);

        RuntimeTagElement _jettag_c_if_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_42_1.setRuntimeParent(null);
        _jettag_c_if_42_1.setTagInfo(_td_c_if_42_1);
        _jettag_c_if_42_1.doStart(context, out);
        while (_jettag_c_if_42_1.okToProcessBody()) {
            _jettag_c_if_42_1.handleBodyContent(out);
        }
        _jettag_c_if_42_1.doEnd();
        out.write(NL);         
        out.write("field ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_7.setRuntimeParent(null);
        _jettag_c_get_43_7.setTagInfo(_td_c_get_43_7);
        _jettag_c_get_43_7.doStart(context, out);
        _jettag_c_get_43_7.doEnd();
        out.write(" --fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_48.setRuntimeParent(null);
        _jettag_c_get_43_48.setTagInfo(_td_c_get_43_48);
        _jettag_c_get_43_48.doStart(context, out);
        _jettag_c_get_43_48.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_44_1.setRuntimeParent(null);
        _jettag_c_if_44_1.setTagInfo(_td_c_if_44_1);
        _jettag_c_if_44_1.doStart(context, out);
        while (_jettag_c_if_44_1.okToProcessBody()) {
            out.write("--transient");  //$NON-NLS-1$        
            _jettag_c_if_44_1.handleBodyContent(out);
        }
        _jettag_c_if_44_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_45_1.setRuntimeParent(null);
        _jettag_c_if_45_1.setTagInfo(_td_c_if_45_1);
        _jettag_c_if_45_1.doStart(context, out);
        while (_jettag_c_if_45_1.okToProcessBody()) {
            out.write("--value ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_45_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_45_55.setRuntimeParent(_jettag_c_if_45_1);
            _jettag_c_get_45_55.setTagInfo(_td_c_get_45_55);
            _jettag_c_get_45_55.doStart(context, out);
            _jettag_c_get_45_55.doEnd();
            _jettag_c_if_45_1.handleBodyContent(out);
        }
        _jettag_c_if_45_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_46_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_46_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_46_1.setRuntimeParent(null);
        _jettag_c_if_46_1.setTagInfo(_td_c_if_46_1);
        _jettag_c_if_46_1.doStart(context, out);
        while (_jettag_c_if_46_1.okToProcessBody()) {
            out.write("--notNull");  //$NON-NLS-1$        
            _jettag_c_if_46_1.handleBodyContent(out);
        }
        _jettag_c_if_46_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_47_1.setRuntimeParent(null);
        _jettag_c_if_47_1.setTagInfo(_td_c_if_47_1);
        _jettag_c_if_47_1.doStart(context, out);
        while (_jettag_c_if_47_1.okToProcessBody()) {
            out.write("--nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_47_1.handleBodyContent(out);
        }
        _jettag_c_if_47_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_49_1.setRuntimeParent(null);
        _jettag_c_if_49_1.setTagInfo(_td_c_if_49_1);
        _jettag_c_if_49_1.doStart(context, out);
        while (_jettag_c_if_49_1.okToProcessBody()) {
            out.write("--type ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_96); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_96.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_49_96.setTagInfo(_td_c_get_49_96);
            _jettag_c_get_49_96.doStart(context, out);
            _jettag_c_get_49_96.doEnd();
            _jettag_c_if_49_1.handleBodyContent(out);
        }
        _jettag_c_if_49_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_50_1.setRuntimeParent(null);
        _jettag_c_if_50_1.setTagInfo(_td_c_if_50_1);
        _jettag_c_if_50_1.doStart(context, out);
        while (_jettag_c_if_50_1.okToProcessBody()) {
            out.write("--primitive");  //$NON-NLS-1$        
            _jettag_c_if_50_1.handleBodyContent(out);
        }
        _jettag_c_if_50_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_52_1.setRuntimeParent(null);
        _jettag_c_if_52_1.setTagInfo(_td_c_if_52_1);
        _jettag_c_if_52_1.doStart(context, out);
        while (_jettag_c_if_52_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_53_1.setRuntimeParent(_jettag_c_if_52_1);
            _jettag_c_if_53_1.setTagInfo(_td_c_if_53_1);
            _jettag_c_if_53_1.doStart(context, out);
            while (_jettag_c_if_53_1.okToProcessBody()) {
                out.write("--primitive");  //$NON-NLS-1$        
                _jettag_c_if_53_1.handleBodyContent(out);
            }
            _jettag_c_if_53_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_54_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_54_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_54_1.setRuntimeParent(_jettag_c_if_52_1);
            _jettag_c_if_54_1.setTagInfo(_td_c_if_54_1);
            _jettag_c_if_54_1.doStart(context, out);
            while (_jettag_c_if_54_1.okToProcessBody()) {
                out.write("--unique");  //$NON-NLS-1$        
                _jettag_c_if_54_1.handleBodyContent(out);
            }
            _jettag_c_if_54_1.doEnd();
            out.write(NL);         
            _jettag_c_if_52_1.handleBodyContent(out);
        }
        _jettag_c_if_52_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_57_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_57_1.setRuntimeParent(null);
        _jettag_c_setVariable_57_1.setTagInfo(_td_c_setVariable_57_1);
        _jettag_c_setVariable_57_1.doStart(context, out);
        _jettag_c_setVariable_57_1.doEnd();
        RuntimeTagElement _jettag_c_include_58_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_58_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_58_1.setRuntimeParent(null);
        _jettag_c_include_58_1.setTagInfo(_td_c_include_58_1);
        _jettag_c_include_58_1.doStart(context, out);
        _jettag_c_include_58_1.doEnd();
    }
}
