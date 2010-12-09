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
                "$ePackage//EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eEnum/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_3_21 = new TagInfo("c:include", //$NON-NLS-1$
            3, 21,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_95 = new TagInfo("c:get", //$NON-NLS-1$
            3, 95,
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
    private static final TagInfo _td_c_get_5_23 = new TagInfo("c:get", //$NON-NLS-1$
            5, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_18 = new TagInfo("c:include", //$NON-NLS-1$
            11, 18,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_92 = new TagInfo("c:get", //$NON-NLS-1$
            11, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/eSuperTypes[1]/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_13 = new TagInfo("c:include", //$NON-NLS-1$
            14, 13,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_87 = new TagInfo("c:get", //$NON-NLS-1$
            14, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_1 = new TagInfo("c:if", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_1 = new TagInfo("c:include", //$NON-NLS-1$
            18, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/field.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_1 = new TagInfo("c:include", //$NON-NLS-1$
            21, 1,
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
            out.write("enum type --class ~.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_3_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_3_21.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_include_3_21.setTagInfo(_td_c_include_3_21);
            _jettag_c_include_3_21.doStart(context, out);
            _jettag_c_include_3_21.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_95.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_3_95.setTagInfo(_td_c_get_3_95);
            _jettag_c_get_3_95.doStart(context, out);
            _jettag_c_get_3_95.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
            _jettag_c_iterate_4_1.doStart(context, out);
            while (_jettag_c_iterate_4_1.okToProcessBody()) {
                out.write("enum constant --name \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_23.setRuntimeParent(_jettag_c_iterate_4_1);
                _jettag_c_get_5_23.setTagInfo(_td_c_get_5_23);
                _jettag_c_get_5_23.doStart(context, out);
                _jettag_c_get_5_23.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_4_1.handleBodyContent(out);
            }
            _jettag_c_iterate_4_1.doEnd();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
            _jettag_c_setVariable_10_1.doStart(context, out);
            _jettag_c_setVariable_10_1.doEnd();
            out.write("entity --class ~.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_11_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_11_18.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_include_11_18.setTagInfo(_td_c_include_11_18);
            _jettag_c_include_11_18.doStart(context, out);
            _jettag_c_include_11_18.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_92.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_get_11_92.setTagInfo(_td_c_get_11_92);
            _jettag_c_get_11_92.doStart(context, out);
            _jettag_c_get_11_92.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_12_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_if_12_1.setTagInfo(_td_c_if_12_1);
            _jettag_c_if_12_1.doStart(context, out);
            while (_jettag_c_if_12_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_setVariable_13_1.setTagInfo(_td_c_setVariable_13_1);
                _jettag_c_setVariable_13_1.doStart(context, out);
                _jettag_c_setVariable_13_1.doEnd();
                out.write("--extends ~.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_14_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_13.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_include_14_13.setTagInfo(_td_c_include_14_13);
                _jettag_c_include_14_13.doStart(context, out);
                _jettag_c_include_14_13.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_87.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_get_14_87.setTagInfo(_td_c_get_14_87);
                _jettag_c_get_14_87.doStart(context, out);
                _jettag_c_get_14_87.doEnd();
                out.write(NL);         
                _jettag_c_if_12_1.handleBodyContent(out);
            }
            _jettag_c_if_12_1.doEnd();
            RuntimeTagElement _jettag_c_if_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_16_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_if_16_1.setTagInfo(_td_c_if_16_1);
            _jettag_c_if_16_1.doStart(context, out);
            while (_jettag_c_if_16_1.okToProcessBody()) {
                out.write("--abstract");  //$NON-NLS-1$        
                _jettag_c_if_16_1.handleBodyContent(out);
            }
            _jettag_c_if_16_1.doEnd();
            out.write(" --testAutomatically");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_17_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
            _jettag_c_iterate_17_1.doStart(context, out);
            while (_jettag_c_iterate_17_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_18_1.setRuntimeParent(_jettag_c_iterate_17_1);
                _jettag_c_include_18_1.setTagInfo(_td_c_include_18_1);
                _jettag_c_include_18_1.doStart(context, out);
                _jettag_c_include_18_1.doEnd();
                _jettag_c_iterate_17_1.handleBodyContent(out);
            }
            _jettag_c_iterate_17_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_20_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_iterate_20_1.setTagInfo(_td_c_iterate_20_1);
            _jettag_c_iterate_20_1.doStart(context, out);
            while (_jettag_c_iterate_20_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_21_1.setRuntimeParent(_jettag_c_iterate_20_1);
                _jettag_c_include_21_1.setTagInfo(_td_c_include_21_1);
                _jettag_c_include_21_1.doStart(context, out);
                _jettag_c_include_21_1.doEnd();
                _jettag_c_iterate_20_1.handleBodyContent(out);
            }
            _jettag_c_iterate_20_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
    }
}
