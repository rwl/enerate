/* Copyright (c) 2009 Richard Lincoln */

package com.github.enerate.traits.action;

import com.github.enerate.core.GenerateCodeAction;

public class GenerateTraitsAction extends GenerateCodeAction {

	public GenerateTraitsAction() {
		super();
		this.transformId = "com.github.enerate.traits";
		this.jobDesc = "Python Code with Traits Generation.";
	}

}
