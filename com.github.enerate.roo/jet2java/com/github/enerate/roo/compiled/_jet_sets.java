package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_sets implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_sets() {
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
                "$ePackage//EClass[count(eReferences[@many='true']) > 0]", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many='true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_1 = new TagInfo("c:include", //$NON-NLS-1$
            5, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Sets */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
            _jettag_c_iterate_4_1.doStart(context, out);
            while (_jettag_c_iterate_4_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_5_1.setRuntimeParent(_jettag_c_iterate_4_1);
                _jettag_c_include_5_1.setTagInfo(_td_c_include_5_1);
                _jettag_c_include_5_1.doStart(context, out);
                _jettag_c_include_5_1.doEnd();
                _jettag_c_iterate_4_1.handleBodyContent(out);
            }
            _jettag_c_iterate_4_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
    }
}
