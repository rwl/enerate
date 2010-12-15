package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attributes implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attributes() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_2_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass[count(eAttributes) > 0]", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_5 = new TagInfo("c:include", //$NON-NLS-1$
            5, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Attributes */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_3.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_iterate_4_3.setTagInfo(_td_c_iterate_4_3);
            _jettag_c_iterate_4_3.doStart(context, out);
            while (_jettag_c_iterate_4_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_5_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_5_5.setRuntimeParent(_jettag_c_iterate_4_3);
                _jettag_c_include_5_5.setTagInfo(_td_c_include_5_5);
                _jettag_c_include_5_5.doStart(context, out);
                _jettag_c_include_5_5.doEnd();
                _jettag_c_iterate_4_3.handleBodyContent(out);
            }
            _jettag_c_iterate_4_3.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
    }
}
