package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_treeeditor implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_treeeditor() {
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
    private static final TagInfo _td_c_setVariable_28_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_6 = new TagInfo("c:include", //$NON-NLS-1$
            29, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EPackage", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
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
    private static final TagInfo _td_c_userRegion_37_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            37, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_39_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            39, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_1 = new TagInfo("c:get", //$NON-NLS-1$
            51, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_15 = new TagInfo("c:get", //$NON-NLS-1$
            52, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_5 = new TagInfo("c:if", //$NON-NLS-1$
            53, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAllAttributes[@name = 'name']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_55_14 = new TagInfo("c:include", //$NON-NLS-1$
            55, 14,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_1 = new TagInfo("c:get", //$NON-NLS-1$
            61, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_33 = new TagInfo("c:get", //$NON-NLS-1$
            61, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_15 = new TagInfo("c:get", //$NON-NLS-1$
            62, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_15 = new TagInfo("c:get", //$NON-NLS-1$
            63, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_13 = new TagInfo("c:get", //$NON-NLS-1$
            64, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_65_14 = new TagInfo("c:include", //$NON-NLS-1$
            65, 14,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_10 = new TagInfo("c:get", //$NON-NLS-1$
            66, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_11 = new TagInfo("c:get", //$NON-NLS-1$
            67, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_77_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            77, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_80_3 = new TagInfo("c:choose", //$NON-NLS-1$
            80, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eSuperTypes )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_81_5 = new TagInfo("c:when", //$NON-NLS-1$
            81, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_84_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            84, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_93_1 = new TagInfo("c:include", //$NON-NLS-1$
            93, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/queue.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_96_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            96, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$definedNodes", //$NON-NLS-1$
                "treeNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_98_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            98, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eNodeClass", //$NON-NLS-1$
                "$eClasses[@name = $treeNode]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_5 = new TagInfo("c:get", //$NON-NLS-1$
            99, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_100_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            100, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_5 = new TagInfo("c:get", //$NON-NLS-1$
            101, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eNodeClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_41 = new TagInfo("c:get", //$NON-NLS-1$
            101, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_4 = new TagInfo("c:get", //$NON-NLS-1$
            108, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_1 = new TagInfo("c:get", //$NON-NLS-1$
            111, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_113_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            113, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_115_11 = new TagInfo("c:get", //$NON-NLS-1$
            115, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_117_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            117, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_20 = new TagInfo("c:get", //$NON-NLS-1$
            127, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_9 = new TagInfo("c:get", //$NON-NLS-1$
            137, 9,
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
        out.write("\"\"\" Defines TreeNodes interface for the model.");  //$NON-NLS-1$        
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
        out.write("    import View, Item, Group, TreeEditor, TreeNode");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.ui.menu \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import Action, Menu");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_28_1.setRuntimeParent(null);
        _jettag_c_setVariable_28_1.setTagInfo(_td_c_setVariable_28_1);
        _jettag_c_setVariable_28_1.doStart(context, out);
        _jettag_c_setVariable_28_1.doEnd();
        out.write("from ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_29_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_29_6.setRuntimeParent(null);
        _jettag_c_include_29_6.setTagInfo(_td_c_include_29_6);
        _jettag_c_include_29_6.doStart(context, out);
        _jettag_c_include_29_6.doEnd();
        out.write(" import *");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_30_1.setRuntimeParent(null);
        _jettag_c_iterate_30_1.setTagInfo(_td_c_iterate_30_1);
        _jettag_c_iterate_30_1.doStart(context, out);
        while (_jettag_c_iterate_30_1.okToProcessBody()) {
            out.write("from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_31_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_31_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_31_6.setRuntimeParent(_jettag_c_iterate_30_1);
            _jettag_c_include_31_6.setTagInfo(_td_c_include_31_6);
            _jettag_c_include_31_6.doStart(context, out);
            _jettag_c_include_31_6.doEnd();
            out.write(" import *");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_30_1.handleBodyContent(out);
        }
        _jettag_c_iterate_30_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Constants:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_37_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_37_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_37_1.setRuntimeParent(null);
        _jettag_c_userRegion_37_1.setTagInfo(_td_c_userRegion_37_1);
        _jettag_c_userRegion_37_1.doStart(context, out);
        while (_jettag_c_userRegion_37_1.okToProcessBody()) {
            out.write("# <<< constants");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_39_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_39_1.setRuntimeParent(_jettag_c_userRegion_37_1);
            _jettag_c_initialCode_39_1.setTagInfo(_td_c_initialCode_39_1);
            _jettag_c_initialCode_39_1.doStart(context, out);
            while (_jettag_c_initialCode_39_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("IMAGE_PATH = \"\"");  //$NON-NLS-1$        
                _jettag_c_initialCode_39_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_39_1.doEnd();
            out.write(NL);         
            out.write("# >>> constants");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_37_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_37_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Tree nodes:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_49_1.setRuntimeParent(null);
        _jettag_c_iterate_49_1.setTagInfo(_td_c_iterate_49_1);
        _jettag_c_iterate_49_1.doStart(context, out);
        while (_jettag_c_iterate_49_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_50_1.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_setVariable_50_1.setTagInfo(_td_c_setVariable_50_1);
            _jettag_c_setVariable_50_1.doStart(context, out);
            _jettag_c_setVariable_50_1.doEnd();
            RuntimeTagElement _jettag_c_get_51_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_1.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_get_51_1.setTagInfo(_td_c_get_51_1);
            _jettag_c_get_51_1.doStart(context, out);
            _jettag_c_get_51_1.doEnd();
            out.write("_TreeNode = TreeNode(");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    node_for=[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_52_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_52_15.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_get_52_15.setTagInfo(_td_c_get_52_15);
            _jettag_c_get_52_15.doStart(context, out);
            _jettag_c_get_52_15.doEnd();
            out.write("],");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_53_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_53_5.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_if_53_5.setTagInfo(_td_c_if_53_5);
            _jettag_c_if_53_5.doStart(context, out);
            while (_jettag_c_if_53_5.okToProcessBody()) {
                out.write("label=\"name\",");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_53_5.handleBodyContent(out);
            }
            _jettag_c_if_53_5.doEnd();
            out.write("    tooltip=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_55_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_55_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_55_14.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_include_55_14.setTagInfo(_td_c_include_55_14);
            _jettag_c_include_55_14.doStart(context, out);
            _jettag_c_include_55_14.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    on_dclick=lambda obj: obj.edit_traits(kind=\"livemodal\"),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    icon_path=IMAGE_PATH)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_59_1.setRuntimeParent(_jettag_c_iterate_49_1);
            _jettag_c_iterate_59_1.setTagInfo(_td_c_iterate_59_1);
            _jettag_c_iterate_59_1.doStart(context, out);
            while (_jettag_c_iterate_59_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_60_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_60_5.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_setVariable_60_5.setTagInfo(_td_c_setVariable_60_5);
                _jettag_c_setVariable_60_5.doStart(context, out);
                _jettag_c_setVariable_60_5.doEnd();
                RuntimeTagElement _jettag_c_get_61_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_1.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_61_1.setTagInfo(_td_c_get_61_1);
                _jettag_c_get_61_1.doStart(context, out);
                _jettag_c_get_61_1.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_61_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_33); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_33.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_61_33.setTagInfo(_td_c_get_61_33);
                _jettag_c_get_61_33.doStart(context, out);
                _jettag_c_get_61_33.doEnd();
                out.write("_TreeNode = TreeNode(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    node_for=[");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_15.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_62_15.setTagInfo(_td_c_get_62_15);
                _jettag_c_get_62_15.doStart(context, out);
                _jettag_c_get_62_15.doEnd();
                out.write("],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    children=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_15.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_63_15.setTagInfo(_td_c_get_63_15);
                _jettag_c_get_63_15.doStart(context, out);
                _jettag_c_get_63_15.doEnd();
                out.write("\",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    label=\"=");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_64_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_13.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_64_13.setTagInfo(_td_c_get_64_13);
                _jettag_c_get_64_13.doStart(context, out);
                _jettag_c_get_64_13.doEnd();
                out.write("\",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    tooltip=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_65_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_65_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_65_14.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_include_65_14.setTagInfo(_td_c_include_65_14);
                _jettag_c_include_65_14.doStart(context, out);
                _jettag_c_include_65_14.doEnd();
                out.write("\",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    add=[");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_66_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_10.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_66_10.setTagInfo(_td_c_get_66_10);
                _jettag_c_get_66_10.doStart(context, out);
                _jettag_c_get_66_10.doEnd();
                out.write("],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    move=[");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_11); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_11.setRuntimeParent(_jettag_c_iterate_59_1);
                _jettag_c_get_67_11.setTagInfo(_td_c_get_67_11);
                _jettag_c_get_67_11.doStart(context, out);
                _jettag_c_get_67_11.doEnd();
                out.write("],");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    icon_path=IMAGE_PATH)");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_59_1.handleBodyContent(out);
            }
            _jettag_c_iterate_59_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_49_1.handleBodyContent(out);
        }
        _jettag_c_iterate_49_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Tree node list:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_77_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_77_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_77_1.setRuntimeParent(null);
        _jettag_c_iterate_77_1.setTagInfo(_td_c_iterate_77_1);
        _jettag_c_iterate_77_1.doStart(context, out);
        while (_jettag_c_iterate_77_1.okToProcessBody()) {
     EClass ec = (EClass)context.getVariable("eClass"); 
            // Classes with no super type should be defined last. 
            RuntimeTagElement _jettag_c_choose_80_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_80_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_80_3.setRuntimeParent(_jettag_c_iterate_77_1);
            _jettag_c_choose_80_3.setTagInfo(_td_c_choose_80_3);
            _jettag_c_choose_80_3.doStart(context, out);
            JET2Writer _jettag_c_choose_80_3_saved_out = out;
            while (_jettag_c_choose_80_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_81_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_81_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_81_5.setRuntimeParent(_jettag_c_choose_80_3);
                _jettag_c_when_81_5.setTagInfo(_td_c_when_81_5);
                _jettag_c_when_81_5.doStart(context, out);
                JET2Writer _jettag_c_when_81_5_saved_out = out;
                while (_jettag_c_when_81_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             nodes.add( ec.getName() ); 
                    _jettag_c_when_81_5.handleBodyContent(out);
                }
                out = _jettag_c_when_81_5_saved_out;
                _jettag_c_when_81_5.doEnd();
                RuntimeTagElement _jettag_c_otherwise_84_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_84_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_84_5.setRuntimeParent(_jettag_c_choose_80_3);
                _jettag_c_otherwise_84_5.setTagInfo(_td_c_otherwise_84_5);
                _jettag_c_otherwise_84_5.doStart(context, out);
                JET2Writer _jettag_c_otherwise_84_5_saved_out = out;
                while (_jettag_c_otherwise_84_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             queue.add( ec.getName() ); 
                    _jettag_c_otherwise_84_5.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_84_5_saved_out;
                _jettag_c_otherwise_84_5.doEnd();
                _jettag_c_choose_80_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_80_3_saved_out;
            _jettag_c_choose_80_3.doEnd();
            _jettag_c_iterate_77_1.handleBodyContent(out);
        }
        _jettag_c_iterate_77_1.doEnd();

context.setVariable( "nodeQueue", XPathUtil.asNodeSet(queue) );
context.setVariable( "definedNodes", XPathUtil.asNodeSet(nodes) );

        RuntimeTagElement _jettag_c_include_93_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_93_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_93_1.setRuntimeParent(null);
        _jettag_c_include_93_1.setTagInfo(_td_c_include_93_1);
        _jettag_c_include_93_1.doStart(context, out);
        _jettag_c_include_93_1.doEnd();
        out.write(NL);         
        out.write("tree_nodes = [");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_96_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_96_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_96_5.setRuntimeParent(null);
        _jettag_c_iterate_96_5.setTagInfo(_td_c_iterate_96_5);
        _jettag_c_iterate_96_5.doStart(context, out);
        while (_jettag_c_iterate_96_5.okToProcessBody()) {
            // Get the EClass. 
            RuntimeTagElement _jettag_c_setVariable_98_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_98_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_98_5.setRuntimeParent(_jettag_c_iterate_96_5);
            _jettag_c_setVariable_98_5.setTagInfo(_td_c_setVariable_98_5);
            _jettag_c_setVariable_98_5.doStart(context, out);
            _jettag_c_setVariable_98_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_99_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_99_5.setRuntimeParent(_jettag_c_iterate_96_5);
            _jettag_c_get_99_5.setTagInfo(_td_c_get_99_5);
            _jettag_c_get_99_5.doStart(context, out);
            _jettag_c_get_99_5.doEnd();
            out.write("_TreeNode,");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_100_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_100_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_100_5.setRuntimeParent(_jettag_c_iterate_96_5);
            _jettag_c_iterate_100_5.setTagInfo(_td_c_iterate_100_5);
            _jettag_c_iterate_100_5.doStart(context, out);
            while (_jettag_c_iterate_100_5.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_101_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_101_5.setRuntimeParent(_jettag_c_iterate_100_5);
                _jettag_c_get_101_5.setTagInfo(_td_c_get_101_5);
                _jettag_c_get_101_5.doStart(context, out);
                _jettag_c_get_101_5.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_101_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_101_41.setRuntimeParent(_jettag_c_iterate_100_5);
                _jettag_c_get_101_41.setTagInfo(_td_c_get_101_41);
                _jettag_c_get_101_41.doStart(context, out);
                _jettag_c_get_101_41.doEnd();
                out.write("_TreeNode,");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_100_5.handleBodyContent(out);
            }
            _jettag_c_iterate_100_5.doEnd();
            _jettag_c_iterate_96_5.handleBodyContent(out);
        }
        _jettag_c_iterate_96_5.doEnd();
        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("tree_nodes.reverse()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_108_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_108_4.setRuntimeParent(null);
        _jettag_c_get_108_4.setTagInfo(_td_c_get_108_4);
        _jettag_c_get_108_4.doStart(context, out);
        _jettag_c_get_108_4.doEnd();
        out.write(" Tree Editor:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_111_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_111_1.setRuntimeParent(null);
        _jettag_c_get_111_1.setTagInfo(_td_c_get_111_1);
        _jettag_c_get_111_1.doStart(context, out);
        _jettag_c_get_111_1.doEnd();
        out.write("TreeEditor = TreeEditor(nodes=tree_nodes, editable=True)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_113_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_113_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_113_1.setRuntimeParent(null);
        _jettag_c_userRegion_113_1.setTagInfo(_td_c_userRegion_113_1);
        _jettag_c_userRegion_113_1.doStart(context, out);
        while (_jettag_c_userRegion_113_1.okToProcessBody()) {
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#  Begin \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_115_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_115_11.setRuntimeParent(_jettag_c_userRegion_113_1);
            _jettag_c_get_115_11.setTagInfo(_td_c_get_115_11);
            _jettag_c_get_115_11.doStart(context, out);
            _jettag_c_get_115_11.doEnd();
            out.write("TreeEditor\" user region:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_117_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_117_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_117_1.setRuntimeParent(_jettag_c_userRegion_113_1);
            _jettag_c_initialCode_117_1.setTagInfo(_td_c_initialCode_117_1);
            _jettag_c_initialCode_117_1.doStart(context, out);
            while (_jettag_c_initialCode_117_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("class TreeRoot(HasTraits):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    # Root element of the model tree.");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    root = Instance(HasTraits)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    # Traits view to display.");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    view = View(");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        Item('root',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            editor=");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_127_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_20.setRuntimeParent(_jettag_c_initialCode_117_1);
                _jettag_c_get_127_20.setTagInfo(_td_c_get_127_20);
                _jettag_c_get_127_20.doStart(context, out);
                _jettag_c_get_127_20.doEnd();
                out.write("TreeEditor,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            show_label=False),");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        width     = 0.33,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        height    = 0.50,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        resizable = True,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        buttons   = [\"OK\", \"Cancel\"]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    )");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                _jettag_c_initialCode_117_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_117_1.doEnd();
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#  End \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_137_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_137_9.setRuntimeParent(_jettag_c_userRegion_113_1);
            _jettag_c_get_137_9.setTagInfo(_td_c_get_137_9);
            _jettag_c_get_137_9.doStart(context, out);
            _jettag_c_get_137_9.doEnd();
            out.write("TreeEditor\" user region:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_113_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_113_1.doEnd();
        out.write(NL);         
        out.write("if __name__ == \"__main__\":");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    root = TreeRoot()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    root.configure_traits()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
