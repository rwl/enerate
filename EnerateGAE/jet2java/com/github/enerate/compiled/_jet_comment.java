package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_comment implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_comment() {
        super();
    }
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eAnnotated/eAnnotations", //$NON-NLS-1$
                "eAnnotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_1_64 = new TagInfo("c:if", //$NON-NLS-1$
            1, 64,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAnnotation/@source = 'http://www.eclipse.org/emf/2002/GenModel'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_1_143 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 143,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eAnnotation/details", //$NON-NLS-1$
                "detailsEntry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_2_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            2, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "\",\\n", //$NON-NLS-1$
                "', ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_48 = new TagInfo("c:get", //$NON-NLS-1$
            2, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$detailsEntry/@value", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_1_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_1_64.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_1_64.setTagInfo(_td_c_if_1_64);
            _jettag_c_if_1_64.doStart(context, out);
            while (_jettag_c_if_1_64.okToProcessBody()) {
                RuntimeTagElement _jettag_c_iterate_1_143 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_143); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_1_143.setRuntimeParent(_jettag_c_if_1_64);
                _jettag_c_iterate_1_143.setTagInfo(_td_c_iterate_1_143);
                _jettag_c_iterate_1_143.doStart(context, out);
                while (_jettag_c_iterate_1_143.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_replaceStrings_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_2_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_replaceStrings_2_1.setRuntimeParent(_jettag_c_iterate_1_143);
                    _jettag_c_replaceStrings_2_1.setTagInfo(_td_c_replaceStrings_2_1);
                    _jettag_c_replaceStrings_2_1.doStart(context, out);
                    JET2Writer _jettag_c_replaceStrings_2_1_saved_out = out;
                    while (_jettag_c_replaceStrings_2_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_get_2_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_48); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_2_48.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                        _jettag_c_get_2_48.setTagInfo(_td_c_get_2_48);
                        _jettag_c_get_2_48.doStart(context, out);
                        _jettag_c_get_2_48.doEnd();
                        _jettag_c_replaceStrings_2_1.handleBodyContent(out);
                    }
                    out = _jettag_c_replaceStrings_2_1_saved_out;
                    _jettag_c_replaceStrings_2_1.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    _jettag_c_iterate_1_143.handleBodyContent(out);
                }
                _jettag_c_iterate_1_143.doEnd();
                _jettag_c_if_1_64.handleBodyContent(out);
            }
            _jettag_c_if_1_64.doEnd();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
    }
}
