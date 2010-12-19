package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
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
    private static final TagInfo _td_c_setVariable_20_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            20, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClasses", //$NON-NLS-1$
                "$ePackage//EClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_22_1 = new TagInfo("ws:project", //$NON-NLS-1$
            22, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_23_3 = new TagInfo("java:package", //$NON-NLS-1$
            23, 3,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "org.example", //$NON-NLS-1$
                "src", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_26_5 = new TagInfo("java:class", //$NON-NLS-1$
            26, 5,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
                "class.jet", //$NON-NLS-1$
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
        //
        //TODO: traverse input model, performing calculations and storing
        //the results as model annotations via c:set tag
        out.write(NL);         
        out.write(NL);         
        //
        //Traverse annotated model, performing text generation actions
        //such as ws:file, ws:folder and ws:project
        RuntimeTagElement _jettag_c_setVariable_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_20_1.setRuntimeParent(null);
        _jettag_c_setVariable_20_1.setTagInfo(_td_c_setVariable_20_1);
        _jettag_c_setVariable_20_1.doStart(context, out);
        _jettag_c_setVariable_20_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_22_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_22_1.setRuntimeParent(null);
        _jettag_ws_project_22_1.setTagInfo(_td_ws_project_22_1);
        _jettag_ws_project_22_1.doStart(context, out);
        while (_jettag_ws_project_22_1.okToProcessBody()) {
            RuntimeTagElement _jettag_java_package_23_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_23_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_package_23_3.setRuntimeParent(_jettag_ws_project_22_1);
            _jettag_java_package_23_3.setTagInfo(_td_java_package_23_3);
            _jettag_java_package_23_3.doStart(context, out);
            while (_jettag_java_package_23_3.okToProcessBody()) {
                // java:class and java:resource tags here will be relative to org.example 
                RuntimeTagElement _jettag_c_iterate_25_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_25_3.setRuntimeParent(_jettag_java_package_23_3);
                _jettag_c_iterate_25_3.setTagInfo(_td_c_iterate_25_3);
                _jettag_c_iterate_25_3.doStart(context, out);
                while (_jettag_c_iterate_25_3.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_class_26_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_26_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_26_5.setRuntimeParent(_jettag_c_iterate_25_3);
                    _jettag_java_class_26_5.setTagInfo(_td_java_class_26_5);
                    _jettag_java_class_26_5.doStart(context, out);
                    _jettag_java_class_26_5.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_25_3.handleBodyContent(out);
                }
                _jettag_c_iterate_25_3.doEnd();
                _jettag_java_package_23_3.handleBodyContent(out);
            }
            _jettag_java_package_23_3.doEnd();
            _jettag_ws_project_22_1.handleBodyContent(out);
        }
        _jettag_ws_project_22_1.doEnd();
        out.write(NL);         
    }
}
