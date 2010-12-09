package com.github.enerate.roo.compiled;

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
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAnnotated/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_1_114 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 114,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eAnnotated/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']", //$NON-NLS-1$
                "eAnnotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_1_229 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 229,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eAnnotation/details[@key='documentation']", //$NON-NLS-1$
                "detailsEntry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_3_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            3, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "\",\\n", //$NON-NLS-1$
                "', ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_48 = new TagInfo("c:get", //$NON-NLS-1$
            3, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$detailsEntry/@value", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            out.write(" --comment \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_1_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_114); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_1_114.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_iterate_1_114.setTagInfo(_td_c_iterate_1_114);
            _jettag_c_iterate_1_114.doStart(context, out);
            while (_jettag_c_iterate_1_114.okToProcessBody()) {
                RuntimeTagElement _jettag_c_iterate_1_229 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_229); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_1_229.setRuntimeParent(_jettag_c_iterate_1_114);
                _jettag_c_iterate_1_229.setTagInfo(_td_c_iterate_1_229);
                _jettag_c_iterate_1_229.doStart(context, out);
                while (_jettag_c_iterate_1_229.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_replaceStrings_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_3_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_replaceStrings_3_1.setRuntimeParent(_jettag_c_iterate_1_229);
                    _jettag_c_replaceStrings_3_1.setTagInfo(_td_c_replaceStrings_3_1);
                    _jettag_c_replaceStrings_3_1.doStart(context, out);
                    JET2Writer _jettag_c_replaceStrings_3_1_saved_out = out;
                    while (_jettag_c_replaceStrings_3_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_get_3_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_48); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_3_48.setRuntimeParent(_jettag_c_replaceStrings_3_1);
                        _jettag_c_get_3_48.setTagInfo(_td_c_get_3_48);
                        _jettag_c_get_3_48.doStart(context, out);
                        _jettag_c_get_3_48.doEnd();
                        _jettag_c_replaceStrings_3_1.handleBodyContent(out);
                    }
                    out = _jettag_c_replaceStrings_3_1_saved_out;
                    _jettag_c_replaceStrings_3_1.doEnd();
                    _jettag_c_iterate_1_229.handleBodyContent(out);
                }
                _jettag_c_iterate_1_229.doEnd();
                _jettag_c_iterate_1_114.handleBodyContent(out);
            }
            _jettag_c_iterate_1_114.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
    }
}
