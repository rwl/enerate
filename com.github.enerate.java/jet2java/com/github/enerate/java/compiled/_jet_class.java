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
    
    private static final TagInfo _td_java_format_3_1 = new TagInfo("java:format", //$NON-NLS-1$
            3, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_importsLocation_7_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            7, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "{$eClass/ePackage/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_1 = new TagInfo("java:import", //$NON-NLS-1$
            9, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_43 = new TagInfo("c:get", //$NON-NLS-1$
            9, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // the class template 
        out.write("/* Copyright (C) 2010 Richard Lincoln */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_3_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_3_1.setRuntimeParent(null);
        _jettag_java_format_3_1.setTagInfo(_td_java_format_3_1);
        _jettag_java_format_3_1.doStart(context, out);
        JET2Writer _jettag_java_format_3_1_saved_out = out;
        while (_jettag_java_format_3_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("package org.example;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            // setup location for automatical import statement insertion 
            RuntimeTagElement _jettag_java_importsLocation_7_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_importsLocation_7_1.setRuntimeParent(_jettag_java_format_3_1);
            _jettag_java_importsLocation_7_1.setTagInfo(_td_java_importsLocation_7_1);
            _jettag_java_importsLocation_7_1.doStart(context, out);
            _jettag_java_importsLocation_7_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_java_import_9_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_9_1.setRuntimeParent(_jettag_java_format_3_1);
            _jettag_java_import_9_1.setTagInfo(_td_java_import_9_1);
            _jettag_java_import_9_1.doStart(context, out);
            JET2Writer _jettag_java_import_9_1_saved_out = out;
            while (_jettag_java_import_9_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("java.util.List");  //$NON-NLS-1$        
                _jettag_java_import_9_1.handleBodyContent(out);
            }
            out = _jettag_java_import_9_1_saved_out;
            _jettag_java_import_9_1.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_43); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_43.setRuntimeParent(_jettag_java_format_3_1);
            _jettag_c_get_9_43.setTagInfo(_td_c_get_9_43);
            _jettag_c_get_9_43.doStart(context, out);
            _jettag_c_get_9_43.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            _jettag_java_format_3_1.handleBodyContent(out);
        }
        out = _jettag_java_format_3_1_saved_out;
        _jettag_java_format_3_1.doEnd();
        out.write(NL);         
    }
}
