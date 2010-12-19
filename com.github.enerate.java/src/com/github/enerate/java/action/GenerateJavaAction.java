/* Copyright (C) 2010 Richard Lincoln */

package com.github.enerate.java.action;

import com.github.enerate.core.GenerateCodeAction;

public class GenerateJavaAction extends GenerateCodeAction {

	public GenerateJavaAction() {
		super();
		this.transformId = "com.github.enerate.java";
		this.jobDesc = "Generate Java Code";
	}

}
