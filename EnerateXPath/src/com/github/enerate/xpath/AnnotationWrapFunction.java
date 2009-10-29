package com.github.enerate.xpath;

import java.util.List;
import org.eclipse.jet.xpath.XPathFunction;
import org.eclipse.jet.xpath.XPathUtil;
// import org.eclipse.jet.internal.xpath.functions.StringFunction;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.StringUtils;

public class AnnotationWrapFunction implements XPathFunction {

	public AnnotationWrapFunction() {
		super();
	}

  public Object evaluate(List args) {
	/*
	 *  Wrap long sentences to fit with in the given number of characters, inserting
	 *  the given indent at the start of each new line.
	 *
	 *  The quick red fox jumped over the lazy brown dog. The quick red fox
	 *  jumped over the lazy brown dog.
	 *
	 */

	String buffer = XPathUtil.xpathString(args.get(0));
//	int characters = (int) XPathUtil.xpathNumber(args.get(1));

//	int indent;
//	if (args.size() == 2) {
//		indent = 1;
//	} else {
//		indent = (int) XPathUtil.xpathNumber(args.get(2));
//	}

	final String NEW_LINE = System.getProperty("line.separator");
	String newLineStr = StringUtils.leftPad(NEW_LINE, 8);

	String wrapped = WordUtils.wrap(buffer, 80, "\n", true);
//	String wrapped = WordUtils.wrap(buffer, 80);

	// The number of chars for new line operators
//	int n_newline_chars = (buffer.length()/76) * 2;
//
//    StringBuffer sb = new StringBuffer(buffer.length()+n_newline_chars);
//
//    for (int index = 0; index < buffer.length(); index++) {
//
//    	char c = buffer.charAt(index);
//
//    	if (index == 76) {
//    		// Step backwards looking for whitespace
//    		char space = (char)0x20;
//    		for (int white_idx = index; white_idx > 0; white_idx--) {
//    			char w = buffer.charAt(white_idx);
//    			if (w == space) {
//    				// Insert a new line char after it and carry on
//    				sb.insert(white_idx+1, "\n");
//    				break;
//    			}
//    		}
//    	}
//
//        sb.append(c);
//
//    }

    return wrapped;

	/*
	 * End function logic
	 */
  }
}
