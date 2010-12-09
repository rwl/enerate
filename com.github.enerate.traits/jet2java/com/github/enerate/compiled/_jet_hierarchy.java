package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import org.eclipse.jet.xpath.NodeSet;

public class _jet_hierarchy implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_hierarchy() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_3_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$classQueue", //$NON-NLS-1$
                "eClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 3,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClass", //$NON-NLS-1$
                "$ePackage/EClass[@name = $eClassName]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_3 = new TagInfo("c:if", //$NON-NLS-1$
            7, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$definedClasses[contains(., $eClass/eSuperTypes/@name)]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_5 = new TagInfo("c:include", //$NON-NLS-1$
            8, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/class.jet", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_1 = new TagInfo("c:if", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($classQueue) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_1 = new TagInfo("c:include", //$NON-NLS-1$
            22, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/hierarchy.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_1.setRuntimeParent(null);
        _jettag_c_iterate_3_1.setTagInfo(_td_c_iterate_3_1);
        _jettag_c_iterate_3_1.doStart(context, out);
        while (_jettag_c_iterate_3_1.okToProcessBody()) {
            // Get the EClass. 
            RuntimeTagElement _jettag_c_setVariable_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_3.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_setVariable_5_3.setTagInfo(_td_c_setVariable_5_3);
            _jettag_c_setVariable_5_3.doStart(context, out);
            _jettag_c_setVariable_5_3.doEnd();
            // Define the class if its first super class has been defined previously. 
            RuntimeTagElement _jettag_c_if_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_3.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_if_7_3.setTagInfo(_td_c_if_7_3);
            _jettag_c_if_7_3.doStart(context, out);
            while (_jettag_c_if_7_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_8_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_8_5.setRuntimeParent(_jettag_c_if_7_3);
                _jettag_c_include_8_5.setTagInfo(_td_c_include_8_5);
                _jettag_c_include_8_5.doStart(context, out);
                _jettag_c_include_8_5.doEnd();
                out.write(NL);         
        
        String cn = (String)context.getVariable("eClassName");
        NodeSet defined = (NodeSet)context.getVariable("definedClasses");
        NodeSet queue = (NodeSet)context.getVariable("classQueue");
        defined.add( cn );
        queue.remove( cn );
        context.setVariable( "definedClasses", defined );
        context.setVariable( "classQueue", queue );
        
                _jettag_c_if_7_3.handleBodyContent(out);
            }
            _jettag_c_if_7_3.doEnd();
            _jettag_c_iterate_3_1.handleBodyContent(out);
        }
        _jettag_c_iterate_3_1.doEnd();
        RuntimeTagElement _jettag_c_if_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_1.setRuntimeParent(null);
        _jettag_c_if_21_1.setTagInfo(_td_c_if_21_1);
        _jettag_c_if_21_1.doStart(context, out);
        while (_jettag_c_if_21_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_22_1.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_include_22_1.setTagInfo(_td_c_include_22_1);
            _jettag_c_include_22_1.doStart(context, out);
            _jettag_c_include_22_1.doEnd();
            _jettag_c_if_21_1.handleBodyContent(out);
        }
        _jettag_c_if_21_1.doEnd();
    }
}
