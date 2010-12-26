package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_ref implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_ref() {
        super();
    }
    
    private static final TagInfo _td_c_if_1_9 = new TagInfo("c:if", //$NON-NLS-1$
            1, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_54 = new TagInfo("c:get", //$NON-NLS-1$
            1, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_1_126 = new TagInfo("c:if", //$NON-NLS-1$
            1, 126,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_37 = new TagInfo("c:get", //$NON-NLS-1$
            2, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_109 = new TagInfo("c:get", //$NON-NLS-1$
            2, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("private ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_9.setRuntimeParent(null);
        _jettag_c_if_1_9.setTagInfo(_td_c_if_1_9);
        _jettag_c_if_1_9.doStart(context, out);
        while (_jettag_c_if_1_9.okToProcessBody()) {
            out.write("List<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_1_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_1_54.setRuntimeParent(_jettag_c_if_1_9);
            _jettag_c_get_1_54.setTagInfo(_td_c_get_1_54);
            _jettag_c_get_1_54.doStart(context, out);
            _jettag_c_get_1_54.doEnd();
            out.write(">");  //$NON-NLS-1$        
            _jettag_c_if_1_9.handleBodyContent(out);
        }
        _jettag_c_if_1_9.doEnd();
        RuntimeTagElement _jettag_c_if_1_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_126.setRuntimeParent(null);
        _jettag_c_if_1_126.setTagInfo(_td_c_if_1_126);
        _jettag_c_if_1_126.doStart(context, out);
        while (_jettag_c_if_1_126.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_2_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_37.setRuntimeParent(_jettag_c_if_1_126);
            _jettag_c_get_2_37.setTagInfo(_td_c_get_2_37);
            _jettag_c_get_2_37.doStart(context, out);
            _jettag_c_get_2_37.doEnd();
            _jettag_c_if_1_126.handleBodyContent(out);
        }
        _jettag_c_if_1_126.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_109); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_109.setRuntimeParent(null);
        _jettag_c_get_2_109.setTagInfo(_td_c_get_2_109);
        _jettag_c_get_2_109.doStart(context, out);
        _jettag_c_get_2_109.doEnd();
        out.write(";");  //$NON-NLS-1$        
    }
}
