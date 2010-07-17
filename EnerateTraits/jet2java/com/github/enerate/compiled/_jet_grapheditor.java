package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_grapheditor implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_grapheditor() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_9_1 = new TagInfo("c:include", //$NON-NLS-1$
            9, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_32 = new TagInfo("c:get", //$NON-NLS-1$
            12, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_31_6 = new TagInfo("c:include", //$NON-NLS-1$
            31, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EPackage", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_33_6 = new TagInfo("c:include", //$NON-NLS-1$
            33, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_39_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            39, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_41_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            41, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_52_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            52, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_1 = new TagInfo("c:get", //$NON-NLS-1$
            53, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_15 = new TagInfo("c:get", //$NON-NLS-1$
            54, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_5 = new TagInfo("c:if", //$NON-NLS-1$
            55, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllAttributes[@name = 'name']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_57_14 = new TagInfo("c:include", //$NON-NLS-1$
            57, 14,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_65_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_66_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            66, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_68_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            68, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_2 = new TagInfo("c:get", //$NON-NLS-1$
            69, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_34 = new TagInfo("c:get", //$NON-NLS-1$
            69, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_16 = new TagInfo("c:get", //$NON-NLS-1$
            70, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_19 = new TagInfo("c:get", //$NON-NLS-1$
            73, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_74_15 = new TagInfo("c:include", //$NON-NLS-1$
            74, 15,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_85_3 = new TagInfo("c:choose", //$NON-NLS-1$
            85, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eSuperTypes )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_86_5 = new TagInfo("c:when", //$NON-NLS-1$
            86, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_89_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            89, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_98_1 = new TagInfo("c:include", //$NON-NLS-1$
            98, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/queue.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_101_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            101, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$definedNodes", //$NON-NLS-1$
                "treeNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_103_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            103, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eNodeClass", //$NON-NLS-1$
                "$eClasses[@name = $treeNode]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_5 = new TagInfo("c:get", //$NON-NLS-1$
            104, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_110_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            110, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$definedNodes", //$NON-NLS-1$
                "treeNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_112_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            112, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eNodeClass", //$NON-NLS-1$
                "$eClasses[@name = $treeNode]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_113_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            113, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_6 = new TagInfo("c:get", //$NON-NLS-1$
            114, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_42 = new TagInfo("c:get", //$NON-NLS-1$
            114, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_4 = new TagInfo("c:get", //$NON-NLS-1$
            121, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_1 = new TagInfo("c:get", //$NON-NLS-1$
            124, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

ArrayList<String> nodes = new ArrayList<String>();
ArrayList<String> queue = new ArrayList<String>();

        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_9_1.setRuntimeParent(null);
        _jettag_c_include_9_1.setTagInfo(_td_c_include_9_1);
        _jettag_c_include_9_1.doStart(context, out);
        _jettag_c_include_9_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\"\"\" Defines a graph editor for ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_32.setRuntimeParent(null);
        _jettag_c_get_12_32.setTagInfo(_td_c_get_12_32);
        _jettag_c_get_12_32.doStart(context, out);
        _jettag_c_get_12_32.doEnd();
        out.write(".");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Imports:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.api \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import HasTraits, Str, Property, Instance");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.ui.api \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import View, Item, Group");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.ui.menu \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import Action, Menu");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from godot.ui.graph_editor import GraphNode, GraphEditor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_30_1.setRuntimeParent(null);
        _jettag_c_setVariable_30_1.setTagInfo(_td_c_setVariable_30_1);
        _jettag_c_setVariable_30_1.doStart(context, out);
        _jettag_c_setVariable_30_1.doEnd();
        out.write("from ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_31_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_31_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_31_6.setRuntimeParent(null);
        _jettag_c_include_31_6.setTagInfo(_td_c_include_31_6);
        _jettag_c_include_31_6.doStart(context, out);
        _jettag_c_include_31_6.doEnd();
        out.write(" import *");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_32_1.setRuntimeParent(null);
        _jettag_c_iterate_32_1.setTagInfo(_td_c_iterate_32_1);
        _jettag_c_iterate_32_1.doStart(context, out);
        while (_jettag_c_iterate_32_1.okToProcessBody()) {
            out.write("from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_33_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_33_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_33_6.setRuntimeParent(_jettag_c_iterate_32_1);
            _jettag_c_include_33_6.setTagInfo(_td_c_include_33_6);
            _jettag_c_include_33_6.doStart(context, out);
            _jettag_c_include_33_6.doEnd();
            out.write(" import *");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_32_1.handleBodyContent(out);
        }
        _jettag_c_iterate_32_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Constants:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_39_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_39_1.setRuntimeParent(null);
        _jettag_c_userRegion_39_1.setTagInfo(_td_c_userRegion_39_1);
        _jettag_c_userRegion_39_1.doStart(context, out);
        while (_jettag_c_userRegion_39_1.okToProcessBody()) {
            out.write("# <<< constants");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_41_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_41_1.setRuntimeParent(_jettag_c_userRegion_39_1);
            _jettag_c_initialCode_41_1.setTagInfo(_td_c_initialCode_41_1);
            _jettag_c_initialCode_41_1.doStart(context, out);
            while (_jettag_c_initialCode_41_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("IMAGE_PATH = \"\"");  //$NON-NLS-1$        
                _jettag_c_initialCode_41_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_41_1.doEnd();
            out.write(NL);         
            out.write("# >>> constants");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_39_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_39_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Graph nodes:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_51_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_51_1.setRuntimeParent(null);
        _jettag_c_iterate_51_1.setTagInfo(_td_c_iterate_51_1);
        _jettag_c_iterate_51_1.doStart(context, out);
        while (_jettag_c_iterate_51_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_52_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_52_1.setRuntimeParent(_jettag_c_iterate_51_1);
            _jettag_c_setVariable_52_1.setTagInfo(_td_c_setVariable_52_1);
            _jettag_c_setVariable_52_1.doStart(context, out);
            _jettag_c_setVariable_52_1.doEnd();
            RuntimeTagElement _jettag_c_get_53_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_1.setRuntimeParent(_jettag_c_iterate_51_1);
            _jettag_c_get_53_1.setTagInfo(_td_c_get_53_1);
            _jettag_c_get_53_1.doStart(context, out);
            _jettag_c_get_53_1.doEnd();
            out.write("_GraphNode = GraphNode(");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    node_for=[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_54_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_54_15.setRuntimeParent(_jettag_c_iterate_51_1);
            _jettag_c_get_54_15.setTagInfo(_td_c_get_54_15);
            _jettag_c_get_54_15.doStart(context, out);
            _jettag_c_get_54_15.doEnd();
            out.write("],");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_55_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_55_5.setRuntimeParent(_jettag_c_iterate_51_1);
            _jettag_c_if_55_5.setTagInfo(_td_c_if_55_5);
            _jettag_c_if_55_5.doStart(context, out);
            while (_jettag_c_if_55_5.okToProcessBody()) {
                out.write("label=\"name\",");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_55_5.handleBodyContent(out);
            }
            _jettag_c_if_55_5.doEnd();
            out.write("    tooltip=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_57_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_57_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_57_14.setRuntimeParent(_jettag_c_iterate_51_1);
            _jettag_c_include_57_14.setTagInfo(_td_c_include_57_14);
            _jettag_c_include_57_14.doStart(context, out);
            _jettag_c_include_57_14.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    on_dclick=lambda obj: obj.edit_traits(kind=\"livemodal\"))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c_iterate_51_1.handleBodyContent(out);
        }
        _jettag_c_iterate_51_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Graph edges:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_65_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_65_1.setRuntimeParent(null);
        _jettag_c_iterate_65_1.setTagInfo(_td_c_iterate_65_1);
        _jettag_c_iterate_65_1.doStart(context, out);
        while (_jettag_c_iterate_65_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_66_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_66_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_66_1.setRuntimeParent(_jettag_c_iterate_65_1);
            _jettag_c_setVariable_66_1.setTagInfo(_td_c_setVariable_66_1);
            _jettag_c_setVariable_66_1.doStart(context, out);
            _jettag_c_setVariable_66_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_67_1.setRuntimeParent(_jettag_c_iterate_65_1);
            _jettag_c_iterate_67_1.setTagInfo(_td_c_iterate_67_1);
            _jettag_c_iterate_67_1.doStart(context, out);
            while (_jettag_c_iterate_67_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_68_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_68_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_68_5.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_setVariable_68_5.setTagInfo(_td_c_setVariable_68_5);
                _jettag_c_setVariable_68_5.doStart(context, out);
                _jettag_c_setVariable_68_5.doEnd();
                out.write("#");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_69_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_2.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_get_69_2.setTagInfo(_td_c_get_69_2);
                _jettag_c_get_69_2.doStart(context, out);
                _jettag_c_get_69_2.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_69_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_34); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_34.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_get_69_34.setTagInfo(_td_c_get_69_34);
                _jettag_c_get_69_34.doStart(context, out);
                _jettag_c_get_69_34.doEnd();
                out.write("_GraphEdge = GraphEdge(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#    edge_for=[");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_70_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_16.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_get_70_16.setTagInfo(_td_c_get_70_16);
                _jettag_c_get_70_16.doStart(context, out);
                _jettag_c_get_70_16.doEnd();
                out.write("],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#    head_nodes=[],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#    tail_nodes=[],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#    head_label=\"=");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_73_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_19.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_get_73_19.setTagInfo(_td_c_get_73_19);
                _jettag_c_get_73_19.doStart(context, out);
                _jettag_c_get_73_19.doEnd();
                out.write("\",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#    tooltip=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_74_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_74_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_74_15.setRuntimeParent(_jettag_c_iterate_67_1);
                _jettag_c_include_74_15.setTagInfo(_td_c_include_74_15);
                _jettag_c_include_74_15.doStart(context, out);
                _jettag_c_include_74_15.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                _jettag_c_iterate_67_1.handleBodyContent(out);
            }
            _jettag_c_iterate_67_1.doEnd();
            _jettag_c_iterate_65_1.handleBodyContent(out);
        }
        _jettag_c_iterate_65_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Graph node list:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_82_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_82_1.setRuntimeParent(null);
        _jettag_c_iterate_82_1.setTagInfo(_td_c_iterate_82_1);
        _jettag_c_iterate_82_1.doStart(context, out);
        while (_jettag_c_iterate_82_1.okToProcessBody()) {
     EClass ec = (EClass)context.getVariable("eClass"); 
            // Classes with no super type should be defined last. 
            RuntimeTagElement _jettag_c_choose_85_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_85_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_85_3.setRuntimeParent(_jettag_c_iterate_82_1);
            _jettag_c_choose_85_3.setTagInfo(_td_c_choose_85_3);
            _jettag_c_choose_85_3.doStart(context, out);
            JET2Writer _jettag_c_choose_85_3_saved_out = out;
            while (_jettag_c_choose_85_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_86_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_86_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_86_5.setRuntimeParent(_jettag_c_choose_85_3);
                _jettag_c_when_86_5.setTagInfo(_td_c_when_86_5);
                _jettag_c_when_86_5.doStart(context, out);
                JET2Writer _jettag_c_when_86_5_saved_out = out;
                while (_jettag_c_when_86_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             nodes.add( ec.getName() ); 
                    _jettag_c_when_86_5.handleBodyContent(out);
                }
                out = _jettag_c_when_86_5_saved_out;
                _jettag_c_when_86_5.doEnd();
                RuntimeTagElement _jettag_c_otherwise_89_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_89_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_89_5.setRuntimeParent(_jettag_c_choose_85_3);
                _jettag_c_otherwise_89_5.setTagInfo(_td_c_otherwise_89_5);
                _jettag_c_otherwise_89_5.doStart(context, out);
                JET2Writer _jettag_c_otherwise_89_5_saved_out = out;
                while (_jettag_c_otherwise_89_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             queue.add( ec.getName() ); 
                    _jettag_c_otherwise_89_5.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_89_5_saved_out;
                _jettag_c_otherwise_89_5.doEnd();
                _jettag_c_choose_85_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_85_3_saved_out;
            _jettag_c_choose_85_3.doEnd();
            _jettag_c_iterate_82_1.handleBodyContent(out);
        }
        _jettag_c_iterate_82_1.doEnd();

context.setVariable( "nodeQueue", XPathUtil.asNodeSet(queue) );
context.setVariable( "definedNodes", XPathUtil.asNodeSet(nodes) );

        RuntimeTagElement _jettag_c_include_98_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_98_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_98_1.setRuntimeParent(null);
        _jettag_c_include_98_1.setTagInfo(_td_c_include_98_1);
        _jettag_c_include_98_1.doStart(context, out);
        _jettag_c_include_98_1.doEnd();
        out.write(NL);         
        out.write("graph_nodes = [");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_101_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_101_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_101_5.setRuntimeParent(null);
        _jettag_c_iterate_101_5.setTagInfo(_td_c_iterate_101_5);
        _jettag_c_iterate_101_5.doStart(context, out);
        while (_jettag_c_iterate_101_5.okToProcessBody()) {
            // Get the EClass. 
            RuntimeTagElement _jettag_c_setVariable_103_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_103_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_103_5.setRuntimeParent(_jettag_c_iterate_101_5);
            _jettag_c_setVariable_103_5.setTagInfo(_td_c_setVariable_103_5);
            _jettag_c_setVariable_103_5.doStart(context, out);
            _jettag_c_setVariable_103_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_104_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_104_5.setRuntimeParent(_jettag_c_iterate_101_5);
            _jettag_c_get_104_5.setTagInfo(_td_c_get_104_5);
            _jettag_c_get_104_5.doStart(context, out);
            _jettag_c_get_104_5.doEnd();
            out.write("_GraphNode,");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_101_5.handleBodyContent(out);
        }
        _jettag_c_iterate_101_5.doEnd();
        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("graph_nodes.reverse()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("#graph_edges = [");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_110_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_110_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_110_5.setRuntimeParent(null);
        _jettag_c_iterate_110_5.setTagInfo(_td_c_iterate_110_5);
        _jettag_c_iterate_110_5.doStart(context, out);
        while (_jettag_c_iterate_110_5.okToProcessBody()) {
            // Get the EClass. 
            RuntimeTagElement _jettag_c_setVariable_112_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_112_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_112_5.setRuntimeParent(_jettag_c_iterate_110_5);
            _jettag_c_setVariable_112_5.setTagInfo(_td_c_setVariable_112_5);
            _jettag_c_setVariable_112_5.doStart(context, out);
            _jettag_c_setVariable_112_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_113_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_113_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_113_5.setRuntimeParent(_jettag_c_iterate_110_5);
            _jettag_c_iterate_113_5.setTagInfo(_td_c_iterate_113_5);
            _jettag_c_iterate_113_5.doStart(context, out);
            while (_jettag_c_iterate_113_5.okToProcessBody()) {
                out.write("#    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_6.setRuntimeParent(_jettag_c_iterate_113_5);
                _jettag_c_get_114_6.setTagInfo(_td_c_get_114_6);
                _jettag_c_get_114_6.doStart(context, out);
                _jettag_c_get_114_6.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_42); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_42.setRuntimeParent(_jettag_c_iterate_113_5);
                _jettag_c_get_114_42.setTagInfo(_td_c_get_114_42);
                _jettag_c_get_114_42.doStart(context, out);
                _jettag_c_get_114_42.doEnd();
                out.write("_GraphEdge,");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_113_5.handleBodyContent(out);
            }
            _jettag_c_iterate_113_5.doEnd();
            _jettag_c_iterate_110_5.handleBodyContent(out);
        }
        _jettag_c_iterate_110_5.doEnd();
        out.write("#]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#graph_edges.reverse()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_121_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_4.setRuntimeParent(null);
        _jettag_c_get_121_4.setTagInfo(_td_c_get_121_4);
        _jettag_c_get_121_4.doStart(context, out);
        _jettag_c_get_121_4.doEnd();
        out.write(" Graph Editor:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_124_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_124_1.setRuntimeParent(null);
        _jettag_c_get_124_1.setTagInfo(_td_c_get_124_1);
        _jettag_c_get_124_1.doStart(context, out);
        _jettag_c_get_124_1.doEnd();
        out.write("GraphEditor = GraphEditor(nodes=graph_nodes)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
