package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestNode {
	private String description;
	private ResultNode result;
	private String name;
	private String executed;

	public TestNode() {
	}

	public TestNode(String name, String executed, String description, ResultNode result) {
		this.name = name;
		this.executed = executed;
		this.description = description;
		this.result = result;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement
	public ResultNode getResult() {
		return result;
	}

	public void setResult(ResultNode result) {
		this.result = result;
	}

	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute(name = "executed")
	public String getExecuted() {
		return executed;
	}

	public void setExecuted(String executed) {
		this.executed = executed;
	}

}
