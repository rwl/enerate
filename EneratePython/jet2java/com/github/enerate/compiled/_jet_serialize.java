package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_serialize implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_serialize() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_52 = new TagInfo("c:get", //$NON-NLS-1$
            3, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_8_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            8, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_11 = new TagInfo("c:get", //$NON-NLS-1$
            9, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_10_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            10, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_54 = new TagInfo("c:get", //$NON-NLS-1$
            13, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_62 = new TagInfo("c:get", //$NON-NLS-1$
            26, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_31_1 = new TagInfo("c:choose", //$NON-NLS-1$
            31, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_32_1 = new TagInfo("c:when", //$NON-NLS-1$
            32, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_25 = new TagInfo("c:get", //$NON-NLS-1$
            33, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_26 = new TagInfo("c:get", //$NON-NLS-1$
            34, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_58 = new TagInfo("c:get", //$NON-NLS-1$
            34, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_37_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            37, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_38_17 = new TagInfo("c:get", //$NON-NLS-1$
            38, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_26 = new TagInfo("c:get", //$NON-NLS-1$
            39, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_58 = new TagInfo("c:get", //$NON-NLS-1$
            39, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_42 = new TagInfo("c:get", //$NON-NLS-1$
            40, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_22 = new TagInfo("c:get", //$NON-NLS-1$
            45, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_54 = new TagInfo("c:get", //$NON-NLS-1$
            45, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_109 = new TagInfo("c:get", //$NON-NLS-1$
            45, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_141 = new TagInfo("c:get", //$NON-NLS-1$
            45, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_38 = new TagInfo("c:get", //$NON-NLS-1$
            46, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAllSuperTypes", //$NON-NLS-1$
                "eSuperType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_50_1 = new TagInfo("c:choose", //$NON-NLS-1$
            50, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_51_1 = new TagInfo("c:when", //$NON-NLS-1$
            51, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_25 = new TagInfo("c:get", //$NON-NLS-1$
            52, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_26 = new TagInfo("c:get", //$NON-NLS-1$
            53, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_62 = new TagInfo("c:get", //$NON-NLS-1$
            53, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_56_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            56, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_57_17 = new TagInfo("c:get", //$NON-NLS-1$
            57, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_26 = new TagInfo("c:get", //$NON-NLS-1$
            58, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_62 = new TagInfo("c:get", //$NON-NLS-1$
            58, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_42 = new TagInfo("c:get", //$NON-NLS-1$
            59, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_22 = new TagInfo("c:get", //$NON-NLS-1$
            64, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_58 = new TagInfo("c:get", //$NON-NLS-1$
            64, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_113 = new TagInfo("c:get", //$NON-NLS-1$
            64, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_149 = new TagInfo("c:get", //$NON-NLS-1$
            64, 149,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_38 = new TagInfo("c:get", //$NON-NLS-1$
            65, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_50 = new TagInfo("c:get", //$NON-NLS-1$
            71, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_11 = new TagInfo("c:get", //$NON-NLS-1$
            78, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("    def __str__(self):");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\" Returns a string representation of the ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_52.setRuntimeParent(null);
        _jettag_c_get_3_52.setTagInfo(_td_c_get_3_52);
        _jettag_c_get_3_52.doStart(context, out);
        _jettag_c_get_3_52.doEnd();
        out.write(".");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return self.serialize(header=True, depth=2, format=True)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_8_1.setRuntimeParent(null);
        _jettag_c_userRegion_8_1.setTagInfo(_td_c_userRegion_8_1);
        _jettag_c_userRegion_8_1.doStart(context, out);
        while (_jettag_c_userRegion_8_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_11.setRuntimeParent(_jettag_c_userRegion_8_1);
            _jettag_c_get_9_11.setTagInfo(_td_c_get_9_11);
            _jettag_c_get_9_11.doStart(context, out);
            _jettag_c_get_9_11.doEnd();
            out.write(".serialize");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_10_1.setRuntimeParent(_jettag_c_userRegion_8_1);
            _jettag_c_initialCode_10_1.setTagInfo(_td_c_initialCode_10_1);
            _jettag_c_initialCode_10_1.doStart(context, out);
            while (_jettag_c_initialCode_10_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    def serialize(self, header=False, depth=0, format=False):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\" Returns an RDF/XML representation of the ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_54); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_54.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_get_13_54.setTagInfo(_td_c_get_13_54);
                _jettag_c_get_13_54.doStart(context, out);
                _jettag_c_get_13_54.doEnd();
                out.write(".");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        s = ''");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        indent = ' ' * depth if depth else ''");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if format:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            indent = '\\n' + indent");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if header:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            s += '<?xml version=\"1.0\" encoding=\"UTF-8\"?>\\n'");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            s += '<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:%s=\"%s\">' % \\");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                (ns_prefix, ns_uri)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if format:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                indent += ' ' * depth");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        s += '%s<%s:%s rdf:ID=\"%s\">' % (indent, ns_prefix, \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_62.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_get_26_62.setTagInfo(_td_c_get_26_62);
                _jettag_c_get_26_62.doStart(context, out);
                _jettag_c_get_26_62.doEnd();
                out.write("\", self.uri)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if format:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            indent += ' ' * depth");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_30_1.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_iterate_30_1.setTagInfo(_td_c_iterate_30_1);
                _jettag_c_iterate_30_1.doStart(context, out);
                while (_jettag_c_iterate_30_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_choose_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_31_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_31_1.setRuntimeParent(_jettag_c_iterate_30_1);
                    _jettag_c_choose_31_1.setTagInfo(_td_c_choose_31_1);
                    _jettag_c_choose_31_1.doStart(context, out);
                    JET2Writer _jettag_c_choose_31_1_saved_out = out;
                    while (_jettag_c_choose_31_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_32_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_32_1.setRuntimeParent(_jettag_c_choose_31_1);
                        _jettag_c_when_32_1.setTagInfo(_td_c_when_32_1);
                        _jettag_c_when_32_1.doStart(context, out);
                        JET2Writer _jettag_c_when_32_1_saved_out = out;
                        while (_jettag_c_when_32_1.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("        for obj in self.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_33_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_25); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_25.setRuntimeParent(_jettag_c_when_32_1);
                            _jettag_c_get_33_25.setTagInfo(_td_c_get_33_25);
                            _jettag_c_get_33_25.doStart(context, out);
                            _jettag_c_get_33_25.doEnd();
                            out.write(":");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("            s += '%s<%s:");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_34_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_26); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_34_26.setRuntimeParent(_jettag_c_when_32_1);
                            _jettag_c_get_34_26.setTagInfo(_td_c_get_34_26);
                            _jettag_c_get_34_26.doStart(context, out);
                            _jettag_c_get_34_26.doEnd();
                            out.write(".");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_34_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_58); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_34_58.setRuntimeParent(_jettag_c_when_32_1);
                            _jettag_c_get_34_58.setTagInfo(_td_c_get_34_58);
                            _jettag_c_get_34_58.doStart(context, out);
                            _jettag_c_get_34_58.doEnd();
                            out.write(" rdf:resource=\"#%s\"/>' % \\");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("                (indent, ns_prefix, obj.uri)");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_32_1.handleBodyContent(out);
                        }
                        out = _jettag_c_when_32_1_saved_out;
                        _jettag_c_when_32_1.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_37_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_37_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_37_1.setRuntimeParent(_jettag_c_choose_31_1);
                        _jettag_c_otherwise_37_1.setTagInfo(_td_c_otherwise_37_1);
                        _jettag_c_otherwise_37_1.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_37_1_saved_out = out;
                        while (_jettag_c_otherwise_37_1.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("        if self.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_38_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_17); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_38_17.setRuntimeParent(_jettag_c_otherwise_37_1);
                            _jettag_c_get_38_17.setTagInfo(_td_c_get_38_17);
                            _jettag_c_get_38_17.doStart(context, out);
                            _jettag_c_get_38_17.doEnd();
                            out.write(" is not None:");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("            s += '%s<%s:");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_39_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_26); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_39_26.setRuntimeParent(_jettag_c_otherwise_37_1);
                            _jettag_c_get_39_26.setTagInfo(_td_c_get_39_26);
                            _jettag_c_get_39_26.doStart(context, out);
                            _jettag_c_get_39_26.doEnd();
                            out.write(".");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_39_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_58); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_39_58.setRuntimeParent(_jettag_c_otherwise_37_1);
                            _jettag_c_get_39_58.setTagInfo(_td_c_get_39_58);
                            _jettag_c_get_39_58.doStart(context, out);
                            _jettag_c_get_39_58.doEnd();
                            out.write(" rdf:resource=\"#%s\"/>' % \\");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("                (indent, ns_prefix, self.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_40_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_42); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_40_42.setRuntimeParent(_jettag_c_otherwise_37_1);
                            _jettag_c_get_40_42.setTagInfo(_td_c_get_40_42);
                            _jettag_c_get_40_42.doStart(context, out);
                            _jettag_c_get_40_42.doEnd();
                            out.write(".uri)");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_37_1.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_37_1_saved_out;
                        _jettag_c_otherwise_37_1.doEnd();
                        _jettag_c_choose_31_1.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_31_1_saved_out;
                    _jettag_c_choose_31_1.doEnd();
                    _jettag_c_iterate_30_1.handleBodyContent(out);
                }
                _jettag_c_iterate_30_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_44_1.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_iterate_44_1.setTagInfo(_td_c_iterate_44_1);
                _jettag_c_iterate_44_1.doStart(context, out);
                while (_jettag_c_iterate_44_1.okToProcessBody()) {
                    out.write("        s += '%s<%s:");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_22.setRuntimeParent(_jettag_c_iterate_44_1);
                    _jettag_c_get_45_22.setTagInfo(_td_c_get_45_22);
                    _jettag_c_get_45_22.doStart(context, out);
                    _jettag_c_get_45_22.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_54); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_54.setRuntimeParent(_jettag_c_iterate_44_1);
                    _jettag_c_get_45_54.setTagInfo(_td_c_get_45_54);
                    _jettag_c_get_45_54.doStart(context, out);
                    _jettag_c_get_45_54.doEnd();
                    out.write(">%s</%s:");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_109); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_109.setRuntimeParent(_jettag_c_iterate_44_1);
                    _jettag_c_get_45_109.setTagInfo(_td_c_get_45_109);
                    _jettag_c_get_45_109.doStart(context, out);
                    _jettag_c_get_45_109.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_141); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_141.setRuntimeParent(_jettag_c_iterate_44_1);
                    _jettag_c_get_45_141.setTagInfo(_td_c_get_45_141);
                    _jettag_c_get_45_141.doStart(context, out);
                    _jettag_c_get_45_141.doEnd();
                    out.write(">' % \\");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("            (indent, ns_prefix, self.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_46_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_38); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_38.setRuntimeParent(_jettag_c_iterate_44_1);
                    _jettag_c_get_46_38.setTagInfo(_td_c_get_46_38);
                    _jettag_c_get_46_38.doStart(context, out);
                    _jettag_c_get_46_38.doEnd();
                    out.write(", ns_prefix)");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_44_1.handleBodyContent(out);
                }
                _jettag_c_iterate_44_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_48_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_48_1.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_iterate_48_1.setTagInfo(_td_c_iterate_48_1);
                _jettag_c_iterate_48_1.doStart(context, out);
                while (_jettag_c_iterate_48_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_49_1.setRuntimeParent(_jettag_c_iterate_48_1);
                    _jettag_c_iterate_49_1.setTagInfo(_td_c_iterate_49_1);
                    _jettag_c_iterate_49_1.doStart(context, out);
                    while (_jettag_c_iterate_49_1.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_choose_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_50_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_choose_50_1.setRuntimeParent(_jettag_c_iterate_49_1);
                        _jettag_c_choose_50_1.setTagInfo(_td_c_choose_50_1);
                        _jettag_c_choose_50_1.doStart(context, out);
                        JET2Writer _jettag_c_choose_50_1_saved_out = out;
                        while (_jettag_c_choose_50_1.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_when_51_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_51_1); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_when_51_1.setRuntimeParent(_jettag_c_choose_50_1);
                            _jettag_c_when_51_1.setTagInfo(_td_c_when_51_1);
                            _jettag_c_when_51_1.doStart(context, out);
                            JET2Writer _jettag_c_when_51_1_saved_out = out;
                            while (_jettag_c_when_51_1.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("        for obj in self.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_52_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_25); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_52_25.setRuntimeParent(_jettag_c_when_51_1);
                                _jettag_c_get_52_25.setTagInfo(_td_c_get_52_25);
                                _jettag_c_get_52_25.doStart(context, out);
                                _jettag_c_get_52_25.doEnd();
                                out.write(":");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("            s += '%s<%s:");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_53_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_26); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_53_26.setRuntimeParent(_jettag_c_when_51_1);
                                _jettag_c_get_53_26.setTagInfo(_td_c_get_53_26);
                                _jettag_c_get_53_26.doStart(context, out);
                                _jettag_c_get_53_26.doEnd();
                                out.write(".");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_53_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_62); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_53_62.setRuntimeParent(_jettag_c_when_51_1);
                                _jettag_c_get_53_62.setTagInfo(_td_c_get_53_62);
                                _jettag_c_get_53_62.doStart(context, out);
                                _jettag_c_get_53_62.doEnd();
                                out.write(" rdf:resource=\"#%s\"/>' % \\");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("                (indent, ns_prefix, obj.uri)");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_when_51_1.handleBodyContent(out);
                            }
                            out = _jettag_c_when_51_1_saved_out;
                            _jettag_c_when_51_1.doEnd();
                            RuntimeTagElement _jettag_c_otherwise_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_56_1); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_otherwise_56_1.setRuntimeParent(_jettag_c_choose_50_1);
                            _jettag_c_otherwise_56_1.setTagInfo(_td_c_otherwise_56_1);
                            _jettag_c_otherwise_56_1.doStart(context, out);
                            JET2Writer _jettag_c_otherwise_56_1_saved_out = out;
                            while (_jettag_c_otherwise_56_1.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("        if self.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_57_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_17); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_57_17.setRuntimeParent(_jettag_c_otherwise_56_1);
                                _jettag_c_get_57_17.setTagInfo(_td_c_get_57_17);
                                _jettag_c_get_57_17.doStart(context, out);
                                _jettag_c_get_57_17.doEnd();
                                out.write(" is not None:");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("            s += '%s<%s:");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_58_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_26); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_58_26.setRuntimeParent(_jettag_c_otherwise_56_1);
                                _jettag_c_get_58_26.setTagInfo(_td_c_get_58_26);
                                _jettag_c_get_58_26.doStart(context, out);
                                _jettag_c_get_58_26.doEnd();
                                out.write(".");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_58_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_62); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_58_62.setRuntimeParent(_jettag_c_otherwise_56_1);
                                _jettag_c_get_58_62.setTagInfo(_td_c_get_58_62);
                                _jettag_c_get_58_62.doStart(context, out);
                                _jettag_c_get_58_62.doEnd();
                                out.write(" rdf:resource=\"#%s\"/>' % \\");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("                (indent, ns_prefix, self.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_59_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_42); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_59_42.setRuntimeParent(_jettag_c_otherwise_56_1);
                                _jettag_c_get_59_42.setTagInfo(_td_c_get_59_42);
                                _jettag_c_get_59_42.doStart(context, out);
                                _jettag_c_get_59_42.doEnd();
                                out.write(".uri)");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_otherwise_56_1.handleBodyContent(out);
                            }
                            out = _jettag_c_otherwise_56_1_saved_out;
                            _jettag_c_otherwise_56_1.doEnd();
                            _jettag_c_choose_50_1.handleBodyContent(out);
                        }
                        out = _jettag_c_choose_50_1_saved_out;
                        _jettag_c_choose_50_1.doEnd();
                        _jettag_c_iterate_49_1.handleBodyContent(out);
                    }
                    _jettag_c_iterate_49_1.doEnd();
                    RuntimeTagElement _jettag_c_iterate_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_63_1.setRuntimeParent(_jettag_c_iterate_48_1);
                    _jettag_c_iterate_63_1.setTagInfo(_td_c_iterate_63_1);
                    _jettag_c_iterate_63_1.doStart(context, out);
                    while (_jettag_c_iterate_63_1.okToProcessBody()) {
                        out.write("        s += '%s<%s:");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_22.setRuntimeParent(_jettag_c_iterate_63_1);
                        _jettag_c_get_64_22.setTagInfo(_td_c_get_64_22);
                        _jettag_c_get_64_22.doStart(context, out);
                        _jettag_c_get_64_22.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_58); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_58.setRuntimeParent(_jettag_c_iterate_63_1);
                        _jettag_c_get_64_58.setTagInfo(_td_c_get_64_58);
                        _jettag_c_get_64_58.doStart(context, out);
                        _jettag_c_get_64_58.doEnd();
                        out.write(">%s</%s:");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_113); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_113.setRuntimeParent(_jettag_c_iterate_63_1);
                        _jettag_c_get_64_113.setTagInfo(_td_c_get_64_113);
                        _jettag_c_get_64_113.doStart(context, out);
                        _jettag_c_get_64_113.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_149); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_149.setRuntimeParent(_jettag_c_iterate_63_1);
                        _jettag_c_get_64_149.setTagInfo(_td_c_get_64_149);
                        _jettag_c_get_64_149.doStart(context, out);
                        _jettag_c_get_64_149.doEnd();
                        out.write(">' % \\");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            (indent, ns_prefix, self.");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_65_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_38); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_65_38.setRuntimeParent(_jettag_c_iterate_63_1);
                        _jettag_c_get_65_38.setTagInfo(_td_c_get_65_38);
                        _jettag_c_get_65_38.doStart(context, out);
                        _jettag_c_get_65_38.doEnd();
                        out.write(", ns_prefix)");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_iterate_63_1.handleBodyContent(out);
                    }
                    _jettag_c_iterate_63_1.doEnd();
                    _jettag_c_iterate_48_1.handleBodyContent(out);
                }
                _jettag_c_iterate_48_1.doEnd();
                out.write(NL);         
                out.write("        if format:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            indent = indent[:-depth]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        s += '%s</%s:%s>' % (indent, ns_prefix, \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_71_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_50.setRuntimeParent(_jettag_c_initialCode_10_1);
                _jettag_c_get_71_50.setTagInfo(_td_c_get_71_50);
                _jettag_c_get_71_50.doStart(context, out);
                _jettag_c_get_71_50.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        if header:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            s += '%s</rdf:RDF>' % indent[:-depth]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        return s");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_10_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_10_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_78_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_78_11.setRuntimeParent(_jettag_c_userRegion_8_1);
            _jettag_c_get_78_11.setTagInfo(_td_c_get_78_11);
            _jettag_c_get_78_11.doStart(context, out);
            _jettag_c_get_78_11.doEnd();
            out.write(".serialize");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_8_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_8_1.doEnd();
    }
}
