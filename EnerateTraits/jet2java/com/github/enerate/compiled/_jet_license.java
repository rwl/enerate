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
        out.write("# Copyright (C) 2010 Richard Lincoln");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Licensed under the Apache License, Version 2.0 (the \"License\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# you may not use this file except in compliance with the License.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# You may obtain a copy of the License at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#     http://www.apache.org/licenses/LICENSE-2.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Unless required by applicable law or agreed to in writing, software");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# distributed under the License is distributed on an \"AS IS\" BASIS,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# See the License for the specific language governing permissions and");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# limitations under the License.");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
