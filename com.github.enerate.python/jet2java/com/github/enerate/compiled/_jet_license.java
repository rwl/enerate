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
        out.write("# This library is free software; you can redistribute it and/or");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# modify it under the terms of the GNU Lesser General Public");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# License as published by the Free Software Foundation; either");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# version 2.1 of the License, or (at your option) any later version.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# This library is distributed in the hope that it will be useful,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# but WITHOUT ANY WARRANTY; without even the implied warranty of");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Lesser General Public License for more details.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# You should have received a copy of the GNU Lesser General Public");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# License along with this library; if not, write to the Free Software");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA, USA");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
