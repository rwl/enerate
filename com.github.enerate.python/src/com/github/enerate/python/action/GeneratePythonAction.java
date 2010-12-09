/* Copyright (c) 2009 Richard Lincoln */

package com.github.enerate.python.action;

import com.github.enerate.core.GenerateCodeAction;

public class GeneratePythonAction extends GenerateCodeAction {

	public GeneratePythonAction() {
		super();
		this.transformId = "com.github.enerate.python";
		this.jobDesc = "Python Code Generation.";
	}

}
