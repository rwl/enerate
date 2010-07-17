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
        out.write("# Copyright (C) 2009 Richard Lincoln");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# This program is free software; you can redistribute it and/or modify it under");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# the terms of the GNU Affero General Public License as published by the Free");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# Software Foundation; version 2 dated June, 1991.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# This software is distributed in the hope that it will be useful, but WITHOUT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# ANY WARRANTY; without even the implied warranty of MERCHANDABILITY or FITNESS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# FOR A PARTICULAR PURPOSE. See the GNU General Public License for more");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# details.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# You should have received a copy of the GNU Affero General Public License");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# along with this program; if not, write to the Free Software Foundation, Inc.,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("# 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
