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
    private static final TagInfo _td_c_get_47_7 = new TagInfo("c:get", //$NON-NLS-1$
            47, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_48 = new TagInfo("c:get", //$NON-NLS-1$
            47, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_83 = new TagInfo("c:if", //$NON-NLS-1$
            47, 83,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@transient = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_60 = new TagInfo("c:if", //$NON-NLS-1$
            48, 60,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($fieldType = 'set') and not($fieldType = 'enum') and $eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_108 = new TagInfo("c:get", //$NON-NLS-1$
            49, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_165 = new TagInfo("c:if", //$NON-NLS-1$
            49, 165,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eAttribute/@lowerBound = 1) and ($eAttribute/@upperBound = 1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_90 = new TagInfo("c:if", //$NON-NLS-1$
            50, 90,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eAttribute/@lowerBound = 0) and ($eAttribute/@upperBound = 0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_95 = new TagInfo("c:if", //$NON-NLS-1$
            51, 95,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType = 'set'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_39 = new TagInfo("c:get", //$NON-NLS-1$
            52, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_84 = new TagInfo("c:get", //$NON-NLS-1$
            52, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/lowerBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_135 = new TagInfo("c:get", //$NON-NLS-1$
            52, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/upperBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_182 = new TagInfo("c:if", //$NON-NLS-1$
            52, 182,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($fieldType = 'number') or ($fieldType = 'date') or ($fieldType = 'other')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_92 = new TagInfo("c:get", //$NON-NLS-1$
            53, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_134 = new TagInfo("c:if", //$NON-NLS-1$
            53, 134,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType = 'enum'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_37 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 37,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eAttribute/eAttributeType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_55_50 = new TagInfo("c:include", //$NON-NLS-1$
            55, 50,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_124 = new TagInfo("c:get", //$NON-NLS-1$
            55, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_52 = new TagInfo("c:if", //$NON-NLS-1$
            56, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($fieldType = 'boolean') and ($instanceTypeName = 'boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_57_88 = new TagInfo("c:if", //$NON-NLS-1$
            57, 88,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fieldType = 'number'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_31 = new TagInfo("c:if", //$NON-NLS-1$
            58, 31,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($instanceTypeName = 'float') or ($instanceTypeName = 'double') or ($instanceTypeName = 'int') or ($instanceTypeName = 'short') or ($instanceTypeName = 'long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_223 = new TagInfo("c:if", //$NON-NLS-1$
            58, 223,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@iD = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_57 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 57,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_59_111 = new TagInfo("c:include", //$NON-NLS-1$
            59, 111,
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

EAttribute attr = (EAttribute) context.getVariable("eAttribute");
String itn = (String) context.getVariable("instanceTypeName");
String val;

if (typeMap.containsKey(itn)) {
    val = typeMap.get(itn);
} else if (attr.getEAttributeType().eClass().getName() == "EEnum") {
	val = "enum";
} else if (attr.getUpperBound() > 1) {
	val = "set";
} else {
	val = "other";
}

context.setVariable("fieldType", val);

        out.write("field ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_7.setRuntimeParent(null);
        _jettag_c_get_47_7.setTagInfo(_td_c_get_47_7);
        _jettag_c_get_47_7.doStart(context, out);
        _jettag_c_get_47_7.doEnd();
        out.write(" --fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_48.setRuntimeParent(null);
        _jettag_c_get_47_48.setTagInfo(_td_c_get_47_48);
        _jettag_c_get_47_48.doStart(context, out);
        _jettag_c_get_47_48.doEnd();
        RuntimeTagElement _jettag_c_if_47_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_83); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_47_83.setRuntimeParent(null);
        _jettag_c_if_47_83.setTagInfo(_td_c_if_47_83);
        _jettag_c_if_47_83.doStart(context, out);
        while (_jettag_c_if_47_83.okToProcessBody()) {
            out.write(" --transient");  //$NON-NLS-1$        
            _jettag_c_if_47_83.handleBodyContent(out);
        }
        _jettag_c_if_47_83.doEnd();
        RuntimeTagElement _jettag_c_if_48_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_60); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_48_60.setRuntimeParent(null);
        _jettag_c_if_48_60.setTagInfo(_td_c_if_48_60);
        _jettag_c_if_48_60.doStart(context, out);
        while (_jettag_c_if_48_60.okToProcessBody()) {
            out.write(" --value ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_108); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_108.setRuntimeParent(_jettag_c_if_48_60);
            _jettag_c_get_49_108.setTagInfo(_td_c_get_49_108);
            _jettag_c_get_49_108.doStart(context, out);
            _jettag_c_get_49_108.doEnd();
            _jettag_c_if_48_60.handleBodyContent(out);
        }
        _jettag_c_if_48_60.doEnd();
        RuntimeTagElement _jettag_c_if_49_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_165); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_49_165.setRuntimeParent(null);
        _jettag_c_if_49_165.setTagInfo(_td_c_if_49_165);
        _jettag_c_if_49_165.doStart(context, out);
        while (_jettag_c_if_49_165.okToProcessBody()) {
            out.write(" --notNull");  //$NON-NLS-1$        
            _jettag_c_if_49_165.handleBodyContent(out);
        }
        _jettag_c_if_49_165.doEnd();
        RuntimeTagElement _jettag_c_if_50_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_50_90.setRuntimeParent(null);
        _jettag_c_if_50_90.setTagInfo(_td_c_if_50_90);
        _jettag_c_if_50_90.doStart(context, out);
        while (_jettag_c_if_50_90.okToProcessBody()) {
            out.write(" --nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_50_90.handleBodyContent(out);
        }
        _jettag_c_if_50_90.doEnd();
        RuntimeTagElement _jettag_c_if_51_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_51_95.setRuntimeParent(null);
        _jettag_c_if_51_95.setTagInfo(_td_c_if_51_95);
        _jettag_c_if_51_95.doStart(context, out);
        while (_jettag_c_if_51_95.okToProcessBody()) {
            out.write(" --element ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_52_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_39.setRuntimeParent(_jettag_c_if_51_95);
            _jettag_c_get_52_39.setTagInfo(_td_c_get_52_39);
            _jettag_c_get_52_39.doStart(context, out);
            _jettag_c_get_52_39.doEnd();
            out.write(" --sizeMin ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_52_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_84); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_84.setRuntimeParent(_jettag_c_if_51_95);
            _jettag_c_get_52_84.setTagInfo(_td_c_get_52_84);
            _jettag_c_get_52_84.doStart(context, out);
            _jettag_c_get_52_84.doEnd();
            out.write(" --sizeMax ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_52_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_135); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_135.setRuntimeParent(_jettag_c_if_51_95);
            _jettag_c_get_52_135.setTagInfo(_td_c_get_52_135);
            _jettag_c_get_52_135.doStart(context, out);
            _jettag_c_get_52_135.doEnd();
            _jettag_c_if_51_95.handleBodyContent(out);
        }
        _jettag_c_if_51_95.doEnd();
        RuntimeTagElement _jettag_c_if_52_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_182); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_52_182.setRuntimeParent(null);
        _jettag_c_if_52_182.setTagInfo(_td_c_if_52_182);
        _jettag_c_if_52_182.doStart(context, out);
        while (_jettag_c_if_52_182.okToProcessBody()) {
            out.write(" --type ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_92.setRuntimeParent(_jettag_c_if_52_182);
            _jettag_c_get_53_92.setTagInfo(_td_c_get_53_92);
            _jettag_c_get_53_92.doStart(context, out);
            _jettag_c_get_53_92.doEnd();
            _jettag_c_if_52_182.handleBodyContent(out);
        }
        _jettag_c_if_52_182.doEnd();
        RuntimeTagElement _jettag_c_if_53_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_134); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_53_134.setRuntimeParent(null);
        _jettag_c_if_53_134.setTagInfo(_td_c_if_53_134);
        _jettag_c_if_53_134.doStart(context, out);
        while (_jettag_c_if_53_134.okToProcessBody()) {
            out.write(" --type ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_54_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_54_37.setRuntimeParent(_jettag_c_if_53_134);
            _jettag_c_setVariable_54_37.setTagInfo(_td_c_setVariable_54_37);
            _jettag_c_setVariable_54_37.doStart(context, out);
            _jettag_c_setVariable_54_37.doEnd();
            out.write("~.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_55_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_55_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_55_50.setRuntimeParent(_jettag_c_if_53_134);
            _jettag_c_include_55_50.setTagInfo(_td_c_include_55_50);
            _jettag_c_include_55_50.doStart(context, out);
            _jettag_c_include_55_50.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_55_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_124); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_55_124.setRuntimeParent(_jettag_c_if_53_134);
            _jettag_c_get_55_124.setTagInfo(_td_c_get_55_124);
            _jettag_c_get_55_124.doStart(context, out);
            _jettag_c_get_55_124.doEnd();
            _jettag_c_if_53_134.handleBodyContent(out);
        }
        _jettag_c_if_53_134.doEnd();
        RuntimeTagElement _jettag_c_if_56_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_56_52.setRuntimeParent(null);
        _jettag_c_if_56_52.setTagInfo(_td_c_if_56_52);
        _jettag_c_if_56_52.doStart(context, out);
        while (_jettag_c_if_56_52.okToProcessBody()) {
            out.write("--primitive");  //$NON-NLS-1$        
            _jettag_c_if_56_52.handleBodyContent(out);
        }
        _jettag_c_if_56_52.doEnd();
        RuntimeTagElement _jettag_c_if_57_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_57_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_57_88.setRuntimeParent(null);
        _jettag_c_if_57_88.setTagInfo(_td_c_if_57_88);
        _jettag_c_if_57_88.doStart(context, out);
        while (_jettag_c_if_57_88.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_58_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_31.setRuntimeParent(_jettag_c_if_57_88);
            _jettag_c_if_58_31.setTagInfo(_td_c_if_58_31);
            _jettag_c_if_58_31.doStart(context, out);
            while (_jettag_c_if_58_31.okToProcessBody()) {
                out.write(" --primitive");  //$NON-NLS-1$        
                _jettag_c_if_58_31.handleBodyContent(out);
            }
            _jettag_c_if_58_31.doEnd();
            RuntimeTagElement _jettag_c_if_58_223 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_223); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_223.setRuntimeParent(_jettag_c_if_57_88);
            _jettag_c_if_58_223.setTagInfo(_td_c_if_58_223);
            _jettag_c_if_58_223.doStart(context, out);
            while (_jettag_c_if_58_223.okToProcessBody()) {
                out.write(" --unique");  //$NON-NLS-1$        
                _jettag_c_if_58_223.handleBodyContent(out);
            }
            _jettag_c_if_58_223.doEnd();
            _jettag_c_if_57_88.handleBodyContent(out);
        }
        _jettag_c_if_57_88.doEnd();
        RuntimeTagElement _jettag_c_setVariable_59_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_59_57.setRuntimeParent(null);
        _jettag_c_setVariable_59_57.setTagInfo(_td_c_setVariable_59_57);
        _jettag_c_setVariable_59_57.doStart(context, out);
        _jettag_c_setVariable_59_57.doEnd();
        RuntimeTagElement _jettag_c_include_59_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_59_111); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_59_111.setRuntimeParent(null);
        _jettag_c_include_59_111.setTagInfo(_td_c_include_59_111);
        _jettag_c_include_59_111.doStart(context, out);
        _jettag_c_include_59_111.doEnd();
        out.write(NL);         
    }
}
