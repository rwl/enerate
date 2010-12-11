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
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EEnum) > 0", //$NON-NLS-1$
            } );
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
    private static final TagInfo _td_c_if_9_1 = new TagInfo("c:if", //$NON-NLS-1$
            9, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EClass) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_32 = new TagInfo("c:include", //$NON-NLS-1$
            12, 32,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_106 = new TagInfo("c:get", //$NON-NLS-1$
            12, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_137 = new TagInfo("c:if", //$NON-NLS-1$
            12, 137,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_40 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 40,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/eSuperTypes[1]/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_13_137 = new TagInfo("c:include", //$NON-NLS-1$
            13, 137,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_65 = new TagInfo("c:get", //$NON-NLS-1$
            14, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_118 = new TagInfo("c:if", //$NON-NLS-1$
            14, 118,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_54 = new TagInfo("c:if", //$NON-NLS-1$
            15, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'false'", //$NON-NLS-1$
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
                "templates/attr.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_1 = new TagInfo("c:if", //$NON-NLS-1$
            22, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EClass[count(eReferences) > 0]) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass[count(eReferences) > 0]", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_1 = new TagInfo("c:include", //$NON-NLS-1$
            25, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            out.write("/* Enumerations */");  //$NON-NLS-1$        
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
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
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_9_1.setRuntimeParent(null);
        _jettag_c_if_9_1.setTagInfo(_td_c_if_9_1);
        _jettag_c_if_9_1.doStart(context, out);
        while (_jettag_c_if_9_1.okToProcessBody()) {
            out.write("/* Classes and Attributes */");  //$NON-NLS-1$        
            _jettag_c_if_9_1.handleBodyContent(out);
        }
        _jettag_c_if_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_1.setRuntimeParent(null);
        _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
        _jettag_c_iterate_10_1.doStart(context, out);
        while (_jettag_c_iterate_10_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_11_1.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_setVariable_11_1.setTagInfo(_td_c_setVariable_11_1);
            _jettag_c_setVariable_11_1.doStart(context, out);
            _jettag_c_setVariable_11_1.doEnd();
            out.write("entity --class ~.server.domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_12_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_32); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_12_32.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_include_12_32.setTagInfo(_td_c_include_12_32);
            _jettag_c_include_12_32.doStart(context, out);
            _jettag_c_include_12_32.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_106); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_106.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_get_12_106.setTagInfo(_td_c_get_12_106);
            _jettag_c_get_12_106.doStart(context, out);
            _jettag_c_get_12_106.doEnd();
            RuntimeTagElement _jettag_c_if_12_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_137); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_12_137.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_if_12_137.setTagInfo(_td_c_if_12_137);
            _jettag_c_if_12_137.doStart(context, out);
            while (_jettag_c_if_12_137.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_13_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_40.setRuntimeParent(_jettag_c_if_12_137);
                _jettag_c_setVariable_13_40.setTagInfo(_td_c_setVariable_13_40);
                _jettag_c_setVariable_13_40.doStart(context, out);
                _jettag_c_setVariable_13_40.doEnd();
                out.write(" --extends ~.server.domain.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_13_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_13_137); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_13_137.setRuntimeParent(_jettag_c_if_12_137);
                _jettag_c_include_13_137.setTagInfo(_td_c_include_13_137);
                _jettag_c_include_13_137.doStart(context, out);
                _jettag_c_include_13_137.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_65.setRuntimeParent(_jettag_c_if_12_137);
                _jettag_c_get_14_65.setTagInfo(_td_c_get_14_65);
                _jettag_c_get_14_65.doStart(context, out);
                _jettag_c_get_14_65.doEnd();
                _jettag_c_if_12_137.handleBodyContent(out);
            }
            _jettag_c_if_12_137.doEnd();
            RuntimeTagElement _jettag_c_if_14_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_118); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_14_118.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_if_14_118.setTagInfo(_td_c_if_14_118);
            _jettag_c_if_14_118.doStart(context, out);
            while (_jettag_c_if_14_118.okToProcessBody()) {
                out.write(" --abstract");  //$NON-NLS-1$        
                _jettag_c_if_14_118.handleBodyContent(out);
            }
            _jettag_c_if_14_118.doEnd();
            RuntimeTagElement _jettag_c_if_15_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_15_54.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_if_15_54.setTagInfo(_td_c_if_15_54);
            _jettag_c_if_15_54.doStart(context, out);
            while (_jettag_c_if_15_54.okToProcessBody()) {
                out.write(" --testAutomatically");  //$NON-NLS-1$        
                _jettag_c_if_15_54.handleBodyContent(out);
            }
            _jettag_c_if_15_54.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_17_1.setRuntimeParent(_jettag_c_iterate_10_1);
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
            out.write(NL);         
            _jettag_c_iterate_10_1.handleBodyContent(out);
        }
        _jettag_c_iterate_10_1.doEnd();
        RuntimeTagElement _jettag_c_if_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_22_1.setRuntimeParent(null);
        _jettag_c_if_22_1.setTagInfo(_td_c_if_22_1);
        _jettag_c_if_22_1.doStart(context, out);
        while (_jettag_c_if_22_1.okToProcessBody()) {
            out.write("/* References */");  //$NON-NLS-1$        
            _jettag_c_if_22_1.handleBodyContent(out);
        }
        _jettag_c_if_22_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_1.setRuntimeParent(null);
        _jettag_c_iterate_23_1.setTagInfo(_td_c_iterate_23_1);
        _jettag_c_iterate_23_1.doStart(context, out);
        while (_jettag_c_iterate_23_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_24_1.setRuntimeParent(_jettag_c_iterate_23_1);
            _jettag_c_iterate_24_1.setTagInfo(_td_c_iterate_24_1);
            _jettag_c_iterate_24_1.doStart(context, out);
            while (_jettag_c_iterate_24_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_25_1.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_include_25_1.setTagInfo(_td_c_include_25_1);
                _jettag_c_include_25_1.doStart(context, out);
                _jettag_c_include_25_1.doEnd();
                _jettag_c_iterate_24_1.handleBodyContent(out);
            }
            _jettag_c_iterate_24_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_23_1.handleBodyContent(out);
        }
        _jettag_c_iterate_23_1.doEnd();
    }
}
