package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_attribute implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attribute() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_33_1 = new TagInfo("c:if", //$NON-NLS-1$
            33, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_34_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            34, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_35_11 = new TagInfo("c:include", //$NON-NLS-1$
            35, 11,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_91 = new TagInfo("c:if", //$NON-NLS-1$
            35, 91,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAttributeType/eLiterals) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_35_152 = new TagInfo("c:setVariable", //$NON-NLS-1$
            35, 152,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eEnum", //$NON-NLS-1$
                "$eAttribute/eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_35_228 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 228,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
                "eLiteralIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_291 = new TagInfo("c:get", //$NON-NLS-1$
            35, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eEnum/eLiterals[$eLiteralIdx]/@literal)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_361 = new TagInfo("c:if", //$NON-NLS-1$
            35, 361,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteralIdx != count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_16 = new TagInfo("c:get", //$NON-NLS-1$
            42, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_66 = new TagInfo("c:get", //$NON-NLS-1$
            42, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_14 = new TagInfo("c:get", //$NON-NLS-1$
            45, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_65 = new TagInfo("c:get", //$NON-NLS-1$
            45, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/eAttributeType/eLiterals[1]/@literal)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // FIMXE: Remove duplication with the 'init' template. 

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

HashMap<String, String> pythonKeywordMap = new HashMap<String, String>();
pythonKeywordMap.put("For", "ffor");
pythonKeywordMap.put("Class", "klass");

        RuntimeTagElement _jettag_c_if_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_33_1.setRuntimeParent(null);
        _jettag_c_if_33_1.setTagInfo(_td_c_if_33_1);
        _jettag_c_if_33_1.doStart(context, out);
        while (_jettag_c_if_33_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_34_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_34_1.setRuntimeParent(_jettag_c_if_33_1);
            _jettag_c_setVariable_34_1.setTagInfo(_td_c_setVariable_34_1);
            _jettag_c_setVariable_34_1.doStart(context, out);
            _jettag_c_setVariable_34_1.doEnd();
            out.write("        # ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_35_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_35_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_35_11.setRuntimeParent(_jettag_c_if_33_1);
            _jettag_c_include_35_11.setTagInfo(_td_c_include_35_11);
            _jettag_c_include_35_11.doStart(context, out);
            _jettag_c_include_35_11.doEnd();
            _jettag_c_if_33_1.handleBodyContent(out);
        }
        _jettag_c_if_33_1.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_35_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_91.setRuntimeParent(null);
        _jettag_c_if_35_91.setTagInfo(_td_c_if_35_91);
        _jettag_c_if_35_91.doStart(context, out);
        while (_jettag_c_if_35_91.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_35_152 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_35_152); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_35_152.setRuntimeParent(_jettag_c_if_35_91);
            _jettag_c_setVariable_35_152.setTagInfo(_td_c_setVariable_35_152);
            _jettag_c_setVariable_35_152.doStart(context, out);
            _jettag_c_setVariable_35_152.doEnd();
            out.write("Values are: ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_35_228 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_228); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_35_228.setRuntimeParent(_jettag_c_if_35_91);
            _jettag_c_iterate_35_228.setTagInfo(_td_c_iterate_35_228);
            _jettag_c_iterate_35_228.doStart(context, out);
            while (_jettag_c_iterate_35_228.okToProcessBody()) {
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_291); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_291.setRuntimeParent(_jettag_c_iterate_35_228);
                _jettag_c_get_35_291.setTagInfo(_td_c_get_35_291);
                _jettag_c_get_35_291.doStart(context, out);
                _jettag_c_get_35_291.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_35_361 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_361); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_35_361.setRuntimeParent(_jettag_c_iterate_35_228);
                _jettag_c_if_35_361.setTagInfo(_td_c_if_35_361);
                _jettag_c_if_35_361.doStart(context, out);
                while (_jettag_c_if_35_361.okToProcessBody()) {
                    out.write(", ");  //$NON-NLS-1$        
                    _jettag_c_if_35_361.handleBodyContent(out);
                }
                _jettag_c_if_35_361.doEnd();
                _jettag_c_iterate_35_228.handleBodyContent(out);
            }
            _jettag_c_iterate_35_228.doEnd();
            _jettag_c_if_35_91.handleBodyContent(out);
        }
        _jettag_c_if_35_91.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_36_1.setRuntimeParent(null);
        _jettag_c_setVariable_36_1.setTagInfo(_td_c_setVariable_36_1);
        _jettag_c_setVariable_36_1.doStart(context, out);
        _jettag_c_setVariable_36_1.doEnd();

String itn = (String)context.getVariable("instanceTypeName");
String val;

if ( instanceTypeNameValueMap.containsKey( itn ) ) {
    val = instanceTypeNameValueMap.get( itn );

        out.write("        self.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_16.setRuntimeParent(null);
        _jettag_c_get_42_16.setTagInfo(_td_c_get_42_16);
        _jettag_c_get_42_16.doStart(context, out);
        _jettag_c_get_42_16.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_66); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_66.setRuntimeParent(null);
        _jettag_c_get_42_66.setTagInfo(_td_c_get_42_66);
        _jettag_c_get_42_66.doStart(context, out);
        _jettag_c_get_42_66.doEnd();
        out.write(NL);         

} else {
        out.write("        self.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_14.setRuntimeParent(null);
        _jettag_c_get_45_14.setTagInfo(_td_c_get_45_14);
        _jettag_c_get_45_14.doStart(context, out);
        _jettag_c_get_45_14.doEnd();
        out.write(" = '");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_65.setRuntimeParent(null);
        _jettag_c_get_45_65.setTagInfo(_td_c_get_45_65);
        _jettag_c_get_45_65.doStart(context, out);
        _jettag_c_get_45_65.doEnd();
        out.write("'");  //$NON-NLS-1$        
        out.write(NL);         

}
    }
}
