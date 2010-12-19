package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_class implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_class() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_format_2_1 = new TagInfo("java:format", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_importsLocation_6_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            6, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "org.example", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_1 = new TagInfo("java:import", //$NON-NLS-1$
            8, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_43 = new TagInfo("c:get", //$NON-NLS-1$
            8, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // the class template 
        RuntimeTagElement _jettag_java_format_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_2_1.setRuntimeParent(null);
        _jettag_java_format_2_1.setTagInfo(_td_java_format_2_1);
        _jettag_java_format_2_1.doStart(context, out);
        JET2Writer _jettag_java_format_2_1_saved_out = out;
        while (_jettag_java_format_2_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("package org.example;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            // setup location for automatical import statement insertion 
            RuntimeTagElement _jettag_java_importsLocation_6_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_importsLocation_6_1.setRuntimeParent(_jettag_java_format_2_1);
            _jettag_java_importsLocation_6_1.setTagInfo(_td_java_importsLocation_6_1);
            _jettag_java_importsLocation_6_1.doStart(context, out);
            _jettag_java_importsLocation_6_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_java_import_8_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_8_1.setRuntimeParent(_jettag_java_format_2_1);
            _jettag_java_import_8_1.setTagInfo(_td_java_import_8_1);
            _jettag_java_import_8_1.doStart(context, out);
            JET2Writer _jettag_java_import_8_1_saved_out = out;
            while (_jettag_java_import_8_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("java.util.List");  //$NON-NLS-1$        
                _jettag_java_import_8_1.handleBodyContent(out);
            }
            out = _jettag_java_import_8_1_saved_out;
            _jettag_java_import_8_1.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_43); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_43.setRuntimeParent(_jettag_java_format_2_1);
            _jettag_c_get_8_43.setTagInfo(_td_c_get_8_43);
            _jettag_c_get_8_43.doStart(context, out);
            _jettag_c_get_8_43.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            _jettag_java_format_2_1.handleBodyContent(out);
        }
        out = _jettag_java_format_2_1_saved_out;
        _jettag_java_format_2_1.doEnd();
        out.write(NL);         
    }
}
