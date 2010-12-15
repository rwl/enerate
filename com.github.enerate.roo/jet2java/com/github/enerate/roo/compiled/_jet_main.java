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
    private static final TagInfo _td_ws_project_18_1 = new TagInfo("ws:project", //$NON-NLS-1$
            18, 1,
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
                "templates/root.jet", //$NON-NLS-1$
                "{$ePackage/@name}.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_3 = new TagInfo("c:if", //$NON-NLS-1$
            22, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EEnum) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_23_5 = new TagInfo("ws:file", //$NON-NLS-1$
            23, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/enums.jet", //$NON-NLS-1$
                "{$ePackage/@name}-enums.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_3 = new TagInfo("c:if", //$NON-NLS-1$
            26, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EClass[count(eSuperTypes) = 0]) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_27_5 = new TagInfo("ws:file", //$NON-NLS-1$
            27, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/classes.jet", //$NON-NLS-1$
                "{$ePackage/@name}-classes.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_3 = new TagInfo("c:if", //$NON-NLS-1$
            29, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EClass[count(eSuperTypes) > 0]) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_30_5 = new TagInfo("ws:file", //$NON-NLS-1$
            30, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/subclasses.jet", //$NON-NLS-1$
                "{$ePackage/@name}-subclasses.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_3 = new TagInfo("c:if", //$NON-NLS-1$
            33, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EAttribute) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_34_5 = new TagInfo("ws:file", //$NON-NLS-1$
            34, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/attributes.jet", //$NON-NLS-1$
                "{$ePackage/@name}-attributes.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_37_3 = new TagInfo("c:if", //$NON-NLS-1$
            37, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EReference[@many='false']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_38_5 = new TagInfo("ws:file", //$NON-NLS-1$
            38, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/references.jet", //$NON-NLS-1$
                "{$ePackage/@name}-references.roo", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_3 = new TagInfo("c:if", //$NON-NLS-1$
            41, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EReference[@many='true']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_42_5 = new TagInfo("ws:file", //$NON-NLS-1$
            42, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/sets.jet", //$NON-NLS-1$
                "{$ePackage/@name}-sets.roo", //$NON-NLS-1$
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
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_18_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_18_1.setRuntimeParent(null);
        _jettag_ws_project_18_1.setTagInfo(_td_ws_project_18_1);
        _jettag_ws_project_18_1.doStart(context, out);
        while (_jettag_ws_project_18_1.okToProcessBody()) {
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_20_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_20_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_20_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_ws_file_20_3.setTagInfo(_td_ws_file_20_3);
            _jettag_ws_file_20_3.doStart(context, out);
            _jettag_ws_file_20_3.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_22_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_22_3.setTagInfo(_td_c_if_22_3);
            _jettag_c_if_22_3.doStart(context, out);
            while (_jettag_c_if_22_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_23_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_23_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_23_5.setRuntimeParent(_jettag_c_if_22_3);
                _jettag_ws_file_23_5.setTagInfo(_td_ws_file_23_5);
                _jettag_ws_file_23_5.doStart(context, out);
                _jettag_ws_file_23_5.doEnd();
                out.write(NL);         
                _jettag_c_if_22_3.handleBodyContent(out);
            }
            _jettag_c_if_22_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_26_3.setTagInfo(_td_c_if_26_3);
            _jettag_c_if_26_3.doStart(context, out);
            while (_jettag_c_if_26_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_27_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_27_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_27_5.setRuntimeParent(_jettag_c_if_26_3);
                _jettag_ws_file_27_5.setTagInfo(_td_ws_file_27_5);
                _jettag_ws_file_27_5.doStart(context, out);
                _jettag_ws_file_27_5.doEnd();
                out.write(NL);         
                _jettag_c_if_26_3.handleBodyContent(out);
            }
            _jettag_c_if_26_3.doEnd();
            RuntimeTagElement _jettag_c_if_29_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_29_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_29_3.setTagInfo(_td_c_if_29_3);
            _jettag_c_if_29_3.doStart(context, out);
            while (_jettag_c_if_29_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_30_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_30_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_30_5.setRuntimeParent(_jettag_c_if_29_3);
                _jettag_ws_file_30_5.setTagInfo(_td_ws_file_30_5);
                _jettag_ws_file_30_5.doStart(context, out);
                _jettag_ws_file_30_5.doEnd();
                out.write(NL);         
                _jettag_c_if_29_3.handleBodyContent(out);
            }
            _jettag_c_if_29_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_33_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_33_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_33_3.setTagInfo(_td_c_if_33_3);
            _jettag_c_if_33_3.doStart(context, out);
            while (_jettag_c_if_33_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_34_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_34_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_34_5.setRuntimeParent(_jettag_c_if_33_3);
                _jettag_ws_file_34_5.setTagInfo(_td_ws_file_34_5);
                _jettag_ws_file_34_5.doStart(context, out);
                _jettag_ws_file_34_5.doEnd();
                out.write(NL);         
                _jettag_c_if_33_3.handleBodyContent(out);
            }
            _jettag_c_if_33_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_37_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_37_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_37_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_37_3.setTagInfo(_td_c_if_37_3);
            _jettag_c_if_37_3.doStart(context, out);
            while (_jettag_c_if_37_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_38_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_38_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_38_5.setRuntimeParent(_jettag_c_if_37_3);
                _jettag_ws_file_38_5.setTagInfo(_td_ws_file_38_5);
                _jettag_ws_file_38_5.doStart(context, out);
                _jettag_ws_file_38_5.doEnd();
                out.write(NL);         
                _jettag_c_if_37_3.handleBodyContent(out);
            }
            _jettag_c_if_37_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_3.setRuntimeParent(_jettag_ws_project_18_1);
            _jettag_c_if_41_3.setTagInfo(_td_c_if_41_3);
            _jettag_c_if_41_3.doStart(context, out);
            while (_jettag_c_if_41_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_42_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_42_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_42_5.setRuntimeParent(_jettag_c_if_41_3);
                _jettag_ws_file_42_5.setTagInfo(_td_ws_file_42_5);
                _jettag_ws_file_42_5.doStart(context, out);
                _jettag_ws_file_42_5.doEnd();
                out.write(NL);         
                _jettag_c_if_41_3.handleBodyContent(out);
            }
            _jettag_c_if_41_3.doEnd();
            out.write(NL);         
            _jettag_ws_project_18_1.handleBodyContent(out);
        }
        _jettag_ws_project_18_1.doEnd();
    }
}
