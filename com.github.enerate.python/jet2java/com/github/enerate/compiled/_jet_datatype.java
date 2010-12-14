package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_datatype implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_datatype() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_32_7 = new TagInfo("c:get", //$NON-NLS-1$
            32, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "numComments", //$NON-NLS-1$
                "count($eDataType/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel'])", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_34_5 = new TagInfo("c:if", //$NON-NLS-1$
            34, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($numComments > 0) or ($eDataType/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_35_8 = new TagInfo("c:setVariable", //$NON-NLS-1$
            35, 8,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_35_61 = new TagInfo("c:include", //$NON-NLS-1$
            35, 61,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_133 = new TagInfo("c:if", //$NON-NLS-1$
            35, 133,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/eLiterals", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_33 = new TagInfo("c:if", //$NON-NLS-1$
            36, 33,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$numComments > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_24 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 24,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eDataType/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_95 = new TagInfo("c:get", //$NON-NLS-1$
            38, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

HashMap<String, String> typeMap = new HashMap<String, String>();
typeMap.put("boolean", "bool");
typeMap.put("java.lang.Boolean", "bool");
typeMap.put("char", "str");
typeMap.put("java.lang.Character", "str");
typeMap.put("java.util.Date", "str");
typeMap.put("double", "float");
typeMap.put("java.lang.Double", "float");
typeMap.put("float", "float");
typeMap.put("java.lang.Float", "float");
typeMap.put("int", "int");
typeMap.put("java.lang.Integer", "int");
typeMap.put("java.lang.Class", "object");
typeMap.put("java.lang.Object", "object");
typeMap.put("long", "long");
typeMap.put("java.lang.Long", "long");
typeMap.put("java.util.Map", "dict");
typeMap.put("short", "int");
typeMap.put("java.lang.Short", "int");
typeMap.put("java.lang.String", "str");

EDataType dt = (EDataType) context.getVariable("eDataType");
String itn = dt.getInstanceTypeName();
String val = "str";

if (typeMap.containsKey(itn))
    val = typeMap.get(itn);

        out.write("class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_7.setRuntimeParent(null);
        _jettag_c_get_32_7.setTagInfo(_td_c_get_32_7);
        _jettag_c_get_32_7.doStart(context, out);
        _jettag_c_get_32_7.doEnd();
        out.write("(");  //$NON-NLS-1$        
        out.write( val );
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_33_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_33_5.setRuntimeParent(null);
        _jettag_c_setVariable_33_5.setTagInfo(_td_c_setVariable_33_5);
        _jettag_c_setVariable_33_5.doStart(context, out);
        _jettag_c_setVariable_33_5.doEnd();
        RuntimeTagElement _jettag_c_if_34_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_34_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_34_5.setRuntimeParent(null);
        _jettag_c_if_34_5.setTagInfo(_td_c_if_34_5);
        _jettag_c_if_34_5.doStart(context, out);
        while (_jettag_c_if_34_5.okToProcessBody()) {
            out.write("    \"\"\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_35_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_35_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_35_8.setRuntimeParent(_jettag_c_if_34_5);
            _jettag_c_setVariable_35_8.setTagInfo(_td_c_setVariable_35_8);
            _jettag_c_setVariable_35_8.doStart(context, out);
            _jettag_c_setVariable_35_8.doEnd();
            RuntimeTagElement _jettag_c_include_35_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_35_61); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_35_61.setRuntimeParent(_jettag_c_if_34_5);
            _jettag_c_include_35_61.setTagInfo(_td_c_include_35_61);
            _jettag_c_include_35_61.doStart(context, out);
            _jettag_c_include_35_61.doEnd();
            RuntimeTagElement _jettag_c_if_35_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_133); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_35_133.setRuntimeParent(_jettag_c_if_34_5);
            _jettag_c_if_35_133.setTagInfo(_td_c_if_35_133);
            _jettag_c_if_35_133.doStart(context, out);
            while (_jettag_c_if_35_133.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_36_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_33); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_36_33.setRuntimeParent(_jettag_c_if_35_133);
                _jettag_c_if_36_33.setTagInfo(_td_c_if_36_33);
                _jettag_c_if_36_33.doStart(context, out);
                while (_jettag_c_if_36_33.okToProcessBody()) {
                    out.write(NL);         
                    out.write("    ");  //$NON-NLS-1$        
                    _jettag_c_if_36_33.handleBodyContent(out);
                }
                _jettag_c_if_36_33.doEnd();
                out.write("Values are: ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_38_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_38_24.setRuntimeParent(_jettag_c_if_35_133);
                _jettag_c_iterate_38_24.setTagInfo(_td_c_iterate_38_24);
                _jettag_c_iterate_38_24.doStart(context, out);
                while (_jettag_c_iterate_38_24.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_38_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_95); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_95.setRuntimeParent(_jettag_c_iterate_38_24);
                    _jettag_c_get_38_95.setTagInfo(_td_c_get_38_95);
                    _jettag_c_get_38_95.doStart(context, out);
                    _jettag_c_get_38_95.doEnd();
                    _jettag_c_iterate_38_24.handleBodyContent(out);
                }
                _jettag_c_iterate_38_24.doEnd();
                _jettag_c_if_35_133.handleBodyContent(out);
            }
            _jettag_c_if_35_133.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_34_5.handleBodyContent(out);
        }
        _jettag_c_if_34_5.doEnd();
        out.write("    pass");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
