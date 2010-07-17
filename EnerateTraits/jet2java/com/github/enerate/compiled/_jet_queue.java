package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.NodeSet;

public class _jet_queue implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_queue() {
        super();
    }
    
    private static final TagInfo _td_c_iterate_4_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$nodeQueue", //$NON-NLS-1$
                "eNodeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 3,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eNodeClass", //$NON-NLS-1$
                "$eClasses[@name = $eNodeName]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_3 = new TagInfo("c:if", //$NON-NLS-1$
            8, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$definedNodes[contains(., $eNodeClass/eSuperTypes/@name)]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_1 = new TagInfo("c:if", //$NON-NLS-1$
            20, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($nodeQueue) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_1 = new TagInfo("c:include", //$NON-NLS-1$
            21, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/queue.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_4_1.setRuntimeParent(null);
        _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
        _jettag_c_iterate_4_1.doStart(context, out);
        while (_jettag_c_iterate_4_1.okToProcessBody()) {
            // Get the EClass. 
            RuntimeTagElement _jettag_c_setVariable_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_6_3.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_setVariable_6_3.setTagInfo(_td_c_setVariable_6_3);
            _jettag_c_setVariable_6_3.doStart(context, out);
            _jettag_c_setVariable_6_3.doEnd();
            // Add the class if its first super class has been added previously. 
            RuntimeTagElement _jettag_c_if_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_3.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_if_8_3.setTagInfo(_td_c_if_8_3);
            _jettag_c_if_8_3.doStart(context, out);
            while (_jettag_c_if_8_3.okToProcessBody()) {
        
        String cn = (String)context.getVariable("eNodeName");
        NodeSet defined = (NodeSet)context.getVariable("definedNodes");
        NodeSet queue = (NodeSet)context.getVariable("nodeQueue");
        defined.add( cn );
        queue.remove( cn );
        context.setVariable( "definedNodes", defined );
        context.setVariable( "nodeQueue", queue );
        
                _jettag_c_if_8_3.handleBodyContent(out);
            }
            _jettag_c_if_8_3.doEnd();
            _jettag_c_iterate_4_1.handleBodyContent(out);
        }
        _jettag_c_iterate_4_1.doEnd();
        RuntimeTagElement _jettag_c_if_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_20_1.setRuntimeParent(null);
        _jettag_c_if_20_1.setTagInfo(_td_c_if_20_1);
        _jettag_c_if_20_1.doStart(context, out);
        while (_jettag_c_if_20_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_21_1.setRuntimeParent(_jettag_c_if_20_1);
            _jettag_c_include_21_1.setTagInfo(_td_c_include_21_1);
            _jettag_c_include_21_1.doStart(context, out);
            _jettag_c_include_21_1.doEnd();
            _jettag_c_if_20_1.handleBodyContent(out);
        }
        _jettag_c_if_20_1.doEnd();
    }
}
