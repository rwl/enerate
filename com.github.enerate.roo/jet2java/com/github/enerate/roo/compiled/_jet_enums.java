package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enums implements JET2Template {
    private static final String _jetns_en = "com.github.enerate.tag.tagLibrary"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_enums() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_3_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_5_35 = new TagInfo("en:getRoo", //$NON-NLS-1$
            5, 35,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
                "sql", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_7_22 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            7, 22,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                " ,/,-,º", //$NON-NLS-1$
                "_,_per_,_minus_,o", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_7_83 = new TagInfo("en:getRoo", //$NON-NLS-1$
            7, 83,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Enumerations */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_1.setRuntimeParent(null);
        _jettag_c_iterate_3_1.setTagInfo(_td_c_iterate_3_1);
        _jettag_c_iterate_3_1.doStart(context, out);
        while (_jettag_c_iterate_3_1.okToProcessBody()) {
            out.write(NL);         
            out.write("enum type --class ~.client.shared.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_en_getRoo_5_35 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_5_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_en_getRoo_5_35.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_en_getRoo_5_35.setTagInfo(_td_en_getRoo_5_35);
            _jettag_en_getRoo_5_35.doStart(context, out);
            _jettag_en_getRoo_5_35.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_6_1.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_iterate_6_1.setTagInfo(_td_c_iterate_6_1);
            _jettag_c_iterate_6_1.doStart(context, out);
            while (_jettag_c_iterate_6_1.okToProcessBody()) {
                out.write("enum constant --name ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_replaceStrings_7_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_7_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_replaceStrings_7_22.setRuntimeParent(_jettag_c_iterate_6_1);
                _jettag_c_replaceStrings_7_22.setTagInfo(_td_c_replaceStrings_7_22);
                _jettag_c_replaceStrings_7_22.doStart(context, out);
                JET2Writer _jettag_c_replaceStrings_7_22_saved_out = out;
                while (_jettag_c_replaceStrings_7_22.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_en_getRoo_7_83 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_7_83); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_en_getRoo_7_83.setRuntimeParent(_jettag_c_replaceStrings_7_22);
                    _jettag_en_getRoo_7_83.setTagInfo(_td_en_getRoo_7_83);
                    _jettag_en_getRoo_7_83.doStart(context, out);
                    _jettag_en_getRoo_7_83.doEnd();
                    _jettag_c_replaceStrings_7_22.handleBodyContent(out);
                }
                out = _jettag_c_replaceStrings_7_22_saved_out;
                _jettag_c_replaceStrings_7_22.doEnd();
                out.write(NL);         
                _jettag_c_iterate_6_1.handleBodyContent(out);
            }
            _jettag_c_iterate_6_1.doEnd();
            _jettag_c_iterate_3_1.handleBodyContent(out);
        }
        _jettag_c_iterate_3_1.doEnd();
    }
}
