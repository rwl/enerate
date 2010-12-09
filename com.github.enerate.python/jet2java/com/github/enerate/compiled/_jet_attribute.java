package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_attribute implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attribute() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_12 = new TagInfo("c:include", //$NON-NLS-1$
            4, 12,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_91 = new TagInfo("c:if", //$NON-NLS-1$
            4, 91,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAttributeType/eLiterals) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_152 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 152,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eEnum", //$NON-NLS-1$
                "$eAttribute/eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_216 = new TagInfo("c:if", //$NON-NLS-1$
            4, 216,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_295 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 295,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eLiterals)", //$NON-NLS-1$
                "eLiteralIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_358 = new TagInfo("c:get", //$NON-NLS-1$
            4, 358,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals[$eLiteralIdx]/@literal", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_416 = new TagInfo("c:if", //$NON-NLS-1$
            4, 416,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteralIdx != count($eEnum/eLiterals)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_14 = new TagInfo("c:get", //$NON-NLS-1$
            5, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_52 = new TagInfo("c:get", //$NON-NLS-1$
            5, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_1.setRuntimeParent(null);
        _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
        _jettag_c_if_2_1.doStart(context, out);
        while (_jettag_c_if_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
            _jettag_c_setVariable_3_1.doStart(context, out);
            _jettag_c_setVariable_3_1.doEnd();
            out.write("        #: ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_4_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_12.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_include_4_12.setTagInfo(_td_c_include_4_12);
            _jettag_c_include_4_12.doStart(context, out);
            _jettag_c_include_4_12.doEnd();
            _jettag_c_if_2_1.handleBodyContent(out);
        }
        _jettag_c_if_2_1.doEnd();
        RuntimeTagElement _jettag_c_if_4_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_91.setRuntimeParent(null);
        _jettag_c_if_4_91.setTagInfo(_td_c_if_4_91);
        _jettag_c_if_4_91.doStart(context, out);
        while (_jettag_c_if_4_91.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_4_152 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_152); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_4_152.setRuntimeParent(_jettag_c_if_4_91);
            _jettag_c_setVariable_4_152.setTagInfo(_td_c_setVariable_4_152);
            _jettag_c_setVariable_4_152.doStart(context, out);
            _jettag_c_setVariable_4_152.doEnd();
            RuntimeTagElement _jettag_c_if_4_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_216); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_216.setRuntimeParent(_jettag_c_if_4_91);
            _jettag_c_if_4_216.setTagInfo(_td_c_if_4_216);
            _jettag_c_if_4_216.doStart(context, out);
            while (_jettag_c_if_4_216.okToProcessBody()) {
                out.write("        #:");  //$NON-NLS-1$        
                _jettag_c_if_4_216.handleBodyContent(out);
            }
            _jettag_c_if_4_216.doEnd();
            out.write(" Values are: ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_4_295 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_295); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_295.setRuntimeParent(_jettag_c_if_4_91);
            _jettag_c_iterate_4_295.setTagInfo(_td_c_iterate_4_295);
            _jettag_c_iterate_4_295.doStart(context, out);
            while (_jettag_c_iterate_4_295.okToProcessBody()) {
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_358 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_358); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_358.setRuntimeParent(_jettag_c_iterate_4_295);
                _jettag_c_get_4_358.setTagInfo(_td_c_get_4_358);
                _jettag_c_get_4_358.doStart(context, out);
                _jettag_c_get_4_358.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_4_416 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_416); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_4_416.setRuntimeParent(_jettag_c_iterate_4_295);
                _jettag_c_if_4_416.setTagInfo(_td_c_if_4_416);
                _jettag_c_if_4_416.doStart(context, out);
                while (_jettag_c_if_4_416.okToProcessBody()) {
                    out.write(", ");  //$NON-NLS-1$        
                    _jettag_c_if_4_416.handleBodyContent(out);
                }
                _jettag_c_if_4_416.doEnd();
                _jettag_c_iterate_4_295.handleBodyContent(out);
            }
            _jettag_c_iterate_4_295.doEnd();
            _jettag_c_if_4_91.handleBodyContent(out);
        }
        _jettag_c_if_4_91.doEnd();
        out.write(NL);         
        out.write("        self.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_14.setRuntimeParent(null);
        _jettag_c_get_5_14.setTagInfo(_td_c_get_5_14);
        _jettag_c_get_5_14.doStart(context, out);
        _jettag_c_get_5_14.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_52.setRuntimeParent(null);
        _jettag_c_get_5_52.setTagInfo(_td_c_get_5_52);
        _jettag_c_get_5_52.doStart(context, out);
        _jettag_c_get_5_52.doEnd();
        out.write(NL);         
    }
}
