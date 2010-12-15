package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enums implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_enums() {
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
                "$ePackage//EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_35 = new TagInfo("c:get", //$NON-NLS-1$
            3, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_5_22 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            5, 22,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                " ", //$NON-NLS-1$
                "_", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_61 = new TagInfo("c:get", //$NON-NLS-1$
            5, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "upper-case($eLiteral/@literal)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Enumerations */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            out.write("enum type --class ~.client.shared.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_35.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_get_3_35.setTagInfo(_td_c_get_3_35);
            _jettag_c_get_3_35.doStart(context, out);
            _jettag_c_get_3_35.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
            _jettag_c_iterate_4_1.doStart(context, out);
            while (_jettag_c_iterate_4_1.okToProcessBody()) {
                out.write("enum constant --name ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_replaceStrings_5_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_5_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_replaceStrings_5_22.setRuntimeParent(_jettag_c_iterate_4_1);
                _jettag_c_replaceStrings_5_22.setTagInfo(_td_c_replaceStrings_5_22);
                _jettag_c_replaceStrings_5_22.doStart(context, out);
                JET2Writer _jettag_c_replaceStrings_5_22_saved_out = out;
                while (_jettag_c_replaceStrings_5_22.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_5_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_61.setRuntimeParent(_jettag_c_replaceStrings_5_22);
                    _jettag_c_get_5_61.setTagInfo(_td_c_get_5_61);
                    _jettag_c_get_5_61.doStart(context, out);
                    _jettag_c_get_5_61.doEnd();
                    _jettag_c_replaceStrings_5_22.handleBodyContent(out);
                }
                out = _jettag_c_replaceStrings_5_22_saved_out;
                _jettag_c_replaceStrings_5_22.doEnd();
                out.write(NL);         
                _jettag_c_iterate_4_1.handleBodyContent(out);
            }
            _jettag_c_iterate_4_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
    }
}
