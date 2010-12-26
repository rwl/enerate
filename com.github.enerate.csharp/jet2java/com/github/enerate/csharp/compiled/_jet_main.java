package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/annotate.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_20_1 = new TagInfo("ws:project", //$NON-NLS-1$
            20, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_21_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            21, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "src", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//EPackage", //$NON-NLS-1$
                "ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_25_6 = new TagInfo("ws:file", //$NON-NLS-1$
            25, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/class.jet", //$NON-NLS-1$
                "{$eClass/@name}.cs", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EEnum", //$NON-NLS-1$
                "eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_29_6 = new TagInfo("ws:file", //$NON-NLS-1$
            29, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/enum.jet", //$NON-NLS-1$
                "{$eEnum/@name}.cs", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for com.github.enerate.csharp 
        out.write(NL);         
        //
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        //
        //Traverse input model, performing calculations and storing
        //the results as model annotations via c:set tag
        RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_14_1.setRuntimeParent(null);
        _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
        _jettag_c_include_14_1.doStart(context, out);
        _jettag_c_include_14_1.doEnd();
        out.write(NL);         
        //
        //Traverse annotated model, performing text generation actions
        //such as ws:file, ws:folder and ws:project
        RuntimeTagElement _jettag_ws_project_20_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_20_1.setRuntimeParent(null);
        _jettag_ws_project_20_1.setTagInfo(_td_ws_project_20_1);
        _jettag_ws_project_20_1.doStart(context, out);
        while (_jettag_ws_project_20_1.okToProcessBody()) {
            RuntimeTagElement _jettag_ws_folder_21_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_21_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_21_3.setRuntimeParent(_jettag_ws_project_20_1);
            _jettag_ws_folder_21_3.setTagInfo(_td_ws_folder_21_3);
            _jettag_ws_folder_21_3.doStart(context, out);
            while (_jettag_ws_folder_21_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_iterate_22_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_22_5.setRuntimeParent(_jettag_ws_folder_21_3);
                _jettag_c_iterate_22_5.setTagInfo(_td_c_iterate_22_5);
                _jettag_c_iterate_22_5.doStart(context, out);
                while (_jettag_c_iterate_22_5.okToProcessBody()) {
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_iterate_24_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_24_4.setRuntimeParent(_jettag_c_iterate_22_5);
                    _jettag_c_iterate_24_4.setTagInfo(_td_c_iterate_24_4);
                    _jettag_c_iterate_24_4.doStart(context, out);
                    while (_jettag_c_iterate_24_4.okToProcessBody()) {
                        out.write("\t    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_file_25_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_25_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_25_6.setRuntimeParent(_jettag_c_iterate_24_4);
                        _jettag_ws_file_25_6.setTagInfo(_td_ws_file_25_6);
                        _jettag_ws_file_25_6.doStart(context, out);
                        _jettag_ws_file_25_6.doEnd();
                        out.write(NL);         
                        _jettag_c_iterate_24_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_24_4.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_iterate_28_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_28_4.setRuntimeParent(_jettag_c_iterate_22_5);
                    _jettag_c_iterate_28_4.setTagInfo(_td_c_iterate_28_4);
                    _jettag_c_iterate_28_4.doStart(context, out);
                    while (_jettag_c_iterate_28_4.okToProcessBody()) {
                        out.write("\t    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_file_29_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_29_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_29_6.setRuntimeParent(_jettag_c_iterate_28_4);
                        _jettag_ws_file_29_6.setTagInfo(_td_ws_file_29_6);
                        _jettag_ws_file_29_6.doStart(context, out);
                        _jettag_ws_file_29_6.doEnd();
                        out.write(NL);         
                        _jettag_c_iterate_28_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_28_4.doEnd();
                    out.write(NL);         
                    // <c:iterate select="$ePackage/EDataType" var="eDataType">
                    //	    <ws:file template="templates/datatype.jet" path="{$eDataType/@name}.cs"/>
                    //	  </c:iterate> 
                    out.write(NL);         
                    _jettag_c_iterate_22_5.handleBodyContent(out);
                }
                _jettag_c_iterate_22_5.doEnd();
                _jettag_ws_folder_21_3.handleBodyContent(out);
            }
            _jettag_ws_folder_21_3.doEnd();
            _jettag_ws_project_20_1.handleBodyContent(out);
        }
        _jettag_ws_project_20_1.doEnd();
    }
}
