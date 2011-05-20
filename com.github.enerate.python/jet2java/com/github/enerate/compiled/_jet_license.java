package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_license implements JET2Template {

    public _jet_license() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("# Copyright (C) 2010-2011 Richard Lincoln");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Permission is hereby granted, free of charge, to any person obtaining a copy");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# of this software and associated documentation files (the \"Software\"), to");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# deal in the Software without restriction, including without limitation the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# rights to use, copy, modify, merge, publish, distribute, sublicense, and/or");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# sell copies of the Software, and to permit persons to whom the Software is");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# furnished to do so, subject to the following conditions:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# The above copyright notice and this permission notice shall be included in");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# all copies or substantial portions of the Software.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# IN THE SOFTWARE.");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
