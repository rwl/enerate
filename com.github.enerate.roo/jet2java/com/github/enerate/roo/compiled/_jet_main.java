package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_9_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "ePackage", //$NON-NLS-1$
                "/contents", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClasses", //$NON-NLS-1$
                "$ePackage//EClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_19_1 = new TagInfo("ws:project", //$NON-NLS-1$
            19, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_20_3 = new TagInfo("ws:file", //$NON-NLS-1$
            20, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/script.jet", //$NON-NLS-1$
                "{$ePackage/@name}.roo", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for com.github.enerate.roo 
        out.write(NL);         
        //
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_9_1.setRuntimeParent(null);
        _jettag_c_setVariable_9_1.setTagInfo(_td_c_setVariable_9_1);
        _jettag_c_setVariable_9_1.doStart(context, out);
        _jettag_c_setVariable_9_1.doEnd();
        out.write(NL);         
        //
        //TODO: traverse input model, performing calculations and storing
        //the results as model annotations via c:set tag
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_16_1.setRuntimeParent(null);
        _jettag_c_setVariable_16_1.setTagInfo(_td_c_setVariable_16_1);
        _jettag_c_setVariable_16_1.doStart(context, out);
        _jettag_c_setVariable_16_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_17_1.setRuntimeParent(null);
        _jettag_c_setVariable_17_1.setTagInfo(_td_c_setVariable_17_1);
        _jettag_c_setVariable_17_1.doStart(context, out);
        _jettag_c_setVariable_17_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_19_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_19_1.setRuntimeParent(null);
        _jettag_ws_project_19_1.setTagInfo(_td_ws_project_19_1);
        _jettag_ws_project_19_1.doStart(context, out);
        while (_jettag_ws_project_19_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_20_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_20_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_20_3.setRuntimeParent(_jettag_ws_project_19_1);
            _jettag_ws_file_20_3.setTagInfo(_td_ws_file_20_3);
            _jettag_ws_file_20_3.doStart(context, out);
            _jettag_ws_file_20_3.doEnd();
            out.write(NL);         
            _jettag_ws_project_19_1.handleBodyContent(out);
        }
        _jettag_ws_project_19_1.doEnd();
    }
}
