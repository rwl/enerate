package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_view implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_view() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "nAttributes", //$NON-NLS-1$
                "count($eClass/eAllAttributes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "nReferences", //$NON-NLS-1$
                "count($eClass/eAllReferences)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_13 = new TagInfo("c:if", //$NON-NLS-1$
            7, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllAttributes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_67 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 67,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllAttributes)", //$NON-NLS-1$
                "eAttributeIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_138 = new TagInfo("c:get", //$NON-NLS-1$
            7, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAllAttributes[$eAttributeIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_201 = new TagInfo("c:if", //$NON-NLS-1$
            7, 201,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttributeIdx != count($eClass/eAllAttributes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_35 = new TagInfo("c:if", //$NON-NLS-1$
            8, 35,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllAttributes) > 12", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_20 = new TagInfo("c:if", //$NON-NLS-1$
            9, 20,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllReferences) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_74 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 74,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllReferences)", //$NON-NLS-1$
                "eReferenceIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_145 = new TagInfo("c:get", //$NON-NLS-1$
            9, 145,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAllReferences[$eReferenceIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_208 = new TagInfo("c:if", //$NON-NLS-1$
            9, 208,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReferenceIdx != count($eClass/eAllReferences)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_35 = new TagInfo("c:if", //$NON-NLS-1$
            10, 35,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllReferences) > 10", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_13 = new TagInfo("c:include", //$NON-NLS-1$
            12, 13,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_87 = new TagInfo("c:get", //$NON-NLS-1$
            12, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_16 = new TagInfo("c:get", //$NON-NLS-1$
            13, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_1.setRuntimeParent(null);
        _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
        _jettag_c_setVariable_2_1.doStart(context, out);
        _jettag_c_setVariable_2_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_1.setRuntimeParent(null);
        _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
        _jettag_c_setVariable_3_1.doStart(context, out);
        _jettag_c_setVariable_3_1.doEnd();
 Integer na = (Integer)context.getVariable("nAttributes"); 
 Integer nr = (Integer)context.getVariable("nReferences"); 
        out.write("View(Tabbed(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_7_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_7_13.setRuntimeParent(null);
        _jettag_c_if_7_13.setTagInfo(_td_c_if_7_13);
        _jettag_c_if_7_13.doStart(context, out);
        while (_jettag_c_if_7_13.okToProcessBody()) {
            out.write("VGroup(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_7_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_67); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_7_67.setRuntimeParent(_jettag_c_if_7_13);
            _jettag_c_iterate_7_67.setTagInfo(_td_c_iterate_7_67);
            _jettag_c_iterate_7_67.doStart(context, out);
            while (_jettag_c_iterate_7_67.okToProcessBody()) {
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_138.setRuntimeParent(_jettag_c_iterate_7_67);
                _jettag_c_get_7_138.setTagInfo(_td_c_get_7_138);
                _jettag_c_get_7_138.doStart(context, out);
                _jettag_c_get_7_138.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_7_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_201); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_201.setRuntimeParent(_jettag_c_iterate_7_67);
                _jettag_c_if_7_201.setTagInfo(_td_c_if_7_201);
                _jettag_c_if_7_201.doStart(context, out);
                while (_jettag_c_if_7_201.okToProcessBody()) {
                    out.write(", ");  //$NON-NLS-1$        
                    _jettag_c_if_7_201.handleBodyContent(out);
                }
                _jettag_c_if_7_201.doEnd();
                _jettag_c_iterate_7_67.handleBodyContent(out);
            }
            _jettag_c_iterate_7_67.doEnd();
            out.write(",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                label=\"Attributes\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_8_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_35.setRuntimeParent(_jettag_c_if_7_13);
            _jettag_c_if_8_35.setTagInfo(_td_c_if_8_35);
            _jettag_c_if_8_35.doStart(context, out);
            while (_jettag_c_if_8_35.okToProcessBody()) {
                out.write(", columns=");  //$NON-NLS-1$        
                out.write( na/12 );
                _jettag_c_if_8_35.handleBodyContent(out);
            }
            _jettag_c_if_8_35.doEnd();
            out.write("),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            ");  //$NON-NLS-1$        
            _jettag_c_if_7_13.handleBodyContent(out);
        }
        _jettag_c_if_7_13.doEnd();
        RuntimeTagElement _jettag_c_if_9_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_9_20.setRuntimeParent(null);
        _jettag_c_if_9_20.setTagInfo(_td_c_if_9_20);
        _jettag_c_if_9_20.doStart(context, out);
        while (_jettag_c_if_9_20.okToProcessBody()) {
            out.write("VGroup(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_9_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_74); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_9_74.setRuntimeParent(_jettag_c_if_9_20);
            _jettag_c_iterate_9_74.setTagInfo(_td_c_iterate_9_74);
            _jettag_c_iterate_9_74.doStart(context, out);
            while (_jettag_c_iterate_9_74.okToProcessBody()) {
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_145 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_145); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_145.setRuntimeParent(_jettag_c_iterate_9_74);
                _jettag_c_get_9_145.setTagInfo(_td_c_get_9_145);
                _jettag_c_get_9_145.doStart(context, out);
                _jettag_c_get_9_145.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_9_208 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_208); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_208.setRuntimeParent(_jettag_c_iterate_9_74);
                _jettag_c_if_9_208.setTagInfo(_td_c_if_9_208);
                _jettag_c_if_9_208.doStart(context, out);
                while (_jettag_c_if_9_208.okToProcessBody()) {
                    out.write(", ");  //$NON-NLS-1$        
                    _jettag_c_if_9_208.handleBodyContent(out);
                }
                _jettag_c_if_9_208.doEnd();
                _jettag_c_iterate_9_74.handleBodyContent(out);
            }
            _jettag_c_iterate_9_74.doEnd();
            out.write(",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("                label=\"References\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_10_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_35.setRuntimeParent(_jettag_c_if_9_20);
            _jettag_c_if_10_35.setTagInfo(_td_c_if_10_35);
            _jettag_c_if_10_35.doStart(context, out);
            while (_jettag_c_if_10_35.okToProcessBody()) {
                out.write(", columns=");  //$NON-NLS-1$        
                out.write( nr/10 );
                _jettag_c_if_10_35.handleBodyContent(out);
            }
            _jettag_c_if_10_35.doEnd();
            out.write("),");  //$NON-NLS-1$        
            _jettag_c_if_9_20.handleBodyContent(out);
        }
        _jettag_c_if_9_20.doEnd();
        out.write(NL);         
        out.write("            dock=\"tab\"),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        id=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_12_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_12_13.setRuntimeParent(null);
        _jettag_c_include_12_13.setTagInfo(_td_c_include_12_13);
        _jettag_c_include_12_13.doStart(context, out);
        _jettag_c_include_12_13.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_87.setRuntimeParent(null);
        _jettag_c_get_12_87.setTagInfo(_td_c_get_12_87);
        _jettag_c_get_12_87.doStart(context, out);
        _jettag_c_get_12_87.doEnd();
        out.write("\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        title=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_16.setRuntimeParent(null);
        _jettag_c_get_13_16.setTagInfo(_td_c_get_13_16);
        _jettag_c_get_13_16.doStart(context, out);
        _jettag_c_get_13_16.doEnd();
        out.write("\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        buttons=[\"OK\", \"Cancel\", \"Help\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        resizable=False)");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
