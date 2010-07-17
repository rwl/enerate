package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_init implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_init() {
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
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_11 = new TagInfo("c:get", //$NON-NLS-1$
            37, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_60 = new TagInfo("c:get", //$NON-NLS-1$
            37, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/eAttributeType/eLiterals[1]/@literal)", //$NON-NLS-1$
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
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_32 = new TagInfo("c:get", //$NON-NLS-1$
            39, 32,
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
    private static final TagInfo _td_c_include_42_9 = new TagInfo("c:include", //$NON-NLS-1$
            42, 9,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attribute.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_9 = new TagInfo("c:if", //$NON-NLS-1$
            52, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_9 = new TagInfo("c:if", //$NON-NLS-1$
            53, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_15 = new TagInfo("c:get", //$NON-NLS-1$
            54, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_9 = new TagInfo("c:if", //$NON-NLS-1$
            56, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_15 = new TagInfo("c:get", //$NON-NLS-1$
            57, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_9 = new TagInfo("c:if", //$NON-NLS-1$
            60, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_12 = new TagInfo("c:get", //$NON-NLS-1$
            61, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_18 = new TagInfo("c:get", //$NON-NLS-1$
            62, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_68 = new TagInfo("c:get", //$NON-NLS-1$
            62, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_18 = new TagInfo("c:get", //$NON-NLS-1$
            64, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_9 = new TagInfo("c:if", //$NON-NLS-1$
            66, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_14 = new TagInfo("c:get", //$NON-NLS-1$
            67, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_64 = new TagInfo("c:get", //$NON-NLS-1$
            67, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_15 = new TagInfo("c:get", //$NON-NLS-1$
            72, 15,
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
            RuntimeTagElement _jettag_c_get_37_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_60); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_60.setRuntimeParent(_jettag_c_iterate_29_76);
            _jettag_c_get_37_60.setTagInfo(_td_c_get_37_60);
            _jettag_c_get_37_60.doStart(context, out);
            _jettag_c_get_37_60.doEnd();
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
        out.write(", **kw_args):");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\" Initialises a new '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_32.setRuntimeParent(null);
        _jettag_c_get_39_32.setTagInfo(_td_c_get_39_32);
        _jettag_c_get_39_32.doStart(context, out);
        _jettag_c_get_39_32.doEnd();
        out.write("' instance.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_41_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_41_9.setRuntimeParent(null);
        _jettag_c_iterate_41_9.setTagInfo(_td_c_iterate_41_9);
        _jettag_c_iterate_41_9.doStart(context, out);
        while (_jettag_c_iterate_41_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_42_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_42_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_42_9.setRuntimeParent(_jettag_c_iterate_41_9);
            _jettag_c_include_42_9.setTagInfo(_td_c_include_42_9);
            _jettag_c_include_42_9.doStart(context, out);
            _jettag_c_include_42_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_41_9.handleBodyContent(out);
        }
        _jettag_c_iterate_41_9.doEnd();
        //
        //        <c:iterate select="$eClass/eAttributes" var="eAttribute">
        //        self.<c:get select="underscore($eAttribute/@name)"/> = <c:get select="underscore($eAttribute/@name)"/>
        //        </c:iterate>
        //        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_51_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_51_9.setRuntimeParent(null);
        _jettag_c_iterate_51_9.setTagInfo(_td_c_iterate_51_9);
        _jettag_c_iterate_51_9.doStart(context, out);
        while (_jettag_c_iterate_51_9.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_52_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_52_9.setRuntimeParent(_jettag_c_iterate_51_9);
            _jettag_c_if_52_9.setTagInfo(_td_c_if_52_9);
            _jettag_c_if_52_9.doStart(context, out);
            while (_jettag_c_if_52_9.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_53_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_53_9.setRuntimeParent(_jettag_c_if_52_9);
                _jettag_c_if_53_9.setTagInfo(_td_c_if_53_9);
                _jettag_c_if_53_9.doStart(context, out);
                while (_jettag_c_if_53_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_54_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_54_15.setRuntimeParent(_jettag_c_if_53_9);
                    _jettag_c_get_54_15.setTagInfo(_td_c_get_54_15);
                    _jettag_c_get_54_15.doStart(context, out);
                    _jettag_c_get_54_15.doEnd();
                    out.write(" = []");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_53_9.handleBodyContent(out);
                }
                _jettag_c_if_53_9.doEnd();
                RuntimeTagElement _jettag_c_if_56_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_56_9.setRuntimeParent(_jettag_c_if_52_9);
                _jettag_c_if_56_9.setTagInfo(_td_c_if_56_9);
                _jettag_c_if_56_9.doStart(context, out);
                while (_jettag_c_if_56_9.okToProcessBody()) {
                    out.write("        self._");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_57_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_15.setRuntimeParent(_jettag_c_if_56_9);
                    _jettag_c_get_57_15.setTagInfo(_td_c_get_57_15);
                    _jettag_c_get_57_15.doStart(context, out);
                    _jettag_c_get_57_15.doEnd();
                    out.write(" = None");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_56_9.handleBodyContent(out);
                }
                _jettag_c_if_56_9.doEnd();
                _jettag_c_if_52_9.handleBodyContent(out);
            }
            _jettag_c_if_52_9.doEnd();
            RuntimeTagElement _jettag_c_if_60_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_60_9.setRuntimeParent(_jettag_c_iterate_51_9);
            _jettag_c_if_60_9.setTagInfo(_td_c_if_60_9);
            _jettag_c_if_60_9.doStart(context, out);
            while (_jettag_c_if_60_9.okToProcessBody()) {
                out.write("        if ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_61_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_12.setRuntimeParent(_jettag_c_if_60_9);
                _jettag_c_get_61_12.setTagInfo(_td_c_get_61_12);
                _jettag_c_get_61_12.doStart(context, out);
                _jettag_c_get_61_12.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_18.setRuntimeParent(_jettag_c_if_60_9);
                _jettag_c_get_62_18.setTagInfo(_td_c_get_62_18);
                _jettag_c_get_62_18.doStart(context, out);
                _jettag_c_get_62_18.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_68.setRuntimeParent(_jettag_c_if_60_9);
                _jettag_c_get_62_68.setTagInfo(_td_c_get_62_68);
                _jettag_c_get_62_68.doStart(context, out);
                _jettag_c_get_62_68.doEnd();
                out.write(NL);         
                out.write("        else:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_64_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_18.setRuntimeParent(_jettag_c_if_60_9);
                _jettag_c_get_64_18.setTagInfo(_td_c_get_64_18);
                _jettag_c_get_64_18.doStart(context, out);
                _jettag_c_get_64_18.doEnd();
                out.write(" = []");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_60_9.handleBodyContent(out);
            }
            _jettag_c_if_60_9.doEnd();
            RuntimeTagElement _jettag_c_if_66_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_66_9.setRuntimeParent(_jettag_c_iterate_51_9);
            _jettag_c_if_66_9.setTagInfo(_td_c_if_66_9);
            _jettag_c_if_66_9.doStart(context, out);
            while (_jettag_c_if_66_9.okToProcessBody()) {
                out.write("        self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_14.setRuntimeParent(_jettag_c_if_66_9);
                _jettag_c_get_67_14.setTagInfo(_td_c_get_67_14);
                _jettag_c_get_67_14.doStart(context, out);
                _jettag_c_get_67_14.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_64.setRuntimeParent(_jettag_c_if_66_9);
                _jettag_c_get_67_64.setTagInfo(_td_c_get_67_64);
                _jettag_c_get_67_64.doStart(context, out);
                _jettag_c_get_67_64.doEnd();
                out.write(NL);         
                _jettag_c_if_66_9.handleBodyContent(out);
            }
            _jettag_c_if_66_9.doEnd();
            out.write(NL);         
            _jettag_c_iterate_51_9.handleBodyContent(out);
        }
        _jettag_c_iterate_51_9.doEnd();
        out.write(NL);         
        out.write("        super(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_72_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_72_15.setRuntimeParent(null);
        _jettag_c_get_72_15.setTagInfo(_td_c_get_72_15);
        _jettag_c_get_72_15.doStart(context, out);
        _jettag_c_get_72_15.doEnd();
        out.write(", self).__init__(**kw_args)");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
