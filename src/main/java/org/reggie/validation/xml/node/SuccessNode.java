package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SuccessNode {
	private boolean passed;
	private String state;

	SuccessNode() {
	}

	public SuccessNode(boolean passed, String state) {
		this.passed = passed;
		this.state = state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlAttribute(name = "state")
	public String getState() {
		return state;
	}

	public void setPasses(boolean passed) {
		this.passed = passed;
	}

	@XmlAttribute(name = "passed")
	public boolean isPassed() {
		return passed;
	}
}
