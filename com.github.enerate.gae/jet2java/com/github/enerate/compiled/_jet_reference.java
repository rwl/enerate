package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_reference implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_2_1 = new TagInfo("c:choose", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_4_1 = new TagInfo("c:when", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_7 = new TagInfo("c:if", //$NON-NLS-1$
            5, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_56 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 56,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_110 = new TagInfo("c:include", //$NON-NLS-1$
            5, 110,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_5 = new TagInfo("c:get", //$NON-NLS-1$
            6, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_27 = new TagInfo("c:get", //$NON-NLS-1$
            7, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_79 = new TagInfo("c:get", //$NON-NLS-1$
            7, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_10_1 = new TagInfo("c:when", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_7 = new TagInfo("c:if", //$NON-NLS-1$
            11, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_56 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 56,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_110 = new TagInfo("c:include", //$NON-NLS-1$
            11, 110,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_5 = new TagInfo("c:get", //$NON-NLS-1$
            12, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_76 = new TagInfo("c:get", //$NON-NLS-1$
            12, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_26 = new TagInfo("c:get", //$NON-NLS-1$
            13, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_16_1 = new TagInfo("c:when", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_25 = new TagInfo("c:if", //$NON-NLS-1$
            17, 25,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_74 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 74,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_128 = new TagInfo("c:include", //$NON-NLS-1$
            17, 128,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_12 = new TagInfo("c:get", //$NON-NLS-1$
            18, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_29_1 = new TagInfo("c:when", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_1 = new TagInfo("c:if", //$NON-NLS-1$
            30, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_31_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            31, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_32_7 = new TagInfo("c:include", //$NON-NLS-1$
            32, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_5 = new TagInfo("c:get", //$NON-NLS-1$
            34, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_76 = new TagInfo("c:get", //$NON-NLS-1$
            34, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_27 = new TagInfo("c:get", //$NON-NLS-1$
            35, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_37_1 = new TagInfo("c:when", //$NON-NLS-1$
            37, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_5 = new TagInfo("c:get", //$NON-NLS-1$
            38, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_choose_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_2_1.setRuntimeParent(null);
        _jettag_c_choose_2_1.setTagInfo(_td_c_choose_2_1);
        _jettag_c_choose_2_1.doStart(context, out);
        JET2Writer _jettag_c_choose_2_1_saved_out = out;
        while (_jettag_c_choose_2_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            // One-to-one (1..1) association. 
            RuntimeTagElement _jettag_c_when_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_4_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_4_1.setTagInfo(_td_c_when_4_1);
            _jettag_c_when_4_1.doStart(context, out);
            JET2Writer _jettag_c_when_4_1_saved_out = out;
            while (_jettag_c_when_4_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    # ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_5_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_5_7.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_if_5_7.setTagInfo(_td_c_if_5_7);
                _jettag_c_if_5_7.doStart(context, out);
                while (_jettag_c_if_5_7.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_5_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_5_56.setRuntimeParent(_jettag_c_if_5_7);
                    _jettag_c_setVariable_5_56.setTagInfo(_td_c_setVariable_5_56);
                    _jettag_c_setVariable_5_56.doStart(context, out);
                    _jettag_c_setVariable_5_56.doEnd();
                    RuntimeTagElement _jettag_c_include_5_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_110); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_5_110.setRuntimeParent(_jettag_c_if_5_7);
                    _jettag_c_include_5_110.setTagInfo(_td_c_include_5_110);
                    _jettag_c_include_5_110.doStart(context, out);
                    _jettag_c_include_5_110.doEnd();
                    _jettag_c_if_5_7.handleBodyContent(out);
                }
                _jettag_c_if_5_7.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_5.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_get_6_5.setTagInfo(_td_c_get_6_5);
                _jettag_c_get_6_5.doStart(context, out);
                _jettag_c_get_6_5.doEnd();
                out.write(" = db.ReferenceProperty(db.Model,");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        collection_name=\"_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_27.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_get_7_27.setTagInfo(_td_c_get_7_27);
                _jettag_c_get_7_27.doStart(context, out);
                _jettag_c_get_7_27.doEnd();
                out.write("_set\") # ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_79.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_get_7_79.setTagInfo(_td_c_get_7_79);
                _jettag_c_get_7_79.doStart(context, out);
                _jettag_c_get_7_79.doEnd();
                out.write(NL);         
                _jettag_c_when_4_1.handleBodyContent(out);
            }
            out = _jettag_c_when_4_1_saved_out;
            _jettag_c_when_4_1.doEnd();
            // One-to-many (1..n) association. 
            RuntimeTagElement _jettag_c_when_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_10_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_10_1.setTagInfo(_td_c_when_10_1);
            _jettag_c_when_10_1.doStart(context, out);
            JET2Writer _jettag_c_when_10_1_saved_out = out;
            while (_jettag_c_when_10_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    # ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_11_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_11_7.setRuntimeParent(_jettag_c_when_10_1);
                _jettag_c_if_11_7.setTagInfo(_td_c_if_11_7);
                _jettag_c_if_11_7.doStart(context, out);
                while (_jettag_c_if_11_7.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_11_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_11_56.setRuntimeParent(_jettag_c_if_11_7);
                    _jettag_c_setVariable_11_56.setTagInfo(_td_c_setVariable_11_56);
                    _jettag_c_setVariable_11_56.doStart(context, out);
                    _jettag_c_setVariable_11_56.doEnd();
                    RuntimeTagElement _jettag_c_include_11_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_110); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_11_110.setRuntimeParent(_jettag_c_if_11_7);
                    _jettag_c_include_11_110.setTagInfo(_td_c_include_11_110);
                    _jettag_c_include_11_110.doStart(context, out);
                    _jettag_c_include_11_110.doEnd();
                    _jettag_c_if_11_7.handleBodyContent(out);
                }
                _jettag_c_if_11_7.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_5.setRuntimeParent(_jettag_c_when_10_1);
                _jettag_c_get_12_5.setTagInfo(_td_c_get_12_5);
                _jettag_c_get_12_5.doStart(context, out);
                _jettag_c_get_12_5.doEnd();
                out.write(" = db.ReferenceProperty(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_76.setRuntimeParent(_jettag_c_when_10_1);
                _jettag_c_get_12_76.setTagInfo(_td_c_get_12_76);
                _jettag_c_get_12_76.doStart(context, out);
                _jettag_c_get_12_76.doEnd();
                out.write(",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        collection_name=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_26); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_26.setRuntimeParent(_jettag_c_when_10_1);
                _jettag_c_get_13_26.setTagInfo(_td_c_get_13_26);
                _jettag_c_get_13_26.doStart(context, out);
                _jettag_c_get_13_26.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_10_1.handleBodyContent(out);
            }
            out = _jettag_c_when_10_1_saved_out;
            _jettag_c_when_10_1.doEnd();
            // Many-to-one (n..1) association. 
            RuntimeTagElement _jettag_c_when_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_16_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_16_1.setTagInfo(_td_c_when_16_1);
            _jettag_c_when_16_1.doStart(context, out);
            JET2Writer _jettag_c_when_16_1_saved_out = out;
            while (_jettag_c_when_16_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    # Virtual property. ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_17_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_25.setRuntimeParent(_jettag_c_when_16_1);
                _jettag_c_if_17_25.setTagInfo(_td_c_if_17_25);
                _jettag_c_if_17_25.doStart(context, out);
                while (_jettag_c_if_17_25.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_17_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_74); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_17_74.setRuntimeParent(_jettag_c_if_17_25);
                    _jettag_c_setVariable_17_74.setTagInfo(_td_c_setVariable_17_74);
                    _jettag_c_setVariable_17_74.doStart(context, out);
                    _jettag_c_setVariable_17_74.doEnd();
                    RuntimeTagElement _jettag_c_include_17_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_128); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_17_128.setRuntimeParent(_jettag_c_if_17_25);
                    _jettag_c_include_17_128.setTagInfo(_td_c_include_17_128);
                    _jettag_c_include_17_128.doStart(context, out);
                    _jettag_c_include_17_128.doEnd();
                    _jettag_c_if_17_25.handleBodyContent(out);
                }
                _jettag_c_if_17_25.doEnd();
                out.write(NL);         
                out.write("    pass # ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_12.setRuntimeParent(_jettag_c_when_16_1);
                _jettag_c_get_18_12.setTagInfo(_td_c_get_18_12);
                _jettag_c_get_18_12.doStart(context, out);
                _jettag_c_get_18_12.doEnd();
                out.write(NL);         
                _jettag_c_when_16_1.handleBodyContent(out);
            }
            out = _jettag_c_when_16_1_saved_out;
            _jettag_c_when_16_1.doEnd();
            // Many-to-many (n..n) association.
            //<c:when test="$eReference/@many = 'true' and $eReference/eOpposite/@many = 'true'">
            //    <c:get select="underscore($eReference/@name)"/> = db.ListProperty(db.Key)
            //
            //    @property
            //    def <c:get select="underscore($eReference/eOpposite/@name)"/>(self):
            //        return <c:get select="$eReference/eReferenceType/@name"/>.gql("WHERE <c:get select="underscore($eReference/@name)"/> = :1", self.key())
            //</c:when>
            // References without opposites. 
            RuntimeTagElement _jettag_c_when_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_29_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_29_1.setTagInfo(_td_c_when_29_1);
            _jettag_c_when_29_1.doStart(context, out);
            JET2Writer _jettag_c_when_29_1_saved_out = out;
            while (_jettag_c_when_29_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_1.setRuntimeParent(_jettag_c_when_29_1);
                _jettag_c_if_30_1.setTagInfo(_td_c_if_30_1);
                _jettag_c_if_30_1.doStart(context, out);
                while (_jettag_c_if_30_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_31_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_31_5.setRuntimeParent(_jettag_c_if_30_1);
                    _jettag_c_setVariable_31_5.setTagInfo(_td_c_setVariable_31_5);
                    _jettag_c_setVariable_31_5.doStart(context, out);
                    _jettag_c_setVariable_31_5.doEnd();
                    out.write("    # ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_32_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_32_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_32_7.setRuntimeParent(_jettag_c_if_30_1);
                    _jettag_c_include_32_7.setTagInfo(_td_c_include_32_7);
                    _jettag_c_include_32_7.doStart(context, out);
                    _jettag_c_include_32_7.doEnd();
                    out.write(NL);         
                    _jettag_c_if_30_1.handleBodyContent(out);
                }
                _jettag_c_if_30_1.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_5.setRuntimeParent(_jettag_c_when_29_1);
                _jettag_c_get_34_5.setTagInfo(_td_c_get_34_5);
                _jettag_c_get_34_5.doStart(context, out);
                _jettag_c_get_34_5.doEnd();
                out.write(" = db.ReferenceProperty(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_76.setRuntimeParent(_jettag_c_when_29_1);
                _jettag_c_get_34_76.setTagInfo(_td_c_get_34_76);
                _jettag_c_get_34_76.doStart(context, out);
                _jettag_c_get_34_76.doEnd();
                out.write(",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        collection_name=\"_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_27.setRuntimeParent(_jettag_c_when_29_1);
                _jettag_c_get_35_27.setTagInfo(_td_c_get_35_27);
                _jettag_c_get_35_27.doStart(context, out);
                _jettag_c_get_35_27.doEnd();
                out.write("_set\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_29_1.handleBodyContent(out);
            }
            out = _jettag_c_when_29_1_saved_out;
            _jettag_c_when_29_1.doEnd();
            RuntimeTagElement _jettag_c_when_37_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_37_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_37_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_37_1.setTagInfo(_td_c_when_37_1);
            _jettag_c_when_37_1.doStart(context, out);
            JET2Writer _jettag_c_when_37_1_saved_out = out;
            while (_jettag_c_when_37_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_5.setRuntimeParent(_jettag_c_when_37_1);
                _jettag_c_get_38_5.setTagInfo(_td_c_get_38_5);
                _jettag_c_get_38_5.doStart(context, out);
                _jettag_c_get_38_5.doEnd();
                out.write(" = db.ListProperty(db.Key)");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_37_1.handleBodyContent(out);
            }
            out = _jettag_c_when_37_1_saved_out;
            _jettag_c_when_37_1.doEnd();
            _jettag_c_choose_2_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_2_1_saved_out;
        _jettag_c_choose_2_1.doEnd();
    }
}
