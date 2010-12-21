package com.github.enerate.java.compiled;

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
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "ePackage", //$NON-NLS-1$
                "/contents", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClasses", //$NON-NLS-1$
                "$ePackage//EClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_24_1 = new TagInfo("ws:project", //$NON-NLS-1$
            24, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_1 = new TagInfo("c:include", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for com.github.enerate.java 
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
        RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_10_1.setRuntimeParent(null);
        _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
        _jettag_c_setVariable_10_1.doStart(context, out);
        _jettag_c_setVariable_10_1.doEnd();
        out.write(NL);         
        //
        //TODO: traverse input model, performing calculations and storing
        //the results as model annotations via c:set tag
        out.write(NL);         
        out.write(NL);         
        //
        //Traverse annotated model, performing text generation actions
        //such as ws:file, ws:folder and ws:project
        RuntimeTagElement _jettag_c_setVariable_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_22_1.setRuntimeParent(null);
        _jettag_c_setVariable_22_1.setTagInfo(_td_c_setVariable_22_1);
        _jettag_c_setVariable_22_1.doStart(context, out);
        _jettag_c_setVariable_22_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_24_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_24_1.setRuntimeParent(null);
        _jettag_ws_project_24_1.setTagInfo(_td_ws_project_24_1);
        _jettag_ws_project_24_1.doStart(context, out);
        while (_jettag_ws_project_24_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_26_1.setRuntimeParent(_jettag_ws_project_24_1);
            _jettag_c_include_26_1.setTagInfo(_td_c_include_26_1);
            _jettag_c_include_26_1.doStart(context, out);
            _jettag_c_include_26_1.doEnd();
            out.write(NL);         
            // <c:iterate select="$ePackage/eSubpackages" var="ePackage">
            //  <c:include template="templates/package.jet"/>
            //</c:iterate> 
            out.write(NL);         
            _jettag_ws_project_24_1.handleBodyContent(out);
        }
        _jettag_ws_project_24_1.doEnd();
        out.write(NL);         
    }
}
