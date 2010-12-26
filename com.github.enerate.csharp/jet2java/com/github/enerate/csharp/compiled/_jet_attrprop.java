package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attrprop implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attrprop() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_1_1 = new TagInfo("c:choose", //$NON-NLS-1$
            1, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_2_1 = new TagInfo("c:when", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_5_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            5, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@fullyQualifiedName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_8 = new TagInfo("c:get", //$NON-NLS-1$
            9, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_32 = new TagInfo("c:get", //$NON-NLS-1$
            9, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_16 = new TagInfo("c:get", //$NON-NLS-1$
            13, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_9 = new TagInfo("c:get", //$NON-NLS-1$
            17, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_choose_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_1_1.setRuntimeParent(null);
        _jettag_c_choose_1_1.setTagInfo(_td_c_choose_1_1);
        _jettag_c_choose_1_1.doStart(context, out);
        JET2Writer _jettag_c_choose_1_1_saved_out = out;
        while (_jettag_c_choose_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_2_1.setRuntimeParent(_jettag_c_choose_1_1);
            _jettag_c_when_2_1.setTagInfo(_td_c_when_2_1);
            _jettag_c_when_2_1.doStart(context, out);
            JET2Writer _jettag_c_when_2_1_saved_out = out;
            while (_jettag_c_when_2_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Enum 
                RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_when_2_1);
                _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
                _jettag_c_setVariable_3_1.doStart(context, out);
                _jettag_c_setVariable_3_1.doEnd();
                _jettag_c_when_2_1.handleBodyContent(out);
            }
            out = _jettag_c_when_2_1_saved_out;
            _jettag_c_when_2_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_5_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_5_1.setRuntimeParent(_jettag_c_choose_1_1);
            _jettag_c_otherwise_5_1.setTagInfo(_td_c_otherwise_5_1);
            _jettag_c_otherwise_5_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_5_1_saved_out = out;
            while (_jettag_c_otherwise_5_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_6_1.setRuntimeParent(_jettag_c_otherwise_5_1);
                _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
                _jettag_c_setVariable_6_1.doStart(context, out);
                _jettag_c_setVariable_6_1.doEnd();
                _jettag_c_otherwise_5_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_5_1_saved_out;
            _jettag_c_otherwise_5_1.doEnd();
            _jettag_c_choose_1_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_1_1_saved_out;
        _jettag_c_choose_1_1.doEnd();
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_8.setRuntimeParent(null);
        _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
        _jettag_c_get_9_8.doStart(context, out);
        _jettag_c_get_9_8.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_32.setRuntimeParent(null);
        _jettag_c_get_9_32.setTagInfo(_td_c_get_9_32);
        _jettag_c_get_9_32.doStart(context, out);
        _jettag_c_get_9_32.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tget");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn this._");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_16.setRuntimeParent(null);
        _jettag_c_get_13_16.setTagInfo(_td_c_get_13_16);
        _jettag_c_get_13_16.doStart(context, out);
        _jettag_c_get_13_16.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_9.setRuntimeParent(null);
        _jettag_c_get_17_9.setTagInfo(_td_c_get_17_9);
        _jettag_c_get_17_9.doStart(context, out);
        _jettag_c_get_17_9.doEnd();
        out.write(" = value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
