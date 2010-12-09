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
    
    private static final TagInfo _td_c_choose_3_1 = new TagInfo("c:choose", //$NON-NLS-1$
            3, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_4_1 = new TagInfo("c:when", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eSubpackages) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_6_3 = new TagInfo("ws:file", //$NON-NLS-1$
            6, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/module.jet", //$NON-NLS-1$
                "{$ePackage/@name}.py", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_8_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            8, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_ws_folder_10_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            10, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$ePackage/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_11_5 = new TagInfo("ws:file", //$NON-NLS-1$
            11, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/module.jet", //$NON-NLS-1$
                "__init__.py", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/eSubpackages", //$NON-NLS-1$
                "ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_7 = new TagInfo("c:include", //$NON-NLS-1$
            14, 7,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_choose_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_3_1.setRuntimeParent(null);
        _jettag_c_choose_3_1.setTagInfo(_td_c_choose_3_1);
        _jettag_c_choose_3_1.doStart(context, out);
        JET2Writer _jettag_c_choose_3_1_saved_out = out;
        while (_jettag_c_choose_3_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_4_1.setRuntimeParent(_jettag_c_choose_3_1);
            _jettag_c_when_4_1.setTagInfo(_td_c_when_4_1);
            _jettag_c_when_4_1.doStart(context, out);
            JET2Writer _jettag_c_when_4_1_saved_out = out;
            while (_jettag_c_when_4_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // ePackages that have no subpackages are written to a Python module. 
                out.write("  ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_6_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_6_3.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_ws_file_6_3.setTagInfo(_td_ws_file_6_3);
                _jettag_ws_file_6_3.doStart(context, out);
                _jettag_ws_file_6_3.doEnd();
                out.write(NL);         
                _jettag_c_when_4_1.handleBodyContent(out);
            }
            out = _jettag_c_when_4_1_saved_out;
            _jettag_c_when_4_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_8_1.setRuntimeParent(_jettag_c_choose_3_1);
            _jettag_c_otherwise_8_1.setTagInfo(_td_c_otherwise_8_1);
            _jettag_c_otherwise_8_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_8_1_saved_out = out;
            while (_jettag_c_otherwise_8_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // An ePackage that has subpackages is written to a Python package. 
                RuntimeTagElement _jettag_ws_folder_10_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_10_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_10_3.setRuntimeParent(_jettag_c_otherwise_8_1);
                _jettag_ws_folder_10_3.setTagInfo(_td_ws_folder_10_3);
                _jettag_ws_folder_10_3.doStart(context, out);
                while (_jettag_ws_folder_10_3.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_11_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_11_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_11_5.setRuntimeParent(_jettag_ws_folder_10_3);
                    _jettag_ws_file_11_5.setTagInfo(_td_ws_file_11_5);
                    _jettag_ws_file_11_5.doStart(context, out);
                    _jettag_ws_file_11_5.doEnd();
                    out.write(NL);         
                    // Pass the subpackages to another package template. 
                    RuntimeTagElement _jettag_c_iterate_13_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_13_5.setRuntimeParent(_jettag_ws_folder_10_3);
                    _jettag_c_iterate_13_5.setTagInfo(_td_c_iterate_13_5);
                    _jettag_c_iterate_13_5.doStart(context, out);
                    while (_jettag_c_iterate_13_5.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_include_14_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_include_14_7.setRuntimeParent(_jettag_c_iterate_13_5);
                        _jettag_c_include_14_7.setTagInfo(_td_c_include_14_7);
                        _jettag_c_include_14_7.doStart(context, out);
                        _jettag_c_include_14_7.doEnd();
                        _jettag_c_iterate_13_5.handleBodyContent(out);
                    }
                    _jettag_c_iterate_13_5.doEnd();
                    _jettag_ws_folder_10_3.handleBodyContent(out);
                }
                _jettag_ws_folder_10_3.doEnd();
                _jettag_c_otherwise_8_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_8_1_saved_out;
            _jettag_c_otherwise_8_1.doEnd();
            _jettag_c_choose_3_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_3_1_saved_out;
        _jettag_c_choose_3_1.doEnd();
    }
}
