package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_constructor implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_constructor() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_50_22 = new TagInfo("c:if", //$NON-NLS-1$
            50, 22,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAttributes) != 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_76 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 76,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_148 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_3 = new TagInfo("c:get", //$NON-NLS-1$
            57, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_11 = new TagInfo("c:get", //$NON-NLS-1$
            58, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_48 = new TagInfo("c:get", //$NON-NLS-1$
            58, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals[1]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_16 = new TagInfo("c:if", //$NON-NLS-1$
            59, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eReferences) != 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_70 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 70,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_142 = new TagInfo("c:get", //$NON-NLS-1$
            59, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_194 = new TagInfo("c:if", //$NON-NLS-1$
            59, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_31 = new TagInfo("c:get", //$NON-NLS-1$
            60, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_16 = new TagInfo("c:get", //$NON-NLS-1$
            63, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_52 = new TagInfo("c:if", //$NON-NLS-1$
            63, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_101 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 101,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_63_156 = new TagInfo("c:include", //$NON-NLS-1$
            63, 156,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_236 = new TagInfo("c:if", //$NON-NLS-1$
            63, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAttributeType/eLiterals) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_297 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 297,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eEnum", //$NON-NLS-1$
                "$eAttribute/eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_373 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 373,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
                "eLiteralIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_436 = new TagInfo("c:get", //$NON-NLS-1$
            63, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals[$eLiteralIdx]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_494 = new TagInfo("c:if", //$NON-NLS-1$
            63, 494,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteralIdx != count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_65_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_16 = new TagInfo("c:get", //$NON-NLS-1$
            66, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_52 = new TagInfo("c:if", //$NON-NLS-1$
            66, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_66_101 = new TagInfo("c:setVariable", //$NON-NLS-1$
            66, 101,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_66_156 = new TagInfo("c:include", //$NON-NLS-1$
            66, 156,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_70_9 = new TagInfo("c:include", //$NON-NLS-1$
            70, 9,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attribute.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_9 = new TagInfo("c:if", //$NON-NLS-1$
            74, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_9 = new TagInfo("c:if", //$NON-NLS-1$
            75, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_15 = new TagInfo("c:get", //$NON-NLS-1$
            76, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_9 = new TagInfo("c:if", //$NON-NLS-1$
            78, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_15 = new TagInfo("c:get", //$NON-NLS-1$
            79, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_82_9 = new TagInfo("c:if", //$NON-NLS-1$
            82, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_14 = new TagInfo("c:get", //$NON-NLS-1$
            83, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_58 = new TagInfo("c:get", //$NON-NLS-1$
            83, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_107 = new TagInfo("c:get", //$NON-NLS-1$
            83, 107,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_85_9 = new TagInfo("c:if", //$NON-NLS-1$
            85, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_14 = new TagInfo("c:get", //$NON-NLS-1$
            86, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_52 = new TagInfo("c:get", //$NON-NLS-1$
            86, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_9 = new TagInfo("c:if", //$NON-NLS-1$
            90, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_15 = new TagInfo("c:get", //$NON-NLS-1$
            91, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_94_15 = new TagInfo("c:iterate", //$NON-NLS-1$
            94, 15,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_88 = new TagInfo("c:get", //$NON-NLS-1$
            94, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_95_20 = new TagInfo("c:iterate", //$NON-NLS-1$
            95, 20,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_95_92 = new TagInfo("c:setVariable", //$NON-NLS-1$
            95, 92,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_4 = new TagInfo("c:get", //$NON-NLS-1$
            102, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_12 = new TagInfo("c:get", //$NON-NLS-1$
            103, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_105_18 = new TagInfo("c:iterate", //$NON-NLS-1$
            105, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_105_90 = new TagInfo("c:setVariable", //$NON-NLS-1$
            105, 90,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_4 = new TagInfo("c:get", //$NON-NLS-1$
            112, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_12 = new TagInfo("c:get", //$NON-NLS-1$
            113, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_51 = new TagInfo("c:get", //$NON-NLS-1$
            113, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals[1]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_127_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            127, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_87 = new TagInfo("c:get", //$NON-NLS-1$
            127, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // FIXME: Remove duplication with the 'attribute' template. 

ArrayList<String> imported = new ArrayList<String>();
ArrayList<String> traitNames = new ArrayList<String>();

HashMap<String, String> instanceTypeNameValueMap = new HashMap<String, String>();
instanceTypeNameValueMap.put("boolean", "False");
instanceTypeNameValueMap.put("java.lang.Boolean", "False");
instanceTypeNameValueMap.put("char", "''");
instanceTypeNameValueMap.put("java.lang.Character", "''");
instanceTypeNameValueMap.put("java.util.Date", "''");
instanceTypeNameValueMap.put("double", "0.0");
instanceTypeNameValueMap.put("java.lang.Double", "0.0");
instanceTypeNameValueMap.put("float", "0.0");
instanceTypeNameValueMap.put("java.lang.Float", "0.0");
instanceTypeNameValueMap.put("int", "0");
instanceTypeNameValueMap.put("java.lang.Integer", "0");
instanceTypeNameValueMap.put("java.lang.Class", "None");
instanceTypeNameValueMap.put("java.lang.Object", "None");
instanceTypeNameValueMap.put("long", "0L");
instanceTypeNameValueMap.put("java.lang.Long", "0L");
instanceTypeNameValueMap.put("java.util.Map", "{}");
instanceTypeNameValueMap.put("short", "0");
instanceTypeNameValueMap.put("java.lang.Short", "0");
instanceTypeNameValueMap.put("java.lang.String", "''");

HashMap<String, String> instanceTypeNameTypeMap = new HashMap<String, String>();
instanceTypeNameTypeMap.put("boolean", "bool");
instanceTypeNameTypeMap.put("java.lang.Boolean", "bool");
instanceTypeNameTypeMap.put("char", "str");
instanceTypeNameTypeMap.put("java.lang.Character", "str");
instanceTypeNameTypeMap.put("java.util.Date", "str");
instanceTypeNameTypeMap.put("double", "float");
instanceTypeNameTypeMap.put("java.lang.Double", "float");
instanceTypeNameTypeMap.put("float", "float");
instanceTypeNameTypeMap.put("java.lang.Float", "float");
instanceTypeNameTypeMap.put("int", "int");
instanceTypeNameTypeMap.put("java.lang.Integer", "int");
instanceTypeNameTypeMap.put("java.lang.Class", "None");
instanceTypeNameTypeMap.put("java.lang.Object", "None");
instanceTypeNameTypeMap.put("long", "long");
instanceTypeNameTypeMap.put("java.lang.Long", "long");
instanceTypeNameTypeMap.put("java.util.Map", "dict");
instanceTypeNameTypeMap.put("short", "int");
instanceTypeNameTypeMap.put("java.lang.Short", "int");
instanceTypeNameTypeMap.put("java.lang.String", "str");

        out.write("    def __init__(self");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_50_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_50_22.setRuntimeParent(null);
        _jettag_c_if_50_22.setTagInfo(_td_c_if_50_22);
        _jettag_c_if_50_22.doStart(context, out);
        while (_jettag_c_if_50_22.okToProcessBody()) {
            out.write(", ");  //$NON-NLS-1$        
            _jettag_c_if_50_22.handleBodyContent(out);
        }
        _jettag_c_if_50_22.doEnd();
        RuntimeTagElement _jettag_c_iterate_50_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_50_76.setRuntimeParent(null);
        _jettag_c_iterate_50_76.setTagInfo(_td_c_iterate_50_76);
        _jettag_c_iterate_50_76.doStart(context, out);
        while (_jettag_c_iterate_50_76.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_50_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_148); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_50_148.setRuntimeParent(_jettag_c_iterate_50_76);
            _jettag_c_setVariable_50_148.setTagInfo(_td_c_setVariable_50_148);
            _jettag_c_setVariable_50_148.doStart(context, out);
            _jettag_c_setVariable_50_148.doEnd();
    
    String itn = (String)context.getVariable("instanceTypeName");
    String val;

    if ( instanceTypeNameValueMap.containsKey( itn ) ) {
        val = instanceTypeNameValueMap.get( itn );
    
            RuntimeTagElement _jettag_c_get_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_57_3.setRuntimeParent(_jettag_c_iterate_50_76);
            _jettag_c_get_57_3.setTagInfo(_td_c_get_57_3);
            _jettag_c_get_57_3.doStart(context, out);
            _jettag_c_get_57_3.doEnd();
            out.write("=");  //$NON-NLS-1$        
            out.write( val );
    
    } else {
            RuntimeTagElement _jettag_c_get_58_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_11.setRuntimeParent(_jettag_c_iterate_50_76);
            _jettag_c_get_58_11.setTagInfo(_td_c_get_58_11);
            _jettag_c_get_58_11.doStart(context, out);
            _jettag_c_get_58_11.doEnd();
            out.write("=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_58_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_48.setRuntimeParent(_jettag_c_iterate_50_76);
            _jettag_c_get_58_48.setTagInfo(_td_c_get_58_48);
            _jettag_c_get_58_48.doStart(context, out);
            _jettag_c_get_58_48.doEnd();
            out.write("\"");  //$NON-NLS-1$        
    
    }
            _jettag_c_iterate_50_76.handleBodyContent(out);
        }
        _jettag_c_iterate_50_76.doEnd();
        RuntimeTagElement _jettag_c_if_59_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_59_16.setRuntimeParent(null);
        _jettag_c_if_59_16.setTagInfo(_td_c_if_59_16);
        _jettag_c_if_59_16.doStart(context, out);
        while (_jettag_c_if_59_16.okToProcessBody()) {
            out.write(", ");  //$NON-NLS-1$        
            _jettag_c_if_59_16.handleBodyContent(out);
        }
        _jettag_c_if_59_16.doEnd();
        RuntimeTagElement _jettag_c_iterate_59_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_59_70.setRuntimeParent(null);
        _jettag_c_iterate_59_70.setTagInfo(_td_c_iterate_59_70);
        _jettag_c_iterate_59_70.doStart(context, out);
        while (_jettag_c_iterate_59_70.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_59_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_142); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_59_142.setRuntimeParent(_jettag_c_iterate_59_70);
            _jettag_c_get_59_142.setTagInfo(_td_c_get_59_142);
            _jettag_c_get_59_142.doStart(context, out);
            _jettag_c_get_59_142.doEnd();
            out.write("=None");  //$NON-NLS-1$        
            _jettag_c_iterate_59_70.handleBodyContent(out);
        }
        _jettag_c_iterate_59_70.doEnd();
        RuntimeTagElement _jettag_c_if_59_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_194); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_59_194.setRuntimeParent(null);
        _jettag_c_if_59_194.setTagInfo(_td_c_if_59_194);
        _jettag_c_if_59_194.doStart(context, out);
        while (_jettag_c_if_59_194.okToProcessBody()) {
            out.write(", *args, **kw_args");  //$NON-NLS-1$        
            _jettag_c_if_59_194.handleBodyContent(out);
        }
        _jettag_c_if_59_194.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\"Initialises a new '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_60_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_31.setRuntimeParent(null);
        _jettag_c_get_60_31.setTagInfo(_td_c_get_60_31);
        _jettag_c_get_60_31.doStart(context, out);
        _jettag_c_get_60_31.doEnd();
        out.write("' instance.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_62_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_62_9.setRuntimeParent(null);
        _jettag_c_iterate_62_9.setTagInfo(_td_c_iterate_62_9);
        _jettag_c_iterate_62_9.doStart(context, out);
        while (_jettag_c_iterate_62_9.okToProcessBody()) {
            out.write("        @param ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_63_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_16.setRuntimeParent(_jettag_c_iterate_62_9);
            _jettag_c_get_63_16.setTagInfo(_td_c_get_63_16);
            _jettag_c_get_63_16.doStart(context, out);
            _jettag_c_get_63_16.doEnd();
            out.write(":");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_63_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_63_52.setRuntimeParent(_jettag_c_iterate_62_9);
            _jettag_c_if_63_52.setTagInfo(_td_c_if_63_52);
            _jettag_c_if_63_52.doStart(context, out);
            while (_jettag_c_if_63_52.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_63_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_63_101.setRuntimeParent(_jettag_c_if_63_52);
                _jettag_c_setVariable_63_101.setTagInfo(_td_c_setVariable_63_101);
                _jettag_c_setVariable_63_101.doStart(context, out);
                _jettag_c_setVariable_63_101.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_63_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_63_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_63_156.setRuntimeParent(_jettag_c_if_63_52);
                _jettag_c_include_63_156.setTagInfo(_td_c_include_63_156);
                _jettag_c_include_63_156.doStart(context, out);
                _jettag_c_include_63_156.doEnd();
                _jettag_c_if_63_52.handleBodyContent(out);
            }
            _jettag_c_if_63_52.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_63_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_236); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_63_236.setRuntimeParent(_jettag_c_iterate_62_9);
            _jettag_c_if_63_236.setTagInfo(_td_c_if_63_236);
            _jettag_c_if_63_236.doStart(context, out);
            while (_jettag_c_if_63_236.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_63_297 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_297); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_63_297.setRuntimeParent(_jettag_c_if_63_236);
                _jettag_c_setVariable_63_297.setTagInfo(_td_c_setVariable_63_297);
                _jettag_c_setVariable_63_297.doStart(context, out);
                _jettag_c_setVariable_63_297.doEnd();
                out.write("Values are: ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_63_373 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_373); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_63_373.setRuntimeParent(_jettag_c_if_63_236);
                _jettag_c_iterate_63_373.setTagInfo(_td_c_iterate_63_373);
                _jettag_c_iterate_63_373.doStart(context, out);
                while (_jettag_c_iterate_63_373.okToProcessBody()) {
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_63_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_63_436.setRuntimeParent(_jettag_c_iterate_63_373);
                    _jettag_c_get_63_436.setTagInfo(_td_c_get_63_436);
                    _jettag_c_get_63_436.doStart(context, out);
                    _jettag_c_get_63_436.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_if_63_494 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_494); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_63_494.setRuntimeParent(_jettag_c_iterate_63_373);
                    _jettag_c_if_63_494.setTagInfo(_td_c_if_63_494);
                    _jettag_c_if_63_494.doStart(context, out);
                    while (_jettag_c_if_63_494.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_63_494.handleBodyContent(out);
                    }
                    _jettag_c_if_63_494.doEnd();
                    _jettag_c_iterate_63_373.handleBodyContent(out);
                }
                _jettag_c_iterate_63_373.doEnd();
                _jettag_c_if_63_236.handleBodyContent(out);
            }
            _jettag_c_if_63_236.doEnd();
            out.write(NL);         
            _jettag_c_iterate_62_9.handleBodyContent(out);
        }
        _jettag_c_iterate_62_9.doEnd();
        RuntimeTagElement _jettag_c_iterate_65_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_65_9.setRuntimeParent(null);
        _jettag_c_iterate_65_9.setTagInfo(_td_c_iterate_65_9);
        _jettag_c_iterate_65_9.doStart(context, out);
        while (_jettag_c_iterate_65_9.okToProcessBody()) {
            out.write("        @param ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_66_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_66_16.setRuntimeParent(_jettag_c_iterate_65_9);
            _jettag_c_get_66_16.setTagInfo(_td_c_get_66_16);
            _jettag_c_get_66_16.doStart(context, out);
            _jettag_c_get_66_16.doEnd();
            out.write(":");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_66_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_66_52.setRuntimeParent(_jettag_c_iterate_65_9);
            _jettag_c_if_66_52.setTagInfo(_td_c_if_66_52);
            _jettag_c_if_66_52.doStart(context, out);
            while (_jettag_c_if_66_52.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_66_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_66_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_66_101.setRuntimeParent(_jettag_c_if_66_52);
                _jettag_c_setVariable_66_101.setTagInfo(_td_c_setVariable_66_101);
                _jettag_c_setVariable_66_101.doStart(context, out);
                _jettag_c_setVariable_66_101.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_66_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_66_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_66_156.setRuntimeParent(_jettag_c_if_66_52);
                _jettag_c_include_66_156.setTagInfo(_td_c_include_66_156);
                _jettag_c_include_66_156.doStart(context, out);
                _jettag_c_include_66_156.doEnd();
                _jettag_c_if_66_52.handleBodyContent(out);
            }
            _jettag_c_if_66_52.doEnd();
            out.write(NL);         
            _jettag_c_iterate_65_9.handleBodyContent(out);
        }
        _jettag_c_iterate_65_9.doEnd();
        out.write("        \"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_69_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_69_9.setRuntimeParent(null);
        _jettag_c_iterate_69_9.setTagInfo(_td_c_iterate_69_9);
        _jettag_c_iterate_69_9.doStart(context, out);
        while (_jettag_c_iterate_69_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_70_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_70_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_70_9.setRuntimeParent(_jettag_c_iterate_69_9);
            _jettag_c_include_70_9.setTagInfo(_td_c_include_70_9);
            _jettag_c_include_70_9.doStart(context, out);
            _jettag_c_include_70_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_69_9.handleBodyContent(out);
        }
        _jettag_c_iterate_69_9.doEnd();
        RuntimeTagElement _jettag_c_iterate_73_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_73_9.setRuntimeParent(null);
        _jettag_c_iterate_73_9.setTagInfo(_td_c_iterate_73_9);
        _jettag_c_iterate_73_9.doStart(context, out);
        while (_jettag_c_iterate_73_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_74_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_74_9.setRuntimeParent(_jettag_c_iterate_73_9);
            _jettag_c_if_74_9.setTagInfo(_td_c_if_74_9);
            _jettag_c_if_74_9.doStart(context, out);
            while (_jettag_c_if_74_9.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_75_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_75_9.setRuntimeParent(_jettag_c_if_74_9);
                _jettag_c_if_75_9.setTagInfo(_td_c_if_75_9);
                _jettag_c_if_75_9.doStart(context, out);
                while (_jettag_c_if_75_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_76_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_76_15.setRuntimeParent(_jettag_c_if_75_9);
                    _jettag_c_get_76_15.setTagInfo(_td_c_get_76_15);
                    _jettag_c_get_76_15.doStart(context, out);
                    _jettag_c_get_76_15.doEnd();
                    out.write(" = []");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_75_9.handleBodyContent(out);
                }
                _jettag_c_if_75_9.doEnd();
                RuntimeTagElement _jettag_c_if_78_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_78_9.setRuntimeParent(_jettag_c_if_74_9);
                _jettag_c_if_78_9.setTagInfo(_td_c_if_78_9);
                _jettag_c_if_78_9.doStart(context, out);
                while (_jettag_c_if_78_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_15.setRuntimeParent(_jettag_c_if_78_9);
                    _jettag_c_get_79_15.setTagInfo(_td_c_get_79_15);
                    _jettag_c_get_79_15.doStart(context, out);
                    _jettag_c_get_79_15.doEnd();
                    out.write(" = None");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_78_9.handleBodyContent(out);
                }
                _jettag_c_if_78_9.doEnd();
                _jettag_c_if_74_9.handleBodyContent(out);
            }
            _jettag_c_if_74_9.doEnd();
            RuntimeTagElement _jettag_c_if_82_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_82_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_82_9.setRuntimeParent(_jettag_c_iterate_73_9);
            _jettag_c_if_82_9.setTagInfo(_td_c_if_82_9);
            _jettag_c_if_82_9.doStart(context, out);
            while (_jettag_c_if_82_9.okToProcessBody()) {
                out.write("        self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_83_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_14.setRuntimeParent(_jettag_c_if_82_9);
                _jettag_c_get_83_14.setTagInfo(_td_c_get_83_14);
                _jettag_c_get_83_14.doStart(context, out);
                _jettag_c_get_83_14.doEnd();
                out.write(" = [] if ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_83_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_58.setRuntimeParent(_jettag_c_if_82_9);
                _jettag_c_get_83_58.setTagInfo(_td_c_get_83_58);
                _jettag_c_get_83_58.doStart(context, out);
                _jettag_c_get_83_58.doEnd();
                out.write(" is None else ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_83_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_107); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_83_107.setRuntimeParent(_jettag_c_if_82_9);
                _jettag_c_get_83_107.setTagInfo(_td_c_get_83_107);
                _jettag_c_get_83_107.doStart(context, out);
                _jettag_c_get_83_107.doEnd();
                out.write(NL);         
                _jettag_c_if_82_9.handleBodyContent(out);
            }
            _jettag_c_if_82_9.doEnd();
            RuntimeTagElement _jettag_c_if_85_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_85_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_85_9.setRuntimeParent(_jettag_c_iterate_73_9);
            _jettag_c_if_85_9.setTagInfo(_td_c_if_85_9);
            _jettag_c_if_85_9.doStart(context, out);
            while (_jettag_c_if_85_9.okToProcessBody()) {
                out.write("        self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_86_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_14.setRuntimeParent(_jettag_c_if_85_9);
                _jettag_c_get_86_14.setTagInfo(_td_c_get_86_14);
                _jettag_c_get_86_14.doStart(context, out);
                _jettag_c_get_86_14.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_86_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_52.setRuntimeParent(_jettag_c_if_85_9);
                _jettag_c_get_86_52.setTagInfo(_td_c_get_86_52);
                _jettag_c_get_86_52.doStart(context, out);
                _jettag_c_get_86_52.doEnd();
                out.write(NL);         
                _jettag_c_if_85_9.handleBodyContent(out);
            }
            _jettag_c_if_85_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_73_9.handleBodyContent(out);
        }
        _jettag_c_iterate_73_9.doEnd();
        RuntimeTagElement _jettag_c_if_90_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_90_9.setRuntimeParent(null);
        _jettag_c_if_90_9.setTagInfo(_td_c_if_90_9);
        _jettag_c_if_90_9.doStart(context, out);
        while (_jettag_c_if_90_9.okToProcessBody()) {
            out.write("        super(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_91_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_91_15.setRuntimeParent(_jettag_c_if_90_9);
            _jettag_c_get_91_15.setTagInfo(_td_c_get_91_15);
            _jettag_c_get_91_15.doStart(context, out);
            _jettag_c_get_91_15.doEnd();
            out.write(", self).__init__(*args, **kw_args)");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_90_9.handleBodyContent(out);
        }
        _jettag_c_if_90_9.doEnd();
        out.write(NL);         
        out.write("    _attrs = [");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_94_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_94_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_94_15.setRuntimeParent(null);
        _jettag_c_iterate_94_15.setTagInfo(_td_c_iterate_94_15);
        _jettag_c_iterate_94_15.doStart(context, out);
        while (_jettag_c_iterate_94_15.okToProcessBody()) {
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_94_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_94_88.setRuntimeParent(_jettag_c_iterate_94_15);
            _jettag_c_get_94_88.setTagInfo(_td_c_get_94_88);
            _jettag_c_get_94_88.doStart(context, out);
            _jettag_c_get_94_88.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            _jettag_c_iterate_94_15.handleBodyContent(out);
        }
        _jettag_c_iterate_94_15.doEnd();
        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    _attr_types = {");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_95_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_95_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_95_20.setRuntimeParent(null);
        _jettag_c_iterate_95_20.setTagInfo(_td_c_iterate_95_20);
        _jettag_c_iterate_95_20.doStart(context, out);
        while (_jettag_c_iterate_95_20.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_95_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_95_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_95_92.setRuntimeParent(_jettag_c_iterate_95_20);
            _jettag_c_setVariable_95_92.setTagInfo(_td_c_setVariable_95_92);
            _jettag_c_setVariable_95_92.doStart(context, out);
            _jettag_c_setVariable_95_92.doEnd();
    
    String itn = (String)context.getVariable("instanceTypeName");
    String val;

    if ( instanceTypeNameTypeMap.containsKey( itn ) ) {
        val = instanceTypeNameTypeMap.get( itn );
    
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_102_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_102_4.setRuntimeParent(_jettag_c_iterate_95_20);
            _jettag_c_get_102_4.setTagInfo(_td_c_get_102_4);
            _jettag_c_get_102_4.doStart(context, out);
            _jettag_c_get_102_4.doEnd();
            out.write("\": ");  //$NON-NLS-1$        
            out.write( val );
    
    } else {
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_103_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_103_12.setRuntimeParent(_jettag_c_iterate_95_20);
            _jettag_c_get_103_12.setTagInfo(_td_c_get_103_12);
            _jettag_c_get_103_12.doStart(context, out);
            _jettag_c_get_103_12.doEnd();
            out.write("\": str");  //$NON-NLS-1$        
    
    }
            _jettag_c_iterate_95_20.handleBodyContent(out);
        }
        _jettag_c_iterate_95_20.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    _defaults = {");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_105_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_105_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_105_18.setRuntimeParent(null);
        _jettag_c_iterate_105_18.setTagInfo(_td_c_iterate_105_18);
        _jettag_c_iterate_105_18.doStart(context, out);
        while (_jettag_c_iterate_105_18.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_105_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_105_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_105_90.setRuntimeParent(_jettag_c_iterate_105_18);
            _jettag_c_setVariable_105_90.setTagInfo(_td_c_setVariable_105_90);
            _jettag_c_setVariable_105_90.doStart(context, out);
            _jettag_c_setVariable_105_90.doEnd();
    
    String itn = (String)context.getVariable("instanceTypeName");
    String val;

    if ( instanceTypeNameValueMap.containsKey( itn ) ) {
        val = instanceTypeNameValueMap.get( itn );
    
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_112_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_112_4.setRuntimeParent(_jettag_c_iterate_105_18);
            _jettag_c_get_112_4.setTagInfo(_td_c_get_112_4);
            _jettag_c_get_112_4.doStart(context, out);
            _jettag_c_get_112_4.doEnd();
            out.write("\": ");  //$NON-NLS-1$        
            out.write( val );
    
    } else {
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_113_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_113_12.setRuntimeParent(_jettag_c_iterate_105_18);
            _jettag_c_get_113_12.setTagInfo(_td_c_get_113_12);
            _jettag_c_get_113_12.doStart(context, out);
            _jettag_c_get_113_12.doEnd();
            out.write("\": \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_113_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_113_51.setRuntimeParent(_jettag_c_iterate_105_18);
            _jettag_c_get_113_51.setTagInfo(_td_c_get_113_51);
            _jettag_c_get_113_51.doStart(context, out);
            _jettag_c_get_113_51.doEnd();
            out.write("\"");  //$NON-NLS-1$        
    
    }
            _jettag_c_iterate_105_18.handleBodyContent(out);
        }
        _jettag_c_iterate_105_18.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    _enums = {");  //$NON-NLS-1$        

EClass eClass = (EClass) context.getVariable("eClass");

boolean first = true;
for (EAttribute attr : eClass.getEAttributes()) {
	if (attr.getEAttributeType() instanceof EEnum) {
	    if (!first)
	    	out.write(", ");
	    out.write("\"" + attr.getName() + "\": \"" + attr.getEAttributeType().getName() + "\"");
		first = false;
	}
}
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    _refs = [");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_127_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_127_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_127_14.setRuntimeParent(null);
        _jettag_c_iterate_127_14.setTagInfo(_td_c_iterate_127_14);
        _jettag_c_iterate_127_14.doStart(context, out);
        while (_jettag_c_iterate_127_14.okToProcessBody()) {
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_127_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_87); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_127_87.setRuntimeParent(_jettag_c_iterate_127_14);
            _jettag_c_get_127_87.setTagInfo(_td_c_get_127_87);
            _jettag_c_get_127_87.doStart(context, out);
            _jettag_c_get_127_87.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            _jettag_c_iterate_127_14.handleBodyContent(out);
        }
        _jettag_c_iterate_127_14.doEnd();
        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    _many_refs = [");  //$NON-NLS-1$        

first = true;
for (EReference ref : eClass.getEReferences()) {
	if (ref.isMany()) {
	    if (!first)
	    	out.write(", ");
	    out.write("\"" + ref.getName() + "\"");
		first = false;
	}
}

        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
