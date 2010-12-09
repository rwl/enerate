package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_adapter implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_adapter() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_2_1 = new TagInfo("c:include", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_6 = new TagInfo("c:include", //$NON-NLS-1$
            22, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EPackage", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_6 = new TagInfo("c:include", //$NON-NLS-1$
            24, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClasses", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_5 = new TagInfo("c:get", //$NON-NLS-1$
            35, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_7 = new TagInfo("c:get", //$NON-NLS-1$
            38, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_18 = new TagInfo("c:get", //$NON-NLS-1$
            39, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_12 = new TagInfo("c:get", //$NON-NLS-1$
            42, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_51_16 = new TagInfo("c:choose", //$NON-NLS-1$
            51, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences[@many = 'true'] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_52_9 = new TagInfo("c:when", //$NON-NLS-1$
            52, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_53_9 = new TagInfo("c:otherwise", //$NON-NLS-1$
            53, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_57_1 = new TagInfo("c:if", //$NON-NLS-1$
            57, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences[@many = 'true'] ) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_18 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_92 = new TagInfo("c:get", //$NON-NLS-1$
            61, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_18 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_92 = new TagInfo("c:get", //$NON-NLS-1$
            69, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_79_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            79, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_49 = new TagInfo("c:get", //$NON-NLS-1$
            80, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_89_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            89, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_49 = new TagInfo("c:get", //$NON-NLS-1$
            90, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_114_17 = new TagInfo("c:setVariable", //$NON-NLS-1$
            114, 17,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_114_67 = new TagInfo("c:include", //$NON-NLS-1$
            114, 67,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_120_16 = new TagInfo("c:choose", //$NON-NLS-1$
            120, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences[@many = 'true'] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_121_9 = new TagInfo("c:when", //$NON-NLS-1$
            121, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_122_9 = new TagInfo("c:otherwise", //$NON-NLS-1$
            122, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_136_17 = new TagInfo("c:get", //$NON-NLS-1$
            136, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_191_18 = new TagInfo("c:iterate", //$NON-NLS-1$
            191, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_191_91 = new TagInfo("c:get", //$NON-NLS-1$
            191, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_199_16 = new TagInfo("c:choose", //$NON-NLS-1$
            199, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eReferences[@many = 'true'] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_200_9 = new TagInfo("c:when", //$NON-NLS-1$
            200, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_201_9 = new TagInfo("c:otherwise", //$NON-NLS-1$
            201, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_220_17 = new TagInfo("c:iterate", //$NON-NLS-1$
            220, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences[@many = 'true']", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_220_91 = new TagInfo("c:get", //$NON-NLS-1$
            220, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\"\"\" Defines adapters for implementing the ITreeNode interface.");  //$NON-NLS-1$        
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
        out.write("    import HasTraits, Property, Instance, adapts");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.ui.api \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import View, Item, Group, ITreeNode, ITreeNodeAdapter, TreeEditor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("from enthought.traits.ui.menu \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    import Action, Menu");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_21_1.setRuntimeParent(null);
        _jettag_c_setVariable_21_1.setTagInfo(_td_c_setVariable_21_1);
        _jettag_c_setVariable_21_1.doStart(context, out);
        _jettag_c_setVariable_21_1.doEnd();
        out.write("from ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_22_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_22_6.setRuntimeParent(null);
        _jettag_c_include_22_6.setTagInfo(_td_c_include_22_6);
        _jettag_c_include_22_6.doStart(context, out);
        _jettag_c_include_22_6.doEnd();
        out.write(" import *");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_1.setRuntimeParent(null);
        _jettag_c_iterate_23_1.setTagInfo(_td_c_iterate_23_1);
        _jettag_c_iterate_23_1.doStart(context, out);
        while (_jettag_c_iterate_23_1.okToProcessBody()) {
            out.write("from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_24_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_24_6.setRuntimeParent(_jettag_c_iterate_23_1);
            _jettag_c_include_24_6.setTagInfo(_td_c_include_24_6);
            _jettag_c_include_24_6.doStart(context, out);
            _jettag_c_include_24_6.doEnd();
            out.write(" import *");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_23_1.handleBodyContent(out);
        }
        _jettag_c_iterate_23_1.doEnd();
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  Constants:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("IMAGE_PATH = \"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_33_1.setRuntimeParent(null);
        _jettag_c_iterate_33_1.setTagInfo(_td_c_iterate_33_1);
        _jettag_c_iterate_33_1.doStart(context, out);
        while (_jettag_c_iterate_33_1.okToProcessBody()) {
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#  \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_5.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_get_35_5.setTagInfo(_td_c_get_35_5);
            _jettag_c_get_35_5.doStart(context, out);
            _jettag_c_get_35_5.doEnd();
            out.write("Adapter\" class:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_38_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_38_7.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_get_38_7.setTagInfo(_td_c_get_38_7);
            _jettag_c_get_38_7.doStart(context, out);
            _jettag_c_get_38_7.doEnd();
            out.write("Adapter(ITreeNodeAdapter):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"\"\" Adapts a ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_39_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_18.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_get_39_18.setTagInfo(_td_c_get_39_18);
            _jettag_c_get_39_18.doStart(context, out);
            _jettag_c_get_39_18.doEnd();
            out.write(" to implement the ITreeNode interface.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    adapts(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_12.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_get_42_12.setTagInfo(_td_c_get_42_12);
            _jettag_c_get_42_12.doStart(context, out);
            _jettag_c_get_42_12.doEnd();
            out.write(", ITreeNode)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #  \"ITreeNodeAdapter\" interface:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    def allows_children(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether this object can have children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_51_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_51_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_51_16.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_choose_51_16.setTagInfo(_td_c_choose_51_16);
            _jettag_c_choose_51_16.doStart(context, out);
            JET2Writer _jettag_c_choose_51_16_saved_out = out;
            while (_jettag_c_choose_51_16.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_when_52_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_52_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_52_9.setRuntimeParent(_jettag_c_choose_51_16);
                _jettag_c_when_52_9.setTagInfo(_td_c_when_52_9);
                _jettag_c_when_52_9.doStart(context, out);
                JET2Writer _jettag_c_when_52_9_saved_out = out;
                while (_jettag_c_when_52_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("False");  //$NON-NLS-1$        
                    _jettag_c_when_52_9.handleBodyContent(out);
                }
                out = _jettag_c_when_52_9_saved_out;
                _jettag_c_when_52_9.doEnd();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_53_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_53_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_53_9.setRuntimeParent(_jettag_c_choose_51_16);
                _jettag_c_otherwise_53_9.setTagInfo(_td_c_otherwise_53_9);
                _jettag_c_otherwise_53_9.doStart(context, out);
                JET2Writer _jettag_c_otherwise_53_9_saved_out = out;
                while (_jettag_c_otherwise_53_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("True");  //$NON-NLS-1$        
                    _jettag_c_otherwise_53_9.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_53_9_saved_out;
                _jettag_c_otherwise_53_9.doEnd();
                out.write(NL);         
                _jettag_c_choose_51_16.handleBodyContent(out);
            }
            out = _jettag_c_choose_51_16_saved_out;
            _jettag_c_choose_51_16.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_57_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_57_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_57_1.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_if_57_1.setTagInfo(_td_c_if_57_1);
            _jettag_c_if_57_1.doStart(context, out);
            while (_jettag_c_if_57_1.okToProcessBody()) {
                out.write("    def has_children(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\" Returns whether the object has children.");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        attrs = [");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_61_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_61_18.setRuntimeParent(_jettag_c_if_57_1);
                _jettag_c_iterate_61_18.setTagInfo(_td_c_iterate_61_18);
                _jettag_c_iterate_61_18.doStart(context, out);
                while (_jettag_c_iterate_61_18.okToProcessBody()) {
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_61_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_92); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_61_92.setRuntimeParent(_jettag_c_iterate_61_18);
                    _jettag_c_get_61_92.setTagInfo(_td_c_get_61_92);
                    _jettag_c_get_61_92.doStart(context, out);
                    _jettag_c_get_61_92.doEnd();
                    out.write("\", ");  //$NON-NLS-1$        
                    _jettag_c_iterate_61_18.handleBodyContent(out);
                }
                _jettag_c_iterate_61_18.doEnd();
                out.write("]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        children = [len( getattr(self.adaptee, attr) ) for attr in attrs]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        return ( max(children) > 0 )");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                out.write("    def get_children(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\" Gets the object's children.");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        attrs = [");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_69_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_69_18.setRuntimeParent(_jettag_c_if_57_1);
                _jettag_c_iterate_69_18.setTagInfo(_td_c_iterate_69_18);
                _jettag_c_iterate_69_18.doStart(context, out);
                while (_jettag_c_iterate_69_18.okToProcessBody()) {
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_69_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_92); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_92.setRuntimeParent(_jettag_c_iterate_69_18);
                    _jettag_c_get_69_92.setTagInfo(_td_c_get_69_92);
                    _jettag_c_get_69_92.doStart(context, out);
                    _jettag_c_get_69_92.doEnd();
                    out.write("\", ");  //$NON-NLS-1$        
                    _jettag_c_iterate_69_18.handleBodyContent(out);
                }
                _jettag_c_iterate_69_18.doEnd();
                out.write("]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        children = [getattr(self.adaptee, attr) for attr in attrs]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        return [x for c in children for x in c]");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_57_1.handleBodyContent(out);
            }
            _jettag_c_if_57_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def when_children_replaced(self, listener, remove):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Sets up or removes a listener for children being replaced on a");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            specified object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_79_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_79_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_79_9.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_iterate_79_9.setTagInfo(_td_c_iterate_79_9);
            _jettag_c_iterate_79_9.doStart(context, out);
            while (_jettag_c_iterate_79_9.okToProcessBody()) {
                out.write("        self.adaptee.on_trait_change(listener, '");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_80_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_49.setRuntimeParent(_jettag_c_iterate_79_9);
                _jettag_c_get_80_49.setTagInfo(_td_c_get_80_49);
                _jettag_c_get_80_49.doStart(context, out);
                _jettag_c_get_80_49.doEnd();
                out.write("',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            remove=remove, dispatch='ui')");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_79_9.handleBodyContent(out);
            }
            _jettag_c_iterate_79_9.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def when_children_changed ( self, listener, remove ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Sets up or removes a listener for children being changed on a");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            specified object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_89_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_89_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_89_9.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_iterate_89_9.setTagInfo(_td_c_iterate_89_9);
            _jettag_c_iterate_89_9.doStart(context, out);
            while (_jettag_c_iterate_89_9.okToProcessBody()) {
                out.write("        self.adaptee.on_trait_change(listener, '");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_90_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_49.setRuntimeParent(_jettag_c_iterate_89_9);
                _jettag_c_get_90_49.setTagInfo(_td_c_get_90_49);
                _jettag_c_get_90_49.doStart(context, out);
                _jettag_c_get_90_49.doEnd();
                out.write("',");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            remove=remove, dispatch='ui')");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_89_9.handleBodyContent(out);
            }
            _jettag_c_iterate_89_9.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_label(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Gets the label to display for a specified object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        if hasattr(self.adaptee, \"name\"):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return self.adaptee.name");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        else:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            return \"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("#    def get_menu(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\" Returns the right-click context menu for an object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        return Menu(*[Action(name='Create',");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#            action='node.adapter.append_child')])");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_tooltip(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Gets the tooltip to display for a specified object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_114_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_114_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_114_17.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_setVariable_114_17.setTagInfo(_td_c_setVariable_114_17);
            _jettag_c_setVariable_114_17.doStart(context, out);
            _jettag_c_setVariable_114_17.doEnd();
            RuntimeTagElement _jettag_c_include_114_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_114_67); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_114_67.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_include_114_67.setTagInfo(_td_c_include_114_67);
            _jettag_c_include_114_67.doStart(context, out);
            _jettag_c_include_114_67.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_icon(self, is_expanded):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns the icon for a specified object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_120_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_120_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_120_16.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_choose_120_16.setTagInfo(_td_c_choose_120_16);
            _jettag_c_choose_120_16.doStart(context, out);
            JET2Writer _jettag_c_choose_120_16_saved_out = out;
            while (_jettag_c_choose_120_16.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_when_121_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_121_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_121_9.setRuntimeParent(_jettag_c_choose_120_16);
                _jettag_c_when_121_9.setTagInfo(_td_c_when_121_9);
                _jettag_c_when_121_9.doStart(context, out);
                JET2Writer _jettag_c_when_121_9_saved_out = out;
                while (_jettag_c_when_121_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("'<item>'");  //$NON-NLS-1$        
                    _jettag_c_when_121_9.handleBodyContent(out);
                }
                out = _jettag_c_when_121_9_saved_out;
                _jettag_c_when_121_9.doEnd();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_122_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_122_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_122_9.setRuntimeParent(_jettag_c_choose_120_16);
                _jettag_c_otherwise_122_9.setTagInfo(_td_c_otherwise_122_9);
                _jettag_c_otherwise_122_9.doStart(context, out);
                JET2Writer _jettag_c_otherwise_122_9_saved_out = out;
                while (_jettag_c_otherwise_122_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("'<open>'");  //$NON-NLS-1$        
                    _jettag_c_otherwise_122_9.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_122_9_saved_out;
                _jettag_c_otherwise_122_9.doEnd();
                out.write(NL);         
                _jettag_c_choose_120_16.handleBodyContent(out);
            }
            out = _jettag_c_choose_120_16_saved_out;
            _jettag_c_choose_120_16.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_icon_path ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns the path used to locate an object's icon.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return IMAGE_PATH");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_name ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns the name to use when adding a new object instance");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            (displayed in the \"New\" submenu).");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return '");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_136_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_136_17.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_get_136_17.setTagInfo(_td_c_get_136_17);
            _jettag_c_get_136_17.doStart(context, out);
            _jettag_c_get_136_17.doEnd();
            out.write("'");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_view ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Gets the view to use when editing an object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return None");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def can_rename(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether the object's children can be renamed.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return True");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def can_copy(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether the object's children can be copied.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return True");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("#    def can_delete(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\" Returns whether the object's children can be deleted.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        return True");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def can_delete_me ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether the object can be deleted.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return True");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def confirm_delete(self):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Checks whether a specified object can be deleted.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("          Returns");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          -------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          * **True** if the object should be deleted with no further prompting.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          * **False** if the object should not be deleted.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          * Anything else: Caller should take its default action (which might");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            include prompting the user to confirm deletion).");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return True");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("#    def delete_child(self, index):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\" Deletes a child at a specified index from the object's children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("#        pass");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def can_add ( self, add_object ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether a given object is droppable on the node.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        valid = (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_191_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_191_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_191_18.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_iterate_191_18.setTagInfo(_td_c_iterate_191_18);
            _jettag_c_iterate_191_18.doStart(context, out);
            while (_jettag_c_iterate_191_18.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_191_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_191_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_191_91.setRuntimeParent(_jettag_c_iterate_191_18);
                _jettag_c_get_191_91.setTagInfo(_td_c_get_191_91);
                _jettag_c_get_191_91.doStart(context, out);
                _jettag_c_get_191_91.doEnd();
                out.write(", ");  //$NON-NLS-1$        
                _jettag_c_iterate_191_18.handleBodyContent(out);
            }
            _jettag_c_iterate_191_18.doEnd();
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return isinstance(add_object, valid)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def can_insert ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns whether the object's children can be inserted (vs.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            appended).");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_199_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_199_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_199_16.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_choose_199_16.setTagInfo(_td_c_choose_199_16);
            _jettag_c_choose_199_16.doStart(context, out);
            JET2Writer _jettag_c_choose_199_16_saved_out = out;
            while (_jettag_c_choose_199_16.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_when_200_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_200_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_200_9.setRuntimeParent(_jettag_c_choose_199_16);
                _jettag_c_when_200_9.setTagInfo(_td_c_when_200_9);
                _jettag_c_when_200_9.doStart(context, out);
                JET2Writer _jettag_c_when_200_9_saved_out = out;
                while (_jettag_c_when_200_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("False");  //$NON-NLS-1$        
                    _jettag_c_when_200_9.handleBodyContent(out);
                }
                out = _jettag_c_when_200_9_saved_out;
                _jettag_c_when_200_9.doEnd();
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_201_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_201_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_201_9.setRuntimeParent(_jettag_c_choose_199_16);
                _jettag_c_otherwise_201_9.setTagInfo(_td_c_otherwise_201_9);
                _jettag_c_otherwise_201_9.doStart(context, out);
                JET2Writer _jettag_c_otherwise_201_9_saved_out = out;
                while (_jettag_c_otherwise_201_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("True");  //$NON-NLS-1$        
                    _jettag_c_otherwise_201_9.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_201_9_saved_out;
                _jettag_c_otherwise_201_9.doEnd();
                out.write(NL);         
                _jettag_c_choose_199_16.handleBodyContent(out);
            }
            out = _jettag_c_choose_199_16_saved_out;
            _jettag_c_choose_199_16.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    def append_child ( self, child ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Appends a child to the object's children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pass");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def insert_child ( self, index, child ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Inserts a child into the object's children.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pass");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def get_add ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Returns the list of classes that can be added to the object.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        return [");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_220_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_220_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_220_17.setRuntimeParent(_jettag_c_iterate_33_1);
            _jettag_c_iterate_220_17.setTagInfo(_td_c_iterate_220_17);
            _jettag_c_iterate_220_17.doStart(context, out);
            while (_jettag_c_iterate_220_17.okToProcessBody()) {
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_220_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_220_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_220_91.setRuntimeParent(_jettag_c_iterate_220_17);
                _jettag_c_get_220_91.setTagInfo(_td_c_get_220_91);
                _jettag_c_get_220_91.doStart(context, out);
                _jettag_c_get_220_91.doEnd();
                out.write("\", ");  //$NON-NLS-1$        
                _jettag_c_iterate_220_17.handleBodyContent(out);
            }
            _jettag_c_iterate_220_17.doEnd();
            out.write("]");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            out.write("    def dclick ( self ):");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\" Handles an object being double-clicked.");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        self.adaptee.edit_traits(kind=\"livemodal\")");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_33_1.handleBodyContent(out);
        }
        _jettag_c_iterate_33_1.doEnd();
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
