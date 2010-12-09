package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_reference implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_13 = new TagInfo("c:get", //$NON-NLS-1$
            4, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_1 = new TagInfo("c:include", //$NON-NLS-1$
            7, 1,
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
        out.write("field");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_1.setRuntimeParent(null);
        _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
        _jettag_c_if_2_1.doStart(context, out);
        while (_jettag_c_if_2_1.okToProcessBody()) {
            out.write("reference");  //$NON-NLS-1$        
            _jettag_c_if_2_1.handleBodyContent(out);
        }
        _jettag_c_if_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_3_1.setRuntimeParent(null);
        _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
        _jettag_c_if_3_1.doStart(context, out);
        while (_jettag_c_if_3_1.okToProcessBody()) {
            out.write("set");  //$NON-NLS-1$        
            _jettag_c_if_3_1.handleBodyContent(out);
        }
        _jettag_c_if_3_1.doEnd();
        out.write(NL);         
        out.write("--fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_13.setRuntimeParent(null);
        _jettag_c_get_4_13.setTagInfo(_td_c_get_4_13);
        _jettag_c_get_4_13.doStart(context, out);
        _jettag_c_get_4_13.doEnd();
        out.write(NL);         
        out.write("--type ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_1.setRuntimeParent(null);
        _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
        _jettag_c_setVariable_6_1.doStart(context, out);
        _jettag_c_setVariable_6_1.doEnd();
        RuntimeTagElement _jettag_c_include_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_7_1.setRuntimeParent(null);
        _jettag_c_include_7_1.setTagInfo(_td_c_include_7_1);
        _jettag_c_include_7_1.doStart(context, out);
        _jettag_c_include_7_1.doEnd();
    }
}
