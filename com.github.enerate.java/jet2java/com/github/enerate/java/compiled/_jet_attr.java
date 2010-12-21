package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attr implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_attr() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_1_9 = new TagInfo("c:choose", //$NON-NLS-1$
            1, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_2_1 = new TagInfo("c:when", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_1 = new TagInfo("java:import", //$NON-NLS-1$
            3, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_14 = new TagInfo("c:get", //$NON-NLS-1$
            3, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_4_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            4, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_5_1 = new TagInfo("java:import", //$NON-NLS-1$
            5, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_14 = new TagInfo("c:get", //$NON-NLS-1$
            5, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_13 = new TagInfo("c:get", //$NON-NLS-1$
            6, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("private ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_1_9.setRuntimeParent(null);
        _jettag_c_choose_1_9.setTagInfo(_td_c_choose_1_9);
        _jettag_c_choose_1_9.doStart(context, out);
        JET2Writer _jettag_c_choose_1_9_saved_out = out;
        while (_jettag_c_choose_1_9.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_2_1.setRuntimeParent(_jettag_c_choose_1_9);
            _jettag_c_when_2_1.setTagInfo(_td_c_when_2_1);
            _jettag_c_when_2_1.doStart(context, out);
            JET2Writer _jettag_c_when_2_1_saved_out = out;
            while (_jettag_c_when_2_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Enum 
                RuntimeTagElement _jettag_java_import_3_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_3_1.setRuntimeParent(_jettag_c_when_2_1);
                _jettag_java_import_3_1.setTagInfo(_td_java_import_3_1);
                _jettag_java_import_3_1.doStart(context, out);
                JET2Writer _jettag_java_import_3_1_saved_out = out;
                while (_jettag_java_import_3_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_3_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_3_14.setRuntimeParent(_jettag_java_import_3_1);
                    _jettag_c_get_3_14.setTagInfo(_td_c_get_3_14);
                    _jettag_c_get_3_14.doStart(context, out);
                    _jettag_c_get_3_14.doEnd();
                    _jettag_java_import_3_1.handleBodyContent(out);
                }
                out = _jettag_java_import_3_1_saved_out;
                _jettag_java_import_3_1.doEnd();
                _jettag_c_when_2_1.handleBodyContent(out);
            }
            out = _jettag_c_when_2_1_saved_out;
            _jettag_c_when_2_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_otherwise_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_4_1.setRuntimeParent(_jettag_c_choose_1_9);
            _jettag_c_otherwise_4_1.setTagInfo(_td_c_otherwise_4_1);
            _jettag_c_otherwise_4_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_4_1_saved_out = out;
            while (_jettag_c_otherwise_4_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_java_import_5_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_5_1.setRuntimeParent(_jettag_c_otherwise_4_1);
                _jettag_java_import_5_1.setTagInfo(_td_java_import_5_1);
                _jettag_java_import_5_1.doStart(context, out);
                JET2Writer _jettag_java_import_5_1_saved_out = out;
                while (_jettag_java_import_5_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_5_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_14.setRuntimeParent(_jettag_java_import_5_1);
                    _jettag_c_get_5_14.setTagInfo(_td_c_get_5_14);
                    _jettag_c_get_5_14.doStart(context, out);
                    _jettag_c_get_5_14.doEnd();
                    _jettag_java_import_5_1.handleBodyContent(out);
                }
                out = _jettag_java_import_5_1_saved_out;
                _jettag_java_import_5_1.doEnd();
                _jettag_c_otherwise_4_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_4_1_saved_out;
            _jettag_c_otherwise_4_1.doEnd();
            out.write(NL);         
            _jettag_c_choose_1_9.handleBodyContent(out);
        }
        out = _jettag_c_choose_1_9_saved_out;
        _jettag_c_choose_1_9.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_13.setRuntimeParent(null);
        _jettag_c_get_6_13.setTagInfo(_td_c_get_6_13);
        _jettag_c_get_6_13.doStart(context, out);
        _jettag_c_get_6_13.doEnd();
        out.write(";");  //$NON-NLS-1$        
    }
}
