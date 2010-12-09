package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_script implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_script() {
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
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_9 = new TagInfo("c:include", //$NON-NLS-1$
            4, 9,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_83 = new TagInfo("c:get", //$NON-NLS-1$
            4, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/eSuperTypes[1]/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_11 = new TagInfo("c:include", //$NON-NLS-1$
            8, 11,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_85 = new TagInfo("c:get", //$NON-NLS-1$
            8, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_1 = new TagInfo("c:include", //$NON-NLS-1$
            12, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/field.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_1 = new TagInfo("c:include", //$NON-NLS-1$
            15, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_2_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
            _jettag_c_setVariable_2_1.doStart(context, out);
            _jettag_c_setVariable_2_1.doEnd();
            out.write("entity");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("--class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_4_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_9.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_include_4_9.setTagInfo(_td_c_include_4_9);
            _jettag_c_include_4_9.doStart(context, out);
            _jettag_c_include_4_9.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_83.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_4_83.setTagInfo(_td_c_get_4_83);
            _jettag_c_get_4_83.doStart(context, out);
            _jettag_c_get_4_83.doEnd();
            out.write(NL);         
            out.write("--testAutomatically");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_6_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
            _jettag_c_if_6_1.doStart(context, out);
            while (_jettag_c_if_6_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_7_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_setVariable_7_1.setTagInfo(_td_c_setVariable_7_1);
                _jettag_c_setVariable_7_1.doStart(context, out);
                _jettag_c_setVariable_7_1.doEnd();
                out.write("--extends ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_8_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_8_11.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_include_8_11.setTagInfo(_td_c_include_8_11);
                _jettag_c_include_8_11.doStart(context, out);
                _jettag_c_include_8_11.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_85.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_get_8_85.setTagInfo(_td_c_get_8_85);
                _jettag_c_get_8_85.doStart(context, out);
                _jettag_c_get_8_85.doEnd();
                out.write(NL);         
                _jettag_c_if_6_1.handleBodyContent(out);
            }
            _jettag_c_if_6_1.doEnd();
            RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
            _jettag_c_if_10_1.doStart(context, out);
            while (_jettag_c_if_10_1.okToProcessBody()) {
                out.write("--abstract");  //$NON-NLS-1$        
                _jettag_c_if_10_1.handleBodyContent(out);
            }
            _jettag_c_if_10_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_11_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
            _jettag_c_iterate_11_1.doStart(context, out);
            while (_jettag_c_iterate_11_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_12_1.setRuntimeParent(_jettag_c_iterate_11_1);
                _jettag_c_include_12_1.setTagInfo(_td_c_include_12_1);
                _jettag_c_include_12_1.doStart(context, out);
                _jettag_c_include_12_1.doEnd();
                _jettag_c_iterate_11_1.handleBodyContent(out);
            }
            _jettag_c_iterate_11_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_14_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_14_1.setTagInfo(_td_c_iterate_14_1);
            _jettag_c_iterate_14_1.doStart(context, out);
            while (_jettag_c_iterate_14_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_15_1.setRuntimeParent(_jettag_c_iterate_14_1);
                _jettag_c_include_15_1.setTagInfo(_td_c_include_15_1);
                _jettag_c_include_15_1.doStart(context, out);
                _jettag_c_include_15_1.doEnd();
                _jettag_c_iterate_14_1.handleBodyContent(out);
            }
            _jettag_c_iterate_14_1.doEnd();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
    }
}
