package com.github.enerate.java.compiled;

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
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/EPackage", //$NON-NLS-1$
                "ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 3,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_3_3 = new TagInfo("c:set", //$NON-NLS-1$
            3, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage", //$NON-NLS-1$
                "fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_3_55 = new TagInfo("c:include", //$NON-NLS-1$
            3, 55,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "ePackage", //$NON-NLS-1$
                "/contents", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_3 = new TagInfo("c:set", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$eClass", //$NON-NLS-1$
                "fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_53 = new TagInfo("c:get", //$NON-NLS-1$
            8, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_108 = new TagInfo("c:get", //$NON-NLS-1$
            8, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_12_3 = new TagInfo("c:set", //$NON-NLS-1$
            12, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum", //$NON-NLS-1$
                "fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_52 = new TagInfo("c:get", //$NON-NLS-1$
            12, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_106 = new TagInfo("c:get", //$NON-NLS-1$
            12, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_2_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_2_3.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_setVariable_2_3.setTagInfo(_td_c_setVariable_2_3);
            _jettag_c_setVariable_2_3.doStart(context, out);
            _jettag_c_setVariable_2_3.doEnd();
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_3_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_3_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_3_3.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_set_3_3.setTagInfo(_td_c_set_3_3);
            _jettag_c_set_3_3.doStart(context, out);
            JET2Writer _jettag_c_set_3_3_saved_out = out;
            while (_jettag_c_set_3_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_3_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_3_55.setRuntimeParent(_jettag_c_set_3_3);
                _jettag_c_include_3_55.setTagInfo(_td_c_include_3_55);
                _jettag_c_include_3_55.doStart(context, out);
                _jettag_c_include_3_55.doEnd();
                _jettag_c_set_3_3.handleBodyContent(out);
            }
            out = _jettag_c_set_3_3_saved_out;
            _jettag_c_set_3_3.doEnd();
            out.write(NL);         
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_1.setRuntimeParent(null);
        _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
        _jettag_c_setVariable_6_1.doStart(context, out);
        _jettag_c_setVariable_6_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_1.setRuntimeParent(null);
        _jettag_c_iterate_7_1.setTagInfo(_td_c_iterate_7_1);
        _jettag_c_iterate_7_1.doStart(context, out);
        while (_jettag_c_iterate_7_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_8_3.setRuntimeParent(_jettag_c_iterate_7_1);
            _jettag_c_set_8_3.setTagInfo(_td_c_set_8_3);
            _jettag_c_set_8_3.doStart(context, out);
            JET2Writer _jettag_c_set_8_3_saved_out = out;
            while (_jettag_c_set_8_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_8_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_53.setRuntimeParent(_jettag_c_set_8_3);
                _jettag_c_get_8_53.setTagInfo(_td_c_get_8_53);
                _jettag_c_get_8_53.doStart(context, out);
                _jettag_c_get_8_53.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_108); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_108.setRuntimeParent(_jettag_c_set_8_3);
                _jettag_c_get_8_108.setTagInfo(_td_c_get_8_108);
                _jettag_c_get_8_108.doStart(context, out);
                _jettag_c_get_8_108.doEnd();
                _jettag_c_set_8_3.handleBodyContent(out);
            }
            out = _jettag_c_set_8_3_saved_out;
            _jettag_c_set_8_3.doEnd();
            out.write(NL);         
            _jettag_c_iterate_7_1.handleBodyContent(out);
        }
        _jettag_c_iterate_7_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_1.setRuntimeParent(null);
        _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
        _jettag_c_iterate_11_1.doStart(context, out);
        while (_jettag_c_iterate_11_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_12_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_12_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_12_3.setRuntimeParent(_jettag_c_iterate_11_1);
            _jettag_c_set_12_3.setTagInfo(_td_c_set_12_3);
            _jettag_c_set_12_3.doStart(context, out);
            JET2Writer _jettag_c_set_12_3_saved_out = out;
            while (_jettag_c_set_12_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_12_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_52); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_52.setRuntimeParent(_jettag_c_set_12_3);
                _jettag_c_get_12_52.setTagInfo(_td_c_get_12_52);
                _jettag_c_get_12_52.doStart(context, out);
                _jettag_c_get_12_52.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_106); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_106.setRuntimeParent(_jettag_c_set_12_3);
                _jettag_c_get_12_106.setTagInfo(_td_c_get_12_106);
                _jettag_c_get_12_106.doStart(context, out);
                _jettag_c_get_12_106.doEnd();
                _jettag_c_set_12_3.handleBodyContent(out);
            }
            out = _jettag_c_set_12_3_saved_out;
            _jettag_c_set_12_3.doEnd();
            out.write(NL);         
            _jettag_c_iterate_11_1.handleBodyContent(out);
        }
        _jettag_c_iterate_11_1.doEnd();
    }
}
