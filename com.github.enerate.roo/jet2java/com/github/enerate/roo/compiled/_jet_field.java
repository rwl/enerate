package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import java.util.*;

public class _jet_field implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_field() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_7 = new TagInfo("c:get", //$NON-NLS-1$
            31, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_13 = new TagInfo("c:get", //$NON-NLS-1$
            32, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_34_9 = new TagInfo("c:include", //$NON-NLS-1$
            34, 9,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_83 = new TagInfo("c:get", //$NON-NLS-1$
            34, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_1 = new TagInfo("c:if", //$NON-NLS-1$
            35, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@transient = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_37_12 = new TagInfo("c:include", //$NON-NLS-1$
            37, 12,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_38_1 = new TagInfo("c:if", //$NON-NLS-1$
            38, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_9 = new TagInfo("c:get", //$NON-NLS-1$
            39, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_1 = new TagInfo("c:if", //$NON-NLS-1$
            41, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($fieldType = 'number') or ($fieldType = 'date') or ($fieldType = 'other')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_10 = new TagInfo("c:get", //$NON-NLS-1$
            42, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$instanceTypeName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_1.setRuntimeParent(null);
        _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
        _jettag_c_setVariable_2_1.doStart(context, out);
        _jettag_c_setVariable_2_1.doEnd();

HashMap<String, String> typeMap = new HashMap<String, String>();
typeMap.put("boolean", "boolean");
typeMap.put("java.lang.Boolean", "boolean");
typeMap.put("char", "string");
typeMap.put("java.lang.Character", "string");
typeMap.put("java.util.Date", "date");
typeMap.put("double", "number");
typeMap.put("java.lang.Double", "number");
typeMap.put("float", "number");
typeMap.put("java.lang.Float", "number");
typeMap.put("int", "number");
typeMap.put("java.lang.Integer", "number");
typeMap.put("java.lang.Class", "other");
typeMap.put("java.lang.Object", "other");
typeMap.put("long", "number");
typeMap.put("java.lang.Long", "number");
typeMap.put("java.util.Map", "other");
typeMap.put("short", "number");
typeMap.put("java.lang.Short", "number");
typeMap.put("java.lang.String", "string");

String itn = (String)context.getVariable("instanceTypeName");
String val = "other";
if (typeMap.containsKey(itn))
    val = typeMap.get(itn);
context.setVariable("fieldType", val);

        out.write("field ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_7.setRuntimeParent(null);
        _jettag_c_get_31_7.setTagInfo(_td_c_get_31_7);
        _jettag_c_get_31_7.doStart(context, out);
        _jettag_c_get_31_7.doEnd();
        out.write(NL);         
        out.write("--fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_13.setRuntimeParent(null);
        _jettag_c_get_32_13.setTagInfo(_td_c_get_32_13);
        _jettag_c_get_32_13.doStart(context, out);
        _jettag_c_get_32_13.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_33_1.setRuntimeParent(null);
        _jettag_c_setVariable_33_1.setTagInfo(_td_c_setVariable_33_1);
        _jettag_c_setVariable_33_1.doStart(context, out);
        _jettag_c_setVariable_33_1.doEnd();
        out.write("--class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_34_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_34_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_34_9.setRuntimeParent(null);
        _jettag_c_include_34_9.setTagInfo(_td_c_include_34_9);
        _jettag_c_include_34_9.doStart(context, out);
        _jettag_c_include_34_9.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_83.setRuntimeParent(null);
        _jettag_c_get_34_83.setTagInfo(_td_c_get_34_83);
        _jettag_c_get_34_83.doStart(context, out);
        _jettag_c_get_34_83.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_1.setRuntimeParent(null);
        _jettag_c_if_35_1.setTagInfo(_td_c_if_35_1);
        _jettag_c_if_35_1.doStart(context, out);
        while (_jettag_c_if_35_1.okToProcessBody()) {
            out.write("--transient");  //$NON-NLS-1$        
            _jettag_c_if_35_1.handleBodyContent(out);
        }
        _jettag_c_if_35_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_36_1.setRuntimeParent(null);
        _jettag_c_setVariable_36_1.setTagInfo(_td_c_setVariable_36_1);
        _jettag_c_setVariable_36_1.doStart(context, out);
        _jettag_c_setVariable_36_1.doEnd();
        out.write("--comment \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_37_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_37_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_37_12.setRuntimeParent(null);
        _jettag_c_include_37_12.setTagInfo(_td_c_include_37_12);
        _jettag_c_include_37_12.doStart(context, out);
        _jettag_c_include_37_12.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_38_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_38_1.setRuntimeParent(null);
        _jettag_c_if_38_1.setTagInfo(_td_c_if_38_1);
        _jettag_c_if_38_1.doStart(context, out);
        while (_jettag_c_if_38_1.okToProcessBody()) {
            out.write("--value ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_39_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_9.setRuntimeParent(_jettag_c_if_38_1);
            _jettag_c_get_39_9.setTagInfo(_td_c_get_39_9);
            _jettag_c_get_39_9.doStart(context, out);
            _jettag_c_get_39_9.doEnd();
            out.write(NL);         
            _jettag_c_if_38_1.handleBodyContent(out);
        }
        _jettag_c_if_38_1.doEnd();
        RuntimeTagElement _jettag_c_if_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_41_1.setRuntimeParent(null);
        _jettag_c_if_41_1.setTagInfo(_td_c_if_41_1);
        _jettag_c_if_41_1.doStart(context, out);
        while (_jettag_c_if_41_1.okToProcessBody()) {
            out.write("--type = ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_10.setRuntimeParent(_jettag_c_if_41_1);
            _jettag_c_get_42_10.setTagInfo(_td_c_get_42_10);
            _jettag_c_get_42_10.doStart(context, out);
            _jettag_c_get_42_10.doEnd();
            out.write(NL);         
            _jettag_c_if_41_1.handleBodyContent(out);
        }
        _jettag_c_if_41_1.doEnd();
    }
}
