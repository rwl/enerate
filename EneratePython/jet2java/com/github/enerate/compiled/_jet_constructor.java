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
    
    private static final TagInfo _td_c_if_29_22 = new TagInfo("c:if", //$NON-NLS-1$
            29, 22,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAttributes) != 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_76 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 76,
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
    private static final TagInfo _td_c_setVariable_29_148 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 148,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_3 = new TagInfo("c:get", //$NON-NLS-1$
            36, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_11 = new TagInfo("c:get", //$NON-NLS-1$
            37, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_48 = new TagInfo("c:get", //$NON-NLS-1$
            37, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals[1]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_38_16 = new TagInfo("c:if", //$NON-NLS-1$
            38, 16,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eReferences) != 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_70 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 70,
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
    private static final TagInfo _td_c_get_38_142 = new TagInfo("c:get", //$NON-NLS-1$
            38, 142,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_38_194 = new TagInfo("c:if", //$NON-NLS-1$
            38, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_31 = new TagInfo("c:get", //$NON-NLS-1$
            39, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_16 = new TagInfo("c:get", //$NON-NLS-1$
            42, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_52 = new TagInfo("c:if", //$NON-NLS-1$
            42, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_101 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 101,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_42_156 = new TagInfo("c:include", //$NON-NLS-1$
            42, 156,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_236 = new TagInfo("c:if", //$NON-NLS-1$
            42, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAttributeType/eLiterals) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_297 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 297,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eEnum", //$NON-NLS-1$
                "$eAttribute/eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_42_373 = new TagInfo("c:iterate", //$NON-NLS-1$
            42, 373,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
                "eLiteralIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_436 = new TagInfo("c:get", //$NON-NLS-1$
            42, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals[$eLiteralIdx]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_42_494 = new TagInfo("c:if", //$NON-NLS-1$
            42, 494,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteralIdx != count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_16 = new TagInfo("c:get", //$NON-NLS-1$
            45, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_52 = new TagInfo("c:if", //$NON-NLS-1$
            45, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_101 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 101,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_45_156 = new TagInfo("c:include", //$NON-NLS-1$
            45, 156,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_49_9 = new TagInfo("c:include", //$NON-NLS-1$
            49, 9,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attribute.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_57_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            57, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_9 = new TagInfo("c:if", //$NON-NLS-1$
            58, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_9 = new TagInfo("c:if", //$NON-NLS-1$
            59, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_15 = new TagInfo("c:get", //$NON-NLS-1$
            60, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_9 = new TagInfo("c:if", //$NON-NLS-1$
            62, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_15 = new TagInfo("c:get", //$NON-NLS-1$
            63, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_9 = new TagInfo("c:if", //$NON-NLS-1$
            66, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_14 = new TagInfo("c:get", //$NON-NLS-1$
            67, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_58 = new TagInfo("c:get", //$NON-NLS-1$
            67, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_107 = new TagInfo("c:get", //$NON-NLS-1$
            67, 107,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_69_9 = new TagInfo("c:if", //$NON-NLS-1$
            69, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_14 = new TagInfo("c:get", //$NON-NLS-1$
            70, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_52 = new TagInfo("c:get", //$NON-NLS-1$
            70, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_9 = new TagInfo("c:if", //$NON-NLS-1$
            74, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_15 = new TagInfo("c:get", //$NON-NLS-1$
            75, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
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

        out.write("    def __init__(self");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_29_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_29_22.setRuntimeParent(null);
        _jettag_c_if_29_22.setTagInfo(_td_c_if_29_22);
        _jettag_c_if_29_22.doStart(context, out);
        while (_jettag_c_if_29_22.okToProcessBody()) {
            out.write(", ");  //$NON-NLS-1$        
            _jettag_c_if_29_22.handleBodyContent(out);
        }
        _jettag_c_if_29_22.doEnd();
        RuntimeTagElement _jettag_c_iterate_29_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_76.setRuntimeParent(null);
        _jettag_c_iterate_29_76.setTagInfo(_td_c_iterate_29_76);
        _jettag_c_iterate_29_76.doStart(context, out);
        while (_jettag_c_iterate_29_76.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_29_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_148); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_29_148.setRuntimeParent(_jettag_c_iterate_29_76);
            _jettag_c_setVariable_29_148.setTagInfo(_td_c_setVariable_29_148);
            _jettag_c_setVariable_29_148.doStart(context, out);
            _jettag_c_setVariable_29_148.doEnd();
    
    String itn = (String)context.getVariable("instanceTypeName");
    String val;

    if ( instanceTypeNameValueMap.containsKey( itn ) ) {
        val = instanceTypeNameValueMap.get( itn );
    
            RuntimeTagElement _jettag_c_get_36_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_3.setRuntimeParent(_jettag_c_iterate_29_76);
            _jettag_c_get_36_3.setTagInfo(_td_c_get_36_3);
            _jettag_c_get_36_3.doStart(context, out);
            _jettag_c_get_36_3.doEnd();
            out.write("=");  //$NON-NLS-1$        
            out.write( val );
    
    } else {
            RuntimeTagElement _jettag_c_get_37_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_11.setRuntimeParent(_jettag_c_iterate_29_76);
            _jettag_c_get_37_11.setTagInfo(_td_c_get_37_11);
            _jettag_c_get_37_11.doStart(context, out);
            _jettag_c_get_37_11.doEnd();
            out.write("='");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_48.setRuntimeParent(_jettag_c_iterate_29_76);
            _jettag_c_get_37_48.setTagInfo(_td_c_get_37_48);
            _jettag_c_get_37_48.doStart(context, out);
            _jettag_c_get_37_48.doEnd();
            out.write("'");  //$NON-NLS-1$        
    
    }
            _jettag_c_iterate_29_76.handleBodyContent(out);
        }
        _jettag_c_iterate_29_76.doEnd();
        RuntimeTagElement _jettag_c_if_38_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_38_16.setRuntimeParent(null);
        _jettag_c_if_38_16.setTagInfo(_td_c_if_38_16);
        _jettag_c_if_38_16.doStart(context, out);
        while (_jettag_c_if_38_16.okToProcessBody()) {
            out.write(", ");  //$NON-NLS-1$        
            _jettag_c_if_38_16.handleBodyContent(out);
        }
        _jettag_c_if_38_16.doEnd();
        RuntimeTagElement _jettag_c_iterate_38_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_38_70.setRuntimeParent(null);
        _jettag_c_iterate_38_70.setTagInfo(_td_c_iterate_38_70);
        _jettag_c_iterate_38_70.doStart(context, out);
        while (_jettag_c_iterate_38_70.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_38_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_142); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_38_142.setRuntimeParent(_jettag_c_iterate_38_70);
            _jettag_c_get_38_142.setTagInfo(_td_c_get_38_142);
            _jettag_c_get_38_142.doStart(context, out);
            _jettag_c_get_38_142.doEnd();
            out.write("=None");  //$NON-NLS-1$        
            _jettag_c_iterate_38_70.handleBodyContent(out);
        }
        _jettag_c_iterate_38_70.doEnd();
        RuntimeTagElement _jettag_c_if_38_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_194); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_38_194.setRuntimeParent(null);
        _jettag_c_if_38_194.setTagInfo(_td_c_if_38_194);
        _jettag_c_if_38_194.doStart(context, out);
        while (_jettag_c_if_38_194.okToProcessBody()) {
            out.write(", *args, **kw_args");  //$NON-NLS-1$        
            _jettag_c_if_38_194.handleBodyContent(out);
        }
        _jettag_c_if_38_194.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\"Initializes a new '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_31.setRuntimeParent(null);
        _jettag_c_get_39_31.setTagInfo(_td_c_get_39_31);
        _jettag_c_get_39_31.doStart(context, out);
        _jettag_c_get_39_31.doEnd();
        out.write("' instance.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_41_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_41_9.setRuntimeParent(null);
        _jettag_c_iterate_41_9.setTagInfo(_td_c_iterate_41_9);
        _jettag_c_iterate_41_9.doStart(context, out);
        while (_jettag_c_iterate_41_9.okToProcessBody()) {
            out.write("        @param ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_16.setRuntimeParent(_jettag_c_iterate_41_9);
            _jettag_c_get_42_16.setTagInfo(_td_c_get_42_16);
            _jettag_c_get_42_16.doStart(context, out);
            _jettag_c_get_42_16.doEnd();
            out.write(":");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_42_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_42_52.setRuntimeParent(_jettag_c_iterate_41_9);
            _jettag_c_if_42_52.setTagInfo(_td_c_if_42_52);
            _jettag_c_if_42_52.doStart(context, out);
            while (_jettag_c_if_42_52.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_42_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_42_101.setRuntimeParent(_jettag_c_if_42_52);
                _jettag_c_setVariable_42_101.setTagInfo(_td_c_setVariable_42_101);
                _jettag_c_setVariable_42_101.doStart(context, out);
                _jettag_c_setVariable_42_101.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_42_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_42_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_42_156.setRuntimeParent(_jettag_c_if_42_52);
                _jettag_c_include_42_156.setTagInfo(_td_c_include_42_156);
                _jettag_c_include_42_156.doStart(context, out);
                _jettag_c_include_42_156.doEnd();
                _jettag_c_if_42_52.handleBodyContent(out);
            }
            _jettag_c_if_42_52.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_42_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_236); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_42_236.setRuntimeParent(_jettag_c_iterate_41_9);
            _jettag_c_if_42_236.setTagInfo(_td_c_if_42_236);
            _jettag_c_if_42_236.doStart(context, out);
            while (_jettag_c_if_42_236.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_42_297 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_297); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_42_297.setRuntimeParent(_jettag_c_if_42_236);
                _jettag_c_setVariable_42_297.setTagInfo(_td_c_setVariable_42_297);
                _jettag_c_setVariable_42_297.doStart(context, out);
                _jettag_c_setVariable_42_297.doEnd();
                out.write("Values are: ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_42_373 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_42_373); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_42_373.setRuntimeParent(_jettag_c_if_42_236);
                _jettag_c_iterate_42_373.setTagInfo(_td_c_iterate_42_373);
                _jettag_c_iterate_42_373.doStart(context, out);
                while (_jettag_c_iterate_42_373.okToProcessBody()) {
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_436.setRuntimeParent(_jettag_c_iterate_42_373);
                    _jettag_c_get_42_436.setTagInfo(_td_c_get_42_436);
                    _jettag_c_get_42_436.doStart(context, out);
                    _jettag_c_get_42_436.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_if_42_494 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_42_494); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_42_494.setRuntimeParent(_jettag_c_iterate_42_373);
                    _jettag_c_if_42_494.setTagInfo(_td_c_if_42_494);
                    _jettag_c_if_42_494.doStart(context, out);
                    while (_jettag_c_if_42_494.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_42_494.handleBodyContent(out);
                    }
                    _jettag_c_if_42_494.doEnd();
                    _jettag_c_iterate_42_373.handleBodyContent(out);
                }
                _jettag_c_iterate_42_373.doEnd();
                _jettag_c_if_42_236.handleBodyContent(out);
            }
            _jettag_c_if_42_236.doEnd();
            out.write(NL);         
            _jettag_c_iterate_41_9.handleBodyContent(out);
        }
        _jettag_c_iterate_41_9.doEnd();
        RuntimeTagElement _jettag_c_iterate_44_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_44_9.setRuntimeParent(null);
        _jettag_c_iterate_44_9.setTagInfo(_td_c_iterate_44_9);
        _jettag_c_iterate_44_9.doStart(context, out);
        while (_jettag_c_iterate_44_9.okToProcessBody()) {
            out.write("        @param ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_45_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_45_16.setRuntimeParent(_jettag_c_iterate_44_9);
            _jettag_c_get_45_16.setTagInfo(_td_c_get_45_16);
            _jettag_c_get_45_16.doStart(context, out);
            _jettag_c_get_45_16.doEnd();
            out.write(":");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_45_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_45_52.setRuntimeParent(_jettag_c_iterate_44_9);
            _jettag_c_if_45_52.setTagInfo(_td_c_if_45_52);
            _jettag_c_if_45_52.doStart(context, out);
            while (_jettag_c_if_45_52.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_45_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_45_101.setRuntimeParent(_jettag_c_if_45_52);
                _jettag_c_setVariable_45_101.setTagInfo(_td_c_setVariable_45_101);
                _jettag_c_setVariable_45_101.doStart(context, out);
                _jettag_c_setVariable_45_101.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_45_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_45_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_45_156.setRuntimeParent(_jettag_c_if_45_52);
                _jettag_c_include_45_156.setTagInfo(_td_c_include_45_156);
                _jettag_c_include_45_156.doStart(context, out);
                _jettag_c_include_45_156.doEnd();
                _jettag_c_if_45_52.handleBodyContent(out);
            }
            _jettag_c_if_45_52.doEnd();
            out.write(NL);         
            _jettag_c_iterate_44_9.handleBodyContent(out);
        }
        _jettag_c_iterate_44_9.doEnd();
        out.write("        \"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_48_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_48_9.setRuntimeParent(null);
        _jettag_c_iterate_48_9.setTagInfo(_td_c_iterate_48_9);
        _jettag_c_iterate_48_9.doStart(context, out);
        while (_jettag_c_iterate_48_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_49_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_49_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_49_9.setRuntimeParent(_jettag_c_iterate_48_9);
            _jettag_c_include_49_9.setTagInfo(_td_c_include_49_9);
            _jettag_c_include_49_9.doStart(context, out);
            _jettag_c_include_49_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_48_9.handleBodyContent(out);
        }
        _jettag_c_iterate_48_9.doEnd();
        //
        //        <c:iterate select="$eClass/eAttributes" var="eAttribute">
        //        self.<c:get select="$eAttribute/@name"/> = <c:get select="$eAttribute/@name"/>
        //        </c:iterate>
        RuntimeTagElement _jettag_c_iterate_57_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_57_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_57_9.setRuntimeParent(null);
        _jettag_c_iterate_57_9.setTagInfo(_td_c_iterate_57_9);
        _jettag_c_iterate_57_9.doStart(context, out);
        while (_jettag_c_iterate_57_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_58_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_58_9.setRuntimeParent(_jettag_c_iterate_57_9);
            _jettag_c_if_58_9.setTagInfo(_td_c_if_58_9);
            _jettag_c_if_58_9.doStart(context, out);
            while (_jettag_c_if_58_9.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_59_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_59_9.setRuntimeParent(_jettag_c_if_58_9);
                _jettag_c_if_59_9.setTagInfo(_td_c_if_59_9);
                _jettag_c_if_59_9.doStart(context, out);
                while (_jettag_c_if_59_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_15.setRuntimeParent(_jettag_c_if_59_9);
                    _jettag_c_get_60_15.setTagInfo(_td_c_get_60_15);
                    _jettag_c_get_60_15.doStart(context, out);
                    _jettag_c_get_60_15.doEnd();
                    out.write(" = []");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_59_9.handleBodyContent(out);
                }
                _jettag_c_if_59_9.doEnd();
                RuntimeTagElement _jettag_c_if_62_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_62_9.setRuntimeParent(_jettag_c_if_58_9);
                _jettag_c_if_62_9.setTagInfo(_td_c_if_62_9);
                _jettag_c_if_62_9.doStart(context, out);
                while (_jettag_c_if_62_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_63_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_63_15.setRuntimeParent(_jettag_c_if_62_9);
                    _jettag_c_get_63_15.setTagInfo(_td_c_get_63_15);
                    _jettag_c_get_63_15.doStart(context, out);
                    _jettag_c_get_63_15.doEnd();
                    out.write(" = None");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_62_9.handleBodyContent(out);
                }
                _jettag_c_if_62_9.doEnd();
                _jettag_c_if_58_9.handleBodyContent(out);
            }
            _jettag_c_if_58_9.doEnd();
            RuntimeTagElement _jettag_c_if_66_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_66_9.setRuntimeParent(_jettag_c_iterate_57_9);
            _jettag_c_if_66_9.setTagInfo(_td_c_if_66_9);
            _jettag_c_if_66_9.doStart(context, out);
            while (_jettag_c_if_66_9.okToProcessBody()) {
                out.write("        self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_14.setRuntimeParent(_jettag_c_if_66_9);
                _jettag_c_get_67_14.setTagInfo(_td_c_get_67_14);
                _jettag_c_get_67_14.doStart(context, out);
                _jettag_c_get_67_14.doEnd();
                out.write(" = [] if ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_58.setRuntimeParent(_jettag_c_if_66_9);
                _jettag_c_get_67_58.setTagInfo(_td_c_get_67_58);
                _jettag_c_get_67_58.doStart(context, out);
                _jettag_c_get_67_58.doEnd();
                out.write(" is None else ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_107); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_107.setRuntimeParent(_jettag_c_if_66_9);
                _jettag_c_get_67_107.setTagInfo(_td_c_get_67_107);
                _jettag_c_get_67_107.doStart(context, out);
                _jettag_c_get_67_107.doEnd();
                out.write(NL);         
                _jettag_c_if_66_9.handleBodyContent(out);
            }
            _jettag_c_if_66_9.doEnd();
            RuntimeTagElement _jettag_c_if_69_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_69_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_69_9.setRuntimeParent(_jettag_c_iterate_57_9);
            _jettag_c_if_69_9.setTagInfo(_td_c_if_69_9);
            _jettag_c_if_69_9.doStart(context, out);
            while (_jettag_c_if_69_9.okToProcessBody()) {
                out.write("        self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_70_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_14.setRuntimeParent(_jettag_c_if_69_9);
                _jettag_c_get_70_14.setTagInfo(_td_c_get_70_14);
                _jettag_c_get_70_14.doStart(context, out);
                _jettag_c_get_70_14.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_70_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_52.setRuntimeParent(_jettag_c_if_69_9);
                _jettag_c_get_70_52.setTagInfo(_td_c_get_70_52);
                _jettag_c_get_70_52.doStart(context, out);
                _jettag_c_get_70_52.doEnd();
                out.write(NL);         
                _jettag_c_if_69_9.handleBodyContent(out);
            }
            _jettag_c_if_69_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_57_9.handleBodyContent(out);
        }
        _jettag_c_iterate_57_9.doEnd();
        RuntimeTagElement _jettag_c_if_74_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_74_9.setRuntimeParent(null);
        _jettag_c_if_74_9.setTagInfo(_td_c_if_74_9);
        _jettag_c_if_74_9.doStart(context, out);
        while (_jettag_c_if_74_9.okToProcessBody()) {
            out.write("        super(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_75_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_75_15.setRuntimeParent(_jettag_c_if_74_9);
            _jettag_c_get_75_15.setTagInfo(_td_c_get_75_15);
            _jettag_c_get_75_15.doStart(context, out);
            _jettag_c_get_75_15.doEnd();
            out.write(", self).__init__(*args, **kw_args)");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_74_9.handleBodyContent(out);
        }
        _jettag_c_if_74_9.doEnd();
    }
}
