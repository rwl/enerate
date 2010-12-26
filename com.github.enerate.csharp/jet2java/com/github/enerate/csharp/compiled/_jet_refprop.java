package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_refprop implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_refprop() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_8 = new TagInfo("c:if", //$NON-NLS-1$
            1, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_53 = new TagInfo("c:get", //$NON-NLS-1$
            1, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_1_125 = new TagInfo("c:if", //$NON-NLS-1$
            1, 125,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_37 = new TagInfo("c:get", //$NON-NLS-1$
            2, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_109 = new TagInfo("c:get", //$NON-NLS-1$
            2, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_16 = new TagInfo("c:get", //$NON-NLS-1$
            7, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_9 = new TagInfo("c:get", //$NON-NLS-1$
            11, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_1_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_8.setRuntimeParent(null);
        _jettag_c_if_1_8.setTagInfo(_td_c_if_1_8);
        _jettag_c_if_1_8.doStart(context, out);
        while (_jettag_c_if_1_8.okToProcessBody()) {
            out.write("List<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_1_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_1_53.setRuntimeParent(_jettag_c_if_1_8);
            _jettag_c_get_1_53.setTagInfo(_td_c_get_1_53);
            _jettag_c_get_1_53.doStart(context, out);
            _jettag_c_get_1_53.doEnd();
            out.write(">");  //$NON-NLS-1$        
            _jettag_c_if_1_8.handleBodyContent(out);
        }
        _jettag_c_if_1_8.doEnd();
        RuntimeTagElement _jettag_c_if_1_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_125); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_125.setRuntimeParent(null);
        _jettag_c_if_1_125.setTagInfo(_td_c_if_1_125);
        _jettag_c_if_1_125.doStart(context, out);
        while (_jettag_c_if_1_125.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_2_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_37.setRuntimeParent(_jettag_c_if_1_125);
            _jettag_c_get_2_37.setTagInfo(_td_c_get_2_37);
            _jettag_c_get_2_37.doStart(context, out);
            _jettag_c_get_2_37.doEnd();
            _jettag_c_if_1_125.handleBodyContent(out);
        }
        _jettag_c_if_1_125.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_109); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_109.setRuntimeParent(null);
        _jettag_c_get_2_109.setTagInfo(_td_c_get_2_109);
        _jettag_c_get_2_109.doStart(context, out);
        _jettag_c_get_2_109.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tget");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn this._");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_16.setRuntimeParent(null);
        _jettag_c_get_7_16.setTagInfo(_td_c_get_7_16);
        _jettag_c_get_7_16.doStart(context, out);
        _jettag_c_get_7_16.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_9.setRuntimeParent(null);
        _jettag_c_get_11_9.setTagInfo(_td_c_get_11_9);
        _jettag_c_get_11_9.doStart(context, out);
        _jettag_c_get_11_9.doEnd();
        out.write(" = value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
