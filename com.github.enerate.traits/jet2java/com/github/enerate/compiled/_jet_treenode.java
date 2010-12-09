package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_treenode implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_treenode() {
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
    private static final TagInfo _td_c_iterate_45_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_5 = new TagInfo("c:get", //$NON-NLS-1$
            47, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_7 = new TagInfo("c:get", //$NON-NLS-1$
            50, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_35 = new TagInfo("c:get", //$NON-NLS-1$
            51, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_64_21 = new TagInfo("c:setVariable", //$NON-NLS-1$
            64, 21,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_64_71 = new TagInfo("c:include", //$NON-NLS-1$
            64, 71,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_17 = new TagInfo("c:get", //$NON-NLS-1$
            67, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_70_12 = new TagInfo("c:iterate", //$NON-NLS-1$
            70, 12,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_85 = new TagInfo("c:get", //$NON-NLS-1$
            70, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_86 = new TagInfo("c:get", //$NON-NLS-1$
            73, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_17 = new TagInfo("c:get", //$NON-NLS-1$
            76, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_84_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            84, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_86_15 = new TagInfo("c:get", //$NON-NLS-1$
            86, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_88_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            88, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_91_3 = new TagInfo("c:choose", //$NON-NLS-1$
            91, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences[@many = 'true'] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_92_5 = new TagInfo("c:when", //$NON-NLS-1$
            92, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_96_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            96, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_106_13 = new TagInfo("c:get", //$NON-NLS-1$
            106, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_113_16 = new TagInfo("c:choose", //$NON-NLS-1$
            113, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_114_9 = new TagInfo("c:when", //$NON-NLS-1$
            114, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_115_9 = new TagInfo("c:otherwise", //$NON-NLS-1$
            115, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_123_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            123, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_43 = new TagInfo("c:get", //$NON-NLS-1$
            124, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_127_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            127, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'false']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_128_43 = new TagInfo("c:get", //$NON-NLS-1$
            128, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_153_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            153, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_156_3 = new TagInfo("c:choose", //$NON-NLS-1$
            156, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eSuperTypes )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_157_5 = new TagInfo("c:when", //$NON-NLS-1$
            157, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_160_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            160, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_169_1 = new TagInfo("c:include", //$NON-NLS-1$
            169, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/queue.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_172_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            172, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$definedNodes", //$NON-NLS-1$
                "treeNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_5 = new TagInfo("c:get", //$NON-NLS-1$
            173, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$treeNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_4 = new TagInfo("c:get", //$NON-NLS-1$
            179, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_182_1 = new TagInfo("c:get", //$NON-NLS-1$
            182, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lower-case($ePackage/@name)", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_iterate_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_45_1.setRuntimeParent(null);
        _jettag_c_iterate_45_1.setTagInfo(_td_c_iterate_45_1);
        _jettag_c_iterate_45_1.doStart(context, out);
        while (_jettag_c_iterate_45_1.okToProcessBody()) {
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#  \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_5.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_get_47_5.setTagInfo(_td_c_get_47_5);
            _jettag_c_get_47_5.doStart(context, out);
            _jettag_c_get_47_5.doEnd();
            out.write("TreeNode\" class:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_50_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_50_7.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_get_50_7.setTagInfo(_td_c_get_50_7);
            _jettag_c_get_50_7.doStart(context, out);
            _jettag_c_get_50_7.doEnd();
            out.write("TreeNode(TreeNode):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"\"\" Defines a tree node for a ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_51_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_35.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_get_51_35.setTagInfo(_td_c_get_51_35);
            _jettag_c_get_51_35.doStart(context, out);
            _jettag_c_get_51_35.doEnd();
            out.write(".");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #  \"TreeNode\" interface:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # Name of trait containing children (if '', the node is a leaf).");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#    children = Str(\"Substations\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # Name of a trait containing a label.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    label = Str(\"name\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    tooltip = Str(\"=");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_64_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_64_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_64_21.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_setVariable_64_21.setTagInfo(_td_c_setVariable_64_21);
            _jettag_c_setVariable_64_21.doStart(context, out);
            _jettag_c_setVariable_64_21.doEnd();
            RuntimeTagElement _jettag_c_include_64_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_64_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_64_71.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_include_64_71.setTagInfo(_td_c_include_64_71);
            _jettag_c_include_64_71.doStart(context, out);
            _jettag_c_include_64_71.doEnd();
            out.write("\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # Name to use for a new instance.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    name = Str(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_17.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_get_67_17.setTagInfo(_td_c_get_67_17);
            _jettag_c_get_67_17.doStart(context, out);
            _jettag_c_get_67_17.doEnd();
            out.write("\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # List of object classes than can be added or copied.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    add = [");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_70_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_70_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_70_12.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_70_12.setTagInfo(_td_c_iterate_70_12);
            _jettag_c_iterate_70_12.doStart(context, out);
            while (_jettag_c_iterate_70_12.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_70_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_85.setRuntimeParent(_jettag_c_iterate_70_12);
                _jettag_c_get_70_85.setTagInfo(_td_c_get_70_85);
                _jettag_c_get_70_85.doStart(context, out);
                _jettag_c_get_70_85.doEnd();
                out.write(", ");  //$NON-NLS-1$        
                _jettag_c_iterate_70_12.handleBodyContent(out);
            }
            _jettag_c_iterate_70_12.doEnd();
            out.write("]");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # List of object classes that can be moved.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    move = [");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_73_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_73_13.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_73_13.setTagInfo(_td_c_iterate_73_13);
            _jettag_c_iterate_73_13.doStart(context, out);
            while (_jettag_c_iterate_73_13.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_73_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_86.setRuntimeParent(_jettag_c_iterate_73_13);
                _jettag_c_get_73_86.setTagInfo(_td_c_get_73_86);
                _jettag_c_get_73_86.doStart(context, out);
                _jettag_c_get_73_86.doEnd();
                out.write(", ");  //$NON-NLS-1$        
                _jettag_c_iterate_73_13.handleBodyContent(out);
            }
            _jettag_c_iterate_73_13.doEnd();
            out.write("]");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # List of object classes and/or interfaces that the node applies to.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    node_for = [");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_76_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_76_17.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_get_76_17.setTagInfo(_td_c_get_76_17);
            _jettag_c_get_76_17.doStart(context, out);
            _jettag_c_get_76_17.doEnd();
            out.write("]");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # Function for handling double-clicking an object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#    on_dclick = lambda obj: obj.edit_traits(kind=\"livemodal\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    # Resource path used to locate the node icon.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    icon_path = Str(IMAGE_PATH)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_userRegion_84_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_84_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_userRegion_84_1.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_userRegion_84_1.setTagInfo(_td_c_userRegion_84_1);
            _jettag_c_userRegion_84_1.doStart(context, out);
            while (_jettag_c_userRegion_84_1.okToProcessBody()) {
                out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    #  Begin \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_86_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_15.setRuntimeParent(_jettag_c_userRegion_84_1);
                _jettag_c_get_86_15.setTagInfo(_td_c_get_86_15);
                _jettag_c_get_86_15.doStart(context, out);
                _jettag_c_get_86_15.doEnd();
                out.write("TreeNode\" user definitions:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_initialCode_88_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_88_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_initialCode_88_1.setRuntimeParent(_jettag_c_userRegion_84_1);
                _jettag_c_initialCode_88_1.setTagInfo(_td_c_initialCode_88_1);
                _jettag_c_initialCode_88_1.doStart(context, out);
                while (_jettag_c_initialCode_88_1.okToProcessBody()) {
                    out.write(NL);         
                    out.write("    # @generated");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_choose_91_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_91_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_91_3.setRuntimeParent(_jettag_c_initialCode_88_1);
                    _jettag_c_choose_91_3.setTagInfo(_td_c_choose_91_3);
                    _jettag_c_choose_91_3.doStart(context, out);
                    JET2Writer _jettag_c_choose_91_3_saved_out = out;
                    while (_jettag_c_choose_91_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_92_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_92_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_92_5.setRuntimeParent(_jettag_c_choose_91_3);
                        _jettag_c_when_92_5.setTagInfo(_td_c_when_92_5);
                        _jettag_c_when_92_5.doStart(context, out);
                        JET2Writer _jettag_c_when_92_5_saved_out = out;
                        while (_jettag_c_when_92_5.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("    # Name of leaf item icon.");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("    icon_item = Str( '<item>' )");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_92_5.handleBodyContent(out);
                        }
                        out = _jettag_c_when_92_5_saved_out;
                        _jettag_c_when_92_5.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_96_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_96_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_96_6.setRuntimeParent(_jettag_c_choose_91_3);
                        _jettag_c_otherwise_96_6.setTagInfo(_td_c_otherwise_96_6);
                        _jettag_c_otherwise_96_6.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_96_6_saved_out = out;
                        while (_jettag_c_otherwise_96_6.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("    # Name of group item icon.");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("    icon_group = Str( '<group>' )");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write(NL);         
                            out.write("    # Name of opened group item icon.");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("    icon_open = Str( '<open>' )");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_96_6.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_96_6_saved_out;
                        _jettag_c_otherwise_96_6.doEnd();
                        _jettag_c_choose_91_3.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_91_3_saved_out;
                    _jettag_c_choose_91_3.doEnd();
                    _jettag_c_initialCode_88_1.handleBodyContent(out);
                }
                _jettag_c_initialCode_88_1.doEnd();
                out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    #  End \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_106_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_106_13.setRuntimeParent(_jettag_c_userRegion_84_1);
                _jettag_c_get_106_13.setTagInfo(_td_c_get_106_13);
                _jettag_c_get_106_13.doStart(context, out);
                _jettag_c_get_106_13.doEnd();
                out.write("TreeNode\" user definitions:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_userRegion_84_1.handleBodyContent(out);
            }
            _jettag_c_userRegion_84_1.doEnd();
            out.write(NL);         
            out.write("    def allows_children ( self, object ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether this object can have children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_113_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_113_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_113_16.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_choose_113_16.setTagInfo(_td_c_choose_113_16);
            _jettag_c_choose_113_16.doStart(context, out);
            JET2Writer _jettag_c_choose_113_16_saved_out = out;
            while (_jettag_c_choose_113_16.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_when_114_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_114_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_114_9.setRuntimeParent(_jettag_c_choose_113_16);
                _jettag_c_when_114_9.setTagInfo(_td_c_when_114_9);
                _jettag_c_when_114_9.doStart(context, out);
                JET2Writer _jettag_c_when_114_9_saved_out = out;
                while (_jettag_c_when_114_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("False");  //$NON-NLS-1$        
                    _jettag_c_when_114_9.handleBodyContent(out);
                }
                out = _jettag_c_when_114_9_saved_out;
                _jettag_c_when_114_9.doEnd();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_115_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_115_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_115_9.setRuntimeParent(_jettag_c_choose_113_16);
                _jettag_c_otherwise_115_9.setTagInfo(_td_c_otherwise_115_9);
                _jettag_c_otherwise_115_9.doStart(context, out);
                JET2Writer _jettag_c_otherwise_115_9_saved_out = out;
                while (_jettag_c_otherwise_115_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("True");  //$NON-NLS-1$        
                    _jettag_c_otherwise_115_9.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_115_9_saved_out;
                _jettag_c_otherwise_115_9.doEnd();
                out.write(NL);         
                _jettag_c_choose_113_16.handleBodyContent(out);
            }
            out = _jettag_c_choose_113_16_saved_out;
            _jettag_c_choose_113_16.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_children ( self, object ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Gets the object's children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        children = []");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_123_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_123_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_123_9.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_123_9.setTagInfo(_td_c_iterate_123_9);
            _jettag_c_iterate_123_9.doStart(context, out);
            while (_jettag_c_iterate_123_9.okToProcessBody()) {
                out.write("        children.extend( getattr(object, \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_124_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_124_43.setRuntimeParent(_jettag_c_iterate_123_9);
                _jettag_c_get_124_43.setTagInfo(_td_c_get_124_43);
                _jettag_c_get_124_43.doStart(context, out);
                _jettag_c_get_124_43.doEnd();
                out.write("\") )");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_123_9.handleBodyContent(out);
            }
            _jettag_c_iterate_123_9.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_127_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_127_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_127_9.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_127_9.setTagInfo(_td_c_iterate_127_9);
            _jettag_c_iterate_127_9.doStart(context, out);
            while (_jettag_c_iterate_127_9.okToProcessBody()) {
                out.write("        children.append( getattr(object, \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_128_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_128_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_128_43.setRuntimeParent(_jettag_c_iterate_127_9);
                _jettag_c_get_128_43.setTagInfo(_td_c_get_128_43);
                _jettag_c_get_128_43.doStart(context, out);
                _jettag_c_get_128_43.doEnd();
                out.write("\") )");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_127_9.handleBodyContent(out);
            }
            _jettag_c_iterate_127_9.doEnd();
            out.write("        return children");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def append_child ( self, object, child ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Appends a child to the object's children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        raise NotImplmentedError");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def dclick ( self, object ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Handles an object being double-clicked.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        if object is not None:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            object.edit_traits(kind=\"livemodal\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return None");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("        return True");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_45_1.handleBodyContent(out);
        }
        _jettag_c_iterate_45_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Tree node list:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_153_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_153_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_153_1.setRuntimeParent(null);
        _jettag_c_iterate_153_1.setTagInfo(_td_c_iterate_153_1);
        _jettag_c_iterate_153_1.doStart(context, out);
        while (_jettag_c_iterate_153_1.okToProcessBody()) {
     EClass ec = (EClass)context.getVariable("eClass"); 
            // Classes with no super type should be defined last. 
            RuntimeTagElement _jettag_c_choose_156_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_156_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_156_3.setRuntimeParent(_jettag_c_iterate_153_1);
            _jettag_c_choose_156_3.setTagInfo(_td_c_choose_156_3);
            _jettag_c_choose_156_3.doStart(context, out);
            JET2Writer _jettag_c_choose_156_3_saved_out = out;
            while (_jettag_c_choose_156_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_157_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_157_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_157_5.setRuntimeParent(_jettag_c_choose_156_3);
                _jettag_c_when_157_5.setTagInfo(_td_c_when_157_5);
                _jettag_c_when_157_5.doStart(context, out);
                JET2Writer _jettag_c_when_157_5_saved_out = out;
                while (_jettag_c_when_157_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             nodes.add( ec.getName() ); 
                    _jettag_c_when_157_5.handleBodyContent(out);
                }
                out = _jettag_c_when_157_5_saved_out;
                _jettag_c_when_157_5.doEnd();
                RuntimeTagElement _jettag_c_otherwise_160_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_160_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_160_5.setRuntimeParent(_jettag_c_choose_156_3);
                _jettag_c_otherwise_160_5.setTagInfo(_td_c_otherwise_160_5);
                _jettag_c_otherwise_160_5.doStart(context, out);
                JET2Writer _jettag_c_otherwise_160_5_saved_out = out;
                while (_jettag_c_otherwise_160_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             queue.add( ec.getName() ); 
                    _jettag_c_otherwise_160_5.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_160_5_saved_out;
                _jettag_c_otherwise_160_5.doEnd();
                _jettag_c_choose_156_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_156_3_saved_out;
            _jettag_c_choose_156_3.doEnd();
            _jettag_c_iterate_153_1.handleBodyContent(out);
        }
        _jettag_c_iterate_153_1.doEnd();

context.setVariable( "nodeQueue", XPathUtil.asNodeSet(queue) );
context.setVariable( "definedNodes", XPathUtil.asNodeSet(nodes) );

        RuntimeTagElement _jettag_c_include_169_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_169_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_169_1.setRuntimeParent(null);
        _jettag_c_include_169_1.setTagInfo(_td_c_include_169_1);
        _jettag_c_include_169_1.doStart(context, out);
        _jettag_c_include_169_1.doEnd();
        out.write(NL);         
        out.write("tree_nodes = [");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_172_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_172_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_172_5.setRuntimeParent(null);
        _jettag_c_iterate_172_5.setTagInfo(_td_c_iterate_172_5);
        _jettag_c_iterate_172_5.doStart(context, out);
        while (_jettag_c_iterate_172_5.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_173_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_5.setRuntimeParent(_jettag_c_iterate_172_5);
            _jettag_c_get_173_5.setTagInfo(_td_c_get_173_5);
            _jettag_c_get_173_5.doStart(context, out);
            _jettag_c_get_173_5.doEnd();
            out.write("TreeNode(),");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_172_5.handleBodyContent(out);
        }
        _jettag_c_iterate_172_5.doEnd();
        out.write("]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("tree_nodes.reverse()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_179_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_179_4.setRuntimeParent(null);
        _jettag_c_get_179_4.setTagInfo(_td_c_get_179_4);
        _jettag_c_get_179_4.doStart(context, out);
        _jettag_c_get_179_4.doEnd();
        out.write(" Tree Editor:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_182_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_182_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_182_1.setRuntimeParent(null);
        _jettag_c_get_182_1.setTagInfo(_td_c_get_182_1);
        _jettag_c_get_182_1.doStart(context, out);
        _jettag_c_get_182_1.doEnd();
        out.write("_tree_editor = TreeEditor(nodes=tree_nodes, editable=True)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
