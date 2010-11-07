package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_package implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_package() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_folder_3_1 = new TagInfo("ws:folder", //$NON-NLS-1$
            3, 1,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$ePackage/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_5_3 = new TagInfo("ws:file", //$NON-NLS-1$
            5, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/init.jet", //$NON-NLS-1$
                "__init__.py", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_9_5 = new TagInfo("ws:file", //$NON-NLS-1$
            9, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/module.jet", //$NON-NLS-1$
                "{$eClass/@name}.py", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/eSubpackages", //$NON-NLS-1$
                "ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_5 = new TagInfo("c:include", //$NON-NLS-1$
            14, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_ws_folder_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_folder_3_1.setRuntimeParent(null);
        _jettag_ws_folder_3_1.setTagInfo(_td_ws_folder_3_1);
        _jettag_ws_folder_3_1.doStart(context, out);
        while (_jettag_ws_folder_3_1.okToProcessBody()) {
            // Create an __init__.py file for the package containing any defined EEnum/EDataType. 
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_5_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_5_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_5_3.setRuntimeParent(_jettag_ws_folder_3_1);
            _jettag_ws_file_5_3.setTagInfo(_td_ws_file_5_3);
            _jettag_ws_file_5_3.doStart(context, out);
            _jettag_ws_file_5_3.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Create one module per class. 
            RuntimeTagElement _jettag_c_iterate_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_8_3.setRuntimeParent(_jettag_ws_folder_3_1);
            _jettag_c_iterate_8_3.setTagInfo(_td_c_iterate_8_3);
            _jettag_c_iterate_8_3.doStart(context, out);
            while (_jettag_c_iterate_8_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_9_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_9_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_9_5.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_ws_file_9_5.setTagInfo(_td_ws_file_9_5);
                _jettag_ws_file_9_5.doStart(context, out);
                _jettag_ws_file_9_5.doEnd();
                out.write(NL);         
                _jettag_c_iterate_8_3.handleBodyContent(out);
            }
            _jettag_c_iterate_8_3.doEnd();
            out.write(NL);         
            // Recursively call the package template with any subpackages. 
            RuntimeTagElement _jettag_c_iterate_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_13_3.setRuntimeParent(_jettag_ws_folder_3_1);
            _jettag_c_iterate_13_3.setTagInfo(_td_c_iterate_13_3);
            _jettag_c_iterate_13_3.doStart(context, out);
            while (_jettag_c_iterate_13_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_14_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_5.setRuntimeParent(_jettag_c_iterate_13_3);
                _jettag_c_include_14_5.setTagInfo(_td_c_include_14_5);
                _jettag_c_include_14_5.doStart(context, out);
                _jettag_c_include_14_5.doEnd();
                _jettag_c_iterate_13_3.handleBodyContent(out);
            }
            _jettag_c_iterate_13_3.doEnd();
            _jettag_ws_folder_3_1.handleBodyContent(out);
        }
        _jettag_ws_folder_3_1.doEnd();
    }
}
