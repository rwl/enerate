package com.github.enerate.xpath;

import java.util.List;
import org.eclipse.jet.xpath.XPathFunction;
import org.eclipse.jet.xpath.XPathUtil;
// import org.eclipse.jet.internal.xpath.functions.StringFunction;

public class AnnotationWrapFunction implements XPathFunction {

	public AnnotationWrapFunction() {
		super();
	}

  public Object evaluate(List args) {
	/*
	 *  Wrap a long sentence every 80 characters
	 *  
	 *  The quick red fox jumped over the lazy brown dog. The quick red fox
	 *  jumped over the lazy brown dog.
	 *  
	 */
	
	String buffer = XPathUtil.xpathString(args.get(0));
	
	// The number of chars for new line operators
	int n_newline_chars = (buffer.length()/76) * 2;
    
    StringBuffer sb = new StringBuffer(buffer.length()+n_newline_chars);

    for (int index = 0; index < buffer.length(); index++) {
    	
    	char c = buffer.charAt(index);
    	
    	if (index == 76) {
    		// Step backwards looking for whitespace
    		char space = (char)0x20;
    		for (int white_idx = index; white_idx > 0; white_idx--) {
    			char w = buffer.charAt(white_idx);
    			if (w == space) {
    				// Insert a new line char after it and carry on
    				sb.insert(white_idx+1, "\n");
    				break;
    			}
    		}
    	}
    	
        sb.append(c);
        
    }

    return sb;
	
	/*
	 * End function logic
	 */
  }
}
