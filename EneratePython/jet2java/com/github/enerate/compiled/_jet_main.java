package com.github.enerate.compiled;

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
    
    private static final TagInfo _td_c_setVariable_11_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "ePackage", //$NON-NLS-1$
                "/contents", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_12_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            12, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClasses", //$NON-NLS-1$
                "$ePackage//EClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_14_1 = new TagInfo("ws:project", //$NON-NLS-1$
            14, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_3 = new TagInfo("c:include", //$NON-NLS-1$
            15, 3,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for com.github.enerate 
        out.write(NL);         
        //
        //TODO: traverse input model, performing calculations and storing
        //the results as model annotations via c:set tag
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_11_1.setRuntimeParent(null);
        _jettag_c_setVariable_11_1.setTagInfo(_td_c_setVariable_11_1);
        _jettag_c_setVariable_11_1.doStart(context, out);
        _jettag_c_setVariable_11_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_12_1.setRuntimeParent(null);
        _jettag_c_setVariable_12_1.setTagInfo(_td_c_setVariable_12_1);
        _jettag_c_setVariable_12_1.doStart(context, out);
        _jettag_c_setVariable_12_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_14_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_14_1.setRuntimeParent(null);
        _jettag_ws_project_14_1.setTagInfo(_td_ws_project_14_1);
        _jettag_ws_project_14_1.doStart(context, out);
        while (_jettag_ws_project_14_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_15_3.setRuntimeParent(_jettag_ws_project_14_1);
            _jettag_c_include_15_3.setTagInfo(_td_c_include_15_3);
            _jettag_c_include_15_3.doStart(context, out);
            _jettag_c_include_15_3.doEnd();
            out.write(NL);         
            _jettag_ws_project_14_1.handleBodyContent(out);
        }
        _jettag_ws_project_14_1.doEnd();
    }
}
