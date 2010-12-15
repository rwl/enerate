package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_annotate implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_annotate() {
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
                "$ePackage//EReference[(@many='true') and (eOpposite/@many='true')]", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($eReference/eOpposite/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_4_1 = new TagInfo("c:set", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$eReference", //$NON-NLS-1$
                "primary", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EReference[(@many='false') and (@lowerBound>0) and (eOpposite/@many='false') and (eOpposite/@lowerBound>0)]", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($eReference/eOpposite/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_11_1 = new TagInfo("c:set", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$eReference", //$NON-NLS-1$
                "primary", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Tag one side of each many-to-many reference as primary to avoid use of mappedBy on both sides of the relationship. 
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_3_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
            _jettag_c_if_3_1.doStart(context, out);
            while (_jettag_c_if_3_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_set_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_4_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_4_1.setRuntimeParent(_jettag_c_if_3_1);
                _jettag_c_set_4_1.setTagInfo(_td_c_set_4_1);
                _jettag_c_set_4_1.doStart(context, out);
                JET2Writer _jettag_c_set_4_1_saved_out = out;
                while (_jettag_c_set_4_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("true");  //$NON-NLS-1$        
                    _jettag_c_set_4_1.handleBodyContent(out);
                }
                out = _jettag_c_set_4_1_saved_out;
                _jettag_c_set_4_1.doEnd();
                out.write(NL);         
                _jettag_c_if_3_1.handleBodyContent(out);
            }
            _jettag_c_if_3_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
        out.write(NL);         
        // Tag one side of each one-to-one not null reference as primary to avoid use of notNull on both sides of the relationship. 
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
            _jettag_c_if_10_1.doStart(context, out);
            while (_jettag_c_if_10_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_set_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_11_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_11_1.setRuntimeParent(_jettag_c_if_10_1);
                _jettag_c_set_11_1.setTagInfo(_td_c_set_11_1);
                _jettag_c_set_11_1.doStart(context, out);
                JET2Writer _jettag_c_set_11_1_saved_out = out;
                while (_jettag_c_set_11_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("true");  //$NON-NLS-1$        
                    _jettag_c_set_11_1.handleBodyContent(out);
                }
                out = _jettag_c_set_11_1_saved_out;
                _jettag_c_set_11_1.doEnd();
                out.write(NL);         
                _jettag_c_if_10_1.handleBodyContent(out);
            }
            _jettag_c_if_10_1.doEnd();
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
    }
}
