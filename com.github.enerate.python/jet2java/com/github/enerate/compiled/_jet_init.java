package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_init implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_init() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_2_1 = new TagInfo("c:include", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_1 = new TagInfo("c:if", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 4,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_56 = new TagInfo("c:include", //$NON-NLS-1$
            5, 56,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
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
    private static final TagInfo _td_c_include_11_6 = new TagInfo("c:include", //$NON-NLS-1$
            11, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_80 = new TagInfo("c:get", //$NON-NLS-1$
            11, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_119 = new TagInfo("c:get", //$NON-NLS-1$
            11, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_10 = new TagInfo("c:get", //$NON-NLS-1$
            14, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_13 = new TagInfo("c:get", //$NON-NLS-1$
            15, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_1 = new TagInfo("c:if", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations[@source='http://www.pycim.com/PyCIM']/details[@key='mapPackage' and @value='true']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_1 = new TagInfo("c:include", //$NON-NLS-1$
            18, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/map.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EEnum", //$NON-NLS-1$
                "eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_1 = new TagInfo("c:include", //$NON-NLS-1$
            23, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/datatype.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EDataType", //$NON-NLS-1$
                "eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_27_1 = new TagInfo("c:include", //$NON-NLS-1$
            27, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/datatype.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_1.setRuntimeParent(null);
        _jettag_c_if_4_1.setTagInfo(_td_c_if_4_1);
        _jettag_c_if_4_1.doStart(context, out);
        while (_jettag_c_if_4_1.okToProcessBody()) {
            out.write("\"\"\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_5_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_4.setRuntimeParent(_jettag_c_if_4_1);
            _jettag_c_setVariable_5_4.setTagInfo(_td_c_setVariable_5_4);
            _jettag_c_setVariable_5_4.doStart(context, out);
            _jettag_c_setVariable_5_4.doEnd();
            RuntimeTagElement _jettag_c_include_5_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_5_56.setRuntimeParent(_jettag_c_if_4_1);
            _jettag_c_include_5_56.setTagInfo(_td_c_include_5_56);
            _jettag_c_include_5_56.doStart(context, out);
            _jettag_c_include_5_56.doEnd();
            out.write(NL);         
            out.write("\"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_4_1.handleBodyContent(out);
        }
        _jettag_c_if_4_1.doEnd();
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
            out.write("from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_11_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_11_6.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_include_11_6.setTagInfo(_td_c_include_11_6);
            _jettag_c_include_11_6.doStart(context, out);
            _jettag_c_include_11_6.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_80); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_80.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_get_11_80.setTagInfo(_td_c_get_11_80);
            _jettag_c_get_11_80.doStart(context, out);
            _jettag_c_get_11_80.doEnd();
            out.write(" import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_119); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_119.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_get_11_119.setTagInfo(_td_c_get_11_119);
            _jettag_c_get_11_119.doStart(context, out);
            _jettag_c_get_11_119.doEnd();
            out.write(NL);         
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
        out.write(NL);         
        out.write("nsURI = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_10.setRuntimeParent(null);
        _jettag_c_get_14_10.setTagInfo(_td_c_get_14_10);
        _jettag_c_get_14_10.doStart(context, out);
        _jettag_c_get_14_10.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("nsPrefix = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_13.setRuntimeParent(null);
        _jettag_c_get_15_13.setTagInfo(_td_c_get_15_13);
        _jettag_c_get_15_13.doStart(context, out);
        _jettag_c_get_15_13.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_16_1.setRuntimeParent(null);
        _jettag_c_if_16_1.setTagInfo(_td_c_if_16_1);
        _jettag_c_if_16_1.doStart(context, out);
        while (_jettag_c_if_16_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_18_1.setRuntimeParent(_jettag_c_if_16_1);
            _jettag_c_include_18_1.setTagInfo(_td_c_include_18_1);
            _jettag_c_include_18_1.doStart(context, out);
            _jettag_c_include_18_1.doEnd();
            _jettag_c_if_16_1.handleBodyContent(out);
        }
        _jettag_c_if_16_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_21_1.setRuntimeParent(null);
        _jettag_c_iterate_21_1.setTagInfo(_td_c_iterate_21_1);
        _jettag_c_iterate_21_1.doStart(context, out);
        while (_jettag_c_iterate_21_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_23_1.setRuntimeParent(_jettag_c_iterate_21_1);
            _jettag_c_include_23_1.setTagInfo(_td_c_include_23_1);
            _jettag_c_include_23_1.doStart(context, out);
            _jettag_c_include_23_1.doEnd();
            _jettag_c_iterate_21_1.handleBodyContent(out);
        }
        _jettag_c_iterate_21_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_1.setRuntimeParent(null);
        _jettag_c_iterate_25_1.setTagInfo(_td_c_iterate_25_1);
        _jettag_c_iterate_25_1.doStart(context, out);
        while (_jettag_c_iterate_25_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_27_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_27_1.setRuntimeParent(_jettag_c_iterate_25_1);
            _jettag_c_include_27_1.setTagInfo(_td_c_include_27_1);
            _jettag_c_include_27_1.doStart(context, out);
            _jettag_c_include_27_1.doEnd();
            _jettag_c_iterate_25_1.handleBodyContent(out);
        }
        _jettag_c_iterate_25_1.doEnd();
    }
}
