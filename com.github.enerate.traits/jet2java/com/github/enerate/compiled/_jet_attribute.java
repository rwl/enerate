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
    
    private static final TagInfo _td_c_if_23_1 = new TagInfo("c:if", //$NON-NLS-1$
            23, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_7 = new TagInfo("c:include", //$NON-NLS-1$
            25, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_8 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@name)", //$NON-NLS-1$
                "eAttributeTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_7 = new TagInfo("c:get", //$NON-NLS-1$
            36, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_54 = new TagInfo("c:if", //$NON-NLS-1$
            36, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_36_110 = new TagInfo("c:include", //$NON-NLS-1$
            36, 110,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // FIMXE: Remove duplication with the 'import' template. 

ArrayList<String> imported = new ArrayList<String>();
ArrayList<String> traitNames = new ArrayList<String>();
HashMap<String, String> eAttributeTraitMap = new HashMap<String, String>();
eAttributeTraitMap.put("EString", "Str");
eAttributeTraitMap.put("EInt", "Int");
eAttributeTraitMap.put("EBoolean", "Bool");
eAttributeTraitMap.put("EDate", "Date");
eAttributeTraitMap.put("EDouble", "Float");
eAttributeTraitMap.put("EList", "List");
eAttributeTraitMap.put("EEnumerator", "Enum");
eAttributeTraitMap.put("EFloat", "Float");
eAttributeTraitMap.put("ELong", "Long");
eAttributeTraitMap.put("EMap", "Dict");
eAttributeTraitMap.put("EShort", "Int");

eAttributeTraitMap.put("Integer", "Int");
eAttributeTraitMap.put("Boolean", "Bool");

        RuntimeTagElement _jettag_c_if_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_23_1.setRuntimeParent(null);
        _jettag_c_if_23_1.setTagInfo(_td_c_if_23_1);
        _jettag_c_if_23_1.doStart(context, out);
        while (_jettag_c_if_23_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_24_1.setRuntimeParent(_jettag_c_if_23_1);
            _jettag_c_setVariable_24_1.setTagInfo(_td_c_setVariable_24_1);
            _jettag_c_setVariable_24_1.doStart(context, out);
            _jettag_c_setVariable_24_1.doEnd();
            out.write("    # ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_25_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_25_7.setRuntimeParent(_jettag_c_if_23_1);
            _jettag_c_include_25_7.setTagInfo(_td_c_include_25_7);
            _jettag_c_include_25_7.doStart(context, out);
            _jettag_c_include_25_7.doEnd();
            out.write(NL);         
            _jettag_c_if_23_1.handleBodyContent(out);
        }
        _jettag_c_if_23_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_26_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_26_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_26_8.setRuntimeParent(null);
        _jettag_c_setVariable_26_8.setTagInfo(_td_c_setVariable_26_8);
        _jettag_c_setVariable_26_8.doStart(context, out);
        _jettag_c_setVariable_26_8.doEnd();

String atn = (String)context.getVariable("eAttributeTypeName");
// Trait name.
String tn;

if ( eAttributeTraitMap.containsKey( atn ) ) {
    tn = eAttributeTraitMap.get( atn );
} else {
    tn = atn;
}

        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_7.setRuntimeParent(null);
        _jettag_c_get_36_7.setTagInfo(_td_c_get_36_7);
        _jettag_c_get_36_7.doStart(context, out);
        _jettag_c_get_36_7.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        out.write( tn );
        RuntimeTagElement _jettag_c_if_36_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_36_54.setRuntimeParent(null);
        _jettag_c_if_36_54.setTagInfo(_td_c_if_36_54);
        _jettag_c_if_36_54.doStart(context, out);
        while (_jettag_c_if_36_54.okToProcessBody()) {
            out.write("(desc=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_36_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_36_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_36_110.setRuntimeParent(_jettag_c_if_36_54);
            _jettag_c_include_36_110.setTagInfo(_td_c_include_36_110);
            _jettag_c_include_36_110.doStart(context, out);
            _jettag_c_include_36_110.doEnd();
            out.write("\")");  //$NON-NLS-1$        
            _jettag_c_if_36_54.handleBodyContent(out);
        }
        _jettag_c_if_36_54.doEnd();
        out.write(NL);         
    }
}
